/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ia.pkg2;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class IA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabela Tab = new Tabela();
        
        Boolean vezDoJogador = true;
        
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
        while(i < listaDeTabela.size()){
            //System.out.println(listaDeTabela.size());
            int[][] vet = listaDeTabela.get(i);
            teste.printMatriz(vet);
            int tes = teste.testeGanhou(vet ,vezDoJogador);
            System.out.println(tes);
            i++;
        }
        
    }

    
}
