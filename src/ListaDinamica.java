import java.util.Arrays;

public class ListaDinamica implements ListaOperacoes {
    No inicio;

    public ListaDinamica() {
        this.inicio = new No(null);
        System.out.println("Lista dinâmica criada com sucesso!");
    }

    public void adicionarElemento(String elemento) {

        if (inicioEstaVazio()) {
            this.inicio.setConteudo(elemento);
        } else {
            No aux = this.inicio;
            No novoNo = new No(elemento);
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }

    public void exibir() {
        if (inicioEstaVazio()) {
            System.out.println("Não existem elementos na lista dinâmica.");
        } else {
            No aux = this.inicio;
//            while(aux != null && aux.getConteudo() != null) {
//                System.out.println(aux.getConteudo());
//                aux = aux.getProx();
//            }

            while (aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            //System.out.println(aux.getConteudo());
        }
    }

    private boolean inicioEstaVazio() {
        if (this.inicio.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void removerElemento(String elemento) {

        // Verifica se o elemento passado não é null ou vazio
        if (elemento == null || elemento.trim().isEmpty()) {
            System.out.println("Elemento não pode ser nulo ou vazio.");
        }

        if (inicioEstaVazio()) {
            System.out.println("Não há elementos a serem removidos.");
        } else {
            if (procurarElemento(elemento)) {
                //remover primeiro elemento isolado
                if (this.inicio.getProx() == null) {
                    System.out.println("Elemento + " + elemento + " removido!");
                    this.inicio.setConteudo(null);
                }
                //remover qualquer nó conectado
                else if (this.inicio.getProx() != null) {
                    No aux = this.inicio;
                    while (aux != null) {
                        if (this.inicio.getConteudo().equalsIgnoreCase(elemento)) {
                            System.out.println("Elemento " + elemento + " removido!");
                            this.inicio = this.inicio.getProx();
                            return;
                        } else if (aux.getProx().getConteudo().equalsIgnoreCase(elemento)) {
                            System.out.println("Elemento " + elemento + " removido!");
                            aux.setProx(aux.getProx().getProx());
                            return;
                        }
                        aux = aux.getProx();
                    }
                }
            }
        }
    }

    public boolean procurarElemento(String elemento) {

        // Verifica se o elemento passado nao é null ou vazio
        if (elemento == null || elemento.trim().isEmpty()) {
            System.out.println("Elemento não pode ser nulo ou vazio.");
            return false;
        }

        // Verifica se a lista esta vazia
        if (inicioEstaVazio()) {
            System.out.println("Não há elementos a serem procurados.");
        } else {
            No aux = this.inicio;
            while (aux != null) {
                if (aux.getConteudo().equalsIgnoreCase(elemento)) {
                    System.out.println("Elemento " + elemento + " encontrado!");
                    return true;
                }
                aux = aux.getProx();
            }
            System.out.println("Elemento " + elemento + " não existe na lista.");
        }
        return false;
    }

    @Override
    public int removerTodas(String elemento) {
        int quantidade = 0;

        No aux = this.inicio;
        while (aux != null) {
            if (procurarElemento(elemento)) {
                quantidade += 1;
                removerElemento(elemento);
            } else {
                return quantidade;
            }
            aux = aux.getProx();
        }
        return quantidade;
    }

    @Override
    public int contar() {
        int cont = 0;
        No aux = this.inicio;
        while (aux != null) {
            cont += 1;
            aux = aux.getProx();
        }
        return cont;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        int cont = 0;

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].getClass().equals(String.class)) {
                adicionarElemento(elementos[i]);
                cont += 1;
            } else {
                System.out.println("Não foi possivel adicionar o elemento " + elementos[i] + " pois nao esta de acordo com o padrão");
            }
        }
        return cont;
    }

    @Override
    public String obter(int indice) {

        // Tratamento para indice menor que 1.
        if(indice < 1){
            System.out.println("Indice deve ser maior que 0.");
            return null;
        }

        // Tratamento para lista vazia
        if(inicioEstaVazio()){
            System.out.println("Lista vazia.");
            return null;
        }

        No aux = this.inicio;
        for (int i = 1; i < indice; i++) {
            aux = aux.getProx();
            if (aux == null) {
                System.out.println("Este indice não existe na lista, recomendado que verifique o tamanho.");
                return null;
            }
        }
        return aux.getConteudo();
    }


    // TENTATIVA DE UM INSERIR
    @Override
    public boolean inserir(int indice, String elemento) {

        if (elemento == null || elemento.trim().isEmpty()) {
            System.out.println("Elemento não pode ser nulo ou vazio.");
            return false;
        }
        
        if (indice < 1) {
            System.out.println("Indice deve ser maior que 0.");
            return false;
        }

        // Tratamento casa esteja vazia e caso for o primeior indice ja inicia aloca corretamente
        if (inicioEstaVazio()) {
            if (indice == 1) {
                this.inicio.setConteudo(elemento);
                System.out.println("Elemento inserido. Lista estava vazia");
                return true;
            } else {
                System.out.println("Lista vazia. Só é possível inserir no índice 1.");
                return false;
            }
        }

        int tamanhoLista = contar();
        if (indice > tamanhoLista + 1) {
            System.out.println("O indice é maior que o tamanho da lista");
            return false;
        }

        if (indice == 1) {
            No novoNo = new No(elemento);
            novoNo.setProx(this.inicio);
            this.inicio = novoNo;
            System.out.println("Elemento inserido.");
            return true;
        }

        No aux = this.inicio;
        for (int i = 1; i < indice - 1; i++) {
            aux = aux.getProx();
        }
        
        No novoNo = new No(elemento);
        novoNo.setProx(aux.getProx());
        aux.setProx(novoNo);
        
        System.out.println("Elemento inserido.");
        return true;
    }

    @Override
    public String removerPorIndice(int indice) {
        removerElemento(obter(indice));
        if(obter(indice) != null){
            return obter(indice);
        }
        return null;
    }

    @Override
    public void limpar() {
        this.inicio.setProx(null);
        this.inicio.setConteudo(null);
    }

    @Override
    public int ultimoIndiceDe(String elemento) {

        if (elemento == null || elemento.trim().isEmpty()) {
            System.out.println("Elemento não pode ser nulo ou vazio.");
            return -1;
        }
        if (inicioEstaVazio()) {
            return -1;
        }

        int ultimoIndice = -1;
        int indiceAtual = 1;
        No aux = this.inicio;

        while (aux != null) {
            if (aux.getConteudo().equalsIgnoreCase(elemento)) {
                ultimoIndice = indiceAtual;
            }
            aux = aux.getProx();
            indiceAtual++;
        }
        return ultimoIndice;
    }

    @Override
    public int contarOcorrencias(String elemento) {

        if (elemento == null || elemento.trim().isEmpty()) {
            System.out.println("Elemento não pode ser nulo ou vazio.");
            return 0;
        }

        if (inicioEstaVazio()) {
            return 0;
        }

        int contador = 0;

        No aux = this.inicio;
        while (aux != null) {
            if (aux.getConteudo().equalsIgnoreCase(elemento)) {
                contador++;
            }
            aux = aux.getProx();
        }

        return contador;
    }

    @Override
    public int substituir(String antigo, String novo) {

        if (antigo == null || antigo.trim().isEmpty()) {
            System.out.println("Elemento antigo não pode ser nulo ou vazio.");
            return 0;
        }

        if (novo == null || novo.trim().isEmpty()) {
            System.out.println("Novo elemento não pode ser nulo ou vazio.");
            return 0;
        }

        if (inicioEstaVazio()) {
            return 0;
        }

        int substituicoes = 0;
        No aux = this.inicio;

        while (aux != null) {
            if (aux.getConteudo().equalsIgnoreCase(antigo)) {
                aux.setConteudo(novo);
                substituicoes++;
            }
            aux = aux.getProx();
        }

        return substituicoes;
    }
}