package fr.uvsq21504875;

public class Save implements Command {
  public double valeur;
  private Interpreteur inter;

  public Save(MoteurRPN m, double valeur){
    this.valeur=valeur;
    this.inter=m;
  }

  public void execute(){
    this.inter.historique.push(this.inter.pileActuelle);
    this.inter.pileActuelle.push(valeur);
    this.inter.print();
  }

}
