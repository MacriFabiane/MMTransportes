import java.util.Scanner;
public class MenuLogin {
       
    public static void main(String[] args){
        Motorista motorista = new Motorista();
        Scanner teclado = new Scanner (System.in);
        int opcao;
        String user, senha;
        boolean saida=false;

        do{
            System.out.println ("..::  Seja bem-vindo à:  ::..");
            System.out.println ("..::  M&M TRANSPORTES  ::..");
            System.out.println ("..:: Menu interativo ::..");
            System.out.println ("(1) Para Fazer Login Como Gerente ");
            System.out.println ("(2) Para Fazer Login como Motorista" );
            System.out.println ("(3) Sair da aplicação");
            System.out.println("Entre com uma opção do menu: ");
            opcao = teclado.nextInt( );

            switch(opcao){
                case 1:
                    System.out.println("Digite seu nome completo:");
                    user = teclado.nextLine();
                    System.out.println("Digite sua senha:");
                    senha = teclado.nextLine();

                    if(validarUsuario(user, senha) == true){  
                        MenuGerente(); ///ver como eu chamo isso aqui
                    }
                    else {
                        System.out.println("Bah! Nome ou senha incorreta! Tente novamente.");
                        System.out.println("Caso o problema persistir entre em contato com o Administrador para recuperar sua senha.");
                    }
                    break;
                case 2:
                    System.out.println("Digite seu nome completo:");
                    user = teclado.nextLine();
                    System.out.println("Digite sua senha:");
                    senha = teclado.nextLine();

                    if(validarUsuario(user, senha) == true){  
                        new MenuMotorista(); ///ver como eu chamo isso aqui
                    }
                    else {
                        System.out.println("Bah! Nome ou senha incorreta! Tente novamente.");
                        System.out.println("Caso o problema persistir entre em contato com o seu Gerente para recuperar ou redefinir sua senha.");
                    }
                    break;
                case 3:
                    System.out.println ("Saindo");
                    saida=true;
                    break;
                default :
                    System.out.println ("Opcao invalida. Tente novamente");
            }
        }while(saida==false);
        teclado.close();
    }

    public Boolean validarUsuario(String nome, String senha){ //fazer a validadação aqui

    }
 }

 