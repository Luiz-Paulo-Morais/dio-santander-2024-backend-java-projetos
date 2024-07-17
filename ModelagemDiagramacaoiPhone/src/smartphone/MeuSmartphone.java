package smartphone;

import componente.IPhone;

public class MeuSmartphone {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        System.out.println("***_Funcoes de Aparelho Telefônico_***");
        iPhone.atender();
        iPhone.ligar("35988880000");
        iPhone.iniciarCorreioVoz();
        System.out.println("**************************************");

        System.out.println("***_Funcoes de Reprodutor Musical_***");
        iPhone.selecionarMusica("Pop Rock Brasil");
        iPhone.tocar();
        iPhone.pausar();
        System.out.println("**************************************");

        System.out.println("***_Funcoes de Navegador na Internet_***");
        iPhone.exibirPagina("www.dio.me");
        iPhone.atualizarPagina();
        iPhone.adicionarNovaAba();
        System.out.println("**************************************");

        



    }

}
