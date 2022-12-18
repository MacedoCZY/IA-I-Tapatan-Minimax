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
        List<int[][]> listaDeTabelaAux = new ArrayList<>();
        List<int[][]> listaDeTabela = new ArrayList<>(); 
        int[][] aux = new int[3][3];
        while(finaliza < cordComJogador.size()){
            //System.out.println(cordComJogador.size());
            int[] vetCordComJogador = cordComJogador.get(finaliza);
            listaDeTabelaAux = analisaTabelaDeMovimentos(Tab, vetCordComJogador, Jogador);
            int cont = 0;
            while(cont < listaDeTabelaAux.size()){
                aux = listaDeTabelaAux.get(cont);
                listaDeTabela.add(aux);
                cont++;
            }
            finaliza++;
        }
        return listaDeTabela;
    }
    
    public List<int[][]> analisaTabelaDeMovimentos(int[][] Tab, int[] Cordenadas, Boolean Jogador){
        int posNaTabelaDePos = (Cordenadas[0]*3) + Cordenadas[1];
        List<int[][]> listaDeTabela = new ArrayList<>();
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
    
    public List<int[][]> resolveTabelaDeRetorno(int[][] Tab, int posNaTabelaDePos, int[] Cordenadas, Boolean Jogador){
        List<int[][]> tabRetorno = new ArrayList<>();
        int[][] tabelaAux = copiaTabela(Tab);
        int[] guardaPosParaAnalise = new int[2];
        for(int j = 0; j < 9; j++){
            tabelaAux = copiaTabela(Tab);
            if(tabelaDePossibilidades[posNaTabelaDePos][j] == 1){
                guardaPosParaAnalise = resolveTabelaGrande(j);
                if(Tab[guardaPosParaAnalise[0]][guardaPosParaAnalise[1]] == 0){
                    tabelaAux[guardaPosParaAnalise[0]][guardaPosParaAnalise[1]] = quemEstaJogando(Jogador);
                    tabelaAux[Cordenadas[0]][Cordenadas[1]] = 0;
                    tabRetorno.add(tabelaAux);
                    //printMatriz(tabelaAux);
                } 
            }
        }
        
        return tabRetorno;
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
    
    public int testeGanhou(int[][] Mat, Boolean Jogador){
        int contador = 0;
        
        int[][] cond1Vit = copiaTabela(Mat);
        int[][] cond2Vit = copiaTabela(Mat);
        int[][] cond3Vit = copiaTabela(Mat);
        int[][] cond4Vit = copiaTabela(Mat);
        int[][] cond5Vit = copiaTabela(Mat);
        int[][] cond6Vit = copiaTabela(Mat);
        int[][] cond7Vit = copiaTabela(Mat);
        int[][] cond8Vit = copiaTabela(Mat);
        cond1Vit[0] = new int[] {quemEstaJogando(Jogador), quemEstaJogando(Jogador), quemEstaJogando(Jogador)};
        cond2Vit[1] = new int[] {quemEstaJogando(Jogador), quemEstaJogando(Jogador), quemEstaJogando(Jogador)};
        cond3Vit[2] = new int[] {quemEstaJogando(Jogador), quemEstaJogando(Jogador), quemEstaJogando(Jogador)};
        
        cond4Vit[0][0] = quemEstaJogando(Jogador);
        cond4Vit[1][0] = quemEstaJogando(Jogador);
        cond4Vit[2][0] = quemEstaJogando(Jogador);
        
        cond5Vit[0][0] = quemEstaJogando(Jogador);
        cond5Vit[1][1] = quemEstaJogando(Jogador);      
        cond5Vit[2][2] = quemEstaJogando(Jogador);
        
        cond6Vit[0][2] = quemEstaJogando(Jogador);
        cond6Vit[1][1] = quemEstaJogando(Jogador);
        cond6Vit[2][0] = quemEstaJogando(Jogador);
        
        cond7Vit[0][1] = quemEstaJogando(Jogador);
        cond7Vit[1][1] = quemEstaJogando(Jogador);
        cond7Vit[2][1] = quemEstaJogando(Jogador);
        
        cond8Vit[0][2] = quemEstaJogando(Jogador);
        cond8Vit[1][2] = quemEstaJogando(Jogador);
        cond8Vit[2][2] = quemEstaJogando(Jogador);
        
        if(comparaTabela(Mat, cond1Vit) == true){            
            return 1;
        }
        if(comparaTabela(Mat, cond2Vit) == true){            
            return 1;
        }
        if(comparaTabela(Mat, cond3Vit) == true){            
            return 1;
        }
        if(comparaTabela(Mat, cond4Vit) == true){            
            return 1;
        }
        if(comparaTabela(Mat, cond5Vit) == true){            
            return 1;
        }
        if(comparaTabela(Mat, cond6Vit) == true){            
            return 1;
        }
        if(comparaTabela(Mat, cond7Vit) == true){            
            return 1;
        }
        if(comparaTabela(Mat, cond8Vit) == true){            
            return 1;
        }
        
        cond1Vit[0] = new int[] {quemEstaJogando(!Jogador), quemEstaJogando(!Jogador), quemEstaJogando(!Jogador)};
        cond2Vit[1] = new int[] {quemEstaJogando(!Jogador), quemEstaJogando(!Jogador), quemEstaJogando(!Jogador)};
        cond3Vit[2] = new int[] {quemEstaJogando(!Jogador), quemEstaJogando(!Jogador), quemEstaJogando(!Jogador)};
        
        cond4Vit[0][0] = quemEstaJogando(!Jogador);
        cond4Vit[1][0] = quemEstaJogando(!Jogador);
        cond4Vit[2][0] = quemEstaJogando(!Jogador);
        
        cond5Vit[0][0] = quemEstaJogando(!Jogador);
        cond5Vit[1][1] = quemEstaJogando(!Jogador);      
        cond5Vit[2][2] = quemEstaJogando(!Jogador);
        
        cond6Vit[0][2] = quemEstaJogando(!Jogador);
        cond6Vit[1][1] = quemEstaJogando(!Jogador);
        cond6Vit[2][0] = quemEstaJogando(!Jogador);
        
        cond7Vit[0][1] = quemEstaJogando(!Jogador);
        cond7Vit[1][1] = quemEstaJogando(!Jogador);
        cond7Vit[2][1] = quemEstaJogando(!Jogador);
        
        cond8Vit[0][2] = quemEstaJogando(!Jogador);
        cond8Vit[1][2] = quemEstaJogando(!Jogador);
        cond8Vit[2][2] = quemEstaJogando(!Jogador);
        
        if(comparaTabela(Mat, cond1Vit) == true){            
            return -1;
        }
        if(comparaTabela(Mat, cond2Vit) == true){            
            return -1;
        }
        if(comparaTabela(Mat, cond3Vit) == true){            
            return -1;
        }
        if(comparaTabela(Mat, cond4Vit) == true){            
            return -1;
        }
        if(comparaTabela(Mat, cond5Vit) == true){            
            return -1;
        }
        if(comparaTabela(Mat, cond6Vit) == true){            
            return -1;
        }
        if(comparaTabela(Mat, cond7Vit) == true){            
            return -1;
        }
        if(comparaTabela(Mat, cond8Vit) == true){            
            return -1;
        }
        
        return 0;
    }    
    
    public int quemEstaJogando(Boolean Jogador){
        if(Jogador){
            return 2;
        }else{
            return 1;
        }
    }
    
    public int[][] copiaTabela(int[][] Tab){
        int[][] copiaTab = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                copiaTab[i][j] = Tab[i][j];
            }
        }
        return copiaTab;
    }
    
    public boolean comparaTabela(int[][] Mat, int[][] cond1Vit){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(Mat[i][j] == cond1Vit[i][j]){
                    sum++;
                }
            }
        }
        if(sum == 9){
            return true;
        }else{
            return false;
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
    
    static int xGanhou = 0;
    public int Minimax(Node no, int cont, Boolean vezDoJogador){
        gerandoArvore teste = new gerandoArvore();
        
        int aux = 0;
        while(aux <= no.filho.size()){
            //System.out.println("filho size = " + no.filho.size());
            //System.out.println("aux = " + aux);
            aux++;
            if(!no.filho.isEmpty() && aux < no.filho.size()){ // olha se a lista de filho é nula
                //System.out.println("entro if");
                Minimax(no.filho.get(aux-1), cont, vezDoJogador);
            }else{
                //System.out.println("slasdlkashdkjashdkasjh");

                //System.out.println(cont);
                //System.out.println("size ===== " +no.filho.size());

                //System.out.println("quant filhos = " +no.pai.filho.size());
                for(int i = 0; i < no.pai.filho.size(); i++){
                    //System.out.println("entrou for");
                    xGanhou += teste.testeGanhou(no.pai.filho.get(i).Tab, vezDoJogador);
                    //System.out.println("ganhou = " + xGanhou);
                }
                //System.out.println("\nNew");
                return xGanhou;
            }
        }
        
        System.out.println("ovo\n");
        return 0;
    }
    
    public int[] noMaisProfundo(Node no, Boolean vezDoJogador){
        int contador = 0;
        int[] resultado = new int[no.filho.size()];
        while(contador < no.filho.size()){
            //System.out.println("tamanho la = "+no.filho.size());
            resultado[contador] = Minimax(no.filho.get(contador), contador, vezDoJogador);
            //System.out.println(resultado[contador]);
            xGanhou = 0;
            contador++;
            //System.out.println("=====================================================");
        }
        
        return resultado;
    }
    
    public void inserirFunc(Node no, Boolean vezDoJogador){
        //Tabela Tab = new Tabela();
        int cont = 0;
        
        gerandoArvore teste = new gerandoArvore();
        List<int[]> cordComJogador = teste.proucurarNaTabela(no.Tab, vezDoJogador);
        
        List<int[][]> listaDeTabela = new ArrayList<>();
        int[][] Tabela;
        listaDeTabela = teste.possibilidadeMov(no.Tab, cordComJogador, vezDoJogador);
        int cont2 = 0;
        
        while(cont2 < listaDeTabela.size()){
            Node no2 = new Node(listaDeTabela.get(cont2));
            no2.Profundidade = no.Profundidade + 1;
            no2.pai = no;
            no.filho.add(no2);
            cont2++;
        }
        
        while(cont < no.filho.size()){
            if(teste.testeGanhou(no.filho.get(cont).Tab, !vezDoJogador) == 0 && no.Profundidade <= 5){
                //teste.printMatriz(no.filho.get(cont).Tab);
                //System.out.println(no.Profundidade);
                try{
                    //TimeUnit.SECONDS.sleep(1/4);
                }catch(Exception e){
                    System.out.println("cu");
                }
                inserirFunc(no.filho.get(cont), !vezDoJogador);
            }else if(teste.testeGanhou(no.filho.get(cont).Tab, !vezDoJogador) == 100){
                //teste.printMatriz(no.filho.get(cont).Tab);
            }
            cont++;
        }
    }
    
    public int[][] melhorJogada(Node Raiz, int[] resultado){
        int cont = 0;
        int pos = 0;
        int maior = Integer.MIN_VALUE;
        while(cont < Raiz.filho.size()){
            if(maior < resultado[cont]){
                pos = cont;
                maior = resultado[cont];
            }
            cont++;
        }
        return Raiz.filho.get(pos).Tab;
    }
}