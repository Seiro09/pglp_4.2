package fr.uvsq21504875;

public class MoteurRPN extends Interpreteur {
  /**
   * Liste des commandes interprétées par le code.
   */
  public MoteurRPN() {
    set.put("undo", new Undo(this));
    set.put("quit", new Quit(this));
    set.put("+", new Calcul(Operation.PLUS, this));
    set.put("-", new Calcul(Operation.MOINS, this));
    set.put("*", new Calcul(Operation.MULT, this));
    set.put("/", new Calcul(Operation.DIV, this));
    set.put("print", new Print(this));

  }
}
