package com.trybe.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Class Smart House.
 **/

public class SmartHouse {
  private boolean lampada = false;
  private House house = null;
  private Map<String, String> estados = new HashMap<>();

  /**
   * SmarthHouse class constructor.
   * 
   */


  public SmartHouse() {
    this.estados.put("PE", "Pernambuco");
    this.estados.put("SC", "Santa Catarina");
    this.estados.put("AM", "Amazonas");
  }

  /**
   * Sets the house object.
   * 
   * @param house The house object.
   */

  public void setHouse(House house) {
    this.house = house;
  }

  /**
   * Gets the house object.
   * 
   * @return The house object.
   */

  public House getHouse() {
    return house;
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

  /**
   * Simulate internet connection.
   */

  public boolean conectarInternet() {
    for (int number = 0; number < 3; number++) {

      if (Math.random() < 0.5) {
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the full name of a state from the abbreviation.
   * 
   * @param estado The abbreviation of a state.
   * @return The full name of the state or "Estado não cadastrado" if the abbreviation is not
   *         registered.
   */

  public String mostraNomeEstado(String estado) {
    String valueEstado = this.estados.get(estado);
    if (valueEstado != null) {
      return valueEstado;
    }
    return "Estado não cadastrado";
  }

}

