import java.io.Serializable;
import java.util.Date;
public class Motorista implements Serializable{
    private String nome = new String(); // deixaria só string nome?
    private int idade, cnh, porcenCom;
    private double salFixo;
    private Date dataAdm = new Date();
    private Date dataDem = new Date();
    private Caminhao caminhao = new Caminhao();
    private String senhaMotorista = new String();

    // Construtor
    public Motorista(String nome, int idade, int cnh, Date dataAdm, Date dataDem, //como colocar para nao ser obrigatorio
    Caminhao placa, int porcenCom, double salFixo, String senhaMotorista) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
        this.dataAdm = dataAdm;
        this.dataDem = dataDem;
        this.caminhao.placa = placa; //???? //acho que na entrada de dados placa n é caminhão mas sim string e agui dai usa this placa e tem que fazer algo pro sistema pegar a de unm caminhaõ q n tá em uso
        this.porcenCom = porcenCom;
        this.salFixo = salFixo;
        this.senhaMotorista = senhaMotorista;
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

    public String getPlacaCam() {// Função para pegar a placa do caminhao que o motorista trabalha
        return this.placa;//?????
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

    }
    
    public void registrarDespesas(){
        
    }

    public void gerarHolerite(){
        
    }


}