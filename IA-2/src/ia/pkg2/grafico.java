/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia.pkg2;

/**
 *
 * @author Gustavo
 */
import java.awt.*;  
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;  
import java.awt.geom.*;  
  
//Extends JPanel class  
public class grafico extends JPanel implements MouseListener{  
    //initialize coordinates    
    int larguraLab, alturaLab;
    static int[][] Tab;
    public static int cont = 0;
    elipseObject[] oval = new elipseObject[9];
    int contador = 0;
    int contador2 = 3;
    int contador3 = 6;
    
public grafico(int[][] cTab){
    this.Tab = cTab;
    addMouseListener(this);
}

    protected void paintComponent(Graphics grf){  
        //create instance of the Graphics to use its methods  
        super.paintComponent(grf);  
        Graphics2D graph = (Graphics2D)grf;  
          
        //Sets the value of a single preference for the rendering algorithms.  
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
          
        // get largura and altura  
        int largura = getWidth();  
        int altura = getHeight();   
        
        graph.setPaint(Color.BLACK); 
        
        graph.drawLine(largura/4, altura/4, (largura/4)*3, (altura/4));
        graph.drawLine(largura/4, (altura/4)*2, (largura/4)*3, (altura/4)*2);
        graph.drawLine(largura/4, (altura/4)*3, (largura/4)*3, (altura/4)*3);
        
        graph.drawLine(largura/4, altura/4, (largura/4), (altura/4)*3);
        graph.drawLine(largura/4*2, altura/4, (largura/4)*2, (altura/4)*3);
        graph.drawLine(largura/4*3, altura/4, (largura/4)*3, (altura/4)*3);
        
        graph.drawLine(largura/4, altura/4, (largura/4)*3, (altura/4)*3);
        graph.drawLine(largura/4, (altura/4)*3, (largura/4)*3, (altura/4));
        contador = 0;
        contador2 = 3;
        contador3 = 6;
        for(int i = 0; i < Tab[0].length; i++){
            for(int j = 0; j < Tab.length; j++){
                if(Tab[i][j] == 1){
                    graph.setPaint(Color.YELLOW); 
                    oval[contador] = new elipseObject(new Ellipse2D.Double(((largura/4)*(j+1))-25, ((altura/4)*(i+1))-25, 50, 50));
                    oval[contador].i = i;
                    oval[contador].j = j;
                    graph.fill(oval[contador].oval);
                    contador++;
                }
                if(Tab[i][j] == 2){
                    graph.setPaint(Color.RED); 
                    oval[contador2] = new elipseObject(new Ellipse2D.Double(((largura/4)*(j+1))-25, ((altura/4)*(i+1))-25, 50, 50));
                    oval[contador2].i = i;
                    oval[contador2].j = j;
                    graph.fill(oval[contador2].oval);
                    contador2++;
                }
                if(Tab[i][j] == 0){
                    graph.setPaint(new Color(1.0f,1.0f,1.0f,0f)); 
                    oval[contador3] = new elipseObject(new Ellipse2D.Double(((largura/4)*(j+1))-25, ((altura/4)*(i+1))-25, 50, 50));
                    oval[contador3].i = i;
                    oval[contador3].j = j;
                    graph.fill(oval[contador3].oval);
                    contador3++;
                }
        }
        
        
        //find value of x and scale to plot points  
        double scaley = (double)(altura/20);  
        double scalex = (double)(largura/20);
        
        }

    }
    
    public void calculaPos(elipseObject oval){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(2 < oval.j+1
                   && (Tab[oval.i][oval.j+1]) == 0){
                    
                }else{
                    
                }
                if(0 < oval.i-1
                   && (Tab[oval.i][oval.j-1]) == 0){
                    
                }else{
                    
                }
                if(2 < oval.i+1  
                   && (Tab[oval.i+1][oval.j]) == 0){
                    
                }else{
                    
                }
                if(2 < oval.i-1
                   && (Tab[oval.i-1][oval.j]) == 0){
                    
                }else{
                    
                }
                if(((2 < oval.i+1) && (2 < oval.j+1)) 
                   && (Tab[oval.i+1][oval.j+1]) == 0){
                    
                }else{
                    
                }
                if(((0 < oval.i-1) && (0 < oval.j-1))
                   && (Tab[oval.i-1][oval.j-1]) == 0){
                    
                }else{
                    
                }
                if(((2 < oval.i+1) && (0 < oval.j-1))
                   && (Tab[oval.i+1][oval.j-1]) == 0){
                    
                }else{
                    
                }
                if(((0 < oval.i-1) && (2 < oval.j+1))
                   && (Tab[oval.i-1][oval.j+1]) == 0){
                    
                }else{
                    
                }
                
            }
        }
    }
    
    // funcao desenhar  
    public void desenha(){  
         
        JFrame Tela = new JFrame();
        //System.out.println(boneco.getPos_atual().getX() + " " + boneco.getPos_atual().getY() );
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Tela.add(this);  
        Tela.setSize(1000, 700);  
        Tela.setLocation(200, 10);  
        Tela.setVisible(true); 
        
        JButton nuevo = new JButton();
        
    }  

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println(e.getX()+" "+e.getY());
        for(int i = 0; i < 3; i++){
            if((e.getButton() == 1) && oval[i].oval.contains(e.getX(), e.getY())){
                
            }else{
                System.out.println("papinho");
            }
        }
        return;
    }
    /*if((e.getX() >= ((this.getWidth()/4)*(j+1))-25 && e.getX() <= ((this.getWidth()/4)*(j+1))+25)
        && (e.getY() >= ((this.getHeight()/4)*(i+1))-25) && (e.getY() <= ((this.getHeight()/4)*(i+1))+25)){
    */

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
  
    
}  