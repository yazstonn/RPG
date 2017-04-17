/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnages;

import Objet.Objet;

/**
 *
 * @author yazst
 */
public class Inventaires {
    Objet[][] o;

    public Inventaires(int x,int y) {
        o = new Objet[x][y];
    }
    
    void aj(int x,int y,Objet ob){
        o[x][y] = ob;
    }
    
    
}
