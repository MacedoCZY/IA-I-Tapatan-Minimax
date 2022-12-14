/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia;

/**
 *
 * @author gusta
 */
public class Tabela extends Matriz {
    public Peca Matrix[][] = {{red1, null, blue1},
                           {blue2, null, red2},
                           {red3, null, blue3}};

    public Peca[][] getMatrix() {
        return Matrix;
    }

    public void setMatrix(Peca[][] Matrix) {
        this.Matrix = Matrix;
    }
    
}
