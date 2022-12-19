/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia.pkg2;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
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
                guardaPosParaAnalise = resolveTabelaDePossibilidade(j);
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
    
    public int[] resolveTabelaDePossibilidade(int j){
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
    
    public int testeGanhouArvore(int[][] Mat){
        int[][] cond1Vit = copiaTabela(Mat);
        int[][] cond2Vit = copiaTabela(Mat);
        int[][] cond3Vit = copiaTabela(Mat);
        int[][] cond4Vit = copiaTabela(Mat);
        int[][] cond5Vit = copiaTabela(Mat);
        int[][] cond6Vit = copiaTabela(Mat);
        int[][] cond7Vit = copiaTabela(Mat);
        int[][] cond8Vit = copiaTabela(Mat);
        cond1Vit[0] = new int[] {2, 2, 2};
        cond2Vit[1] = new int[] {2, 2, 2};
        cond3Vit[2] = new int[] {2, 2, 2};
        
        cond4Vit[0][0] = 2;
        cond4Vit[1][0] = 2;
        cond4Vit[2][0] = 2;
        
        cond5Vit[0][0] = 2;
        cond5Vit[1][1] = 2;      
        cond5Vit[2][2] = 2;
        
        cond6Vit[0][2] = 2;
        cond6Vit[1][1] = 2;
        cond6Vit[2][0] = 2;
        
        cond7Vit[0][1] = 2;
        cond7Vit[1][1] = 2;
        cond7Vit[2][1] = 2;
        
        cond8Vit[0][2] = 2;
        cond8Vit[1][2] = 2;
        cond8Vit[2][2] = 2;
        
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
        
        cond1Vit[0] = new int[] {1, 1, 1};
        cond2Vit[1] = new int[] {1, 1, 1};
        cond3Vit[2] = new int[] {1, 1, 1};
        
        cond4Vit[0][0] = 1;
        cond4Vit[1][0] = 1;
        cond4Vit[2][0] = 1;
        
        cond5Vit[0][0] = 1;
        cond5Vit[1][1] = 1;      
        cond5Vit[2][2] = 1;
        
        cond6Vit[0][2] = 1;
        cond6Vit[1][1] = 1;
        cond6Vit[2][0] = 1;
        
        cond7Vit[0][1] = 1;
        cond7Vit[1][1] = 1;
        cond7Vit[2][1] = 1;
        
        cond8Vit[0][2] = 1;
        cond8Vit[1][2] = 1;
        cond8Vit[2][2] = 1;
        
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
    
    public int testeGanhou(int[][] Mat, Boolean Jogador){
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

	
    public int imparizacaum(int prof){
            if(prof%2 == 0){
                    return prof-1;
            }else{
                    return prof;
            }
    }

    static int menorProfundi = Integer.MAX_VALUE;
    /*
    public int funcAlteranativa(Node no){
            int varia = Integer.MAX_VALUE;
            if(no.filho.size() == 0){
                    return no.Profundidade;
            }else{
                    for(int i = 0; i < no.filho.size(); i++){
                            if(funcAlteranativa(no.filho.get(i)) < varia){
                                    varia = funcAlteranativa(no.filho.get(i));
                            }
                    }
                    return varia;
            }
    }
    */
    public void acharNoMenosProfundo(Node no){
            for(int i = 0; i <= no.filho.size(); i++){
                    if(no.filho.size() != 0 && i != no.filho.size()){
                        acharNoMenosProfundo(no.filho.get(i));
                    }else{
                        menorProfundi = min(no.Profundidade, menorProfundi);
                    }
            }
    }
    
    public void MinimaxR(Node no, int profundidade, Boolean MAX){
        int melhorValor;
        int v;
        //System.out.println("prof =" +profundidade);
            /*
            System.out.println("///////////////////////////////////////////");
            printMatriz(no.Tab);
            System.out.println("size dos filhos do no = " + no.filho.size());
            System.out.println("teste no =" +testeGanhou(no.Tab, MAX));
            System.out.println("profundidade no = " + no.Profundidade);
            System.out.println("size do no atual = "+ no.pai.filho.size());
            System.out.println("///////////////////////////////////////////");
            */

            for(int i = 0; i < no.filho.size(); i++){
                    if(!no.filho.get(i).filho.isEmpty() && no.filho.get(i).Profundidade <= menorProfundi){

                        /*
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("profundidade filho = " + no.filho.get(i).Profundidade);
                        System.out.println("size filho = "+ no.filho.size());
                        printMatriz(no.filho.get(i).Tab);
                        System.out.println("teste filho =" +testeGanhou(no.filho.get(i).Tab, MAX));
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
                        */
                        MinimaxR(no.filho.get(i), no.filho.get(i).Profundidade+1, true);
                    }else{
                        for(int k = 0; k < no.filho.size(); k++){
                                minR += testeGanhou(no.filho.get(k).Tab, true)*Math.pow(6, IA2.prof-no.filho.get(k).Profundidade);
                        }
                    }
            }

            if(no.filho.isEmpty()){
                System.out.println("entro=========================================");
                minR += testeGanhou(no.Tab, true)*Math.pow(6, IA2.prof-no.Profundidade);
            }
            /*
            if(profundidade == IA2.prof || no.filho.size() == 0){
                    for(int i = 0; i < no.filho.size(); i++){
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("profundidade filho = " + no.filho.get(i).Profundidade);
                        System.out.println("size filho = "+ no.filho.size());
                        printMatriz(no.filho.get(i).Tab);
                        System.out.println("teste filho =" +testeGanhou(no.filho.get(i).Tab, MAX));
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            }
        }
        if(MAX){
            melhorValor = Integer.MIN_VALUE;
            for(int i = 0; i < no.filho.size(); i++){
                System.out.println("MAX");
                v = MinimaxR(no.filho.get(i), no.filho.get(i).Profundidade+1, true);
                //System.out.println("v =" +v);
                melhorValor = max(melhorValor, v);
            }
            return melhorValor;
        }else{
            melhorValor = Integer.MAX_VALUE;
            for(int i = 0; i < no.filho.size(); i++){
                System.out.println("MIN");
                v = MinimaxR(no.filho.get(i), no.filho.get(i).Profundidade+1, false);
                melhorValor = min(melhorValor, v);
            }
            return melhorValor;
        }
		*/
    }
    
    static int xGanhou = 0;
    static int minR = 0;
    public int[] noMaisProfundo(Node no, Boolean vezDoJogador){
        int contador = 0;
        int[] resultado = new int[no.filho.size()];
		
        while(contador < no.filho.size()){
            
            System.out.println("===============================");
            printMatriz(no.filho.get(contador).Tab);
            System.out.println("===============================");
	    
            acharNoMenosProfundo(no.filho.get(contador));
            
            MinimaxR(no.filho.get(contador), no.filho.get(contador).Profundidade, vezDoJogador);
            resultado[contador] = minR;
            
            //System.out.println(resultado[contador]);
            xGanhou = 0;
            contador++;
            minR = 0;   
            menorProfundi = Integer.MAX_VALUE;            
            //System.out.println("=====================================================");
        }
        
        return resultado;
    }
    
    public void inserirFunc(Node no, Boolean vezDoJogador){
        //Tabela Tab = new Tabela();
        int cont = 0;
        /*
        System.out.println("***************************************");
        printMatriz(no.Tab);
        System.out.println("***************************************");
        */
        List<int[]> cordComJogador = proucurarNaTabela(no.Tab, vezDoJogador);
        
        List<int[][]> listaDeTabela = new ArrayList<>();
        int[][] Tabela;
        listaDeTabela = possibilidadeMov(no.Tab, cordComJogador, vezDoJogador);
        int cont2 = 0;
        
        while(cont2 < listaDeTabela.size()){
            Node no2 = new Node(listaDeTabela.get(cont2));
            no2.Profundidade = no.Profundidade + 1;
            no2.pai = no;
            no.filho.add(no2);
            /*
            System.out.println("========================================");
            printMatriz(listaDeTabela.get(cont2));
            System.out.println("resutlado = " + testeGanhouArvore(no.filho.get(cont2).Tab));
            System.out.println("========================================");
            */
            cont2++;
        }
        //System.out.println("++++++++++++++++++++++++++++++++++++++++");
        while(cont < no.filho.size()){
            if(testeGanhouArvore(no.filho.get(cont).Tab) == 0 && no.Profundidade <= IA2.prof){
                //teste.printMatriz(no.filho.get(cont).Tab);
                //System.out.println(no.Profundidade);
                try{
                    //TimeUnit.SECONDS.sleep(1/4);
                }catch(Exception e){
                }
                /*
                System.out.println("////////////////////////////////////////");
                printMatriz(no.filho.get(cont).Tab);
                System.out.println("Profundidade =" + no.filho.get(cont).Profundidade + "," +quemEstaJogando(!vezDoJogador));
                System.out.println("////////////////////////////////////////");
                */
                inserirFunc(no.filho.get(cont), !vezDoJogador);
            }else if(testeGanhouArvore(no.filho.get(cont).Tab) != 0){
                //System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
                //printMatriz(no.filho.get(cont).Tab);
                //System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
            }
            cont++;
        }
    }

    public int[][] melhorJogada(Node Raiz, int[] resultado){
        int cont = 0;
        int pos = 0;
        int maior = Integer.MIN_VALUE;
        for(int i = 0; i < resultado.length; i++){
            if(i == resultado.length-1){
                System.out.print(resultado[i]);
            }else{
                System.out.print(resultado[i]+ ", ");
            }
        }
        System.out.println("");
        while(cont < Raiz.filho.size()){
            if(maior < resultado[cont]){
                pos = cont;
                maior = resultado[cont];
            }
            cont++;
        }
        System.out.println("post =" + pos);
        return Raiz.filho.get(pos).Tab;
    }
}