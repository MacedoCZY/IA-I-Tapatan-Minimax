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
    public Node root;
    
    public Tree(Peca dateRoot) {
       root = new Node(dateRoot, 0);
    }

    public Node getRoot() {
        return root;
    }
    
    public Node newNode(Peca dateRoot, int depth){
        return new Node(dateRoot, depth);
    }

}