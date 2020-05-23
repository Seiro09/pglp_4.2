package fr.uvsq21504875;

public class PileException extends Exception {

  PileException() {
    super("Pas assez d'opérandes dans la pile.");
  }
}