import java.util.Scanner;
import java.io.Serializable;
import java.time.LocalDate;

public class Gerencia implements Serializable {

    private LocalDate hoje = LocalDate.now();
    private int mesAtual = hoje.getMonthValue();
    private Motorista[] motorista;
    private int n = 20; //suporta só até 20 motoristas
    private float somaSalarios = 0;

    //Construtor
    public Gerencia() {
        this.n = 20;
        this.motoristas = new Motrista[n];

        for (int i=0; i<motoristas.lenth; i++){
            motoristas[i] = null; //define cada elemento como nulo
        }
    }

    public registrarMotorista(nome, CNH, dataAdm, dataDem, placa, comissao, salario, senha){

    }

    public gerarListaMotoristaSalario(){

    }

    public calcularTotalSalarios(){
        
        for (int i=0; i<motoristas.lenth; i++){
           somaSalarios = motoristas[i].salario;
        }

    }
    
}
