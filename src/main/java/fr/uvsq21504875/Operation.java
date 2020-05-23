package fr.uvsq21504875;

public enum Operation {
  PLUS("+") {
    /**
     * Evaluation de la commande plus.
     *
     * @param op1 L'opérande gauche
     * @param op2 L'opérande droite
     * @return Le résultat du calcul.
     */
    public double eval(final double op1, final double op2) {
      return op1 + op2;
    }
  },
  MOINS("-") {
    /**
     * Evaluation de la commande moins.
     *
     * @param op1 L'opérande gauche.
     * @param op2 L'opérande droite.
     * @return Le résultat du calcul.
     */
    public double eval(final double op1, final double op2) {
      return op1 - op2;
    }
  },
  MULT("*") {
    /**
     * Evaluation de la commande fois.
     *
     * @param op1 L'opérande gauche
     * @param op2 L'opérande droite
     * @return Le résultat du calcul.
     */
    public double eval(final double op1, final double op2) {
      return op1 * op2;
    }
  },
  DIV("/") {
    /**
     * Evaluation de la commande divisé.
     *
     * @param op1 L'opérande gauche
     * @param op2 L'opérande droite
     * @return Le résultat du calcul.
     */
    public double eval(final double op1, final double op2) {
      if (op2 == 0) {
        throw new ArithmeticException("Division par 0");
      }
      return op1 / op2;
    }
  };
  private String symbole;

  /**
   * Constructeur des operations qui stocke le symbole.
   *
   * @param s le symbole qui doit être stocké
   */
  Operation(final String s) {
    this.symbole = s;
  }

  /**
   * Getter du symbole de l'opération.
   *
   * @return Le symbole
   */
  public String getSymbole() {
    return symbole;
  }

  /**
   * Fonction abstraite d'évaluation redéfinie
   * pour chaque elément de l'opération.
   *
   * @param op1 L'opérande gauche
   * @param op2 L'opérande droite
   * @return Le resultat des deux opérandes selon l'opération
   */
  public abstract double eval(double op1, double op2);
}
