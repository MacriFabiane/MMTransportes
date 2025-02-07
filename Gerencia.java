import java.util.Date;
import java.util.Scanner;
import java.io.Serializable;
import java.time.LocalDate;

public class Gerencia implements Serializable {

    private LocalDate hoje = LocalDate.now();
    private int mesAtual = hoje.getMonthValue();
    private Motorista[] motoristas;
    private Caminhao[] caminhoes;
    private int n = 20; //suporta só até 20 motoristas
    private double somaSalarios = 0;

    //Construtor
    public Gerencia() {
        this.n = 20;
        this.motoristas = new Motorista[n];
        this.caminhoes = new Caminhao[n];

        for (int i=0; i<motoristas.length; i++){
            motoristas[i] = null; //define cada elemento como nulo
        }
        for (int i=0; i<caminhoes.length; i++){
            caminhoes[i] = null; //define cada elemento como nulo
        }
    }

    public void registrarMotorista(){ //exemplo em campeonato
        //logica para checkar o caminhão q não tá em uso e definir a placa
        
    }

    public void registrarcaminhao(){

    }

    public String gerarListaMotoristaSalario(){
        //vai precisar chamar o soma salarios aqui
    }

    public double calcularTotalSalarios(){
        
        for (int i=0; i<motoristas.length; i++){

            if(motoristas[i] != null)//se o motorista existir
                somaSalarios += motoristas[i].getSalFixo();

        }

        return  somaSalarios;
    }

    public String gerearRelatorioLeDTotais(){ //gera relatorio de lucros e despesas totais do mes
        //vai chamar aui somar lucros e somar desesas e o diflucdes
    }
    
    public double somarLucros(){
        
    }

    public double somarDespesas(){

    }

    public double calcularDifLucDes(){
        //chamar soma des e soma luc aqui
    }
}
