import com.digitalinnovation.fila.Fila;
import com.digitalinnovation.fila.NoFila;
import com.digitalinnovation.listacircular.ListaCircular;
import com.digitalinnovation.listaduplamenteencadeada.ListaDuplamenteEncadeada;
import com.digitalinnovation.listaencadeada.ListaEncadeada;
import com.digitalinnovation.pilha.No;
import com.digitalinnovation.pilha.Pilha;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        System.out.println(minhaListaCircular);

//        System.out.println(minhaListaCircular.get(4));
        for (int i = 0; i < 20; i++) {
            System.out.println(minhaListaCircular.get(i));
        }

        // Uso da lista duplamente encadeada
        /*ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        minhaLista.add("c6");
        minhaLista.add("c7");

        System.out.println(minhaLista);

        minhaLista.remove(3);
        minhaLista.add(3,"99");
        System.out.println(minhaLista);

        System.out.println(minhaLista.get(3));*/

        // Uso da Lista Encadeada
        /*ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));
        System.out.println(minhaListaEncadeada.toString());
        System.out.println(minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada.toString());*/

        // Uso da Fila
        /*Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue("utlimo");
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());*/

        // Uso da Pilha
        /*Pilha minhaPilha = new Pilha();
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());

        System.out.println(minhaPilha);*/

    }
}
