package speed.clikgraphique_gafsi_guerin_1;

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
                grilleDeBoutons[i][j] = new Bouton (); // permet de placer un bouton dans chaque case de grille 
                }
        }
    }
    
}
