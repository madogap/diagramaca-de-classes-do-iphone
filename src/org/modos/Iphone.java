package org.modos;

import org.intarfaces.service.NavegadorService;
import org.intarfaces.service.ReprodutorMusicalService;



public class Iphone implements ReprodutorMusicalService, NavegadorService {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.acessarWeb();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.parar();
        iphone.

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
