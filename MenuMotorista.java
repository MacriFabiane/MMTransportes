import java.util.Scanner;

public class MenuMotorista {
    public MenuMotorista(){
        Motorista motorista = new Motorista();
        Scanner teclado = new Scanner (System.in);
        String opcao;
        boolean saida=false;

        do{
            System.out.println ("..:: Menu Interativo Motorista:..");
            System.out.println ("(a) Para Registrar viagem ");
            System.out.println ("(b) Para Gerar holerite " );
            System.out.println ("(c) Para Registrar Despesas do Caminhão ");
            System.out.println ("(d) Voltar para a Página Principal");
            System.out.println("Entre com uma opção do menu: ");
            opcao = teclado.nextLine( );

            switch(opcao){
                case "a":
                    motorista.registrarViagem();
                    break;
                case "b":
                    motorista.gerarHolerite();
                    break;
                case "c":
                    motorista.registrarDespesas();
                    break;
                case "d":
                    System.out.println ("Saindo");
                    saida=true;
                    break;
                default :
                    System.out.println ("Opcao invalida. Tente novamente");
            }
        }while(saida==false);
    }
}
