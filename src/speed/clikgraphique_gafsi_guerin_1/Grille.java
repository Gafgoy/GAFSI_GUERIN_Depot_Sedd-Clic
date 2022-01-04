package speed.clikgraphique_gafsi_guerin_1;

import java.util.Random;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hgafs
 */
public class Grille {
    Bouton [][] grilleDeBoutons; // correspond à notre grille de jeu qui est composée de bouton 

    public Grille() { // constructeur de notre grille
    grilleDeBoutons = new Bouton[6][6]; // grille de 36 boutons 
        for (int i=0; i< 6; i++) {
            for (int j=0; j< 6; j++) {
                Bouton bouton = new Bouton(i,j);
                grilleDeBoutons[i][j] = bouton; // permet de placer un bouton dans chaque case de grille 
                }
        }
    }
 
    public void allumer_BoutonAleatoire() { // methode qui permet d'allumer un bouton choisit aléatoirement en rose
    int x;
    int y;
    Random generateur = new Random();
    x = generateur.nextInt(6);
    y = generateur.nextInt(6);
    System.out.println("x = " + x + " et y = " + y); // affiche les coordonnées du bouton allumé
    grilleDeBoutons[x][y].Alummer_bouton();
    }
}
