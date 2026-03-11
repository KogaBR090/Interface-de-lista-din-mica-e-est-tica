/**
 * Classe principal da estrutura {@code ListaSimples}, denominada MainListaSimples.
 * É responsável por iniciar a aplicação e testar as operações definidas
 * na Interface {@code ListaOperacoes}.
 *
 * <p>Esta classe implementa métodos fundamentais para manipulação da lista,
 * como adicionar, remover, buscar e exibir elementos. Além disso, disponibiliza
 * métodos auxiliares, incluindo: removerTodas, contar, adicionarVarios, obter,
 * inserir, removerPorIndice, limpar, ultimoIndiceDe, contarOcorrencias e
 * substituir.</p>
 */
public class MainListaSimples {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(10);

        //Criação do vetor que será usado como exemplo para o métod0 de adicionarVarios
        String[] vetor = {"Detergente", "Esponja", "Sabonete", "Escova de Dente"};

        //Teste de adicionar os elementos e exibí-los
        listaSimples.adicionarElemento("Arroz");
        listaSimples.adicionarElemento("Feijão");
        listaSimples.adicionarElemento("Sabão em Pó");
        listaSimples.adicionarElemento("Papel Higiênico");
        listaSimples.adicionarElemento("Óleo");
        listaSimples.adicionarElemento("Feijão");
        listaSimples.exibirElementos();
        System.out.println("-----------------------------");

        //Teste de buscar, remover e exibir os elementos
        listaSimples.buscarElemento("Óleo");
        listaSimples.removerElemento("Óleo");
        listaSimples.buscarElemento("Óleo");
        listaSimples.exibirElementos();
        System.out.println("-----------------------------");

        //Teste 1 - removerTodas
        listaSimples.removerTodas("Feijão");
        listaSimples.exibirElementos();

        //Teste 2 - contar
        listaSimples.contar();
        System.out.println("-----------------------------");

        //Teste 3 - adicionarVarios (passando o vetor criado no começo da classe)
        listaSimples.adicionarVarios(vetor);
        listaSimples.exibirElementos();
        System.out.println("-----------------------------");

        //Teste 4 - obter
        listaSimples.obter(5);
        listaSimples.obter(8); //Teste no elemento nulo
        System.out.println("-----------------------------");

        //Teste 5 - inserir
        listaSimples.inserir(7, "Batata");
        listaSimples.inserir(8, "Maçã");
        listaSimples.inserir(9, "Banana");
        listaSimples.inserir(9, "Kiwi"); //Teste de inserção no índice já utilizado
        listaSimples.exibirElementos();
        System.out.println("-----------------------------");

        //Teste 6 - removerPorIndice
        listaSimples.removerPorIndice(2);
        listaSimples.removerPorIndice(2); //Retorno esperado = null
        listaSimples.exibirElementos();
        System.out.println("-----------------------------");

        //Teste 7 - limpar
        listaSimples.limpar();
        listaSimples.exibirElementos();
        System.out.println("-----------------------------");

        //Teste 8 - ultimoIndiceDe
        listaSimples.ultimoIndiceDe("Esponja"); //Retorno esperado = -1
        listaSimples.adicionarVarios(vetor); //Adicionando vários elementos só para conseguir testar a função
        listaSimples.adicionarElemento("Esponja");//Adicionando o elemento duplicado pra ver se funciona pegar o último índice
        listaSimples.exibirElementos();
        listaSimples.ultimoIndiceDe("Esponja");
        System.out.println("-----------------------------");

        //Teste 9 - contarOcorrencias
        listaSimples.contarOcorrencias("Esponja");
        listaSimples.contarOcorrencias("Detergente");
        listaSimples.contarOcorrencias("Abacaxi"); //Retorno esperado = não existe/aparece nenhuma vez
        System.out.println("-----------------------------");

        //Teste 10 - substituir
        listaSimples.substituir("Esponja", "Carne");
        listaSimples.substituir("Pêra", "Laranja"); //Retorno esperado = não dê para substituir, pois não existe
        listaSimples.exibirElementos();

    }
}
