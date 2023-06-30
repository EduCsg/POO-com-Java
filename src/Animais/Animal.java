package Animais;

// Classes abstratas não permitem que sejam criados objetos a partir dela, ela serve apenas de herança para outras classes
public abstract class Animal {

  protected String nome;
  protected String cor;
  protected int altura;
  protected double peso;
  protected String estadoDeEspirito;

  protected void comer() {
  }

  protected void dormir() {
  }

  public Animal(String nome, String cor, double peso) {
    this.nome = nome;
    this.cor = cor;
    this.peso = peso;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getEstadoDeEspirito() {
    return estadoDeEspirito;
  }

  public void setEstadoDeEspirito(String estadoDeEspirito) {
    this.estadoDeEspirito = estadoDeEspirito;
  }

  // Ao colocar o abstract, queremos dizer que:
  // Todo Animal possui o método soar, porém, cada animal terá uma lógica
  // diferente para o método
  public abstract void soar();

}
