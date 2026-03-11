/**
 * Classe principal da estrutura {@code ListaDinamica}, denominada MainListaDinamica.
 * É responsável por iniciar a aplicação e testar as operações definidas
 * na Interface {@code ListaOperacoes}.
 *
 * <p>Esta classe implementa métodos fundamentais para manipulação da lista,
 * como adicionar, remover, buscar e exibir elementos. Além disso, disponibiliza
 * métodos auxiliares, incluindo: removerTodas, contar, adicionarVarios, obter,
 * inserir, removerPorIndice, limpar, ultimoIndiceDe, contarOcorrencias e
 * substituir.</p>
 */
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
        System.out.println("===========================================");
        listaDinamica.exibir();
        System.out.println("Foram adicionados " + listaDinamica.adicionarVarios(elementos) + " elementos");
        listaDinamica.exibir();
        System.out.println("==================================================");
        System.out.println(listaDinamica.obter(10));
        System.out.println("==================================================");
        listaDinamica.exibir();
        listaDinamica.inserir(1,"sla");
        listaDinamica.exibir();
        System.out.println("==================================================");
        listaDinamica.removerPorIndice(2);
        System.out.println("==================================================");
    }
}
