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
    

   String Couleur;
    boolean etreAllume; 
    
    public Bouton() {
        Couleur = "blanc";
        etreAllume = false;
        
    }

   
    
    public void allumerUnBouton() {
        etreAllume = true; // on utilisera cette fonction pour allumer (true) un bouton de la grille                
               
    }
    
    public void eteindreUnBouton() {
        etreAllume = false; // on utilisera cette fonction pour eteindre (false) le dernier bouton allumé de la grille
       
    }
    
    public void colorationBouton(String typeJeton) { 
        Couleur = typeJeton;
    }
 }

    

