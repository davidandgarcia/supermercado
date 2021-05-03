public class Produto {

    //variaveis
    private String codBarras;
    private float preco;
    private String nome;

    //construtor
    public Produto(String codBarras, float preco, String nome) {
        this.codBarras = codBarras;
        this.preco = preco;
        this.nome = nome;
    }

    //Getters
    public String getCodBarras() {
        return codBarras;
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    //Setters
    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
