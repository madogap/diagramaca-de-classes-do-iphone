package org.app;

import org.equipamentos.service.Navegador;
import org.equipamentos.service.ReprodutorMusical;
import org.equipamentos.service.Telefone;

public class Iphone implements ReprodutorMusical, Navegador, Telefone {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.acessarWeb();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.parar();


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
    
}
