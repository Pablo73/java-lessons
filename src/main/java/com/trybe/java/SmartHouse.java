package com.trybe.java;

/**
 * Class Smart House.
 **/

public class SmartHouse {
  private boolean lampada;

  public SmartHouse(boolean lampada) {
    this.lampada = false;
  }

  /**
   * Turn on the lamp, if it is off..
   */

  public void ligarLampada() {
    if (this.lampada == false) {
      this.lampada = true;
    }
  }

  /**
   * Turn off the lamp if it's on.
   */

  public void desligarLampada() {
    if (this.lampada == true) {
      this.lampada = false;
    }
  }

  /**
   * Checks the status of the lamp if it is on or off.
   * 
   * @return true if on, false if off.
   */

  public boolean isLampadaLigada() {
    return this.lampada;
  }

}

