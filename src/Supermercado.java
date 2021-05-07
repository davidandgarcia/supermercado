import java.awt.desktop.SystemEventListener;
import java.util.Locale;
import java.util.Scanner;

public class Supermercado {
    private static char escolha;
    private static char categoria;


    public static void main(String[] args) {

        Scanner scMenu = new Scanner(System.in);
        Scanner scCategoria = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        Stocks stock = new Stocks();

        do {
            do {
                System.out.println("\nSupermercado David Garcia\n");
                System.out.println("Escolha uma opção:");
                System.out.println("A- Aumentar stock");
                System.out.println("V- Efetuar uma venda");
                System.out.println("G- Novo produto granel");
                System.out.println("E- Novo produto embalado");
                System.out.println("L- Listar todos os produtos");
                System.out.println("C- Novo cabaz");
                System.out.println("S- Sair");
                System.out.println("");
                escolha = scMenu.next().charAt(0);
                escolha = Character.toLowerCase(escolha);
            } while (!(escolha == 'a' || escolha == 'l'  || escolha == 'v' || escolha == 'g' || escolha == 'e' || escolha == 'c' || escolha == 's'));
            switch (escolha) {
                case 'a':
                    System.out.println("Adicionar stock a um produto");
                    do {
                        System.out.println("Em que categoria se encontra esse produto (Embalado(E) / Granel(G))");
                        categoria = scCategoria.next().charAt(0);
                        categoria = Character.toLowerCase(categoria);
                    } while (!(categoria == 'e' || categoria == 'g'));
                    switch (categoria) {
                        case 'e':
                            System.out.println("ADICIONAR STOCK A PRODUTO EMBALADO");
                            stock.listarProdutosEmbalados();
                            if(stock.produtosEmbalados.isEmpty()){
                                System.out.println("Nao existem produtos embalado em stock, adicione na opcao E");
                            }else{
                                System.out.println("Adicionar stock ao produto...");
                                System.out.println("Codigo de barras: ");
                                Scanner referenciaEmbalado = new Scanner(System.in);
                                String referencia;
                                referencia = referenciaEmbalado.nextLine();
                                stock.aumentaEmbalado(referencia);
                                stock.listarProdutosEmbalados();
                            }
                            break;
                        case 'g':
                            System.out.println("ADICIONAR STOCK A PRODUTO GRANEL");
                            stock.listarProdutosGranel();
                            if(stock.produtosAGranel.isEmpty()){
                                System.out.println("Nao existem produtos a granel em stock, adicione na opcao G");
                            }else{
                                System.out.println("Adicionar stock ao produto...");
                                System.out.println("Codigo de barras: ");
                                Scanner referenciaGranel = new Scanner(System.in);
                                String referencia;
                                referencia = referenciaGranel.nextLine();
                                stock.aumentaGranel(referencia);
                                stock.listarProdutosGranel();
                            }
                            break;
                    }
                    break;
                case 'v':
                    System.out.println("PROCESSAMENTO DE UMA NOVA VENDA");
                    break;
                case 'g':
                    System.out.println("NOVO PRODUTO A GRANEL");
                    System.out.println("Cod Barras: ");
                    String codBarrasGranel = scanner.nextLine();

                    System.out.println("Nome: ");
                    String nomeGranel = scanner.nextLine();

                    System.out.println("Peso: ");
                    Float pesoGranel = scanner.nextFloat();

                    System.out.println("Preço: ");
                    Float precoGranel = scanner.nextFloat();

                    System.out.println("Quantidade: ");
                    Integer quantidadeGranel = scanner.nextInt();

                    ProdutoGranel produtoGranel1 = new ProdutoGranel(codBarrasGranel, precoGranel, nomeGranel, pesoGranel, quantidadeGranel);
                    System.out.println("Foi adicionado um novo produto a granel");
                    System.out.println("Cod Barras : " + produtoGranel1.getCodBarras() + " | Nome: " + produtoGranel1.getNome() +
                            " | Peso: " + produtoGranel1.getPeso() + " | Preço: " + " | Quantidade: " + produtoGranel1.getQuantidade());
                    break;
                case 'e':
                    System.out.println("NOVO PRODUTO EMBALADO");
                    System.out.println("Cod Barras: ");
                    String codBarrasEmbalado = scanner.nextLine();
                    System.out.println("Nome: ");
                    String nomeEmbalado = scanner.nextLine();
                    System.out.println("Validade: ");
                    String datavalidadeEmbalado = scanner.nextLine();
                    System.out.println("Quantidade: ");
                    Integer quantidadeEmbalado = scanner.nextInt();
                    System.out.println("Preço: ");
                    Float precoEmbalado = scanner.nextFloat();
                    ProdutoEmbalado produtoEmbalado1 = new ProdutoEmbalado(codBarrasEmbalado, precoEmbalado, nomeEmbalado, datavalidadeEmbalado, quantidadeEmbalado);
                    System.out.println("Foi adicionado um novo produto embalado");
                    System.out.println("Cod Barras : " + produtoEmbalado1.getCodBarras() + " | Nome: " + produtoEmbalado1.getNome() +
                            " | Validade: " + produtoEmbalado1.getDatavalidade() + " | Preço: " + produtoEmbalado1.getPreco() + " | Quantidade: " + produtoEmbalado1.getQuantidade());
                    stock.inserirEmbalado(produtoEmbalado1);
                    break;
                case 'c':
                    System.out.println("NOVO CABAZ");
                    System.out.println("Quais os produtos disponiveis para adicionar a um novo cabaz");
                    stock.listarProdutosEmbalados();
                    stock.listarProdutosGranel();
                    System.out.println("-----------");
                    System.out.println("Cod Barras: ");
                    String codBarrasCabaz = scanner.nextLine();
                    System.out.println("Nome: ");
                    String nomeCabaz = scanner.nextLine();
                    System.out.println("Desconto: ");
                    Integer descontoCabaz = scanner.nextInt();
                    System.out.println("Preço: ");
                    Integer precoCabaz = scanner.nextInt();
                    //ESCOLHER OS PRODUTOS DISPONIVEIS

                    //Cabaz cabaz1 = new Cabaz(codBarrasCabaz, precoCabaz, nomeCabaz, descontoCabaz, lista de produtos)
                    //stock.inserirCabaz(cabaz1);
                    break;
                case 'l':
                    System.out.println("LISTAR TODOS OS PRODUTOS EXISTENTES");
                    stock.listarProdutosEmbalados();
                    stock.listarProdutosGranel();
                    stock.listarCabazes();
                    break;
                case 's':
                    System.out.println("Até à próxima!");
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    break;
            }
        } while (!(escolha == 's'));
    }
}

