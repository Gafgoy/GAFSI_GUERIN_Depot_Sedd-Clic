/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speed.clikgraphique_gafsi_guerin_1;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author hgafsi
 */
public class BoutonGraphique extends JButton {
   
    Bouton BoutonAssociee;
    ImageIcon img_boutoneteind = new javax.swing.ImageIcon(getClass().getResource("/images/boutoneteind.png"));
    ImageIcon img_boutonallume = new javax.swing.ImageIcon(getClass().getResource("/images/boutonallume.png")); // changer l'image
            
            
               
 public BoutonGraphique(Bouton unbouton) { // quoi mettre comme paramètre 
        BoutonAssociee = unbouton ;
        
    } 
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
          setIcon(img_boutoneteind);
           if (BoutonAssociee.etreAllume == true){ // vidéo 4, 6min45 > conditions pour afficher un bouton allumé
                setIcon(img_boutonallume);
                }
            else {
              setIcon(img_boutoneteind);  
                }
        
     
}
}



