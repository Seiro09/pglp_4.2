package fr.uvsq21504875;

public enum CalculatriceRPN {
  CALCULATRICE_RPN;

  private void run() throws PileException{
    SaisieRPN S  = new SaisieRPN();
    S.session();
  }

  public static void main(String[] args) throws PileException{
    CALCULATRICE_RPN.run();
  }
}
