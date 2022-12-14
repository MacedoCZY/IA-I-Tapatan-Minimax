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
    Peca rootRed = new Peca(-1,-1);
    
    Tree tree = new Tree(rootRed);
    
    int matrizPossiblePos[][] = {{0,1,0,1,1,0,0,0,0},
                                 {1,0,1,0,1,0,0,0,0},
                                 {0,1,0,0,1,1,0,0,0},
                                 {1,0,0,0,1,0,1,0,0},
                                 {1,1,1,1,0,1,1,1,1},
                                 {0,0,1,0,1,0,0,0,1},
                                 {0,0,0,1,1,0,0,1,0},
                                 {0,0,0,0,1,0,1,0,1},
                                 {0,0,0,0,1,1,0,1,0}};
    
    public Peca[][] lokPos(int i, Peca pc, Peca Matrix[][]){
        Peca Matrix1[][] = Matrix;
        printMat(Matrix);
        System.out.println("");
        //printMat(Matrix1);
        System.out.println("");
        switch(i){
            case 0:
                if(Matrix[0][0] == null){
                    Matrix1[pc.x][pc.y] = null;
                    pc.x = 0;
                    pc.y = 0;
                    Matrix1[0][0] = pc;
                    return Matrix1;
                }
            case 1:
                if(Matrix[0][1] == null){
                    Matrix1[pc.x][pc.y] = null;
                    pc.x = 0;
                    pc.y = 1;
                    Matrix1[0][1] = pc;
                    return Matrix1;
                }
            case 2:
                if(Matrix[0][2] == null){
                    Matrix1[pc.x][pc.y] = null;
                    pc.x = 0;
                    pc.y = 2;
                    Matrix1[0][2] = pc;
                    return Matrix1;
                }
            case 3:
                if(Matrix[1][0] == null){
                    Matrix1[pc.x][pc.y] = null;
                    pc.x = 1;
                    pc.y = 0;
                    Matrix1[1][0] = pc;
                    return Matrix1;
                }
            case 4:
                if(Matrix[1][1] == null){
                    Matrix1[pc.x][pc.y] = null;
                    pc.x = 1;
                    pc.y = 1;
                    Matrix1[1][1] = pc;
                    return Matrix1;
                }
            case 5:
                if((Matrix[1][2] == null)){
                    Matrix1[pc.x][pc.y] = null;
                    pc.x = 1;
                    pc.y = 2;
                    Matrix1[1][2] = pc;
                    return Matrix1;
                }
            case 6:
                if(Matrix[2][0] == null){
                    Matrix1[pc.x][pc.y] = null;
                    pc.x = 2;
                    pc.y = 0;
                    Matrix1[2][0] = pc;
                    return Matrix1;
                }
            case 7:
                if(Matrix[2][1] == null){
                    Matrix1[pc.x][pc.y] = null;
                    pc.x = 2;
                    pc.y = 1;
                    Matrix1[2][1] = pc;
                    return Matrix1;
                }
            case 8:
                if(Matrix[2][2] == null){
                    Matrix1[pc.x][pc.y] = null;
                    pc.x = 2;
                    pc.y = 2;
                    Matrix1[2][2] = pc;
                    return Matrix1;
                }
        }
        return null;
    }

    public ArrayList possiblePos(Peca Matrix[][], Peca pc){
        ArrayList<Peca[][]> ret = new ArrayList<Peca[][]>();
        //Peca aux = new Peca(-1,-1);
        for(int i = 0; i <= 8; i++){
            if(pc.x == 0 && pc.y == 0){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    ret.add(lokPos(i, pc, Matrix));
                }
            }
            if(pc.x == 0 && pc.y == 1){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    ret.add(lokPos(i, pc, Matrix));
                }
            }
            if(pc.x == 0 && pc.y == 2){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    ret.add(lokPos(i, pc, Matrix));
                }
            }
            if(pc.x == 1 && pc.y == 0){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    ret.add(lokPos(i, pc, Matrix));
                }
            }
            if(pc.x == 1 && pc.y == 1){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    ret.add(lokPos(i, pc, Matrix));
                }
            }
            if(pc.x == 1 && pc.y == 2){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    ret.add(lokPos(i, pc, Matrix));
                }
            }
            if(pc.x == 2 && pc.y == 0){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    ret.add(lokPos(i, pc, Matrix));
                }
            }
            if(pc.x == 2 && pc.y == 1){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    ret.add(lokPos(i, pc, Matrix));
                }
            }
            if(pc.x == 2 && pc.y == 2){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    ret.add(lokPos(i, pc, Matrix));
                }
            }
        }
        return ret;
    }
    
    public void printMat(Peca Matrix[][]){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(Matrix[i][j] != null){
                    System.out.print(Matrix[i][j].x + " " + Matrix[i][j].y + " ");
                }else{
                    System.out.print("null ");
                }
            }
            System.out.println("");
        }
    }
    
    public void Test(){
        Peca Matrix[][] = {{red1, null, blue1},
                           {blue2, null, red2},
                           {red3, null, blue3}};
        
        /*for(int i = 0; i < possiblePos(Matrix, red1).size(); i++){
            tree.root.sams.add((Peca) possiblePos(Matrix, red1).get(i));
        }*/
        Peca aux[][] = {{red1, null, blue1},
                           {blue2, null, red2},
                           {red3, null, blue3}};
        
        possiblePos(Matrix, red2);
        
        //printMat(aux);
       // possiblePos(Matrix, red3).get(0);
                
        /*int play = 2;
        while(true){
            if(play % 2 == 0){
                possiblePos(Matrix, red1, play);
                possiblePos(Matrix, red2, play);
                possiblePos(Matrix, red3, play);
            }
            play++;
            if(play % 2 != 0){
                possiblePos(Matrix, red1, play);
                possiblePos(Matrix, red2, play);
                possiblePos(Matrix, red3, play);
            }
            
        }*/
    }
}