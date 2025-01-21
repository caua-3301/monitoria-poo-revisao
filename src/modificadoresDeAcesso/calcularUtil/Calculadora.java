package modificadoresDeAcesso.calcularUtil;

import java.time.LocalDate;

public class Calculadora {
    private String marca;
    private LocalDate dataFabricacao;
    private int bateria;

    public Calculadora(String marca, LocalDate dataFabricacao, int bateria) {
        this.marca = marca;
        this.dataFabricacao = dataFabricacao;
        this.bateria = bateria;
    }

    public void somar(double a, double b) {
        Config config = new Config();

        //consigo acessa o método validarBateria e testarConfig sem problemas

        config.testarConfig();

        System.out.println(
                config.validarBateria(this.bateria)
                ? (a+b)
                : "Bateria Fraca"
        );
    }
}
