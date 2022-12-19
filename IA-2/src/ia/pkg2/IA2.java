/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ia.pkg2;


import java.awt.event.MouseListener;
import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    static Semaphore controle = new Semaphore(0);
    static int profundidade;
	static int prof = 2;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Tabela Tab = new Tabela();
        gerandoArvore teste = new gerandoArvore();
        Boolean vezDoJogador = true;
        grafico graf = new grafico(Tab.Tab);
        
        graf.desenha();

        
        while(true){
            
            Node Raiz = new Node(Tab.getTab());
            
            teste.inserirFunc(Raiz, vezDoJogador);
            int[] resultado;
            resultado = teste.noMaisProfundo(Raiz, vezDoJogador);
          
            Tab.setTab(teste.melhorJogada(Raiz, resultado));
            //teste.printMatriz(Tab.getTab());
            
            grafico.Tab = Tab.getTab();
            
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(IA2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            graf.repaint();
            
            if(teste.testeGanhou(Tab.getTab(), vezDoJogador) == 1){
                JOptionPane.showMessageDialog(null,"Perdeu");
                grafico.telaF.dispose();
                break;
            }
            
            try {
                controle.acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(IA2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Tab.setTab(grafico.Tab);

            if(teste.testeGanhou(Tab.getTab(), !vezDoJogador) == 1){
                JOptionPane.showMessageDialog(null,"Ganhou");
                grafico.telaF.dispose();
                break;
            }
			Raiz = null;
            System.gc();
        }
    }
}
