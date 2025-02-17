public class Manutencao {
    private String nome = new String(); 
    private String descricao = new String(); 
    private double valor;
    private String data;

    public Manutencao(String nome, String descricao, double valor, String data){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public String getNome() {// Função para pegar o nome do lugar da manutenção.
        return this.nome;
    }

    public String getDescricao() {// Função para pegar a descrição da manutenção.
        return this.descricao;
    }

    public double getValor() {// Função para pegar o valor da manutenção.
        return this.valor;
    }

    public String getData() {// Função para pegar a data da manutenção.
        return this.data;
    }
}
