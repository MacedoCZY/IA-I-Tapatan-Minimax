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
        gerandoArvore teste = new gerandoArvore();
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
        teste.inserirFunc(Raiz, vezDoJogador);
        
        teste.noMaisProfundo(Raiz, vezDoJogador);
    }
}
