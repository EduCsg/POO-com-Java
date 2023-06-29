package Animais;

public class Cachorro {

  // Como a class foi criada em um package, as variáveis
  // do cachorro só podem ser acessadas com o public
  public String nome;
  public String cor;
  public int altura;
  public double peso;
  public int tamanhoDoRabo = 5;

  public String estadoDeEspirito;

  // Methods
  // Retorna um void
  public void latir() {
    System.out.println("Au au!");
  }

  // retorna uma String
  public String pegar() {

    return "Peguei!";
  }

  public String interagir(String acao) {

    // if (acao.equals("carinho")) {
    // this.estadoDeEspirito = "Feliz";
    // } else if (acao.equals("vai dormir!")) {
    // this.estadoDeEspirito = "Bravo";
    // } else {
    // this.estadoDeEspirito = "Neutro";
    // }

    // Em Java, o switch aceita apenas inteiros, Strings e enum
    switch (acao) {
      case "carinho":
        this.estadoDeEspirito = "Feliz";
        break;

      case "vai dormir!":
        this.estadoDeEspirito = "Bravo";
        break;

      case "pisar na patinha":
        this.estadoDeEspirito = "Triste";
        break;

      default:
        this.estadoDeEspirito = "Neutro";
        break;
    }

    return this.estadoDeEspirito;
  }

}
