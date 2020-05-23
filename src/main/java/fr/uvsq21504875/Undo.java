package fr.uvsq21504875;

public class Undo implements Command {
  /**
   * Interpreteur de la calculatrice.
   */
  private Interpreteur inter;

  /**
   * Constructeur de la commande Undo.
   *
   * @param inter l'interpreteur.
   */
  public Undo(final Interpreteur inter) {
    this.inter = inter;
  }

  /**
   * Fonction d'exécution de la classe Undo.
   */
  public void execute() {
    this.inter.undo();
    this.inter.print();
  }
}
