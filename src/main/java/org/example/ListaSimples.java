package org.example;

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
                if(this.lista[i] != null && this.lista[i].equals(elemento)) {
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
        for(int i = 0; i < this.lista.length; i++) {
            if(this.lista[i].equals(elemento)) {
                this.lista[i] = null;
            }
        }
        System.out.println("Todos os elementos " + elemento + " foram removidos.");
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

        return adicionados;
    }

    @Override
    public String obter(int indice) {
        if (indice < 0 || indice >= this.lista.length) {
            return null;
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
        return true;
    }

    @Override
    public String removerPorIndice(int indice) {
        for(int i = 0; i < this.lista.length; i++) {
           if(i == indice) {
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
        int cont = 0;
        for(int i = 0; i < this.lista.length; i++) {
            if(this.lista[i].equals(elemento)) {
                cont += 1;
            }
        }
        System.out.println("A quantidade de vezes que o elemento aparece é: " + cont);
        return 0;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        int cont = 0;
        for(int i = 0; i < this.lista.length; i++) {
            if(this.lista[i].equals(elemento)) {
                cont += 1;
            }
        }
        System.out.println("O elemento aparece " + cont + " vez(es) na lista ");
        return 0;
    }

    @Override
    public int substituir(String antigo, String novo) {
        for(int i = 0; i < this.lista.length; i++) {
            if(this.lista[i].equals(antigo)) {
                this.lista[i] = novo;
            }
        }
        return 0;
    }
}