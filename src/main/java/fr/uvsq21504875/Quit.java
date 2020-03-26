package fr.uvsq21504875;

public class Quit {

  private Interpreteur inter;

  public Quit(Interpreteur inter){
    this.inter=inter;
  }

  public void execute(){
    this.inter.exit();
  }
}
