package fr.uvsq21504875;

import java.util.HashMap;
import java.util.Stack;

public class Interpreteur {
  protected Stack<Double> pileActuelle = new Stack<Double>();
  protected Stack<Stack> historique = new Stack<Stack>();
  protected HashMap set = new HashMap();

 /* public void session(){
    while(true) {
      Command command = getNewCommand();
      if (command instanceof Quit) return;
      else command.execute();
    }
  }

  protected Command getNewCommand(){
    String s = input.getString();
    while (!set.containsKey(s)){
      display.printError("Erreur");
      s = input.getString();
    }
    return ((Command)set.get(s)).clone();
  }*/

  public void undo(){
    this.pileActuelle=this.historique.pop();
  }

  public void exit() {
    System.exit(0);
  }
}
