import java.util.HashMap;
import java.util.Map;

public class Registro {
    protected Map<Email, Usuario> mapaUsuarios = new HashMap<>();

    //Construtor
    public Registro(String email, String senha) throws Exception {
        //Atributos
        Usuario usuario = new Usuario(email, senha);

        if(mapaUsuarios.containsKey(usuario.getEmail())){
            throw new Exception("Este e-mail já foi cadastrado.");
        }
        mapaUsuarios.put(usuario.getEmail(), usuario);
        System.out.println("Usuário cadastrado com sucesso.");
    }

    //Métodos
}
