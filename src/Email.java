public class Email {
    private String email;

    //Construtor
    public Email(String email) throws Exception {
        this.setEmail(email);
    }

    //Métodos
    public boolean validarEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) throws Exception {
        if(!validarEmail(email)){
            throw new Exception("E-mail inválido.");
        }
        this.email=email;
    }
}
