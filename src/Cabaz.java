import java.util.ArrayList;

public class Cabaz extends Produto {

    private int desconto;
    private ArrayList<Produto> produtos;

    public Cabaz(String codBarras, float preco, String nome, int desconto, ArrayList<Produto> produto) {
        super(codBarras, preco, nome);
        this.produtos = produto;
        this.quantidade = 0;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
