package org.app;

import org.equipamentos.service.Navegador;
import org.equipamentos.service.ReprodutorMusical;
import org.equipamentos.service.Telefone;

public class Iphone implements ReprodutorMusical, Navegador, Telefone {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        System.out.println("......O Iphone......");
        iphone.ligar();
        iphone.desligar();
        iphone.acessarWeb();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.desligar();
        System.out.println("\n......Navegador acessando.....");
        Navegador navegador = iphone;
        navegador.acessarWeb();
        navegador.atualizarPagina();
        System.out.println("\n......Reproduzindo musica....");
        ReprodutorMusical reprodutorMusical = iphone;
        reprodutorMusical.tocar();
        reprodutorMusical.parar();
        System.out.println("\n......Ligando telefone.....");
        Telefone telefone = iphone;
        telefone.ligar();
        telefone.desligar();
        System.out.println("");

    }


    @Override
    public void parar() {
        System.out.println("Pausado musica");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");

    }

    @Override
    public void acessarWeb() {
        System.out.println("Acessando Pagina");

    }

    @Override
    public void atualizarPagina() {

        System.out.println("Atualizando Pagina");

    }

    @Override
    public void ligar() {
        System.out.println("Ligando para o número");

    }
    @Override
    public void desligar() {
        System.out.println("Desligando a chamada");

    }

}
