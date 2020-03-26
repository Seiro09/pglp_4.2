package fr.uvsq21504875;

import java.util.HashMap;
import java.util.Stack;

public class Interpreteur {
  protected Stack history = new Stack();
  protected HashMap set = new HashMap();

  public void session(){
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
  }
}
