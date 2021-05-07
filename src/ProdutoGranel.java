public class ProdutoGranel extends Produto {
    private float peso;

    public ProdutoGranel(String codBarras, float preco, String nome, float peso, int quantidade) {
        super(codBarras, preco, nome);
        this.peso = peso;
        this.quantidade = quantidade;
    }

    public Float getPeso(){
        return peso;
    }

    public Float getPrecoFinal(){
        return peso;
    }


}
