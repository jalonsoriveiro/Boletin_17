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
public class Morcego extends Aves implements IPodeCamiñar,IPodeVoar{

    @Override
    public void caminar() {
        System.out.println("Morcegos caminan");
    }

    @Override
    public void voar() {
        System.out.println("Morcegos voan");
    }
    
}
