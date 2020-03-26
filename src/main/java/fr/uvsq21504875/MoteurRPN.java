package fr.uvsq21504875;

public class MoteurRPN extends Interpreteur {
  public MoteurRPN(){
    set.put("undo", new Undo(this));
    set.put("quit",new Quit(this));
    set.put("+",new Calcul(Operation.PLUS,this));
  }
}
