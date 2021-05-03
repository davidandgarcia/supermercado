import java.util.Scanner;
mas que grande merda
public class Supermercado {
    private static String escolha;
    private static String categoria;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
                escolha = sc.nextLine();
            } while (!(escolha.equals("a") && escolha.equals("A")) &&
                    (escolha.equals("v") && escolha.equals("V")) &&
                    (escolha.equals("g") && escolha.equals("G")) &&
                    (escolha.equals("e") && escolha.equals("E")) &&
                    (escolha.equals("c") && escolha.equals("C")) &&
                    (escolha.equals("s") && escolha.equals("S")));

            switch (escolha) {
                case "a":
                case "A":
                    System.out.println("Adicionar stock a um produto");
                    do {
                        System.out.println("Em que categoria se encontra esse produto (Embalado(E) / Granel(G))");
                        categoria = sc.nextLine();
                    }while(categoria.equals("e") && categoria.equals("E") && categoria.equals("g") && categoria.equals("G"));
                    switch (categoria) {
                        case "e":
                        case "E":
                            break;
                        case "g":
                        case "G":
                            break;


                    }

                case "v":
                case "V":
                    System.out.println("Processamento de venda numero" + ".");
                    break;
                case "g":
                case "G":
                    System.out.println("Novo produto a granel");
                    break;
                case "e":
                case "E":
                    System.out.println("Novo produto embalado");
                    break;
                case "c":
                case "C":
                    System.out.println("Novo cabaz");
                    break;
                case "s":
                case "S":
                    System.out.println("Até à próxima!");
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    break;
            }
        } while (!(escolha.equals("s") || escolha.equals("S")));
    }
}

