import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;
public class Motorista implements Serializable{
    private String nome = new String(); 
    private int idade, cnh, contCam = 5, contMot = 5, contViag = 15, contMan = 5, contAbas = 7;
    private String dataAdm = new String();
    private String dataDem = new String();
    private String senhaMotorista = new String();
    private String placa = new String();
    private double  salFixo, porcenCom;

    public Caminhao[] caminhao;
    public Abastecimento[] abastecimento;
    public Manutencao[] manutencao;
    public Viagem[] viagem;

    // Construtor
    public Motorista(String nome, int idade, int cnh, String dataAdm, String dataDem, 
    double porcenCom, double salFixo, String senhaMotorista, String placa) {

        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
        this.dataAdm = dataAdm;
        this.dataDem = dataDem;
        this.porcenCom = porcenCom;
        this.salFixo = salFixo;
        this.senhaMotorista = senhaMotorista;
        this.placa = placa;
        this.viagem = new Viagem[contViag];
        this.manutencao = new Manutencao[contMan];
        this.abastecimento = new Abastecimento[contAbas];

        for (int i = 0; i < viagem.length; i++) {
            viagem[i] = null; // Define cada elemento como nulo
        }

        for (int i = 0; i < abastecimento.length; i++) {
            abastecimento[i] = null; // Define cada elemento como nulo
        }

        for (int i = 0; i < manutencao.length; i++) {
            manutencao[i] = null; // Define cada elemento como nulo
        }
    }

    public Motorista(String nome, int idade, int cnh, String dataAdm, 
    double porcenCom, double salFixo, String senhaMotorista, String placa){
        this(nome, idade, cnh, dataAdm, null, porcenCom, salFixo, senhaMotorista, placa);

        this.viagem = new Viagem[contViag];
        this.manutencao = new Manutencao[contMan];
        this.abastecimento = new Abastecimento[contAbas];

        for (int i = 0; i < viagem.length; i++) {
            viagem[i] = null; // Define cada elemento como nulo
        }
        
        for (int i = 0; i < abastecimento.length; i++) {
            abastecimento[i] = null; // Define cada elemento como nulo
        }

        for (int i = 0; i < manutencao.length; i++) {
            manutencao[i] = null; // Define cada elemento como nulo
        }
    }

    public String getNome() {// Função para pegar o nome do motorista.
        return this.nome;
    }

    public int getIdade() {// Função para pegar a idade do motorista.
        return this.idade;
    }

    public int getCnh() {// Função para pegar a CNH do motorista.
        return this.cnh;
    }

    public String getDataAdm() {// Função para pegar a data de admissão do motorista.
        return this.dataAdm;
    }

    public String getDataDem() {// Função para pegar a data de demissao do motorista.
        return this.dataDem;
    }

    public String getPlacaMot() {// Função para pegar a placa do caminhao que o motorista trabalha
        return this.placa;
    }

    public double getPorcenCom() {// Função para pegar a porcentagem de comissão do motorista.
        return this.porcenCom;
    }

    public double getSalFixo() {// Função para pegar o salário fixo do motorista.
        return this.salFixo;
    }

    public String getSenhaMotorista() {// Função para pegar a senha do motorista.
        return this.senhaMotorista;
    }

    public void setDataDem(String novaDem) {//Função que vai definir a data de demissão do motorista
        this.dataDem = novaDem;
    }

    public double calcularValorFrete(double peso, double valor){  //calcula o valor do total do frete da viagem
        double valorTotalFrete;
        valorTotalFrete = peso*valor; 

        return valorTotalFrete;
    }

    public void registrarViagem(){
        double kmIni, kmFim, valorTonelada, pesoCarga, valorFrete, valorComissaoViagem;
        String origem, destino, carregamento;
        Scanner teclado = new Scanner(System.in);
        int i;
        for (i = 0; i < contViag; i++) {
            if(viagem[i] == null){
                System.out.println("Origem: ");
                origem = teclado.nextLine();
                System.out.println("Destino: ");
                destino = teclado.nextLine();
                System.out.println("Carregamento: ");
                carregamento = teclado.nextLine();
                System.out.println("Km Inicial: ");
                kmIni = teclado.nextDouble();
                teclado.nextLine(); // Limpa o buffer
                System.out.println("Km Final: ");
                kmFim = teclado.nextDouble();
                teclado.nextLine(); // Limpa o buffer
                System.out.println("Valor do Frete por Tonelada: ");
                valorTonelada = teclado.nextDouble();
                teclado.nextLine(); // Limpa o buffer
                System.out.println("Peso da Carga (em toneladas): ");
                pesoCarga = teclado.nextDouble();
                teclado.nextLine(); // Limpa o buffer
                valorFrete = calcularValorFrete(pesoCarga,valorTonelada);
                valorComissaoViagem = calcularComissaoViagem(valorFrete);

                viagem[i] = new Viagem(origem, destino, carregamento, kmIni, kmFim, valorTonelada, pesoCarga, valorFrete,valorComissaoViagem);
                break;
            } 
        }
        if(i==contViag){
            System.out.println("Quantidade de Viagens está cheia!");
            System.out.print("\n");
        }

    }

    public double calcularComissaoViagem(double valorFrete){
        double comissaoViagem;
        comissaoViagem = valorFrete * (porcenCom/100);

        return comissaoViagem;
    }
    
    public void registrarDespesas(){
        Scanner teclado = new Scanner (System.in);
        String opcao;
        boolean saida=false;

        do{
            System.out.println ("..:: Menu Interativo Registrar Despesas:..");
            System.out.println ("(a) Para Registrar Abastecimento ");
            System.out.println ("(b) Para Registrar Manutenção " );
            System.out.println ("(c) Voltar ao Menu Motorista");
            System.out.println("Entre com uma opção do menu: ");
            opcao = teclado.nextLine( );

            switch(opcao){
                case "a":
                    registrarAbastecimento();
                    break;
                case "b":
                    registrarManutencao();
                    break;
                case "c":
                    System.out.println ("Saindo");
                    saida=true;
                    break;
                default :
                    System.out.println ("Opcao invalida. Tente novamente");
            }
        }while(saida==false);
    }

    public void registrarAbastecimento(){
        String nome,dataStr;
        double litragem, valor;
        Scanner teclado = new Scanner(System.in);
        int i;
        for (i = 0; i < contAbas; i++) {
            if(abastecimento[i] == null){
                System.out.println("Posto: ");
                nome = teclado.nextLine();
                System.out.println("Litragem Abastecido: ");
                litragem = teclado.nextDouble();
                teclado.nextLine(); // Limpa o buffer
                System.out.println("Valor Abastecido: ");
                valor = teclado.nextDouble();
                teclado.nextLine(); // Limpa o buffer
                System.out.println("Data de Abastecimento: (dd/MM/yyyy)");
                dataStr = teclado.nextLine();

                abastecimento[i] = new Abastecimento(nome, litragem, valor, dataStr);
                System.out.println("Abastecimento cadastrado com sucesso!");
                break;
            }
        }
        if(i==contAbas-1){
            System.out.println("Quantidade de Abastecimento está cheio!");
            System.out.print("\n");
        }

    }

    public void registrarManutencao(){
        String nome, descricao, dataStr;
        double valor;
        Scanner teclado = new Scanner(System.in);
        int i;

        for (i = 0; i < contMan; i++) {
            if(manutencao[i] == null){
                System.out.println("Nome: ");
                nome = teclado.nextLine();
                System.out.println("Descrição: ");
                descricao = teclado.nextLine();
                System.out.println("Valor da Manutenção: ");
                valor = teclado.nextDouble();
                teclado.nextLine(); // Limpa o buffer
                System.out.println("Data da Manutenção: (dd/MM/yyyy)");
                dataStr = teclado.nextLine();

                manutencao[i] = new Manutencao(nome, descricao, valor, dataStr);
                System.out.println("Manutenção cadastrada com sucesso!");
                break;
            }
        }
        if(i==contMan){
            System.out.println("Quantidade de Manutenções está cheia!");
            System.out.print("\n");
        }

    }

    public void gerarHolerite(){
        Scanner teclado = new Scanner(System.in);
        String opcao = "N";
        int i;

        do{
            double somaComissao = 0;     
            System.out.println("..::Holerite do Mês::..");           
            System.out.println(" ");
            System.out.printf("Salário Fixo: R$ %.2f", getSalFixo());
            System.out.println(" ");
            System.out.println("Comissão por viagem: ");

            for(i=0; i<contViag; i++){
                if(viagem[i]!=null){
                    System.out.printf("Viagem %d: R$ %.2f\n", i+1, viagem[i].getComissao());
                    somaComissao += viagem[i].getComissao();
                }
            }
            System.out.printf("Soma de Todas as Comissões: R$ %.2f\n", somaComissao);
            System.out.printf("Salário Fixo + Comissões: R$ %.2f", calcularSomaSalCom(somaComissao));
            System.out.println(" ");
            System.out.println("Deseja sair da página? S - Sim  /  N - Não ");
            opcao = teclado.nextLine();
        }while(!opcao.equals("S"));
        System.out.print("\n");
    }

    public double calcularSomaSalCom(double somaComissao){
        double somaSalCom;
        somaSalCom = salFixo + somaComissao;
        return somaSalCom;
    }

}