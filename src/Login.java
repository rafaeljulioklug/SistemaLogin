public class Login {
    private Registro registro;

    public Login(Registro registro) {
        this.registro = registro;
    }

    public boolean autenticar(String email, String senhaDigitada) {
        Usuario usuario = registro.buscarUsuario(email);
        if (usuario != null) {
            return usuario.getSenha().getTexto().equals(senhaDigitada);
        }
        return false;
    }
}
