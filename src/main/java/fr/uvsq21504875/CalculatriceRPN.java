package fr.uvsq21504875;

public enum CalculatriceRPN {
  /**
   * Permet de respecter le singleton de la classe principale.
   */
  CALCULATRICE_RPN;

  /**
   * Fonction contenant de la code de l'application
   *
   * @throws PileException
   */
  private void run() throws PileException {
    SaisieRPN saisieRPN = new SaisieRPN();
    saisieRPN.session();
  }

  /**
   * Fonction principale.
   *
   * @param args Les arguments entrés par l'utilisateur.
   * @throws PileException La pile vide.
   */
  public static void main(final String[] args) throws PileException {
    CALCULATRICE_RPN.run();
  }
}
