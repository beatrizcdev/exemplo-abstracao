import dados.Dados;
import java.util.Scanner;
public class Main{

    public static void main(String[] args){

        //Declarações:
        Scanner entrada = new Scanner(System.in);
        String usuario = "", senha = "";
        Dados dados = new Dados("bia", "sd45");

        //Entradas:

        //fazer login{

        System.out.println("Insira o Usuário");
        usuario = entrada.nextLine();

        System.out.println("Insira a Senha");
        senha = entrada.nextLine();
        
        // }

        //processamento e saídas

        if (fazerLogin(usuario, senha, dados)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }
    
        
        entrada.close();
    }

    public static boolean fazerLogin(String usuario, String senha, Dados dados) {

        return usuario.equals(dados.getLogin()) && senha.equals(dados.getSenha());
    }
}