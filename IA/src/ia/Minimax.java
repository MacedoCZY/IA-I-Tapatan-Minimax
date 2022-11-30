/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia;

/**
 *
 * @author gusta
 */
public class Minimax {
    public Nodo_C type_nodo;
    public int depth;
    public Boolean MAX;
    public float utilit;
    public float best_val;

    public Nodo_C getType_nodo() {
        return type_nodo;
    }

    public void setType_nodo(Nodo_C type_nodo) {
        this.type_nodo = type_nodo;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public Boolean getMAX() {
        return MAX;
    }

    public void setMAX(Boolean MAX) {
        this.MAX = MAX;
    }
    
    public float getUtilit() {
        return utilit;
    }

    public void setUtilit(float utilit) {
        this.utilit = utilit;
    }

    public float getBest_val() {
        return best_val;
    }

    public void setBest_val(float best_val) {
        this.best_val = best_val;
    }
    public float get_Minimax(Nodo_C nodo, int depth, Boolean MAX){
        if ((depth == 0) || (nodo.nodo_terminal))
            return get_Heuristc(min.type_nodo); 
        
        if(MAX){
            min.setBest_val(-2147483648);
            for(int i = 0; i < min.type_nodo.qtd_sam; i++){
                float v = get_Minimax(nodo, depth - 1, false);
                maximize(min.getBest_val(),v);
            }
            return min.getBest_val();
        }else if(min.MAX){
            min.setBest_val(2147483647);
            for(int i = 0; i < min.type_nodo.qtd_sam; i++){
                float v = get_Minimax(nodo, depth - 1, true);
                minimize(min.getBest_val(),v);
            }
            return min.getBest_val();
        }
        return 0;
    }
    public float get_Heuristc(Nodo_C nodo){
        float rst = nodo.nodo_val;
        
        return rst;
    }
    
    public float maximize(float best_val, float v){
        float rst = 0;
        
        return rst;
    }
    
    public float minimize(float best_val, float v){
        float rst = 0;
        
        return rst;
    }
}
