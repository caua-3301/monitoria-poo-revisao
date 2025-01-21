package modificadoresDeAcesso.calcularUtil;

public class Config {
    void testarConfig() {
        System.out.println("tudo ok!");
    }

    protected boolean validarBateria(int nivelBateria) {
        return nivelBateria > 10;
    }
}
