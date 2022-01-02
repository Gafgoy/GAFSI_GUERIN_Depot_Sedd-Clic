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
    
 boolean etreAllume; // definie l'état du bouton
    //String couleur;
    //String couleur_vide;

    public Bouton(){ // constructeur de bouton

    etreAllume = false; 
     //couleur="R";
     //couleur_vide ="G";
    }

    public void Alummer_bouton(){// renvoie vrai si le bouton est allumer 
    etreAllume = true;
    
    }

    public void Eteindre_bouton(){ // renvoie vrai si le bouton est eteint
    etreAllume =false; 
   
    
    }
 }

    

