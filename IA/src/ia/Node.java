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
class Node {
    public Peca pc;
    public int depth;
    public ArrayList<Peca> sams;
    
    public Node(Peca pc, int depth) {
        this.sams = new ArrayList<Peca>();
        this.pc = pc;
        this.depth = depth;
    }

    public Node addSam(Peca dataSam) {
        Node n = new Node(dataSam, this.depth);
        sams.add(dataSam);
        return n;
    }

    public Peca getData() {
        return pc;
    }

    public ArrayList<Peca> getSams() {
        return sams;
    }
    
    public int getDepth(){
        return depth;
    }
    
    public int getSize(){
        return sams.size();
    }
}