package heranca.escola;

import heranca.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

//classe filho, ou, subclasse
public class Professor extends Pessoa {
    private BigDecimal salario;
    private String matricula;

    public Professor(String nome, int idade, LocalDate dataNascimento, BigDecimal salario, String matricula) {
        super(nome, idade, dataNascimento);
        this.salario = salario;
        this.matricula = matricula;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
