import java.util.Date;

public class Abastecimento {
        private String nome = new String(); 
        private double litragem, valor;
        private Date data;

    public Abastecimento(String nome, double litragem, double valor, Date data){
        this.nome = nome;
        this.litragem = litragem;
        this.valor = valor;
        this.data = data;
    }

    public String getNome() {// Função para pegar o nome do lugar do abastecimento.
        return this.nome;
    }

    public double getLitragem() {// Função para pegar a litragem abastecida.
        return this.litragem;
    }

    public double getValor() {// Função para pegar o valor abastecido.
        return this.valor;
    }

    public Date getData() {// Função para pegar a data do abastecimento.
        return this.data;
    }
}
