package fr.uvsq21504875;

import java.util.HashMap;
import java.util.Stack;

public class Interpreteur {
  /**
   * Pile de calcul.
   */
  protected Stack<Double> pileActuelle = new Stack<>();
  /**
   * Historique des piles pour retour en arrière.
   */
  protected Stack<Stack<Double>> historique = new Stack<>();
  /**
   * Liste de commandes.
   */
  protected HashMap<String, Command> set = new HashMap<>();


  /**
   * Fonction pour Undo.
   */
  public void undo() {
    this.pileActuelle = this.historique.pop();
    System.out.println("Historique : " + this.historique.peek());
  }

  /**
   * Fonction pour Exit.
   */
  public void exit() {
    System.exit(0);
  }

  /**
   * Fonction pour Print.
   */
  public void print() {
    System.out.println(this.pileActuelle);
  }
}
