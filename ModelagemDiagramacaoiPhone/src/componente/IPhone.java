package componente;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado...");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Chamando... " + numero);
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausa na reproducao...");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
        
    }

    @Override
    public void tocar() {
        System.out.println("Musica reproduzindo...");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada...");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando a pagina: " + url);
        
    }

}
