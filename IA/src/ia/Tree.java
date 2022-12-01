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
}