import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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

    public void inserirGranel(ProdutoGranel insertGranel) {
        produtosAGranel.add(insertGranel);
    }

    public void inserirEmbalado(ProdutoEmbalado insertEmbalado) {
        produtosEmbalados.add(insertEmbalado);
    }

    public void inserirCabaz(Cabaz insertCabaz) {
        cabazes.add(insertCabaz);
    }

    public Stocks() {
        this.produtosAGranel = new ArrayList<ProdutoGranel>();
        this.cabazes = new ArrayList<Cabaz>();
        this.produtosEmbalados = new ArrayList<ProdutoEmbalado>();
    }

    public void listarProdutosGranel() {
        System.out.println("Lista de todos os produtos a granel");
        Iterator<ProdutoGranel> it = produtosAGranel.iterator();

        while (it.hasNext()) {
            ProdutoGranel produtoGranel = it.next();
            System.out.println("Cod Barras : " + produtoGranel.getCodBarras() + " | Nome: " + produtoGranel.getNome() +
                    " | Peso: " + produtoGranel.getPeso() + " | Preço: " + produtoGranel.getPreco() + " | Quantidade: " + produtoGranel.getQuantidade());
        }
    }

    public void listarProdutosEmbalados() {
        System.out.println("Lista de todos os produtos embalados");
        Iterator<ProdutoEmbalado> it = produtosEmbalados.iterator();

        while (it.hasNext()) {
            ProdutoEmbalado produtoEmbalado = it.next();
            System.out.println("Cod Barras : " + produtoEmbalado.getCodBarras() + " | Nome: " + produtoEmbalado.getNome() +
                    " | Validade: " + produtoEmbalado.getDatavalidade() + " | Preço: " + produtoEmbalado.getPreco() + " | Quantidade: " + produtoEmbalado.getQuantidade());
        }
    }

    public void listarCabazes() {
        System.out.println("Lista de todos os cabazes");
        Iterator<Cabaz> it = cabazes.iterator();

        while (it.hasNext()) {
            Cabaz cabaz = it.next();
            System.out.println("Cod Barras : " + cabaz.getCodBarras() + " | Nome: " + cabaz.getNome() + " | Preço: " + cabaz.getPreco() + " | Desconto: " + cabaz.getDesconto() + " | Quantidade: " + cabaz.getQuantidade());
        }
    }

    public void aumentaEmbalado(String cod) {
        boolean found = false;
        Iterator<ProdutoEmbalado> it = produtosEmbalados.iterator();
        while (!found && it.hasNext()) {
            ProdutoEmbalado prodemb = it.next();
            if (prodemb.getCodBarras().equals(cod)) {
                found = true;

                int quant;
                Scanner scquant = new Scanner(System.in);
                System.out.println("Quantidade que deseja adicionar:");
                quant = scquant.nextInt();
                prodemb.quantidade += quant;
                System.out.println("Stock alterado com sucesso.");
            }
        }
    }

    public void aumentaGranel(String cod) {
        boolean found = false;
        Iterator<ProdutoGranel> it = produtosAGranel.iterator();
        while (!found && it.hasNext()) {
            ProdutoGranel prodgranel = it.next();
            if (prodgranel.getCodBarras().equals(cod)) {
                found = true;

                int quant;
                Scanner scquant = new Scanner(System.in);
                System.out.println("Quantidade que deseja adicionar:");
                quant = scquant.nextInt();
                prodgranel.quantidade += quant;
                System.out.println("Stock alterado com sucesso.");
            }
        }
    }
}