package polimorfismo.contas;

import polimorfismo.Conta;

public class Poupanca extends Conta {
    private double rendimento;
    public Poupanca(String agencia, String numero, Double saldo) {
        super(agencia, numero, saldo);
        this.rendimento = 0.012;
    }

    //sobrescrevendo do pai (tempo de execução)
    @Override
    public void depositar(double valor) {
        //lógica para validar depósito...
        this.setSaldo(
                this.getSaldo() + valor
        );
    }

    @Override
    public void sacar(double valor) {
        //lógica que valida um saque
        this.setSaldo(
                this.getSaldo() - valor
        );
    }
}
