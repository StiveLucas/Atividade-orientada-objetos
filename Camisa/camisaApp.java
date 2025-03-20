import java.util.ArrayList;
import java.util.Scanner;

public class camisaApp{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<camisa> list = new ArrayList<>();

        int codigo = 10;
        while (codigo != 0) {

            System.err.println("=== Menu ===");
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

                    System.out.println("Listando todas as Camisas");
                    for(String camisa: camisas){
                        System.out.println(camisa);
                    }
            
                default:
                    break;
            }
            
            
        }



    }
        
}