public class Viagem {
    //colocar construtor de viagem

    double kmIni, Kmfin, valorTonelada, pesoCarga, valorFrete, comissao;
    String origem, destino, carregamento;
    
    public Viagem (String origem, String destino, String carregamento, double kmIni, double Kmfin, double valorTonelada, double pesoCarga, double valorFrete, double comissao){
        this.origem = origem;
        this.destino = destino;
        this.carregamento = carregamento;
        this.kmIni = kmIni;
        this.Kmfin = Kmfin;
        this.valorTonelada = valorTonelada;
        this.pesoCarga = pesoCarga;
        this.valorFrete = valorFrete;
        this.comissao = comissao;
    }
}
