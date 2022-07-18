package ExercícioMódulo03.Exercício02;

public class Candidato {

    private String matricula;
    private double nota;

    public Candidato(String matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
