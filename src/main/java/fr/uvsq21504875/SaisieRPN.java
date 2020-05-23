package fr.uvsq21504875;

import java.util.Scanner;

public class SaisieRPN {
  /**
   * Moteur RPN.
   */
  private MoteurRPN rpn;

  /**
   * Constructeur de la classe de prise en compte des données utilisateur.
   */
  public SaisieRPN() {
    this.rpn = new MoteurRPN();
  }

  /**
   * Session de calcul.
   */
  public void session() {
    double valeur = 0;
    while (true) {
      System.out.print("Entrez une valeur ou une operation : ");
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      if (this.rpn.set.containsKey(line)) {
        this.rpn.set.get(line).execute();
      } else {
        try {
          valeur = Double.parseDouble(line);
        } catch (Exception e) {
          System.out.println("Exception : " + e);
        } finally {
          Save s = new Save(this.rpn, valeur);
          s.execute();
        }
      }
    }
  }
}
