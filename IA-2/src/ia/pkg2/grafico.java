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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JButton[] nuevo = new JButton[9];
    
public grafico(int[][] cTab){
    this.Tab = cTab;
    addMouseListener(this);
}

    protected void paintComponent(Graphics grf){  
        //create instance of the Graphics to use its methods  
        super.paintComponent(grf);  
        Graphics2D graph = (Graphics2D)grf;
        
        nuevo[0] = new JButton();
        nuevo[0].setLocation(100, 570);
        nuevo[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
                System.out.println("entro");
                ajustaTabela(oval[0].i, oval[0].j, oval[0].i, oval[0].j+1);
            }
        });
        nuevo[1] = new JButton();
        nuevo[1].setLocation(200, 570);    
        nuevo[2] = new JButton();
        nuevo[2].setLocation(300, 570);
        nuevo[3] = new JButton();
        nuevo[3].setLocation(400, 570);
        nuevo[4] = new JButton();
        nuevo[4].setLocation(500, 570);
        nuevo[5] = new JButton();
        nuevo[5].setLocation(600, 570);
        nuevo[6] = new JButton();
        nuevo[6].setLocation(700, 570);
        nuevo[7] = new JButton();
        nuevo[7].setLocation(800, 570);
        
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
    
    public void ajustaTabela(int atX, int atY, int psX, int psY){
        this.Tab[atX][atY] = 0;
        this.Tab[psX][psY] = 1;
        this.removeAll();
        this.repaint();
    }
     
    public void calculaPos(elipseObject oval){
        
        gerandoArvore teste = new gerandoArvore();
        
        this.removeAll();
        
        System.out.println("pos atual = " + oval.i + " " + oval.j);
        teste.printMatriz(Tab);
        if((oval.i == 0 && oval.i == 0) || (oval.i == 2 && oval.j == 0)
        || (oval.i == 2 && oval.j == 2) || (oval.i == 0 && oval.j == 2)
        || (oval.i == 1 && oval.j == 1)){
            calculaTabelaPosDiag(oval);
            System.out.println("Diagonal");
        }else{
            calculaTabelaPos(oval);
            System.out.println("Não diagonal");
        }
    }
    
    public void calculaTabelaPosDiag(elipseObject oval){
        if(2 >= oval.j+1
           && (Tab[oval.i][oval.j+1]) == 0){
            System.out.println("1+1");
            nuevo[0].setText(Integer.toString(oval.i*3+oval.j+1));
            nuevo[0].setSize(oval.i, 30);
            nuevo[0].setVisible(true);
            this.add(nuevo[0]);
            this.repaint();
            this.validate();
        }else{

        }
        if(0 <= oval.j-1
           && (Tab[oval.i][oval.j-1]) == 0){
            System.out.println("1-1");
            nuevo[1].setText(Integer.toString(oval.i*3+oval.j-1));
            nuevo[1].setSize(20, 30);
            nuevo[1].setVisible(true);
            this.add(nuevo[1]);
            this.repaint();
            this.validate();
        }else{

        }
        if(2 >= oval.i+1  
           && (Tab[oval.i+1][oval.j]) == 0){
            System.out.println("+11");
            nuevo[2].setText(Integer.toString((oval.i+1)*3+oval.j));
            nuevo[2].setSize(20, 30);
            nuevo[2].setVisible(true);
            this.add(nuevo[2]);
            this.repaint();
            this.validate();
        }else{

        }
        if(0 <= oval.i-1
           && (Tab[oval.i-1][oval.j]) == 0){
            System.out.println("-11");
            nuevo[3].setText(Integer.toString((oval.i-1)*3+oval.j));
            nuevo[3].setSize(20, 30);
            nuevo[3].setVisible(true);
            this.add(nuevo[3]);
            this.repaint();
            this.validate();
        }else{
            
        }
        if(((2 >= oval.i+1) && (2 >= oval.j+1)) 
           && (Tab[oval.i+1][oval.j+1]) == 0){
            System.out.println("+1+1");
            nuevo[4].setText(Integer.toString((oval.i+1)*3+oval.j+1));
            nuevo[4].setSize(20, 30);
            nuevo[4].setVisible(true);
            this.add(nuevo[4]);
            this.repaint();
            this.validate();
        }else{

        }
        if(((0 <= oval.i-1) && (0 <= oval.j-1))
           && (Tab[oval.i-1][oval.j-1]) == 0){
            System.out.println("-1-1");
            nuevo[5].setText(Integer.toString((oval.i-1)*3+oval.j-1));
            nuevo[5].setSize(20, 30);
            nuevo[5].setVisible(true);
            this.add(nuevo[5]);
            this.repaint();
            this.validate();
        }else{

        }
        if(((2 >= oval.i+1) && (0 <= oval.j-1))
           && (Tab[oval.i+1][oval.j-1]) == 0){
            System.out.println("+1-1");
            nuevo[6].setText(Integer.toString((oval.i+1)*3+oval.j-1));
            nuevo[6].setSize(20, 30);
            nuevo[6].setVisible(true);
            this.add(nuevo[6]);
            this.repaint();
            this.validate();
        }else{

        }
        if(((0 <= oval.i-1) && (2 >= oval.j+1))
           && (Tab[oval.i-1][oval.j+1]) == 0){
            System.out.println("-1+1");
            nuevo[7].setText(Integer.toString((oval.i-1)*3+oval.j+1));
            nuevo[7].setSize(20, 30);
            nuevo[7].setVisible(true);
            this.add(nuevo[7]);
            this.repaint();
            this.validate();
        }else{

        }
    }
    
    public void calculaTabelaPos(elipseObject oval){
        if(2 >= oval.j+1
           && (Tab[oval.i][oval.j+1]) == 0){
            System.out.println("1+1");
            nuevo[0].setText(Integer.toString(oval.i*3+oval.j+1));
            nuevo[0].setSize(200, 300);
            nuevo[0].setVisible(true);
            this.add(nuevo[0]);
            this.repaint();
            this.validate();
        }else{

        }
        if(0 <= oval.j-1
           && (Tab[oval.i][oval.j-1]) == 0){
            System.out.println("1-1");
            nuevo[1].setText(Integer.toString(oval.i*3+oval.j-1));
            nuevo[1].setSize(20, 30);
            nuevo[1].setVisible(true);
            this.add(nuevo[1]);
            this.repaint();
            this.validate();
        }else{

        }
        if(2 >= oval.i+1  
           && (Tab[oval.i+1][oval.j]) == 0){
            System.out.println("+11");
            nuevo[2].setText(Integer.toString((oval.i+1)*3+oval.j));
            nuevo[2].setSize(20, 30);
            nuevo[2].setVisible(true);
            this.add(nuevo[2]);
            this.repaint();
            this.validate();
        }else{

        }
        if(0 <= oval.i-1
           && (Tab[oval.i-1][oval.j]) == 0){
            System.out.println("-11");
            nuevo[3].setText(Integer.toString((oval.i-1)*3+oval.j));
            nuevo[3].setSize(20, 30);
            nuevo[3].setVisible(true);
            this.add(nuevo[3]);
            this.repaint();
            this.validate();
        }else{
           
        }
        /*
        if(((2 >= oval.i+1) && (2 >= oval.j+1)) 
           && (Tab[oval.i+1][oval.j+1]) == 0){
            System.out.println("+1+1");
            nuevo[4].setText(Integer.toString(oval.i*3+oval.j));
            nuevo[4].setSize(20, 30);
            nuevo[4].setVisible(true);
            this.add(nuevo[4]);
            this.repaint();
            this.validate();
        }else{

        }
        */
        /*
        if(((0 <= oval.i-1) && (0 <= oval.j-1))
           && (Tab[oval.i-1][oval.j-1]) == 0){
            System.out.println("-1-1");
            nuevo[5].setText(Integer.toString(oval.i*3+oval.j));
            nuevo[5].setSize(20, 30);
            nuevo[5].setVisible(true);
            this.add(nuevo[5]);
            this.repaint();
            this.validate();
        }else{

        }
      
        if(((2 >= oval.i+1) && (0 <= oval.j-1))
           && (Tab[oval.i+1][oval.j-1]) == 0){
            System.out.println("+1-1");
            nuevo[6].setText(Integer.toString(oval.i*3+oval.j));
            nuevo[6].setSize(20, 30);
            nuevo[6].setVisible(true);
            this.add(nuevo[6]);
            this.repaint();
            this.validate();
        }else{

        }
        if(((0 <= oval.i-1) && (2 >= oval.j+1))
           && (Tab[oval.i-1][oval.j+1]) == 0){
            System.out.println("-1+1");
            nuevo[7].setText(Integer.toString(oval.i*3+oval.j));
            nuevo[7].setSize(20, 30);
            nuevo[7].setVisible(true);
            this.add(nuevo[7]);
        }else{

        }  
        */
    }
    
    // funcao desenhar  
    public void desenha(){
        JFrame Tela = new JFrame();
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Tela.add(this);  
        Tela.setSize(1000, 700);  
        Tela.setLocation(200, 10);  
        Tela.setVisible(true);
    }  

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println(e.getX()+" "+e.getY());
        for(int i = 0; i < 3; i++){
            if((e.getButton() == 1) && oval[i].oval.contains(e.getX(), e.getY())){
                calculaPos(oval[i]);
            }else{
                System.out.println("papinho");
            }
        }
        return;
    }

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