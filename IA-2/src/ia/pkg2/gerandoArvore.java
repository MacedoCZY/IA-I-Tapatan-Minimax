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
public class gerandoArvore {
    int tabelaDePossibilidades[][] = {{0,1,0,1,1,0,0,0,0},
                                     {1,0,1,0,1,0,0,0,0},
                                     {0,1,0,0,1,1,0,0,0},
                                     {1,0,0,0,1,0,1,0,0},
                                     {1,1,1,1,0,1,1,1,1},
                                     {0,0,1,0,1,0,0,0,1},
                                     {0,0,0,1,1,0,0,1,0},
                                     {0,0,0,0,1,0,1,0,1},
                                     {0,0,0,0,1,1,0,1,0}};
    
    public List<int[]> proucurarNaTabela(int[][] Tab, Boolean Jogador){
        List<int[]> cordComJogador = new ArrayList<int[]>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(Jogador){
                    if(Tab[i][j] == 2){
                        int[] cordenadas = {i,j};
                        cordComJogador.add(cordenadas);
                    }
                }else{
                    if(Tab[i][j] == 1){
                        int[] cordenadas = {i,j};
                        cordComJogador.add(cordenadas);
                    }
                }
            }
        }
        return cordComJogador;
    }
    
    public List<int[][]> possibilidadeMov(int[][] Tab, List<int[]> cordComJogador, Boolean Jogador){
        int finaliza = 0;
        List<int[][]> listaDeTabela = new ArrayList<int[][]>();
        while(finaliza < cordComJogador.size()){
            //System.out.println(cordComJogador.size());
            int[] vetCordComJogador = cordComJogador.get(finaliza);
            listaDeTabela = analisaTabelaDeMovimentos(Tab, vetCordComJogador, Jogador);
            finaliza++;
        }
        return listaDeTabela;
    }
    
    public List<int[][]> analisaTabelaDeMovimentos(int[][] Tab, int[] Cordenadas, Boolean Jogador){
        int posNaTabelaDePos = (Cordenadas[0]*3) + Cordenadas[1];
        System.out.println("x = " +posNaTabelaDePos);
        System.out.println(Cordenadas[0] + "  " + Cordenadas[1]);
        List<int[][]> listaDeTabela = new ArrayList<int[][]>();
        if(posNaTabelaDePos == 0){
                listaDeTabela = resolveTabelaDeRetorno(Tab, posNaTabelaDePos, Cordenadas, Jogador);
        }
        if(posNaTabelaDePos == 1){
                listaDeTabela = resolveTabelaDeRetorno(Tab, posNaTabelaDePos, Cordenadas, Jogador);
        }
        if(posNaTabelaDePos == 2){
                listaDeTabela = resolveTabelaDeRetorno(Tab, posNaTabelaDePos, Cordenadas, Jogador);
        }
        if(posNaTabelaDePos == 3){
                listaDeTabela = resolveTabelaDeRetorno(Tab, posNaTabelaDePos, Cordenadas, Jogador);
        }
        if(posNaTabelaDePos == 4){
                listaDeTabela = resolveTabelaDeRetorno(Tab, posNaTabelaDePos, Cordenadas, Jogador);
        }
        if(posNaTabelaDePos == 5){
                listaDeTabela = resolveTabelaDeRetorno(Tab, posNaTabelaDePos, Cordenadas, Jogador);
        }
        if(posNaTabelaDePos == 6){
                listaDeTabela = resolveTabelaDeRetorno(Tab, posNaTabelaDePos, Cordenadas, Jogador);
        }
        if(posNaTabelaDePos == 7){
                listaDeTabela = resolveTabelaDeRetorno(Tab, posNaTabelaDePos, Cordenadas, Jogador);
        }
        if(posNaTabelaDePos == 8){
                listaDeTabela = resolveTabelaDeRetorno(Tab, posNaTabelaDePos, Cordenadas, Jogador);
        }
        return listaDeTabela;
    }
    
    public int[] resolveTabelaGrande(int j){
        int[] cordenada = new int[2];
        switch(j){
            case 0:
                cordenada[0] = 0;
                cordenada[1] = 0;
                return cordenada;
            case 1:
                cordenada[0] = 0;
                cordenada[1] = 1;
                return cordenada;
            case 2:
                cordenada[0] = 0;
                cordenada[1] = 2;
                return cordenada;
            case 3:
                cordenada[0] = 1;
                cordenada[1] = 0;
                return cordenada;
            case 4:
                cordenada[0] = 1;
                cordenada[1] = 1;
                return cordenada;
            case 5:
                cordenada[0] = 1;
                cordenada[1] = 2;
                return cordenada;
            case 6:
                cordenada[0] = 2;
                cordenada[1] = 0;
                return cordenada;
            case 7:
                cordenada[0] = 2;
                cordenada[1] = 1;
                return cordenada;
            case 8:
                cordenada[0] = 2;
                cordenada[1] = 2;
                return cordenada;
        }
        return null;
    }
    
    public List<int[][]> resolveTabelaDeRetorno(int[][] Tab, int posNaTabelaDePos, int[] Cordenadas, Boolean Jogador){
        List<int[][]> tabRetorno = new ArrayList<int[][]>();
        int[] guardaPosParaAnalise = new int[2];
        for(int j = 0; j < 9; j++){
            int[][] tabelaAux = Tab;
            //System.out.println("j fora = "+j);
            if(tabelaDePossibilidades[posNaTabelaDePos][j] == 1){
                //System.out.println("j = "+j);
                guardaPosParaAnalise = resolveTabelaGrande(j);
                //System.out.println("val ="+guardaPosParaAnalise[0] +" "+ guardaPosParaAnalise[1]);
                if(Tab[guardaPosParaAnalise[0]][guardaPosParaAnalise[1]] == 0){
                    //System.out.println("++++++Tab = "+ Tab[guardaPosParaAnalise[0]][guardaPosParaAnalise[1]]);
                    tabelaAux[guardaPosParaAnalise[0]][guardaPosParaAnalise[1]] = quemEstaJogando(Jogador);
                    tabelaAux[Cordenadas[0]][Cordenadas[1]] = 0;
                    tabRetorno.add(tabelaAux);
                    printMatriz(Tab);
                    tabelaAux = Tab;
                } 
            }
        }
        System.out.println("termino");
        return tabRetorno;
    }
    
    public int quemEstaJogando(Boolean Jogador){
        if(Jogador){
            return 2;
        }else{
            return 1;
        }
    }
    
    public void printMatriz(int[][] Mat){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(Mat[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}