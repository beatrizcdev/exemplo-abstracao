package dados;

public class Dados {

    static int numeroDeUsuarios;

    private String login;
    private String senha;

    public Dados(String login, String senha){

        this.login = login;
        this.senha = senha;

        numeroDeUsuarios ++;

    }

    public String getLogin(){
        return login;
    }

    public String getSenha(){
        return senha;
    }
}


