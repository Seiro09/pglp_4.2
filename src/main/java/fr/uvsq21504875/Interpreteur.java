package fr.uvsq21504875;

import java.util.HashMap;
import java.util.Stack;

public class Interpreteur {
  protected Stack<Double> pileActuelle = new Stack<Double>();
  protected Stack<Stack> historique = new Stack<Stack>();
  protected HashMap<String,Command> set = new HashMap<String,Command>();


  public void undo(){
    this.pileActuelle=this.historique.pop();
  }

  public void exit() {
    System.exit(0);
  }

  public void print(){
    System.out.println(this.pileActuelle);
  }
}
