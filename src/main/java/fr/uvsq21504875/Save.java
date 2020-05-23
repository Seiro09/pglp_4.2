package fr.uvsq21504875;

import java.util.Stack;

public class Save implements Command {
  /**
   * La valeur à ajouter.
   */
  public double valeur;
  /**
   * Interpreteur.
   */
  private Interpreteur inter;

  /**
   * Constructeur de la commande Save.
   *
   * @param m Le MoteurRPN
   * @param valeur La valeur à ajouter.
   */
  public Save(final MoteurRPN m, final double valeur) {
    this.valeur = valeur;
    this.inter = m;
  }

  /**
   * Fonction d'exécution de la commande Save.
   */
  public void execute() {
    this.inter.historique.push((Stack<Double>) this.inter.pileActuelle.clone());
    System.out.println("Historique : " + this.inter.historique.peek());
    this.inter.pileActuelle.push(valeur);
    this.inter.print();
  }

}
