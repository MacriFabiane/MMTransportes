import java.io.Serializable;
public class Caminhao implements Serializable{
    private String placa = new String();
    private String chassi = new String();
    private boolean emUso;
   

    // Construtor
    public Caminhao(String placa, String chassi, Boolean emUso) {
        this.placa = placa;
        this.chassi = chassi;
        this.emUso = emUso;
    }

    public String getPlaca() {// Função para pegar a placa do caminhão.
        return this.placa;
    }

    public String getChassi() {// Função para pegar o chassi do caminhão.
        return this.chassi;
    }

    public boolean getEmUso() {// Função para ver se o caminhão está em uso.
        return this.emUso;
    }

    public void setEmUso(boolean x) {//vai colocar a pontuação das jogadas
        emUso = x;
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