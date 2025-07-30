public class Usuario {

    //Atributos
    private Email email;
    private Senha senha;

    //Construtor
    public Usuario(String email, String senha) throws Exception {
        this.email = new Email(email);
        this.senha = new Senha(senha);
    }

    //Métodos
    public Email getEmail(){
        return email;
    }

    public Senha getSenha(){
        return senha;
    }
}
