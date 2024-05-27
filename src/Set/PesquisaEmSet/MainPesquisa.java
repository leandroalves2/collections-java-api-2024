package Set.PesquisaEmSet;

public class MainPesquisa {

    public static void main(String[] args) {
        AgendaContatosFunc();
    }

    public static void AgendaContatosFunc(){
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Karol", 111111111);
        agendaContatos.adicionarContato("Luis", 222222222);
        agendaContatos.adicionarContato("Luis", 333333333);
        agendaContatos.adicionarContato("Kevin", 444444444);
        agendaContatos.adicionarContato("Wilian", 555555555);
        agendaContatos.adicionarContato("Enrique", 666666666);
        System.out.println("Lista de contatos: ");
        agendaContatos.exibirContatos();
        System.out.println("");

        System.out.println("Pesquisando por Wilian");
        System.out.println(agendaContatos.pesquisarPorNome("Wilian"));
        System.out.println("");

        System.out.println("Atualizar o numero do Kevin");
        System.out.println(agendaContatos.atualizarNumeroContato("Kevin", 777777777));
        System.out.println("");

        System.out.println("Lista de contatos: ");
        agendaContatos.exibirContatos();
    }

}