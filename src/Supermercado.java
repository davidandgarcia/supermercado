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

        do {
            do {
                System.out.println("\nSupermercado David Garcia\n");
                System.out.println("Escolha uma opção:");
                System.out.println("A- Adicionar stock");
                System.out.println("V- Efetuar uma venda");
                System.out.println("G- Novo produto granel");
                System.out.println("E- Novo produto embalado");
                System.out.println("C- Novo cabaz");
                System.out.println("S- Sair");
                System.out.println("");
                escolha = scMenu.next().charAt(0);
                escolha = Character.toLowerCase(escolha);
            } while (!(escolha == 'a' || escolha == 'v' || escolha == 'g' || escolha == 'e' || escolha == 'c' || escolha == 's'));
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
                            break;
                        case 'g':
                            break;
                    }
                    break;
                case 'v':
                    System.out.println("Processamento de venda numero" + ".");
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

                    ProdutoGranel produtoGranel1 = new ProdutoGranel(codBarrasGranel, precoGranel, nomeGranel, pesoGranel);
                    System.out.println("Foi adicionado um novo produto a granel");
                    System.out.println("Cod Barras : " + produtoGranel1.getCodBarras() + " | Nome: " + produtoGranel1.getNome() +
                            " | Peso: " + produtoGranel1.getPeso() + " | Preço: " + produtoGranel1.getPreco());
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
                            " | Validade: " + produtoEmbalado1.getDatavalidade() + " | Quantidade: " + produtoEmbalado1.getQuantidade() +
                            " | Preço: " + produtoEmbalado1.getPreco());
                case 'c':
                    System.out.println("Novo cabaz");
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

