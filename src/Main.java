// O método main() precisa ter 5 características

// 1 - É um método público
// 2 - É um método estático
// 3 - Não retorna nada (void)
// 4 - O nome do método é main
// 5 - Recebe um array (ou varArgs) de Strings como argumento

// O JVM (Java Virtual Machine) é quem chama o método main()
// ele entende que o método main SEMPRE será o primeiro a ser compilado

import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Encapsulamento.CachorroEncapsulado;

public class Main {

    // static public void main(String... args)
    // ou
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        // Classe - Variável -- Instância
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Rex";
        cachorro1.cor = "Branco";
        cachorro1.altura = 30;
        cachorro1.peso = 10.3;
        cachorro1.tamanhoDoRabo = 10;

        System.out.println(cachorro1); // Animais.Cachorro@76ed6628
        // package.class @ endereço na memoria
        // Animais.Cachorro@76ed6628

        cachorro1.latir();

        // cachorro1.pegar(); // não printa nada, pois o método voltar um return
        System.out.println(cachorro1.pegar()); // Peguei!

        System.out.println("O cachorro esta " + cachorro1.interagir("carinho")); // O cachorro esta Feliz
        System.out.println("O cachorro esta " + cachorro1.interagir("nada")); // O cachorro esta Neutro
        System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!")); // O cachorro esta Bravo

        // Como fizemos o encapsulamento dentro de variáveis private na class, agora
        // para alterar essas variáveis é necessário utilizar os Setters

        CachorroEncapsulado teste1 = new CachorroEncapsulado("null", "null", 0, 0, 0);
        CachorroEncapsulado teste2 = new CachorroEncapsulado("null", "null", 0, 0, 0);
        System.out.println(CachorroEncapsulado.getNumeroDeCachorros()); // 2

        // Herança

        Gato gato1 = new Gato("Felix", "Cinza", 10);
        Passaro passaro1 = new Passaro("PassaroNome", "Azul", 0.4);
        CachorroEncapsulado cachorro3 = new CachorroEncapsulado("Rex", "Preto", 10, 9, 3);

        cachorro3.soar();
        gato1.soar();
        passaro1.soar();

    }
}
