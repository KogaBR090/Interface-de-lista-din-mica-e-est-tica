public class ListaSimples implements ListaOperacoes {
    String [] lista;
    public ListaSimples(int tamanho) {
        this.lista = new String[tamanho];
        System.out.println("Lista criada com sucesso! Existem " + tamanho + " posições disponíveis.");
    }

    public void adicionarElemento(String elemento) {
        if(!this.estaCheia()) {
            this.lista[encontrarPosicao()] = elemento;
            System.out.println("Elemento " + elemento + " adicionado com sucesso!");
        }
    }

    public boolean estaCheia() {
        for (int i = 0; i < this.lista.length; i++) {
            if(this.lista[i] == null) {
                return false;
            }
        }
        System.out.println("Não há espaço disponível na lista.");
        return true;
    }

    public boolean estaVazia() {
        for (int i = 0; i < this.lista.length; i++) {
            if(this.lista[i] != null) {
                return false;
            }
        }
        return true;
    }

    private int encontrarPosicao() {
        int i;
        for (i = 0; i < this.lista.length; i++) {
            if(this.lista[i] == null) {
                break;
            }
        }
        return i;
    }

    public void exibirElementos() {
        for (int i = 0; i < this.lista.length; i++) {
            System.out.println("Lista[" + i + "] = " + this.lista[i]);
        }
    }

    public void removerElemento(String elemento) {
        boolean removido = false;
        if(!estaVazia()) {
            for (int i = 0; i < this.lista.length; i++) {
                if(this.lista[i] != null && this.lista[i].equals(elemento)) {
                    this.lista[i] = null;
                    removido = true;
                }
            }
        }
        if(removido) {
            System.out.println("O elemento " + elemento + " foi removido com sucesso!");
        } else {
            System.out.println("O elemento " + elemento + " não existe na lista.");
        }
    }

    public void buscarElemento(String elemento) {
        boolean encontrado = false;
        if(!estaVazia()) {
            for (int i = 0; i < this.lista.length; i++) {
                if(this.lista[i] != null && this.lista[i] == elemento) {
                    encontrado = true;
                }
            }
        }
        if(encontrado) {
            System.out.println("O elemento " + elemento + " existe na lista!");
        } else {
            System.out.println("O elemento " + elemento + " não existe na lista.");
        }
    }

    @Override
    public int removerTodas(String elemento) {
        int cont = 0;
        for(int i = 0; i < this.lista.length; i++) {
            if(this.lista[i] == elemento) {
                this.lista[i] = null;
                cont++;
            }
        }
        System.out.println("Todos os elementos " + elemento + " foram removidos. Quantidade: " + cont);
        return 0;
    }

    @Override
    public int contar() {
        int cont = 0;
        for (int i = 0; i < this.lista.length; i++) {
            if(this.lista[i] != null && this.lista[i] != "") {
                cont += 1;
            }
        }
        System.out.println("A quantidade de elementos é: " + cont);
        return cont;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        int adicionados = 0;

        for (int i = 0; i < elementos.length; i++) {
            if (!estaCheia()) {
                this.lista[encontrarPosicao()] = elementos[i];
                adicionados++;
            } else {
                break;
            }
        }
        System.out.println("Quantidade de elementos que foram adicionados na lista: " +  adicionados);
        return adicionados;
    }

    @Override
    public String obter(int indice) {
        if (indice < 0 || indice >= this.lista.length) {
            return null;
        }
        if (this.lista[indice] == null) {
            System.out.println("O elemento no índice " + indice + " se encontra nulo!");
        } else {
            System.out.println("O elemento " + this.lista[indice] + " se encontra na posição: " + indice);
        }
        return this.lista[indice];
    }


    @Override
    public boolean inserir(int indice, String elemento) {
        if (indice < 0 || indice >= this.lista.length || estaCheia()) {
            return false;
        }

        for (int i = this.lista.length - 1; i > indice; i--) {
            this.lista[i] = this.lista[i - 1];
        }

        this.lista[indice] = elemento;
        System.out.println("O elemento " + elemento + " foi adicionado com sucesso na posição: " + indice);
        return true;
    }

    @Override
    public String removerPorIndice(int indice) {
        for(int i = 0; i < this.lista.length; i++) {
            if(i == indice && this.lista[i] != null) {
                System.out.println("O elemento " + this.lista[indice] + " que se encontra no índice: " + indice +
                        ", foi removido com sucesso!");
                this.lista[i] = null;
            }
        }
        return "";
    }

    @Override
    public void limpar() {
        if(!estaVazia()) {
            for(int i = 0; i < this.lista.length; i++) {
                this.lista[i] = null;
            }
        }
        System.out.println("Lista esvaziada");
    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        int ultimoIndice = -1;
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] != null && this.lista[i].equals(elemento)) {
                ultimoIndice = i;
            }
        }
        System.out.println("O índice do último elemento " + elemento + " se encontra na posição: " + ultimoIndice);
        return ultimoIndice;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        int cont = 0;
        for(int i = 0; i < this.lista.length; i++) {
            if(this.lista[i] == elemento) {
                cont += 1;
            }
        }
        System.out.println("O elemento " + elemento + " aparece " + cont + " vez(es) na lista ");
        return 0;
    }

    @Override
    public int substituir(String antigo, String novo) {
        int cont = 0;
        for(int i = 0; i < this.lista.length; i++) {
            if(this.lista[i] == antigo) {
                this.lista[i] = novo;
                cont += 1;
            }
        }
        System.out.println("O elemento " + antigo + " foi substituído com sucesso pelo elemento: " + novo +
                " (" + cont + " vezes)");
        return 0;
    }
}