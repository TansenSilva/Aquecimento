package Módulo03.Exercício02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Lista novaLista = new Lista();
        boolean repetirMenu = true;
        while (repetirMenu) {
            System.out.println();
            System.out.print("Escolha uma opção:\n1-Cadastrar candidato\n2-Exibir candidatos\n3-Excluir candidato\n4-Finalizar\n");
            System.out.print("Digite a opção escolhida: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Digite quantos candidatos deseja adicionar: ");
                    int quantidadeCandidatos = input.nextInt();
                    for (int i = 0; i < quantidadeCandidatos; i++) {
                        System.out.print("Digite a matrícula do candidato: ");
                        String matricula = input.next();
                        System.out.print("Digite a nota do candidato: ");
                        double nota = input.nextDouble();
                        Candidato candidato = new Candidato(matricula, nota);
                        novaLista.adicionarCandidato(candidato);
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
