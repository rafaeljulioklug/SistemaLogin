import java.util.HashMap;
import java.util.Map;

public class Registro {
    private Map<String, Usuario> mapaUsuarios = new HashMap<>();

    public void cadastrar(Email email, Senha senha) throws Exception {
        if (mapaUsuarios.containsKey(email.getEndereco())) {
            throw new Exception("E-mail já cadastrado.");
        }

        Usuario usuario = new Usuario(email, senha);
        mapaUsuarios.put(email.getEndereco(), usuario);
    }

    public Usuario buscarUsuario(String email) {
        return mapaUsuarios.get(email);
    }
}
