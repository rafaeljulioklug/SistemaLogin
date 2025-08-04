public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();
        Login login = new Login(registro);

        try {
            Email email = new Email("rafa@teste.com");
            Senha senha = new Senha("Senha@123");
            registro.cadastrar(email, senha);
        } catch (Exception e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }

        boolean autenticado = login.autenticar("rafa@teste.com", "Senha@123");
        System.out.println("Autenticação: " + (autenticado ? "sucesso" : "falha"));
    }
}
