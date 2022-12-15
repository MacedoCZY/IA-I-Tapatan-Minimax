/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ia.pkg2;


import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author gusta
 */
public class IA2 {

    /**
     * @param args the command line arguments
     */
    static int profund = 0;
    static int profundAux = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Tabela Tab = new Tabela();
        
        Boolean vezDoJogador = true;
        /*
        gerandoArvore teste = new gerandoArvore();
        List<int[]> cordComJogador = teste.proucurarNaTabela(Tab.getTab(), vezDoJogador);
        int i = 0 ;
        while(i < cordComJogador.size()){
            int[] vet = cordComJogador.get(i);
            //System.out.println(vet[0]+ " " +vet[1]);
            i++;
        }
        List<int[][]> listaDeTabela = new ArrayList<>();
        listaDeTabela = teste.possibilidadeMov(Tab.getTab(), cordComJogador, vezDoJogador);
        i = 0 ;
        int[][] te = new int[3][3];
        //Hash rh = new Hash();*/
        
        Node Raiz = new Node(Tab.getTab());
        inserirFunc(Raiz, vezDoJogador);
        
        noMaisProfundo(Raiz, vezDoJogador);
    }
    
    public static void inserirFunc(Node no, Boolean vezDoJogador){
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
            if(teste.testeGanhou(no.filho.get(cont).Tab, !vezDoJogador) == 0 && no.Profundidade <= 7){
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
    
    public static int Minimax(Node no, int cont, Boolean vezDoJogador){
        gerandoArvore teste = new gerandoArvore();
        int xGanhou = 0;
        int aux = 0;
        if(!no.filho.isEmpty()){
            Minimax(no.filho.get(0), cont, vezDoJogador);
        }else{
            System.out.println(cont);
            System.out.println("size ===== " +no.filho.size());
            
            System.out.println("quant filhos = " +no.pai.filho.size());
            for(int i = 0; i < no.pai.filho.size(); i++){
                System.out.println("entrou for");
                xGanhou = teste.testeGanhou(no.pai.filho.get(i).Tab, vezDoJogador);
                aux = aux + xGanhou;
                System.out.println("ganhou = " + aux);
            }
            System.out.println("\nNew");
            return xGanhou;
        }
        
        /*if(noMaisProfundo(no) == -1 || no.filho == null){
            return no.Profundidade;
        }else if(!vezDoJogador){
            int melhorValor = 0;
            for(int i = 0; i < no.filho.size(); i++){
                int v = Minimax(no.filho.get(i), no.Profundidade - 1, !vezDoJogador);
                melhorValor = max(melhorValor, v);
            }
            return melhorValor;
        }*/
        return 0;
    }
    
    public static int noMaisProfundo(Node no, Boolean vezDoJogador){
        int contador = 0;
        while(contador < 1/*no.filho.size()*/){
            System.out.println("tamanho la = "+no.filho.size());
            Minimax(no.filho.get(contador), contador, vezDoJogador);
            contador++;
        }
        
        return -1;
    }
}
