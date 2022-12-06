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
    
    public Peca lokPos(int i){
        Peca aux = new Peca(-1,-1);
        switch(i){
            case 0:
                aux.x = 0;
                aux.y = 0;
                return aux;
            case 1:
                aux.x = 0;
                aux.y = 1;
                return aux;
            case 2:
                aux.x = 0;
                aux.y = 2;
                return aux;
            case 3:
                aux.x = 1;
                aux.y = 0;
                return aux;
            case 4:
                aux.x = 1;
                aux.y = 1;
                return aux;
            case 5:
                aux.x = 1;
                aux.y = 2;
                return aux;
            case 6:
                aux.x = 2;
                aux.y = 0;
                return aux;
            case 7:
                aux.x = 2;
                aux.y = 1;
                return aux;
            case 8:
                aux.x = 2;
                aux.y = 2;
                return aux;
        }
        return null;
    }

    public ArrayList possiblePos(Peca Matrix[][], Peca pc){
        ArrayList<Peca> ret = new ArrayList<Peca>();
        Peca aux = new Peca(-1,-1);
        for(int i = 0; i <= 8; i++){
            if(pc.x == 0 && pc.y == 0){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    aux = lokPos(i);
                    if(Matrix[aux.x][aux.y] == null){
                        ret.add(lokPos(i));
                    }
                }
            }
            if(pc.x == 0 && pc.y == 1){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    aux = lokPos(i);
                    if(Matrix[aux.x][aux.y] == null){
                        ret.add(lokPos(i));
                    }
                }
            }
            if(pc.x == 0 && pc.y == 2){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    aux = lokPos(i);
                    if(Matrix[aux.x][aux.y] == null){
                        ret.add(lokPos(i));
                    }
                }
            }
            if(pc.x == 1 && pc.y == 0){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    aux = lokPos(i);
                    if(Matrix[aux.x][aux.y] == null){
                        ret.add(lokPos(i));
                    }
                }
            }
            if(pc.x == 1 && pc.y == 1){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    aux = lokPos(i);
                    if(Matrix[aux.x][aux.y] == null){
                        ret.add(lokPos(i));
                    }
                }
            }
            if(pc.x == 1 && pc.y == 2){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    aux = lokPos(i);
                    if(Matrix[aux.x][aux.y] == null){
                        ret.add(lokPos(i));
                    }
                }
            }
            if(pc.x == 2 && pc.y == 0){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    aux = lokPos(i);
                    if(Matrix[aux.x][aux.y] == null){
                        ret.add(lokPos(i));
                    }
                }
            }
            if(pc.x == 2 && pc.y == 1){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    aux = lokPos(i);
                    if(Matrix[aux.x][aux.y] == null){
                        ret.add(lokPos(i));
                    }
                }
            }
            if(pc.x == 2 && pc.y == 2){
                if(matrizPossiblePos[3*pc.x+pc.y][0+i] == 1){
                    aux = lokPos(i);
                    if(Matrix[aux.x][aux.y] == null){
                        ret.add(lokPos(i));
                    }
                }
            }
        }
        return ret;
    }
    
    public void Test(){
        Matriz mt = new Matriz();
        Peca Matrix[][] = {{red1, null, blue1},
                           {blue2, null, red2},
                           {red3, null, blue3}};
        
        for(int i = 0; i < possiblePos(Matrix, red1).size(); i++){
            tree.root.sams.add((Peca) possiblePos(Matrix, red1).get(i));
        }
        possiblePos(Matrix, red2).get(0);
        possiblePos(Matrix, red3).get(0);
                
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