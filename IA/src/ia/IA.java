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
    Minimax min = new Minimax();
    
    Matriz mt = new Matriz();
    Peca Matrix[][] = {{mt.red1, null, mt.blue1},
                       {mt.blue2, null, mt.red2},
                       {mt.red3, null, mt.blue3}};
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
