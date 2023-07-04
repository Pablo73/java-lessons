package com.trybe.java;

/**
 * Class .
 **/

public class SmartHouse {
  private boolean lampada;

  public SmartHouse() {
    this.lampada = false;
  }

  public void ligarLampada() {
    if (this.lampada == false) {
      this.lampada = true;
    } else {
      System.out.println("A lampada já está desligada");
    }
  }

  public void desligarLampada() {
    if (this.lampada == true) {
      this.lampada = false;
    } else {
      System.out.println("A lampada já está ligada");
    }
  }

  public boolean isLampadaLigada() {
    return this.lampada;
  }

}

