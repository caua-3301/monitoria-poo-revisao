package interfacesEClassesAbstratas.abstractClasses;

import java.time.LocalDate;

public abstract class Carro {
    private String chassi;
    private String placa;
    private LocalDate fabricacao;
    private String nomeModelo;

    //métodos marcados com abstract exigem implementação na classe filho
    public abstract void exibirChassi();

    public void exibirNomeModelo() {
        System.out.println(nomeModelo);
    }
}
