package speed.clikgraphique_gafsi_guerin_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hgafs
 */
public class Bouton {
    
  boolean etreAllume = false; // definie l'état du bouton
    int x;
    int y;
 
    
    public Bouton(int x, int y) { // à permis de debeuguer le code lorsque le bouton ne s'allumer pas quand on débutait la partie
        this.x = x;
        this.y= y;
    }

    public void Alummer_bouton(){// renvoie vrai si le bouton est allumer 
    etreAllume = true;
    
    }

    public void Eteindre_bouton(){ // renvoie vrai si le bouton est eteint
    etreAllume =false; 
   
    
    }
 }

    

