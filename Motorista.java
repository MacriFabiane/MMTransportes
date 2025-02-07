import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;
public class Motorista implements Serializable{
    private String nome = new String(); // deixaria só string nome?
    private int idade, cnh, porcenCom;
    private double salFixo;
    private Date dataAdm = new Date();
    private Date dataDem = new Date();
    private String senhaMotorista = new String();
    private Caminhao[] caminhao;
    private String placa = new String();
    private String origem;

    // Construtor
    public Motorista(String nome, int idade, int cnh, Date dataAdm, Date dataDem, 
    int porcenCom, double salFixo, String senhaMotorista) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
        this.dataAdm = dataAdm;
        this.dataDem = dataDem;
        this.porcenCom = porcenCom;
        this.salFixo = salFixo;
        this.senhaMotorista = senhaMotorista;
        for(int i=0; i<caminhao.length;i++){
            if(caminhao[i].getEmUso() == false){
                this.placa = caminhao[i].getPlaca();
                caminhao[i].setEmUso(true);
                break;
            }
            System.out.println("Não é possível adicionar novo motorista, pois todos os caminhões estão em uso!");
        }
    }

    public Motorista(String nome, int idade, int cnh, Date dataAdm, 
    int porcenCom, double salFixo, String senhaMotorista){
        this(nome, idade, cnh, dataAdm, null, porcenCom, salFixo, senhaMotorista);
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

    public Date getDataAdm() {// Função para pegar a data de admissão do motorista.
        return this.dataAdm;
    }

    public Date getDataDem() {// Função para pegar a data de demissao do motorista.
        return this.dataDem;
    }

    public String getPlacaMot() {// Função para pegar a placa do caminhao que o motorista trabalha
        return this.placa;
    }

    public int getPorcenCom() {// Função para pegar a porcentagem de comissão do motorista.
        return this.porcenCom;
    }

    public double getSalFixo() {// Função para pegar o salário fixo do motorista.
        return this.salFixo;
    }

    public String getSenhaMotorista() {// Função para pegar a senha do motorista.
        return this.senhaMotorista;
    }

    public void setDataDem(Date novaDem) {//Função que vai definir a data de demissão do motorista
        dataDem = novaDem;
    }

    public void registrarViagem(){
        Scanner teclado= new Scanner(System.in);

        System.out.println("Origem: ");
        origem = teclado.nextLine();
    }
    
    public void registrarDespesas(){
        Scanner teclado= new Scanner(System.in);
    }

    public void gerarHolerite(){
        
    }

}