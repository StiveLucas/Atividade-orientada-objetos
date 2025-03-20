import java.util.ArrayList;
import java.util.Scanner;

public class camisaApp{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Camisa> list = new ArrayList<>();

        int codigo = -1;
        while (codigo != 0) {

            System.err.println("\n=== Menu ===");
            System.err.println("Código | Descrição");
            System.err.println("1 | Cadastrar Camisa");
            System.err.println("2 | Listar Camisas");
            System.err.println("3 | Atualizar Camisas");
            System.err.println("4 | Remover Camisas");
            System.err.println("0 |  Sair");

            System.err.println("Digite o Codigo:");
            codigo = sc.nextInt();

            switch (codigo) {
                case 1:

                    System.out.println("Digite a cor da camisa: ");
                    String cor = sc.next();

                    System.out.println("Digite o tamanho da camisa: ");
                    Double tamanho = sc.nextDouble();

                    System.out.println("Digite o tipo da camisa: ");
                    String tipo = sc.next();

                    list.add(new Camisa(cor, tamanho, tipo));
                    System.out.println("Camisa cadastrada com sucesso!");
                    break;

                case 2:

                    System.out.println("\n=== Lista de Camisas ===");

                    //O Comando is.Empty verifica se a lista está vazia.
                    if (list.isEmpty()) {
                        System.out.println("Nenhuma camisa cadastrada.");
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println("Índice: " + i + " | " + list.get(i));

                        }
                    }

                    break;

                case 3:

                    System.out.println("\n=== Atualizar Camisa ===");

                    //O Comando is.Empty verifica se a lista está vazia.
                    if (list.isEmpty()) {
                        System.out.println("Nenhuma camisa cadastrada.");
                        break;
                    }

                    System.out.print("Digite o índice da camisa a ser atualizada: ");
                    int indiceAtualizar = sc.nextInt();

                    if (indiceAtualizar < 0 || indiceAtualizar >= list.size()) {
                        System.out.println("❌ Índice inválido.");
                        break;
                    }

                    System.out.print("Nova cor: ");
                    String novaCor = sc.next();

                    System.out.print("Novo tamanho: ");
                    double novoTamanho = sc.nextDouble();

                    System.out.print("Novo tipo: ");
                    String novoTipo = sc.next();

                    list.set(indiceAtualizar, new Camisa(novaCor, novoTamanho, novoTipo));
                    System.out.println("Camisa atualizada com sucesso!");
                    break;

                case 4:

                    System.out.println("\n=== Remover Camisa ===");

                    //O Comando is.Empty verifica se a lista está vazia.
                    if (list.isEmpty()) {
                        System.out.println(" Nenhuma camisa cadastrada.");
                        break;
                    }

                    System.out.print("Digite o índice da camisa a ser removida: ");
                    int indiceRemover = sc.nextInt();

                    if (indiceRemover < 0 || indiceRemover >= list.size()) {
                        System.out.println("❌ Índice inválido.");
                        break;
                    }

                    list.remove(indiceRemover);
                    System.out.println(" Camisa removida com sucesso!");
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println(" Código inválido! Tente novamente.");
            }
        }

        sc.close();
    }
}