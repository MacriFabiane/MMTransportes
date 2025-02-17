import java.util.Date;
import java.util.Scanner;
import java.io.Serializable;
import java.time.LocalDate;

public class Gerencia implements Serializable {

    public LocalDate hoje = LocalDate.now();
    public int mesAtual = hoje.getMonthValue();
    public Motorista[] motoristas;
    public Caminhao[] caminhoes;
    public int n = 5; //suporta só até 5 motoristas/caminhoes
    public double somaSalarios = 0;
    public String nomeGerente, senhaGerente;


    //Construtor
    public Gerencia() {
        this.n = 5;
        this.motoristas = new Motorista[n];
        this.caminhoes = new Caminhao[n];
        this.nomeGerente = "Lucilia Araki"; //gerente pré cadastrado
        this.senhaGerente = "12345";

        for (int i=0; i<motoristas.length; i++){
            motoristas[i] = null; //define cada elemento como nulo
        }
        for (int i=0; i<caminhoes.length; i++){
            caminhoes[i] = null; //define cada elemento como nulo
        }
    }

    public void registrarcaminhao(){
        for(int i=0; i<5 ; i++){
            if(caminhoes[i] != null){
                
            }
        }
        
    }

    public void registrarMotorista(){ //exemplo em campeonato
        //logica para checkar o caminhão q não tá em uso e definir a placa
        
    }

    public void gerarListaMotoristaSalario(){
        //vai precisar chamar o soma salarios aqui
        //SÓ PRINTAR NA TELA
    }

    public double calcularTotalSalarios(){ //total salario do motorista (salario fixo mais as comissões das viagens do mês)
        
        for (int i=0; i<motoristas.length; i++){

            if(motoristas[i] != null)//se o motorista existir
                somaSalarios += motoristas[i].getSalFixo(); //vai ter que somar tbm a comissão de cada viagem

        }

        return  somaSalarios;
    }

    public void gerearRelatorioLeDTotais(){ //gera relatorio de lucros e despesas totais do mes
        //vai chamar aui somar lucros e somar desesas e o diflucdes
        //so printar 
    }
    
    public double somarLucros(){
        
    }

    public double somarDespesas(){
        if(motorista.registrarDespesas)


    }

    public double calcularDifLucDes(){
        //chamar soma des e soma luc aqui
        
    }

    public void gerarListaDespesasLucrosTotaisMotoristaPlaca(){
        //printar na tela só
    }
}
