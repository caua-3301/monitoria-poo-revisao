package polimorfismo;

public class Conta implements Operacoes {
    private String agencia;
    private String numero;
    private Double saldo;

    //exemplo de sobrecarga
    public Conta(String agencia, String numero, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    //tempo de compilação
    public Conta() {}

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //sobrescrita
    @Override
    public void depositar(double valor) {
        //posso implementar algo aqui, ou, sobrecrever novamente nos filhos dessa classe
    }

    @Override
    public void sacar(double valor) {
        //posso implementar algo aqui, ou, sobrecrever novamente nos filhos dessa classe
    }
}
