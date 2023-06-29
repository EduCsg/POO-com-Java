package Tipos;

public class Primarios {

  public Primarios() {

    // Tipos primitivos
    // byte, short, char, int, long, -> Números
    // float, double -> Pontos flutuantes
    // boolean -> True/False

    // byte -> -128 até 127 (8 bits / 1 byte)
    // short -> -32768 até 32767 (16 bits / 2 bytes)
    // char -> 0 até 65535 (16 bits / 2 bytes)
    // int -> -2147483648 até 2147483647 (32 bits / 4 bytes)
    // long -> -9223372036854775808 até 9223372036854775807 (64 bits / 8 bytes)

    byte byte_01 = 120; // OK
    // byte byte_02 = 128; // ERRO
    System.out.println("Variavel byte: " + byte_01);

    short short_01 = 32767; // OK
    // short short_02 = 32768; // ERRO
    System.out.println("Variavel short: " + short_01);

    int variavelInt = 9830;
    System.out.println("Variavel int: " + variavelInt);

  }

}
