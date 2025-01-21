package encapsulamento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tv {
    //todos estão como private, complexidade está sendo escondida
    private boolean ligada;
    private String sequenciaDeOperacoes;
    private String caminhoListaConfiguracoes = "src/encapsulamento/operacoes/operacoes-para-ligar.txt";

    //complexidade e informações que são unicamente necessária nessa classe
    public void ligarTv() {
        //se não estiver ligar, ela liga
        if (!ligada) {

            try(BufferedReader reader = new BufferedReader(new FileReader(this.caminhoListaConfiguracoes))) {

                String configuration = reader.readLine();

                System.out.println("Executando configurações:");
                while (configuration != null) {
                    System.out.println(configuration);
                    configuration = reader.readLine();
                }

            } catch (IOException error) {
                System.out.println("Erro ao carregar arquivo: " + error.getMessage());
            }

            ligada = true;
            System.out.println("\n\n A Tv foi ligada com sucesso");

        } else {
            System.out.println("A Tv já está ligada");
        }
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("Desligada");
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public String getSequenciaDeOperacoes() {
        return sequenciaDeOperacoes;
    }

    public void setSequenciaDeOperacoes(String sequenciaDeOperacoes) {
        this.sequenciaDeOperacoes = sequenciaDeOperacoes;
    }

    public String getCaminhoListaConfiguracoes() {
        return caminhoListaConfiguracoes;
    }

    public void setCaminhoListaConfiguracoes(String caminhoListaConfiguracoes) {
        this.caminhoListaConfiguracoes = caminhoListaConfiguracoes;
    }
}
