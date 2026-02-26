public class MainListaDinamica {
    public static void main(String[] args) {

        String elementos[] = {"a", "b"};

        ListaDinamica listaDinamica = new ListaDinamica();
        listaDinamica.adicionarElemento("Arroz");
        listaDinamica.adicionarElemento("Feijão");
        listaDinamica.adicionarElemento("Batata");
        listaDinamica.adicionarElemento("Alho");
        listaDinamica.adicionarElemento("Cebola");
        System.out.println(listaDinamica.removerTodas("alho"));
        System.out.println("Existem " + listaDinamica.contar() + " elementos");
        System.out.println("Foram adicionados " + listaDinamica.adicionarVarios(elementos) + " elementos");
        System.out.println(listaDinamica.obter(10));
    }
}
