public class MeuTelefone implements AparelhoTelefonico {

    private String[] contatos = {
        "Carlos Eduardo - (91) 98010-2307",
        "Erick Victor - (91) 98816-1514",
        "Eduardo Coelho - (94) 98955-5645"
    };

    @Override
    public void mostrarContatos(){
        for (int i = 0; i < contatos.length; i++) {
            System.out.println((i+1) + " - " + contatos[i]);
        }
    }

    @Override
    public void ligar(int indice) {
        if (indice >=1 && indice <= contatos.length) {
            System.out.println("Ligado para: " + contatos[indice - 1 ]);
        }
    }

    @Override
    public void receberLigacao() {
        System.out.println("Recebendo Ligação.....");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz...");
    }

}
