package Módulo03.Exercício02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista {

    Scanner input = new Scanner(System.in);
    Set<Candidato> listaDeCandidatos = new HashSet<>();

    public Lista() {
        this.listaDeCandidatos = listaDeCandidatos;
    }

    public void adicionarCandidato(Candidato candidato){
        this.listaDeCandidatos.add(candidato);
    }

    public void exibirCandidatos(){
        if(this.listaDeCandidatos.isEmpty()){
            System.out.println("A lista está vazia");
        }else {
            for (Candidato candidato : this.listaDeCandidatos) {
                System.out.println("Matrícula: " + candidato.getMatricula() + " - Nota: " + candidato.getNota());
            }
        }
    }

    public void removerCandidato() {
        if (this.listaDeCandidatos.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            System.out.print("Digite a Matrícula do candidato que deseja remover: ");
            String remover = input.next();
            this.listaDeCandidatos.removeIf(candidato -> candidato.getMatricula().equalsIgnoreCase(remover));
        }
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public Set<Candidato> getListaDeCandidatos() {
        return listaDeCandidatos;
    }

    public void setListaDeCandidatos(Set<Candidato> listaDeCandidatos) {
        this.listaDeCandidatos = listaDeCandidatos;
    }

}
