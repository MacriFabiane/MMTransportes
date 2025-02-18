import java.util.Scanner;

public class MenuGerente {
    public MenuGerente(){
        Gerencia gerencia = new Gerencia();
        Scanner teclado = new Scanner (System.in);
        String opcao;
        boolean saida=false;

        do{
            System.out.println ("..:: Menu Interativo Gerente:..");
            System.out.println ("(a) Para Registrar um Caminhão");
            System.out.println ("(b) Para Registrar um Motorista" );
            System.out.println ("(c) Para Gerar Folha de Pagamento dos Funcionários");
            System.out.println ("(d) Para Gerar Relatório de Lucros e Despesas Totais da Transportadora");
            System.out.println ("(e) Para Gerar Relatório de Lucros e Despesas da Transportadora Separado por Motorista e Placa");
            System.out.println ("(f) Voltar para a Página Principal");
            System.out.println("Entre com uma opção do menu: ");
            opcao = teclado.nextLine( );

            switch(opcao){
                case "a":
                    gerencia.registrarcaminhao();
                    break;
                case "b":
                    gerencia.registrarMotorista();
                    break;
                case "c":
                    gerencia.gerarListaMotoristaSalario();
                    break;
                case "d":
                    gerencia.gerearRelatorioLeDTotais();
                    break;
                case "e":
                    gerencia.gerarListaDespesasLucrosTotaisMotoristaPlaca();
                    break;
                case "f":
                    System.out.println ("Saindo");
                    saida=true;
                    break;
                default :
                    System.out.println ("Opcao invalida. Tente novamente");
            }
        }while(saida==false);
        //teclado.close();
    }
}