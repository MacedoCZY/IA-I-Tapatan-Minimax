/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Matriz {
    public 
    Peca red1 = new Peca(0,0);
    Peca red2 = new Peca(1,2);
    Peca red3 = new Peca(2,0);
    Peca blue1 = new Peca(0,2);
    Peca blue2 = new Peca(1,0);
    Peca blue3 = new Peca(2,2);
    
    public ArrayList possible_Pos(Peca Matrix[][], Peca pc){
        ArrayList ret = new ArrayList();
        int[][] aux = new int[1][1];
        if(Matrix[pc.x][pc.y+1] == null){
            ret.add(aux[pc.x][pc.y+1]);
        }
    }
    
}