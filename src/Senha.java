public class Senha {
    private String texto;

    public Senha(String texto) throws Exception {
        if (!senhaForte(texto)) {
            throw new Exception("A senha deve conter no mínimo 8 caracteres, uma letra maiúscula, uma minúscula, um número e um caractere especial.");
        }
        this.texto = texto;
    }

    private boolean senhaForte(String senha) {
        return senha != null && senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
    }

    public String getTexto() {
        return texto;
    }
}
