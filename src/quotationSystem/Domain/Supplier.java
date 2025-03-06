package quotationSystem.Domain;

public class Supplier {
    private String nome;

    public Supplier(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
