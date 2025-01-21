package modificadoresDeAcesso.calcularUtil.subConfig;

import modificadoresDeAcesso.calcularUtil.Config;

//a herança é necessária no caso dos submodulos
public class Interno extends Config {
    public void testarTudo() {
        //consigo acessar o protected, mas não o package
        super.validarBateria(50);
    }
}
