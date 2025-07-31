import java.util.HashMap;
import java.util.Map;

public class Registro {
    protected Map<Email, Usuario> mapaUsuarios = new HashMap<>();


    public void cadastrarUsuario(String email, String senha) throws Exception {
        Email chave = new Email(email);
        if (mapaUsuarios.containsKey(chave)) {
            throw new Exception("Este e-mail já foi cadastrado.");
        }
        Usuario novoUsuario = new Usuario(email, senha);
        mapaUsuarios.put(chave, novoUsuario);
        System.out.println("Usuário cadastrado com sucesso.");
    }


    public boolean autenticarUsuario(String email, String senha) throws Exception {
        Email chave = new Email(email);
        Usuario usuario = mapaUsuarios.get(chave);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            System.out.println("Login realizado com sucesso.");
            return true;
        } else {
            System.out.println("E-mail ou senha incorretos.");
            return false;
        }
    }


    public boolean removerUsuario(String email) throws Exception {
        Email chave = new Email(email);
        if (mapaUsuarios.containsKey(chave)) {
            mapaUsuarios.remove(chave);
            System.out.println("Usuário removido.");
            return true;
        } else {
            System.out.println("Usuário não encontrado.");
            return false;
        }
    }


    public void listarUsuarios() {
        if (mapaUsuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        for (Map.Entry<Email, Usuario> entry : mapaUsuarios.entrySet()) {
            System.out.println("Email: " + entry.getKey().getEmail());
        }
    }
}
