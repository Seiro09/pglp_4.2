package fr.uvsq21504875;

public class Calcul implements Command {
  private Operation o;
  private Interpreteur inter;

  public Calcul(Operation o, Interpreteur inter) {
    this.o = o;
    this.inter = inter;
  }

  public void execute() {
    if (this.inter.pileActuelle.size() > 1) {
      this.inter.historique.push(this.inter.pileActuelle);
      this.inter.pileActuelle.push(o.eval(this.inter.pileActuelle.pop(), this.inter.pileActuelle.pop()));
    }
    this.inter.print();
  }
}