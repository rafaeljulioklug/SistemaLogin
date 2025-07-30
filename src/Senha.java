public class Senha {
    //Atributos
    private String senha;

    //Construtor
    public Senha(String senha) throws Exception {
        this.setSenha(senha);
    }

    //Métodos
    public boolean validarSenha(String senha) {
        return senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if(!validarSenha(senha)){
            throw new Exception("Senha inválida.");
        }
        this.senha = senha;
    }

}
