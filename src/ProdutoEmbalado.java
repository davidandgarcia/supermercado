public class ProdutoEmbalado extends Produto{

    private String datavalidade;

    public ProdutoEmbalado(String codBarras, float preco, String nome, String datavalidade, int quantidade) {
        super(codBarras, preco, nome);
        this.datavalidade = datavalidade;
        this.quantidade = quantidade;
    }

    public String getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(String datavalidade) {
        this.datavalidade = datavalidade;
    }

    public int verQuantidade(){
        return quantidade;
    }
}