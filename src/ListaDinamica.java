import java.util.Arrays;

public class ListaDinamica implements ListaOperacoes{
    No inicio;

    public ListaDinamica() {
        this.inicio = new No(null);
        System.out.println("Lista dinâmica criada com sucesso!");
    }

    public void adicionarElemento(String elemento) {

        if(inicioEstaVazio()) {
            this.inicio.setConteudo(elemento);
        } else {
            No aux = this.inicio;
            No novoNo = new No(elemento);
            while(aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }

    public void exibir() {
        if(inicioEstaVazio()) {
            System.out.println("Não existem elementos na lista dinâmica.");
        } else {
            No aux = this.inicio;
//            while(aux != null && aux.getConteudo() != null) {
//                System.out.println(aux.getConteudo());
//                aux = aux.getProx();
//            }

            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            //System.out.println(aux.getConteudo());
        }
    }

    private boolean inicioEstaVazio() {
        if(this.inicio.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void removerElemento(String elemento) {
        if(inicioEstaVazio()) {
            System.out.println("Não há elementos a serem removidos.");
        } else {
            if(procurarElemento(elemento)) {
                //remover primeiro elemento isolado
                if(this.inicio.getProx() == null) {
                    System.out.println("Elemento + " + elemento + " removido!");
                    this.inicio.setConteudo(null);
                }
                //remover qualquer nó conectado
                else if(this.inicio.getProx() != null) {
                    No aux = this.inicio;
                    while(aux != null) {
                        if (this.inicio.getConteudo().equalsIgnoreCase(elemento)) {
                            System.out.println("Elemento " + elemento + " removido!");
                            this.inicio = this.inicio.getProx();
                            return;
                        } else if(aux.getProx().getConteudo().equalsIgnoreCase(elemento)) {
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
        if(inicioEstaVazio()) {
            System.out.println("Não há elementos a serem procurados.");
        } else {
            No aux = this.inicio;
            while(aux != null) {
                if(aux.getConteudo().equalsIgnoreCase(elemento)) {
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
        while(aux != null) {
            if(procurarElemento(elemento)){
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
        while(aux != null) {
         cont += 1;
         aux = aux.getProx();
        }
        return cont;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        int cont = 0;

        for (int i = 0; i < elementos.length; i++){
            if(elementos[i].getClass().equals(String.class)){
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
        No aux = this.inicio;
        for(int i = 1; i < indice; i++) {
            aux = aux.getProx();
            if(aux == null){
                System.out.println("Este indice não existe na lista, recomendado que verifique o tamanho.");
                return "";
            }
        }
        return aux.getConteudo();
    }
}
