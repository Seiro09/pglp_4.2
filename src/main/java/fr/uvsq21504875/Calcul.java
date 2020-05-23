package fr.uvsq21504875;

import java.util.Stack;

public class Calcul implements Command {
  /**
   * L'opération a effectuer.
   */
  private Operation operation;
  /**
   * Interpreteur.
   */
  private Interpreteur inter;

  /**
   * Constructeur de la commande Calcul.
   *
   * @param operation L'opération à effectuer.
   * @param inter L'interpreteur.
   */
  public Calcul(final Operation operation, final Interpreteur inter) {
    this.operation = operation;
    this.inter = inter;
  }

  /**
   * Fonction d'exécution de la commande Calcul.
   */
  public void execute() {
    if (this.inter.pileActuelle.size() > 1) {
      this.inter.historique.push(
          (Stack<Double>) this.inter.pileActuelle.clone());
      this.inter.pileActuelle.push(
          operation.eval(
              this.inter.pileActuelle.pop(), this.inter.pileActuelle.pop()));
    }
    this.inter.print();
  }
}