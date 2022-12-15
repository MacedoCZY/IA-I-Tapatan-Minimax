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
    public List<Node> filho = new ArrayList<>();

    public Node(int[][] Tab) {
        this.Tab = Tab;
    }
    
    public void Inserir(int[][] n){
        Node no = new Node(n);
        no.filho = new ArrayList<>();
        this.filho.add(no);
    }
}
