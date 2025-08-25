public class ListaMusical implements ReprodutorMusical {
    
    private String[] musicas = {
        "Jesus Chorou - Racionais Mc's",
        "Capitulo 4 Versiculo 3 - Racionais Mc's",
        "Ha Tempos - Legião Urbana"
    };

    private String musicaSelecionada = null;

    public void mostrarMusicas() {
        for (int i = 0; i < musicas.length; i++){
            System.out.println((i+1) + " - " + musicas[i]);
        }
    }

    @Override
    public void selecionarMusica(int indice) {
        if (indice >=1 && indice <= musicas.length) {
            musicaSelecionada = musicas[indice - 1];
            System.out.println("Música Selecionada: " + musicaSelecionada);
        } else {
            System.out.println("Opção Invalida");
        }
    }

    @Override
    public void selecionarMusica(String nome) {
        boolean encontrada = false;
        for (String musica : musicas) {
            if (musica.equalsIgnoreCase(nome)) {
                musicaSelecionada = musica;
                System.out.println("Música Selecionada: " + musicaSelecionada);
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Música não encontrada!");
        }
    }

    @Override
    public void tocar(){
        if (musicaSelecionada != null) {
            System.out.println("Tocando: " + musicaSelecionada);
        } else {
            System.out.println("Selecionar uma Música Primeiro!");
        }
    }

    @Override
    public void pausar() {
        if (musicaSelecionada != null) {
            System.out.println("Pausando: " + musicaSelecionada);
        } else {
            System.out.println("Nenhuma Música Selecionada! ");
        }
    }
}
