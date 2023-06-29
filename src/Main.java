// O método main() precisa ter 5 características

// 1 - É um método público
// 2 - É um método estático
// 3 - Não retorna nada (void)
// 4 - O nome do método é main
// 5 - Recebe um array (ou varArgs) de Strings como argumento

// O JVM (Java Virtual Machine) é quem chama o método main()
// ele entende que o método main SEMPRE será o primeiro a ser compilado

public class Main {

    // static public void main(String... args)
    // ou
    public static void main(String[] args) {

        System.out.println("Hello, World!");

    }
}
