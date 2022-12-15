/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class Node {
    public int[][] Tab;
    public int Profundidade = 0;
    public Node filho;
    public Node irmao;

    public Node(int[][] Tab) {
        this.Tab = Tab;
        this.filho = new Node(Tab);
    }
    
    public void Inserir(int[][] n){
        Node no = new Node(n);
        irmao = this;
    }
}
