/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia;

/**
 *
 * @author gusta
 */
public class Node {
    public Node right;
    public Node left;
    public int item;

    public Node getRigth() {
        return right;
    }

    public void setRigth(Node rigth) {
        this.right = rigth;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getVal() {
        return item;
    }

    public void setVal(int item) {
        this.item = item;
    }
    
}
