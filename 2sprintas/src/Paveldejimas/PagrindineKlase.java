package Paveldejimas;

import java.io.File;

public class PagrindineKlase {
    public static void main(String[] args) {

        String filePath = new File("").getAbsolutePath();
        System.out.println (filePath);
        Animal gyvunas = new Animal();
        Dog suo = new Dog();
        Dog suo1 = new Dog("Auauauauaua");
        Cat kate = new Cat();

        System.out.println(gyvunas.toString());
        System.out.println(suo.toString());
        System.out.println(kate.toString());

        Animal suoAnimal = new Dog();
        Animal kateAnimal = new Cat();

        System.out.println(((Dog) suoAnimal).suoFainas());
        System.out.println(kateAnimal.toString());

        Farm fermyte = new Farm();
        fermyte.pridetiGyvuna(suo);
        fermyte.pridetiGyvuna(kate);
        fermyte.pridetiGyvuna(suoAnimal);
        fermyte.pridetiGyvuna(kateAnimal);
        fermyte.pridetiGyvuna(suo);

        System.out.println(fermyte.toString());
    }
}
