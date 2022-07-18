package Módulo03.Exercício01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaDeProdutos {
    Scanner input = new Scanner(System.in);

    private Map<String, Double> listaDeProdutos = new HashMap<>();

    public ListaDeProdutos() {

    }


    public  void adicionarProdutos(){
        System.out.print("Digite quantos produtos você deseja adicionar: ");
        int adicionar = input.nextInt();
        for (int i = 0;i<adicionar;i++){
            System.out.print("Digite o nome do produto:");
            String nomeProduto = input.next();
            System.out.print("Digite o valor do produto:");
            double valorProduto = input.nextDouble();
            listaDeProdutos.put(nomeProduto,valorProduto);
            System.out.println(listaDeProdutos);

        }
        System.out.print("Digite 1 para excluir um produto ou 2 para exibir os produtos:");
        int escolha = input.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Digite o nome do produto que deseja excluir.");
                this.listaDeProdutos.remove(input.next());
            case 2:
                System.out.println(this.listaDeProdutos);
                break;
            default:
                System.out.println("Valor inválido!");

        }
    }

    public Map<String, Double> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(Map<String, Double> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
