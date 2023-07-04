package com.trybe.java;

/**
 * Class .
 **/

public class SmartHouse {
  private boolean lampada;

  public SmartHouse() {
    this.lampada = false;
  }

  /**
   * Liga lâmpada, se estiver desligada.
   */

  public void ligarLampada() {
    if (this.lampada == false) {
      this.lampada = true;
    } else {
      System.out.println("A lampada já está desligada");
    }
  }

  /**
   * Desliga a lâmpada se estiver ligada.
   */

  public void desligarLampada() {
    if (this.lampada == true) {
      this.lampada = false;
    } else {
      System.out.println("A lampada já está ligada");
    }
  }

  /**
   * Verifica a situação da lâmpada se está ligada ou desligada.
   * 
   * @return true se estiver ligada, false se estiver desligada.
   */

  public boolean isLampadaLigada() {
    return this.lampada;
  }

}

