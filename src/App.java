import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        ReprodutorMusical reproduzindo = new ListaMusical();
        AparelhoTelefonico telefone = new MeuTelefone();
        NavegadorInternet navegador = new NavegadorInt();

        int menu = 0;

        while (menu != 4) {
            System.out.println("\n---> TELA PRINCIPAL - IPHONE <----\n");
            System.out.println("1 - Reprodutor Músical.");
            System.out.println("2 - Aparelho Telefônico.");
            System.out.println("3 - Navegador de Internet.");
            System.out.println("4 - Sair");
            System.out.println("Escolhar uma Opção: ");

            menu = entrada.nextInt();

            switch (menu){
                case 1: 
                int musicaOpcao = 0;
                while (musicaOpcao != 4) {
                    System.out.println("\n==== Reprodutor Músical ====");
                    System.out.println("1 - Selecionar Música");
                    System.out.println("2 - Tocar Música");
                    System.out.println("3 - Pausar Música");
                    System.out.println("4 - Voltar");
                    System.out.println("Escolhar uma Opção: ");
                    musicaOpcao = entrada.nextInt();


                    switch (musicaOpcao) {
                        case 1: 
                        System.out.println("\n---> Escolhar uma Música <---");
                        reproduzindo.mostrarMusicas();
                        System.out.println("Digite o Número da Música: ");
                        int escolhaMusica = entrada.nextInt();
                        reproduzindo.selecionarMusica(escolhaMusica);
                        break;
                        case 2: reproduzindo.tocar();break;
                        case 3: reproduzindo.pausar();break;
                        case 4: break;
                        default: System.out.println("Opção Inválida!");
                    }
                }

                break;

                case 2: 
                int telOpcao = 0;
                while (telOpcao != 4 ) {
                    System.out.println("\n==== Aparelho Telefônico ====");
                    System.out.println("1 - Ligar para contato");
                    System.out.println("2 - Receber Ligação");
                    System.out.println("3 - Correio De Voz");
                    System.out.println("4 - voltar");
                    System.out.println("Escolhar uma Opção: ");
                    telOpcao = entrada.nextInt();

                    switch (telOpcao) {
                        case 1:
                        System.out.println("\n---> Escolhar um Contato <---");
                        telefone.mostrarContatos();
                        System.out.println("Digite o número do Contato: ");
                        int escolhaContato = entrada.nextInt();
                        telefone.ligar(escolhaContato);
                        break;

                        case 2:telefone.receberLigacao();break;
                        case 3:telefone.iniciarCorreioVoz();break;
                        case 4: break;
                        default: System.out.println("Opção Inválida");
                    }
                }
                break;

                case 3: 
                int navOpcao = 0;
                while (navOpcao != 4 ) {
                    System.out.println("\n==== Navegador De Internet ====");
                    System.out.println("1 - Exibir Página");
                    System.out.println("2 - Nova Aba");
                    System.out.println("3 - Atualizar Página");
                    System.out.println("4 - Voltar");
                    System.out.println("Escolha uma Opção: ");
                    navOpcao = entrada.nextInt();


                    switch (navOpcao) {
                        case 1: 
                        System.out.println("Digite a URL da Página: ");
                        entrada.nextLine();
                        String url = entrada.nextLine();
                        navegador.exibirPagina(url);
                        break;

                        case 2: navegador.adicionarNovaAba();break;
                        case 3: navegador.atualizarPagina();break;
                        case 4: break;
                        default: System.out.println("Opção Inválida!");
                    }
                }
                break;

                case 4: 
                System.out.println("Saindo.....");
                break;
                default:
                System.out.println("Opção Inválida!");
            }


        }

        entrada.close();
    }

}