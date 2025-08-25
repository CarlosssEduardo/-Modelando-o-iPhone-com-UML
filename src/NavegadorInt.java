public class NavegadorInt implements NavegadorInternet {
    
    @Override 
    public void exibirPagina(String url) {
        System.out.println("Exibindo Página: " + url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Página Atualizada.");
    }

}
