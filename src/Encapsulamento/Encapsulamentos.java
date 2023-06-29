package Encapsulamento;

public class Encapsulamentos {
  // Tipos de encapsulamento

  /*
   * 
   * visibilidade ------------------- public -- protected -- default --- private
   * 
   * mesma classe -------------------- sim ------ sim -------- sim ------- sim
   * classe no mesmo package --------- sim ------ sim -------- sim ------- não
   * classe filha no mesmo package --- sim ------ sim -------- sim ------- não
   * classe filha em outro package --- sim ------ sim -------- não ------- não
   * classe em outro package --------- sim ------ não -------- não ------- não
   * 
   * 
   * Public ----> todos podem ver
   * Protected -> todos, exceto outra classe em outro package (classes filhas
   * em outro package podem ver)
   * Default ---> todos, exceto outro package
   * Private ---> apenas a classe
   */

}
