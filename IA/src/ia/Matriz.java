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
    Peca raizRed = new Peca(-1,-1);
    
    Tree tree = new Tree(raizRed);
    
    int matrizPossiblePos[][] = {{0,1,0,1,1,0,0,0,0},
                                 {1,0,1,0,1,0,0,0,0},
                                 {0,1,0,0,1,1,0,0,0},
                                 {1,0,0,0,1,0,1,0,0},
                                 {1,1,1,1,0,1,1,1,1},
                                 {0,0,1,0,1,0,0,0,1},
                                 {0,0,0,1,1,0,1,0,0},
                                 {0,0,0,0,1,0,1,0,1},
                                 {0,0,0,0,1,1,0,1,0}};
    
    public Peca arrumaCord(Peca pc){
        Peca aux;
        if(pc.x == 0 && pc.y == 0){
            aux.x = 0;
            aux.y = 0;
        }
        
    }
    
    public void possible_Pos(Peca Matrix[][], Peca pc){
        //ArrayList ret = new ArrayList();
        for(int i = 0; i <= 8; i++){
            if(matrizPossiblePos[pc.x][pc.y+i] == 1){
                if(Matrix[])
            }
        }
    }
    
}