public class Produto {
    private String nome;
    private double valor;
    private String termo;

    public Produto(String nome, double valor, String termo) {
        this.nome = nome;
        this.valor = valor;
        this.termo = termo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;

    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

}
