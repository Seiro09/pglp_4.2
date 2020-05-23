package fr.uvsq21504875;

public class Print implements Command {

  /**
   * Interpreteur.
   */
  private Interpreteur inter;

  /**
   * Constructeur de la classe Print.
   *
   * @param inter l'Interpréteur.
   */
  public Print(final Interpreteur inter) {
    this.inter = inter;
  }

  /**
   * Exécution de la classe Print.
   */
  public void execute() {
    this.inter.print();
  }
}
