package com.trybe.java;

/**
 * Class House.
 **/

public class House {
  private String nome;
  private int idade;
  private double peso;
  private double altura;

  /**
   * Creates a new resident with the given attributes.
   * 
   * @param nome new resident.
   * @param idade age of the new resident.
   * @param peso weight of the new resident.
   * @param altura height of the new resident.
   */

  public House(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  /**
   * Get the name of the resident.
   * 
   * @return The name of the resident.
   */

  public String getNome() {
    return this.nome;
  }

  /**
   * Get the age of the resident.
   * 
   * @return The name of the age.
   */

  public int getIdade() {
    return this.idade;
  }

  /**
   * Get the weight of the resident.
   * 
   * @return The weight of the resident.
   */

  public double getPeso() {
    return this.peso;
  }

  /**
   * Get the height of the resident.
   * 
   * @return The height of the resident.
   */

  public double getAltura() {
    return this.altura;
  }

  /**
   * Set the name of the resident.
   * 
   * @param nome The name of the resident.
   */

  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Set the age of the resident.
   * 
   * @param idade The age of the resident.
   */

  public void setIdade(int idade) {
    this.idade = idade;
  }

  /**
   * Set the weight of the resident.
   * 
   * @param peso The weight of the resident.
   */

  public void setPeso(double peso) {
    this.peso = peso;
  }

  /**
   * Set the height of the resident.
   * 
   * @param altura new resident.
   */

  public void setAltura(double altura) {
    this.altura = altura;
  }

}

