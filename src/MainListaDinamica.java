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
        listaDinamica.exibir();
        System.out.println("==================================================");
        System.out.println(listaDinamica.ultimoIndiceDe("cebola"));
        System.out.println( listaDinamica.ultimoIndiceDe("cebolaaaaaaaa"));
        System.out.println("==================================================");
        System.out.println(listaDinamica.contarOcorrencias("cebola"));
        System.out.println(listaDinamica.contarOcorrencias("aaaaaaaaa"));
        System.out.println("==================================================");
        System.out.println(listaDinamica.substituir("cebola", "arroz"));
        System.out.println(listaDinamica.substituir("aaaaa", "arroz"));
        System.out.println(listaDinamica.substituir("cebola", "1"));
        listaDinamica.limpar();
        listaDinamica.exibir();

        //===========================================================================

        ListaDinamica listaDinamicaTeste = new ListaDinamica();

        String[] teste = {"alho", "arroz", "feijao"};

        listaDinamicaTeste.adicionarElemento("Arroz");
        listaDinamicaTeste.adicionarElemento("Arroz");
        listaDinamicaTeste.adicionarElemento("Feijão");
        listaDinamicaTeste.adicionarElemento("Feijão");
        listaDinamicaTeste.adicionarElemento("Batata");
        listaDinamicaTeste.adicionarElemento("Batata");
        listaDinamicaTeste.adicionarElemento("Alho");
        listaDinamicaTeste.adicionarElemento("Alho");
        listaDinamicaTeste.adicionarElemento("Cebola");
        listaDinamicaTeste.adicionarElemento("Cebola");


        System.out.println("+============================================================+");
        System.out.println("+============================================================+");
        System.out.println("+============================================================+");

        //TESTE REMOVER TODAS
        System.out.println("===TESTANDO METODO REMOVER TODAS===\n");
        listaDinamicaTeste.removerTodas("aloo"); //Teste com elemento inexistente
        listaDinamicaTeste.removerTodas("alho"); //Teste considerando sensitiveCase
        listaDinamicaTeste.exibir();

        //TESTE CONTAR
        System.out.println("===TESTANDO O METODO CONTAR===\n");
        System.out.println("Teste com uma lista cheia:\n");
        System.out.println(listaDinamicaTeste.contar());
        listaDinamicaTeste.limpar();
        System.out.println("Teste com uma lista vazia:\n");
        System.out.println(listaDinamicaTeste.contar());

        //TESTE ADICIONAR VARIOS
        System.out.println("===TESTANDO ADICIONAR VARIOS===");
        System.out.println("Lista inicial");
        listaDinamicaTeste.exibir();
        System.out.println("Adicionar varioas a partir de uma lista vazia:");
        listaDinamicaTeste.adicionarVarios(teste);
        listaDinamicaTeste.exibir();
        System.out.println("Adicionar varios a partir de uma lista ja com conteudo");
        listaDinamicaTeste.adicionarVarios(teste);
        listaDinamicaTeste.exibir();

        //TESTE OBTER
        System.out.println("===TESTANDO OBTER===");
        System.out.println("TESTANDO OBTER A PARTIR DE UMA LISTA COM ELEMENTOS");
        listaDinamicaTeste.obter(-1);
        System.out.println("TESTANDO OBTER A PARTIR DE UMA LISTA COM ELEMENTOS");
        listaDinamicaTeste.obter(1);
        System.out.println("TESTANDO OBTER A PARTIR DE UMA LISTA COM ELEMENTS");
        listaDinamicaTeste.obter(3);
        System.out.println("TESTANDO O OBTER A PARTIR DE UMA LISTA COM INDICES IRREIAS");
        listaDinamicaTeste.obter(1000);

        //TESTE INSERIR
        System.out.println("===TESTANDO INSERIR===");
        listaDinamicaTeste.limpar();
        System.out.println("Teste inserir em lista vazia (índice 1):");
        listaDinamicaTeste.inserir(1, "primeiro");
        listaDinamicaTeste.exibir();
        System.out.println("Teste inserir em lista vazia (índice inválido):");
        listaDinamicaTeste.inserir(5, "erro");
        System.out.println("Teste inserir no início:");
        listaDinamicaTeste.inserir(1, "novo_primeiro");
        listaDinamicaTeste.exibir();
        System.out.println("Teste inserir no meio:");
        listaDinamicaTeste.inserir(2, "meio");
        listaDinamicaTeste.exibir();
        System.out.println("Teste inserir no fim:");
        listaDinamicaTeste.inserir(4, "fim");
        listaDinamicaTeste.exibir();
        System.out.println("Teste inserir com índice negativo:");
        listaDinamicaTeste.inserir(-1, "negativo");
        System.out.println("Teste inserir com elemento nulo:");
        listaDinamicaTeste.inserir(2, null);
        System.out.println("Teste inserir com elemento vazio:");
        listaDinamicaTeste.inserir(2, "");
        System.out.println("Teste inserir com índice muito alto:");
        listaDinamicaTeste.inserir(100, "alto");

        //TESTE REMOVER POR ÍNDICE
        System.out.println("\n===TESTANDO REMOVER POR INDICE===");
        listaDinamicaTeste.exibir();
        System.out.println("Teste remover índice válido (2):");
        System.out.println("Removido: " + listaDinamicaTeste.removerPorIndice(2));
        listaDinamicaTeste.exibir();
        System.out.println("Teste remover primeiro elemento:");
        System.out.println("Removido: " + listaDinamicaTeste.removerPorIndice(1));
        listaDinamicaTeste.exibir();
        System.out.println("Teste remover último elemento:");
        System.out.println("Removido: " + listaDinamicaTeste.removerPorIndice(listaDinamicaTeste.contar()));
        listaDinamicaTeste.exibir();
        System.out.println("Teste remover com índice negativo:");
        System.out.println("Removido: " + listaDinamicaTeste.removerPorIndice(-1));
        System.out.println("Teste remover com índice muito alto:");
        System.out.println("Removido: " + listaDinamicaTeste.removerPorIndice(100));
        System.out.println("Teste remover de lista vazia:");
        listaDinamicaTeste.limpar();
        System.out.println("Removido: " + listaDinamicaTeste.removerPorIndice(1));

        //TESTE ULTIMO INDICE DE
        System.out.println("\n===TESTANDO ULTIMO INDICE DE===");
        listaDinamicaTeste.adicionarElemento("arroz");
        listaDinamicaTeste.adicionarElemento("feijao");
        listaDinamicaTeste.adicionarElemento("arroz");
        listaDinamicaTeste.adicionarElemento("batata");
        listaDinamicaTeste.adicionarElemento("arroz");
        listaDinamicaTeste.exibir();
        System.out.println("Teste elemento que existe múltiplas vezes:");
        System.out.println("Último índice de 'arroz': " + listaDinamicaTeste.ultimoIndiceDe("arroz"));
        System.out.println("Teste elemento que existe uma vez:");
        System.out.println("Último índice de 'feijao': " + listaDinamicaTeste.ultimoIndiceDe("feijao"));
        System.out.println("Teste elemento que não existe:");
        System.out.println("Último índice de 'inexistente': " + listaDinamicaTeste.ultimoIndiceDe("inexistente"));
        System.out.println("Teste com caso sensitivo:");
        System.out.println("Último índice de 'ARROZ': " + listaDinamicaTeste.ultimoIndiceDe("ARROZ"));
        System.out.println("Teste com elemento nulo:");
        System.out.println("Último índice de null: " + listaDinamicaTeste.ultimoIndiceDe(null));
        System.out.println("Teste com elemento vazio:");
        System.out.println("Último índice de string vazia: " + listaDinamicaTeste.ultimoIndiceDe(""));
        listaDinamicaTeste.limpar();
        System.out.println("Teste com lista vazia:");
        System.out.println("Último índice em lista vazia: " + listaDinamicaTeste.ultimoIndiceDe("arroz"));

        //TESTE CONTAR OCORRENCIAS
        System.out.println("\n===TESTANDO CONTAR OCORRENCIAS===");
        listaDinamicaTeste.adicionarElemento("banana");
        listaDinamicaTeste.adicionarElemento("maca");
        listaDinamicaTeste.adicionarElemento("banana");
        listaDinamicaTeste.adicionarElemento("uva");
        listaDinamicaTeste.adicionarElemento("BANANA");
        listaDinamicaTeste.exibir();
        System.out.println("Teste contar elemento que existe múltiplas vezes:");
        System.out.println("Ocorrências de 'banana': " + listaDinamicaTeste.contarOcorrencias("banana"));
        System.out.println("Teste contar elemento que existe uma vez:");
        System.out.println("Ocorrências de 'maca': " + listaDinamicaTeste.contarOcorrencias("maca"));
        System.out.println("Teste contar elemento que não existe:");
        System.out.println("Ocorrências de 'laranja': " + listaDinamicaTeste.contarOcorrencias("laranja"));
        System.out.println("Teste com caso sensitivo:");
        System.out.println("Ocorrências de 'BANANA': " + listaDinamicaTeste.contarOcorrencias("BANANA"));
        System.out.println("Teste com elemento nulo:");
        System.out.println("Ocorrências de null: " + listaDinamicaTeste.contarOcorrencias(null));
        System.out.println("Teste com elemento vazio:");
        System.out.println("Ocorrências de string vazia: " + listaDinamicaTeste.contarOcorrencias(""));
        listaDinamicaTeste.limpar();
        System.out.println("Teste com lista vazia:");
        System.out.println("Ocorrências em lista vazia: " + listaDinamicaTeste.contarOcorrencias("banana"));

        //TESTE SUBSTITUIR
        System.out.println("\n===TESTANDO SUBSTITUIR===");
        listaDinamicaTeste.adicionarElemento("gato");
        listaDinamicaTeste.adicionarElemento("cachorro");
        listaDinamicaTeste.adicionarElemento("gato");
        listaDinamicaTeste.adicionarElemento("pássaro");
        listaDinamicaTeste.adicionarElemento("GATO");
        System.out.println("Lista antes das substituições:");
        listaDinamicaTeste.exibir();
        System.out.println("Teste substituir elemento que existe múltiplas vezes:");
        System.out.println("Substituições de 'gato' por 'felino': " + listaDinamicaTeste.substituir("gato", "felino"));
        listaDinamicaTeste.exibir();
        System.out.println("Teste substituir elemento que existe uma vez:");
        System.out.println("Substituições de 'cachorro' por 'canino': " + listaDinamicaTeste.substituir("cachorro", "canino"));
        listaDinamicaTeste.exibir();
        System.out.println("Teste substituir elemento que não existe:");
        System.out.println("Substituições de 'peixe' por 'aquático': " + listaDinamicaTeste.substituir("peixe", "aquático"));
        System.out.println("Teste substituir com caso sensitivo:");
        System.out.println("Substituições de 'GATO' por 'FELINO': " + listaDinamicaTeste.substituir("GATO", "FELINO"));
        listaDinamicaTeste.exibir();
        System.out.println("Teste substituir com elemento antigo nulo:");
        System.out.println("Substituições de null por 'novo': " + listaDinamicaTeste.substituir(null, "novo"));
        System.out.println("Teste substituir com elemento novo nulo:");
        System.out.println("Substituições de 'felino' por null: " + listaDinamicaTeste.substituir("felino", null));
        System.out.println("Teste substituir com elemento antigo vazio:");
        System.out.println("Substituições de '' por 'novo': " + listaDinamicaTeste.substituir("", "novo"));
        System.out.println("Teste substituir com elemento novo vazio:");
        System.out.println("Substituições de 'canino' por '': " + listaDinamicaTeste.substituir("canino", ""));
        listaDinamicaTeste.limpar();
        System.out.println("Teste substituir em lista vazia:");
        System.out.println("Substituições em lista vazia: " + listaDinamicaTeste.substituir("qualquer", "outro"));

        //TESTE LIMPAR
        System.out.println("\n===TESTANDO LIMPAR===");
        System.out.println("Lista antes de limpar:");
        listaDinamicaTeste.exibir();
        System.out.println("Teste limpar lista com elementos:");
        listaDinamicaTeste.limpar();
        System.out.println("Lista após limpar:");
        listaDinamicaTeste.exibir();
        System.out.println("Teste limpar lista já vazia:");
        listaDinamicaTeste.limpar();
        System.out.println("Lista após limpar novamente:");
        listaDinamicaTeste.exibir();
        System.out.println("Teste contar após limpar:");
        System.out.println("Quantidade de elementos: " + listaDinamicaTeste.contar());
    }
}