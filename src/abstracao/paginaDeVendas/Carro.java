package abstracao.paginaDeVendas;

import java.math.BigDecimal;
import java.time.LocalDate;

//como uma página de venda de carros abstrairia um carro para exibir aos clientes?
public class Carro {
    //informações do carro que são úteis para página de venda
    private String modelo;
    private String cor;
    private LocalDate anoFabricacao;
    private Double kmsRodados;
    private BigDecimal preco;

    public Carro(String modelo, String cor, LocalDate anoFabricacao, Double kmsRodados, BigDecimal preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.kmsRodados = kmsRodados;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Double getKmsRodados() {
        return kmsRodados;
    }

    public void setKmsRodados(Double kmsRodados) {
        this.kmsRodados = kmsRodados;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
