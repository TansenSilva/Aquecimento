package ExercícioMódulo03.Exercício03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista {

    Scanner input = new Scanner(System.in);
    Set<Prato> listaDePratos = new HashSet<>();

    public Lista() {
        this.listaDePratos = listaDePratos;
    }

    public void adicionarPrato(Prato prato){
        this.listaDePratos.add(prato);
    }

    public void exibirPrato(){
        if(this.listaDePratos.isEmpty()){
            System.out.println("A lista está vazia");
        }else {
            for (Prato prato : this.listaDePratos) {
                System.out.println("Nome do prato: " + prato.getNomePrato());
                System.out.println("Ingredientes: " + prato.getIngredientes());
                System.out.println();
            }
        }
    }

    public void removerPrato() {
        if (this.listaDePratos.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            System.out.print("Digite o nome do prato que deseja remover: ");
            String remover = input.next();
            this.listaDePratos.removeIf(candidato -> candidato.getNomePrato().equalsIgnoreCase(remover));
        }
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public Set<Prato> getListaDePratos() {
        return listaDePratos;
    }

    public void setListaDePratos(Set<Prato> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }

}
