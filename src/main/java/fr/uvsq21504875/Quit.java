package fr.uvsq21504875;

public class Quit implements Command {

  /**
   * Interpreteur.
   */
  private Interpreteur inter;

  /**
   * Constructeur de la commande Quit.
   *
   * @param inter
   */
  public Quit(final Interpreteur inter) {
    this.inter = inter;
  }

  /**
   * Fonction d'exécution de la commande Quit.
   */
  public void execute() {
    this.inter.exit();
  }
}
