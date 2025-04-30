package org.example;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba web");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página web");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançado para próxima música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando outra música...");
    }
}
