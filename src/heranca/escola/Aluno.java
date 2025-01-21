package heranca.escola;

import heranca.Pessoa;

import java.time.LocalDate;

//classe filho, ou, subclasse
public class Aluno extends Pessoa {
    private String curso;
    private String matricula;

    public Aluno(String nome, int idade, LocalDate dataNascimento, String curso) {
        super(nome, idade, dataNascimento);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
