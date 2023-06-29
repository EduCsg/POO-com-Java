package Animais;

public class Gato extends Animal {

  static int numeroDeGatos;

  // private String nome;
  // private String cor;
  // private int altura;
  // private double peso;
  // private String estadoDeEspirito;

  // Constructor
  public Gato(String nome, String cor, double peso) {

    super(nome, cor, peso);

  }

  @Override
  public String toString() {
    return "Gato [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", estadoDeEspirito="
        + estadoDeEspirito + "]";
  }

  @Override
  public void soar() {
    System.out.println("Miau");
  }

}
