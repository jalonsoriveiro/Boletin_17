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
public class Felino implements IPodeCamiñar,IPodeNadar{

    @Override
    public void caminar() {
        System.out.println("Los Felinos caminan");
    }

    @Override
    public void nadar() {
        System.out.println("Los Felinos nadan");
    }
    
    
    public void velocidad(){
    
        System.out.println("Velocidad Felinos");
    
    }
}
