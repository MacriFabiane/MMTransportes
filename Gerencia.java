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
                    if(caminhoes[i].getEmUso()==false){
                        System.out.println("Insira as informações abaixo para realizar o registro de um novo motorista:");
                        System.out.println("Nome Completo: ");
                        String nome = teclado.nextLine();
                        System.out.println("Idade: ");
                        int idade = teclado.nextInt();
                        System.out.println("CNH do novo motorista: ");
                        int cnh = teclado.nextInt();
                        System.out.println("Data de Admissão: ");
                        String dataAdm = teclado.nextLine();
                        System.out.println("Porcentagem de comissão que o motorista vai receber: ");
                        double porcenCom = teclado.nextDouble();
                        System.out.println("Salario fio do motorista: ");
                        double salFixo = teclado.nextDouble();
                        System.out.println("Senha para o Motorista acessar o sistema:");
                        String senhaMotorista = teclado.nextLine();
                        String placa = caminhoes[i].getPlaca();
                        motoristas[j] = new Motorista(nome, idade, cnh, dataAdm, porcenCom, salFixo, senhaMotorista, placa);
                        caminhoes[i].setEmUso(true);
                    }
                }
            }
        }
 
        
    }

    public void gerarListaMotoristaSalario(){
        //vai precisar chamar o soma salarios aqui
        //SÓ PRINTAR NA TELA
    }

    public double calcularTotalSalarios(){ //total salario do motorista (salario fixo mais as comissões das viagens do mês)
        
        for (int i=0; i<motoristas.length; i++){

            if(motoristas[i] != null)//se o motorista existir
                somaSalarios += motoristas[i].getSalFixo(); //vai ter que somar tbm a comissão de cada viagem

        }

        return  somaSalarios;
    }

    public void gerearRelatorioLeDTotais(){ //gera relatorio de lucros e despesas totais do mes
        //vai chamar aui somar lucros e somar desesas e o diflucdes
        //so printar 
    }
    
    public double somarLucros(){
        
    }

    public double somarDespesas(){
        if(motorista.registrarDespesas)


    }

    public double calcularDifLucDes(){
        //chamar soma des e soma luc aqui
        
    }

    public void gerarListaDespesasLucrosTotaisMotoristaPlaca(){
        //printar na tela só
    }
}
