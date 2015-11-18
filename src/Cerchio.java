/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amedeo
 */
public class Cerchio {
    
    private final Punto centro;
    
    private final float raggio;
    
    public Cerchio(float raggio, Punto centro){
        this.centro = centro;
        this.raggio = raggio;
    }
    
    public float area(){
        return (float) (Math.pow(raggio, 2) * Math.PI);
    }
    
    public float circonferenza(){
        return (float) (2*Math.PI*raggio);
    }
    
    public boolean contienePunto(Punto p){
        return this.centro.distanzaAltroPunto(p) <= raggio;
    }
}
