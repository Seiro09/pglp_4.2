package fr.uvsq21504875;

import java.util.Stack;

public class Undo implements Command {
  private Interpreteur inter;

  public Undo(Interpreteur inter){
    this.inter=inter;
  }

  public void execute(){
    this.inter.undo();
  }
}
