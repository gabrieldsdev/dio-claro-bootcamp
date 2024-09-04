package test;

import domain.Iphone;

public class Usuario{
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("992715787");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("-------------");
        iphone.selecionarMusica("Paranoid");
        iphone.tocar();
        iphone.pausar();
        System.out.println("-------------");
        iphone.exibirPagina("google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
