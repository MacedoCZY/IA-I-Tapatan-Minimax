/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ia;

/**
 *
 * @author gusta
 */
public class IA {

    /**
     * @param args the command line arguments
     */    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Matriz mt = new Matriz();
        mt.Test();
        /*
        Peca Matrix[][] = {{mt.red1, null, mt.blue1},
                           {mt.blue2, null, mt.red2},
                           {mt.red3, null, mt.blue3}};  
        
        mt.possiblePos(Matrix, mt.red1);
        mt.possiblePos(Matrix, mt.red2);
        mt.possiblePos(Matrix, mt.red3);
        */
        for(int k = 0; k < mt.tree.root.sams.size(); k++){
            System.out.println(mt.tree.root.getSams().get(k).x + " " + mt.tree.root.getSams().get(k).y);
        }
        
    }
}
