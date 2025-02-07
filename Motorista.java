import java.io.DataInput;
import java.io.Serializable;
import java.util.Date;
public class Motorista implements Serializable{
    private String nome = new String();
    private int idade;
    private int cnh;
    private Date dataAdm = new Date();
    private Date dataDem = new Date();

    // Construtor
    public Motorista(String nome, int idade, int cnh) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
    }

    public String getNome() {// Função para pegar o nome dos respectivos jogadores.
        return this.nome;
    }

    public int getIdade() {// Função para pegar o tipo dos respectivos jogadores.
        return this.idade;
    }

    public int getCnh() {// Função para pegar o tipo dos respectivos jogadores.
        return this.cnh;
    }

    public int getJogoGeneral(int i) { // Função para pegar as jogadas da "ficha" dos respectivos jogadores.
        return this.jogoGeneral.getJogadas(i);
    }

    public JogoGeneral getJogo() { //para acessar por outra classe o jogo de cada jogador
        return this.jogoGeneral;
    }

    public void dell(){ //deleta os dados do jogador
        this.nome=null;
        this.tipoJogador=null;
        this.jogoGeneral=null;
    }

    public void mostrarJogadasExecutadas() {
        // Jogadas já feitas
		for (int i = 0 ; i < 13 ; i++) { 
			if(this.jogoGeneral.getJogadas(i) !=-1) {
				System.out.printf("%d\t", this.jogoGeneral.getJogadas(i)); 
			} 
            else if(this.jogoGeneral.getJogadas(i) ==-1) {
				System.out.print("-\t");
			}
		}
		System.out.println("");
    }

}