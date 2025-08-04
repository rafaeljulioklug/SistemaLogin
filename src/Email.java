public class Email {
    private String endereco;

    public Email(String endereco) throws Exception {
        if (!validar(endereco)) {
            throw new Exception("Formato de e-mail inválido.");
        }
        this.endereco = endereco;
    }

    private boolean validar(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Email)) return false;
        Email outro = (Email) obj;
        return endereco.equalsIgnoreCase(outro.endereco); // ignora maiúsculas
    }

    @Override
    public int hashCode() {
        return endereco.toLowerCase().hashCode();
    }
}
