/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17;

/**
 *
 * @author jalonsoriveiro
 */
public class Gato extends Felino implements IPodeCamiñar,IPodeNadar{

    @Override
    public void caminar() {
        System.out.println("El gato camina");
    }

    @Override
    public void nadar() {
        System.out.println("El gato nada");
    }
 
    @Override
    public void velocidad(){
    
        System.out.println("gatos 50 km");
    
    }
    
}
