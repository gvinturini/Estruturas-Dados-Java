import com.digitalinnovation.arvorebinaria.ArvoreBinaria;
import com.digitalinnovation.arvorebinaria.model.Obj;
import com.digitalinnovation.equalshashcode.Carro;
import com.digitalinnovation.fila.Fila;
import com.digitalinnovation.fila.NoFila;
import com.digitalinnovation.listacircular.ListaCircular;
import com.digitalinnovation.listaduplamenteencadeada.ListaDuplamenteEncadeada;
import com.digitalinnovation.listaencadeada.ListaEncadeada;
import com.digitalinnovation.pilha.No;
import com.digitalinnovation.pilha.Pilha;
import com.digitalinnovation.queue.CarroQueue;
import com.digitalinnovation.stack.CarroStack;

import java.util.*;

public class Main {

    public static void main(String[] args) {



        // Uso de Queue
        /*Queue<CarroQueue> queueCarros = new LinkedList<>();

        queueCarros.add(new CarroQueue("Ford"));
        queueCarros.add(new CarroQueue("Chevrolet"));
        queueCarros.add(new CarroQueue("Fiat"));

        System.out.println(queueCarros.add(new CarroQueue("Peugeot")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new CarroQueue("Renault")));
        System.out.println(queueCarros);
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());*/

        // Uso de Stack
        /*Stack<CarroStack> stackCarros = new Stack<>();

        stackCarros.push(new CarroStack("Ford"));
        stackCarros.push(new CarroStack("Chevrolet"));
        stackCarros.push(new CarroStack("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());*/

        // Uso de hashCode e equals
        /*
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));*/

        // Uso da Árvore binária
        /*ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();*/

        // Uso da lista circular
        /*ListaCircular<String> minhaListaCircular = new ListaCircular<>();

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
        }*/

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
