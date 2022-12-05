/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class Tree {
    private Node raiz;
    
    private static class Node {
            Peca Elem;
            Node Pai;
            List<Node> Filhos;

            public Node(Peca valor) {
                    Elem = valor;
                    Pai = null;
                    Filhos = new ArrayList<>();
            }
    }

    public Tree(Peca elem) {
            raiz = new Node(elem);
    }
    public void inserir(Peca elem, Peca paiStr) {
            Node pai = pesquisa(paiStr, raiz);
            if (pai != null) {
                    Node novo = new Node(elem);
                    novo.Pai = pai;
                    pai.Filhos.add(novo);
                    System.out.println(pai.Filhos);
            }
    }

    private Node pesquisa(Peca e, Node r) {
            if (r.Elem.equals(e))
                    return r;
            for (Node f : r.Filhos) {
                    Node aux = pesquisa(e, f);
                    if (aux != null)
                            return aux;
            }
            return null;
    }
}