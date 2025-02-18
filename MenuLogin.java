import java.util.Scanner;
public class MenuLogin {
    static int indiceMot =0;
    public static void main(String[] args){
        Gerencia gerencia = new Gerencia();
        Scanner teclado = new Scanner (System.in);
        String opcao;
        String user, senha;
        boolean saida=false;
        ;

        do{
            System.out.println ("..::  Seja bem-vindo à:  ::..");
            System.out.println ("..::  M&M TRANSPORTES  ::..");
            System.out.println ("..:: Menu interativo ::..");
            System.out.println ("(1) Para Fazer Login Como Gerente ");
            System.out.println ("(2) Para Fazer Login como Motorista" );
            System.out.println ("(3) Sair da aplicação");
            System.out.println("Entre com uma opção do menu: ");
            opcao = teclado.nextLine( );

            switch(opcao){
                case "1":
                    System.out.println("Digite seu nome completo:");
                    user = teclado.nextLine();
                    System.out.println("Digite sua senha:");
                    senha = teclado.nextLine();

                    boolean validacao= validarUsuario(user, senha, opcao, gerencia);
                    if(validacao == true){  
                        new MenuGerente(gerencia); ///ver se isso aqui funciona ou fazer o menu gerente ser um método e n um construtor
                    }
                    else {
                        System.out.println("Bah! Nome ou senha incorreta! Tente novamente.");
                        System.out.println("Caso o problema persistir entre em contato com o Administrador para recuperar sua senha.");
                    }
                    break;
                case "2":
                    System.out.println("Digite seu nome completo:");
                    user = teclado.nextLine();
                    System.out.println("Digite sua senha:");
                    senha = teclado.nextLine();

                    validacao = validarUsuario(user, senha, opcao, gerencia);
                    if(validacao == true){  
                        new MenuMotorista(gerencia, indiceMot); ///ver como eu chamo isso aqui
                    }
                    else {
                        System.out.println("Bah! Nome ou senha incorreta! Tente novamente.");
                        System.out.println("Caso o problema persistir entre em contato com o seu Gerente para recuperar ou redefinir sua senha.");
                    }
                    break;
                case "3":
                    System.out.println ("Saindo");
                    saida=true;
                    break;
                default :
                    System.out.println ("Opcao invalida. Tente novamente");
            }
        }while(saida==false);
        teclado.close();
    }

    public static Boolean validarUsuario(String nome, String senha, String tipoLogin, Gerencia gerencia){ //fazer a validadação aqui
        if(tipoLogin.equals("1") && nome.equals(gerencia.nomeGerente) && senha.equals(gerencia.senhaGerente)){ 
            return true;
        }
        if(tipoLogin.equals("2")){
            for (int i=0; i<gerencia.motoristas.length; i++){//vai percorrer todos os motoristas
                if(gerencia.motoristas[i]!=null){
                    indiceMot = i;
                    if(nome.equals(gerencia.motoristas[i].getNome()) && senha.equals(gerencia.motoristas[i].getSenhaMotorista())){
                        return true;
                    }
                }
            }
        }
        return false;
    }
 }

 