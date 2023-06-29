// O método main() precisa ter 5 características

// 1 - É um método público
// 2 - É um método estático
// 3 - Não retorna nada (void)
// 4 - O nome do método é main
// 5 - Recebe um array (ou varArgs) de Strings como argumento

// O JVM (Java Virtual Machine) é quem chama o método main()
// ele entende que o método main SEMPRE será o primeiro a ser compilado

import Animais.Cachorro;
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

        // Sem construtor
        CachorroEncapsulado cachorro2 = new CachorroEncapsulado();

        cachorro2.setNome("Dog");
        cachorro2.setCor("Preto");
        cachorro2.setAltura(30);
        cachorro2.setPeso(5.2);
        cachorro2.setTamanhoDoRabo(11);

        // Com construtor
        CachorroEncapsulado cachorro3 = new CachorroEncapsulado("Dog", "Preto", 30, 5.2, 11);

        System.out.println(cachorro3.getNome()); // Dog

        CachorroEncapsulado cachorro4 = new CachorroEncapsulado("Cachorro", "Preto", 30, 5.2, 11);

        System.out.println(cachorro3.toString());
        // CachorroEncapsulado [nome=Dog, cor=Preto, altura=30, peso=5.2,
        // tamanhoDoRabo=11, estadoDeEspirito=null]

        System.out.println(cachorro4.toString());
        // CachorroEncapsulado [nome=Cachorro, cor=Preto, altura=30, peso=5.2,
        // tamanhoDoRabo=11, estadoDeEspirito=null]

        System.out.println(CachorroEncapsulado.getNumeroDeCachorros()); // 2
    }
}
