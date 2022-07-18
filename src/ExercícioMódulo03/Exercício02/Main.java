package ExercícioMódulo03.Exercício02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Lista novaLista = new Lista();
        boolean repetirMenu = true;
        while (repetirMenu) {
            System.out.println();
            System.out.print("Escolha uma opção:\n1-Cadastrar candidato(s)\n2-Exibir candidato(s)\n3-Excluir candidato\n4-Finalizar\n");
            System.out.print("Digite a opção escolhida: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Digite quantos candidatos deseja adicionar: ");
                    int quantidadeCandidatos = input.nextInt();
                    for (int i = 0; i < quantidadeCandidatos; i++) {

                        novaLista.adicionarCandidato();
                    }
                    break;
                case 2:
                    novaLista.exibirCandidatos();
                    break;
                case 3:
                    novaLista.removerCandidato();
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
