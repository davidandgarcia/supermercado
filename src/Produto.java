public class Produto {

    //variaveis
    private String codBarras;
    private float preco;
    private String nome;
    protected int quantidade;

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

    public int getQuantidade() {
        return quantidade;
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

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    //Metodos

    public void aumentaQuantidade(int quantidade){
        this.quantidade += quantidade;

    }
}
