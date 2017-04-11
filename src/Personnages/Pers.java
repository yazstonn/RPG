/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnages;

/**
 *
 * @author yazst
 */
public class Pers {
    private String nom;
    private Inventaires inv;
    private Inventaires principal;
    private Armures armures;
    private int vie;
    private int armure;
    private int force;
    private int mana;
    private int magie;

    public Pers() {
    }

    public Pers(String nom, int vie, int armure, int force, int mana, int magie) {
        this.nom = nom;
        this.vie = vie;
        this.armure = armure;
        this.force = force;
        this.mana = mana;
        this.magie = magie;
    }

    public int getArmure() {
        return armure;
    }

    public int getForce() {
        return force;
    }

    public int getMagie() {
        return magie;
    }

    public int getMana() {
        return mana;
    }

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public void setArmure(int armure) {
        this.armure = armure;
    }

    public void setArmures( Objet.Armor.PArmure p) {
        int pos = p.position;
        inv.aj(armures.remove(pos));
    }
    
    
    
    
    
    
}
