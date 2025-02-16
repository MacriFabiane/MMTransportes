public class Viagem {

    double kmIni, kmFin, valorTonelada, pesoCarga, valorFrete, comissao;
    String origem, destino, carregamento;
    
    public Viagem (String origem, String destino, String carregamento, double kmIni, double kmFin, double valorTonelada, double pesoCarga, double valorFrete, double comissao){
        this.origem = origem;
        this.destino = destino;
        this.carregamento = carregamento;
        this.kmIni = kmIni;
        this.kmFin = kmFin;
        this.valorTonelada = valorTonelada;
        this.pesoCarga = pesoCarga;
        this.valorFrete = valorFrete;
        this.comissao = comissao;
    }

    public String getOrigem(){
        return this.origem;
    }

    public String getDestino(){
        return this.destino;
    }

    public String getCarregamento(){
        return this.carregamento;
    }

    public double getKmIni(){
        return this.kmIni;
    }
    
    public double getKmFim(){
        return this.kmFin;
    }

    public double getValorTonelada(){
        return this.valorTonelada;
    }

    public double getvalorFrete(){
        return this.valorFrete;
    }

    public double getPesoCarga(){
        return this.pesoCarga;
    }

    public double getComissao(){
        return this.comissao;
    }

    public void setOrigem(String origem){
        this.origem = origem;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public void setCarregamento(String carregamento){
        this.carregamento = carregamento;
    }

    public void setKmIni(double kmIni){
        this.kmIni = kmIni;
    }

    public void setKmFin(double kmFin){
        this.kmFin = kmFin;
    }

    public void setValorTonelada(double valorTonelada){
        this.valorTonelada = valorTonelada;
    }

    public void setPesoCarga(double pesoCarga){
        this.pesoCarga = pesoCarga;
    }

    public void setValorFrete(double valorFrete){ //calculado automaticamente
        this.valorFrete = valorFrete;
    }

    public void setComissao(double comissao){ //calculado automaticamente
        this.comissao = comissao;
    }
    
}

