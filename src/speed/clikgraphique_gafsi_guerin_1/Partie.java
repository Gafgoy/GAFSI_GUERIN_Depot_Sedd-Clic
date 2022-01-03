package speed.clikgraphique_gafsi_guerin_1;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hgafs
 */
public class Partie {
       // differents paramètres de la classe partie 
    int Compteur = 0;
    Grille GrilleDeJeu = new Grille();
    Joueur J1;
    
    long startTime = 0;    
    long TempsImpartie = 30000; // long permet de stocker la variable du temps en milisecondes qui est de grand taille
    long TempsRestant = TempsImpartie;
   

    public void debut_partie(String nom_joueur){
        J1 = new Joueur(nom_joueur);
        GrilleDeJeu.allumer_BoutonAleatoire(); 
    }
 

    public void ClicBouton(Bouton bouton) { // méthode qui permet de faire les différents action en fonction du bouton qui a été cliqué
        
        if (TempsRestant() == 0) {
            System.out.println("Partie terminée !");
        } 
        else if (bouton.etreAllume) { // si le joueur clique sur le bouton allumer        
            J1.Score += 1; // le score augmente 
            bouton.Eteindre_bouton(); // on éteint ce bouton 
            GrilleDeJeu.allumer_BoutonAleatoire(); // et on en allume un nouvezu de facon aléatoire sur la grille 
        } else {
            J1.Score -=1 ; // si il se trome de bouton le joeur perd un point 
        }
        System.out.println("Score " + J1.Nom + " : " + J1.Score); // affiche le score du joueur à chaque clique

    }
    
   
    public long TempsRestant() {
                if (startTime == 0) {
                    startTime = System.currentTimeMillis();
                }

                long currentTime = System.currentTimeMillis(); // donne le temps actuel en milisecondes 
                return Math.max(TempsImpartie - (currentTime - startTime), 0);  // permet que le temps ne soit pas négatif ainsi le temps restant est de max 0 seconde 
    }
    
}
