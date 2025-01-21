package abstracao.oficina;

import java.time.LocalDate;

//como uma oficina mecânica abstrairia um carro?
public class Carro {
    //informações acerca do carro que são úteis para a oficina
    private TipoMotor tipo_motor;
    private String marca;
    private Byte[] copiaDoManual;
    private String descricaoDoProblema;
    private LocalDate chegadaNaOficina;
    private LocalDate retiradaEstimada;

    public Carro(TipoMotor tipo_motor, String marca, Byte[] copiaDoManual, String descricaoDoProblema, LocalDate chegadaNaOficina, LocalDate retiradaEstimada) {
        this.tipo_motor = tipo_motor;
        this.marca = marca;
        this.copiaDoManual = copiaDoManual;
        this.descricaoDoProblema = descricaoDoProblema;
        this.chegadaNaOficina = chegadaNaOficina;
        this.retiradaEstimada = retiradaEstimada;
    }

    public TipoMotor getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(TipoMotor tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Byte[] getCopiaDoManual() {
        return copiaDoManual;
    }

    public void setCopiaDoManual(Byte[] copiaDoManual) {
        this.copiaDoManual = copiaDoManual;
    }

    public String getDescricaoDoProblema() {
        return descricaoDoProblema;
    }

    public void setDescricaoDoProblema(String descricaoDoProblema) {
        this.descricaoDoProblema = descricaoDoProblema;
    }

    public LocalDate getChegadaNaOficina() {
        return chegadaNaOficina;
    }

    public void setChegadaNaOficina(LocalDate chegadaNaOficina) {
        this.chegadaNaOficina = chegadaNaOficina;
    }

    public LocalDate getRetiradaEstimada() {
        return retiradaEstimada;
    }

    public void setRetiradaEstimada(LocalDate retiradaEstimada) {
        this.retiradaEstimada = retiradaEstimada;
    }
}
