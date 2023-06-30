package Lojas;

import Animais.Animal;
import Encapsulamento.CachorroEncapsulado;

public class Petshop {

  public void darBanho(Animal animal) {
    animal.setEstadoDeEspirito("Limpo!");
  }

  // Só será possível tosar cachorros
  public void tosar(CachorroEncapsulado cachorro) {
    cachorro.setEstadoDeEspirito("Tosado!");
  }

  public void deixarNoHotal(Animal animal) {
    animal.setEstadoDeEspirito("Com saudades!");
  }

}
