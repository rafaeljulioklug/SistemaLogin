public class Usuario {
    private Email email;
    private Senha senha;

    public Usuario(Email email, Senha senha) {
        this.email = email;
        this.senha = senha;
    }

    public Email getEmail() {
        return email;
    }

    public Senha getSenha() {
        return senha;
    }
}
