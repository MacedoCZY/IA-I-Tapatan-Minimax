/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia.pkg2;

import java.util.List;

/**
 *
 * @author gusta
 */
public class Node {
    public int[][] Tab;
    public int Profundidade = 0;
    public List<Node> filho;
    
    public void Inserir(){
        Node n = new Node();
        filho.add(n);
    }
}
