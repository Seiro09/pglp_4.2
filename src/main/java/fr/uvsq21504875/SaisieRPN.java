package fr.uvsq21504875;

import java.util.Scanner;

public class SaisieRPN {
  private MoteurRPN moteurRPN;

  public SaisieRPN(){
    this.moteurRPN=new MoteurRPN();
  }

  public void session(){
    double valeur=0;
    while(true){
      System.out.print("Entrez une valeur ou une operation : ");
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      if (this.moteurRPN.set.containsKey(line)){
        ((Command)this.moteurRPN.set.get(line)).execute();
      }
      else{
        try{
          valeur = Double.parseDouble(line);
        }
        catch(Exception e){
          System.out.println("Exception : "+e);
        }
        finally {
          Save s = new Save(this.moteurRPN,valeur);
          s.execute();
        }
      }
    }
  }
}
