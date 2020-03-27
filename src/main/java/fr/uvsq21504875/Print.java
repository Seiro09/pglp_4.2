package fr.uvsq21504875;

public class Print implements Command{

  private Interpreteur inter;

  public Print(Interpreteur inter) {
    this.inter=inter;
  }

  public void execute(){
    this.inter.print();
  }
}
