import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Stocks {

    protected ArrayList<ProdutoGranel> produtosAGranel;
    protected ArrayList<ProdutoEmbalado> produtosEmbalados;
    protected ArrayList<Cabaz> cabazes;

    public ArrayList<ProdutoGranel> getProdutosAGranel() {
        return produtosAGranel;
    }

    public void setProdutosAGranel(ArrayList<ProdutoGranel> produtosAGranel) {
        this.produtosAGranel = produtosAGranel;
    }

    public ArrayList<ProdutoEmbalado> getProdutosEmbalados() {
        return produtosEmbalados;
    }

    public void setProdutosEmbalados(ArrayList<ProdutoEmbalado> produtosEmbalados) {
        this.produtosEmbalados = produtosEmbalados;
    }

    public ArrayList<Cabaz> getCabazes() {
        return cabazes;
    }

    public void setCabazes(ArrayList<Cabaz> cabazes) {
        this.cabazes = cabazes;
    }

    public void inserirGranel(ProdutoGranel insertGranel){
        produtosAGranel.add(insertGranel);
    }

    public void inserirEmbalado(ProdutoEmbalado insertEmbalado){
        produtosEmbalados.add(insertEmbalado);
    }

    public void inserirCabaz(Cabaz insertCabaz){
        cabazes.add(insertCabaz);
    }

    public Stocks(){
        this.produtosAGranel = new ArrayList<ProdutoGranel>();
        this.cabazes = new ArrayList<Cabaz>();
        this.produtosEmbalados = new ArrayList<ProdutoEmbalado>();
    }

    public void listarProdutosGranel(){
        System.out.println("Lista de todos os produtos a granel");
        Iterator<ProdutoGranel> itgranel = produtosAGranel.iterator();

        while(itgranel.hasNext()){
            ProdutoGranel produtoGranel = itgranel.next();
            System.out.println("Cod Barras : " + produtoGranel.getCodBarras() + " | Nome: " + produtoGranel.getNome() +
                    " | Peso: " + produtoGranel.getPeso() + " | Preço: " + produtoGranel.getPreco());
        }
    }

    public void listarProdutosEmbalados(){
        System.out.println("Lista de todos os produtos embalados");
        Iterator<ProdutoEmbalado> itembalados = produtosEmbalados.iterator();

        while(itembalados.hasNext()){
            ProdutoEmbalado produtoEmbalado = itembalados.next();
            System.out.println("Cod Barras : " + produtoEmbalado.getCodBarras() + " | Nome: " + produtoEmbalado.getNome() +
                    " | Validade: " + produtoEmbalado.getDatavalidade() + " | Preço: " + produtoEmbalado.getPreco());
        }
    }

    public void listarCabazes(){
        System.out.println("Lista de todos os cabazes");
        Iterator<Cabaz> itcabazes = cabazes.iterator();

        while(itcabazes.hasNext()){
            Cabaz cabaz = itcabazes.next();
            System.out.println("Cod Barras : " + cabaz.getCodBarras() + " | Nome: " + cabaz.getNome() + " | Preço: " + cabaz.getPreco() + " | Desconto: " + cabaz.getDesconto());
        }
    }
}
