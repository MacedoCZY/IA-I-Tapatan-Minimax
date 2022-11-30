/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia;

/**
 *
 * @author gusta
 */
public class Tree {
    private Node root; // raiz

    public Tree() { root=null; } // inicializa arvore

    public void inserir(int v) {
        Node no = new Node(); // cria um novo Nó
        no.item = v; // atribui o valor recebido ao item de dados do Nó
        no.right = null;
        no.left = null;

    if (root == null) 
          root = no;
      
    else  { // se nao for a raiz
        Node current = root;
        Node previous;
        while(true) {
            previous = current;
            if (v <= current.item) { // ir para esquerda
                current = current.left;
                if (current == null) {
                    previous.left = no;
                    return;
                } 
            }  // fim da condição ir a esquerda
            else { // ir para direita
                current = current.right;
                if (current == null) {
                    previous.right = no;
                    return;
                }
            } // fim da condição ir a direita
        } // fim do laço while
      } // fim do else não raiz
    }

    public Node buscar(int chave) {
        if (root == null) return null; // se arvore vazia
        Node current = root;  // começa a procurar desde raiz
        while (current.item != chave) { // enquanto nao encontrou
            if(chave < current.item ) current = current.right; // caminha para esquerda
            else current = current.right; // caminha para direita
            if (current == null) return null; // encontrou uma folha -> sai
        } // fim laço while
        return current; // terminou o laço while e chegou aqui é pq encontrou item
    }
}
