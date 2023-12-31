package Encapsulamento;

import Animais.Animal;

public class CachorroEncapsulado extends Animal {

  // Atributos
  // Calcula o número de objets criados a partir dessa classe
  static int numeroDeCachorros;

  // private String nome;
  // private String cor;
  // private int altura;
  // private double peso;
  private int tamanhoDoRabo = 5;

  // private String estadoDeEspirito;

  // Constructors

  // Construtor padrão
  // public CachorroEncapsulado() {
  // }

  // Cosntrutor detalhado
  public CachorroEncapsulado(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {

    super(nome, cor, peso);
    // this.nome = nome;
    // this.cor = cor;
    // this.peso = peso;
    this.altura = altura;
    this.tamanhoDoRabo = tamanhoDoRabo;

    numeroDeCachorros++;
  }

  // Métodos

  // Getters e Setters
  // Getter -> Coleta um valor

  // Através do getter é possível definir quem poderá ter acesso ao valor real do
  // dado, através do getVariavel

  // Além disso, é possível também que seja enviado um dado fictício quando alguém
  // tentar receber o nome do cachorro
  public String getNome() {
    // Para enviar um nome ficítico, basta dar
    // return "Nome Falso"

    return this.nome;
  }

  // Setter -> Coloca um valor, sem retorno
  public void setNome(String nome) {

    // No setter é possível adicionar validações antes de realizar a alteração do
    // dado dentro do objeto, como por exemplo proibir que uma senha seja igual a
    // "123"

    // nesse caso, proibirá de colocar o nome "teste" no cachorro
    if (nome.equals("teste")) {
      this.nome = null;
    }

    this.nome = nome;
  }

  public static int getNumeroDeCachorros() {
    return numeroDeCachorros;
  }

  public static void setNumeroDeCachorros(int numeroDeCachorros) {
    CachorroEncapsulado.numeroDeCachorros = numeroDeCachorros;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getAltura() {
    return this.altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getTamanhoDoRabo() {
    return tamanhoDoRabo;
  }

  public void setTamanhoDoRabo(int tamanhoDoRabo) {
    this.tamanhoDoRabo = tamanhoDoRabo;
  }

  // Tendo os conceitos de Getter e Setter em mente, é possível criar dados
  // privados apenas dentro da classe e alterá-los por fora, utilizando o get e o
  // set

  // retorna uma String
  public String pegar() {

    return "Peguei!";
  }

  public String interagir(String acao) {

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

  @Override
  public String toString() {
    return "CachorroEncapsulado [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso
        + ", tamanhoDoRabo=" + tamanhoDoRabo + ", estadoDeEspirito=" + estadoDeEspirito + "]";
  }

  @Override
  public void soar() {
    System.out.println("Au au");
  }

}
