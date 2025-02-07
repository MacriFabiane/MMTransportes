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
}