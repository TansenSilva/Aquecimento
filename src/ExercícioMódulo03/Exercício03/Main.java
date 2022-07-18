package ExercícioMódulo03.Exercício03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Lista novaLista = new Lista();
        boolean repetirMenu = true;
        while (repetirMenu) {
            System.out.println();
            System.out.print("Escolha uma opção:\n1-Cadastrar prato\n2-Exibir pratos cadastrados\n3-Excluir prato cadastrado\n4-Finalizar\n");
            System.out.print("Digite a opção escolhida: ");
            int menu = input.nextInt();
            System.out.println();
            switch (menu) {
                case 1:
                    System.out.print("Digite o nome do prato: ");
                    input.nextLine();
                    String nomePrato = input.nextLine();
                    System.out.print("Digite os ingredientes do prato: ");
                    String ingredientes = input.nextLine();
                    Prato prato = new Prato(nomePrato, ingredientes);
                    novaLista.adicionarPrato(prato);
                    break;
                case 2:
                    novaLista.exibirPrato();
                    break;
                case 3:
                    novaLista.removerPrato();
                    break;
                case 4:
                    System.out.println("Programa finalizado pelo usuário!");
                    repetirMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        input.close();
    }
}
