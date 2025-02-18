import java.util.Date;
import java.util.Scanner;
import java.io.Serializable;
import java.time.LocalDate;

public class Gerencia implements Serializable {

    public LocalDate hoje = LocalDate.now();
    public int mesAtual = hoje.getMonthValue();
    public Motorista[] motoristas;
    public Caminhao[] caminhoes;
    public int n = 5; //suporta só até 5 motoristas/caminhoes
    public double somaSalarios = 0;
    public String nomeGerente, senhaGerente;
    public Scanner teclado = new Scanner(System.in);


    //Construtor
    public Gerencia() {
        this.n = 5;
        this.motoristas = new Motorista[n];
        this.caminhoes = new Caminhao[n];
        this.nomeGerente = "Lucilia Araki"; //gerente pré cadastrado
        this.senhaGerente = "12345";

        for (int i=0; i<motoristas.length; i++){
            motoristas[i] = null; //define cada elemento como nulo
        }
        for (int i=0; i<caminhoes.length; i++){
            caminhoes[i] = null; //define cada elemento como nulo
        }
    }

    public void registrarcaminhao(){
       
        for(int i=0; i<5 ; i++){
            if(caminhoes[i] == null){
                System.out.println("Insira as informações abaixo para realizar o cadastro de um novo caminhão:");
                System.out.println("Placa: ");
                String placa = teclado.nextLine();
                System.out.println("Chassi: ");
                String chassi = teclado.nextLine();

                caminhoes[i] = new Caminhao(placa, chassi, false);
                System.out.println("Caminhão cadastrado com sucesso, Chefia!");
                break;
            }
            else if(caminhoes[4] != null){
                System.out.println("Não há como cadastrar um novo caminhão, pouco espaço na transportadora!");
            }
        }
        
    }

    public void registrarMotorista(){ //exemplo em campeonato
        //logica para checkar o caminhão q não tá em uso e definir a placa
        for(int j=0; j<5; j++){
            if(motoristas[j]==null){
                for (int i=0; i<5; i++){
                    if(caminhoes[i] != null && caminhoes[i].getEmUso()==false){
                        System.out.println("Insira as informações abaixo para realizar o registro de um novo motorista:");
                        System.out.println("Nome Completo: ");
                        String nome = teclado.nextLine();
                        System.out.println("Idade: ");
                        int idade = teclado.nextInt();
                        teclado.nextLine(); // Limpa o buffer
                        System.out.println("CNH do novo motorista: ");
                        int cnh = teclado.nextInt();
                        teclado.nextLine(); // Limpa o buffer
                        System.out.println("Data de Admissão: ");
                        String dataAdm = teclado.nextLine();
                        System.out.println("Porcentagem de comissão que o motorista vai receber: ");
                        double porcenCom = teclado.nextDouble();
                        teclado.nextLine(); // Limpa o buffer
                        System.out.println("Salario fixo do motorista: ");
                        double salFixo = teclado.nextDouble();
                        teclado.nextLine(); // Limpa o buffer
                        System.out.println("Senha para o Motorista acessar o sistema:");
                        String senhaMotorista = teclado.nextLine();
                        String placa = caminhoes[i].getPlaca();

                        motoristas[j] = new Motorista(nome, idade, cnh, dataAdm, porcenCom, salFixo, senhaMotorista, placa);
                        caminhoes[i].setEmUso(true);
                        break;
                    }
                    else if (caminhoes[4] != null && caminhoes[4].getEmUso()==true) {
                        System.out.println("Não há caminhões disponíveis na frota, para esse motorista. Não será possível a sua contratação.");
                    }
                }
            }
            else if (motoristas[j]!=null){
                System.out.println("Não há vaga para um novo motorista!");
            }
        }
    }

    public double calcularTotalSalarios(){ //total salario de todos os motoristas (salario fixo mais as comissões das viagens do mês)
        
        for (int i=0; i<motoristas.length; i++){

            if(motoristas[i] != null){//se o motorista existir
                somaSalarios += motoristas[i].getSalFixo(); //vai ter que somar tbm a comissão de cada viagem
                for(int j=0; j<15; j++){
                    if(motoristas[i].viagem[j]!= null)
                        somaSalarios += motoristas[i].viagem[j].getComissao();
                }
            }
        }
        return  somaSalarios;
    }

    public void gerarListaMotoristaSalario(){
        System.out.println("..::Folha de Pagamentos::..");
        System.out.println("Motorista:                   Salário: ");
        for(int i=0; i<5; i++){
            System.out.printf("%s          R$: %.2f%n", motoristas[i], calcularTotalSalarioMotorista(i));
        }
        System.out.printf("Total gasto em salários: R$: %.2f%n", calcularTotalSalarios());
    }

    public double calcularTotalSalarioMotorista(int i){ //total salario do motorista (salario fixo mais as comissões das viagens do mês)
        
            if(motoristas[i] != null){//se o motorista existir
                somaSalarios += motoristas[i].getSalFixo(); //vai ter que somar tbm a comissão de cada viagem
                for(int j=0; j<15; j++){
                    if(motoristas[i].viagem[j]!= null)
                        somaSalarios += motoristas[i].viagem[j].getComissao();
                }
            }
            return somaSalarios;
    }

    public void gerearRelatorioLeDTotais(){ //gera relatorio de lucros e despesas totais do mes //SEM DATA AINDA
        double lucrosTotais = 0.0;
        double despesasTotais = 0.0;
        for(int i=0; i<5; i++){
            lucrosTotais += somarLucros(i);
            despesasTotais += somarDespesas(i);
        }
        System.out.println("..::Relatório de Lucros e Despesas Totais::..");
        System.out.printf("Lucros = R$ %.2f%n", lucrosTotais);
        System.out.printf("Despesas = R$ %.2f%n", despesasTotais);

    }
    
    public double somarLucros(int i){
        double somaLucros = 0.0;

        if(motoristas[i] != null){//se o motorista existir
            
            for(int j=0; j<15; j++){
                if(motoristas[i].viagem[j]!= null)
                    somaLucros += motoristas[i].viagem[j].getValorFrete();//soma o valor total do frete de cada viagem do motorista
            }
            somaLucros = somaLucros - somarDespesas(i); //desconto do lucro bruto as despesas para ter o lucro liquido 
        }
        return somaLucros;
    }

    public double somarDespesas(int i){//FALTA RESTRINGIR DATA
        double somaDespesas = 0.0;

        if(motoristas[i] != null){//se o motorista existir
            somaDespesas += calcularTotalSalarioMotorista(i); //soma o salario
            for(int j=0; j<7; j++){
                if(motoristas[i].abastecimento[j]!= null)
                    somaDespesas += motoristas[i].abastecimento[j].getValor();//soma todos os gastos de abastecimento
            }
            for(int j=0; j<5; j++){
                if(motoristas[i].manutencao[j]!= null)
                    somaDespesas += motoristas[i].manutencao[j].getValor();//soma todos os gastos de manutenção
            }
        }
        return somaDespesas;

    }

    // public double calcularDifLucDes(){ //acho q não preciso disso
    //     //chamar soma des e soma luc aqui
        
    // }

    public void gerarListaDespesasLucrosTotaisMotoristaPlaca(){
        System.out.println("..::Relatório de Lucros e Despesas Separados por Motorista::..");
        System.out.println("Motorista:        Placa:         Despesas:        Lucros:");
        for(int i=0; i<5; i++){
            System.out.printf("%s       %s        R$: %.2f       R$: %.2f%n", motoristas[i], motoristas[i].getPlacaMot(), somarDespesas(i), somarLucros(i));
        }
        System.out.printf("Total gasto em salários: R$: %.2f%n", calcularTotalSalarios());
    }
}
