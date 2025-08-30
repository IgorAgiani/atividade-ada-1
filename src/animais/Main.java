package animais;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animais = new ArrayList<>();
        Animal scoobyDoo = new Cachorro("Scooby Doo");
        Animal garfield = new Gato("Garfield");

        animais.add(scoobyDoo);
        animais.add(garfield);

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}

// O que acontece se você adicionar mais animais diferentes no futuro?
// R: Ao adicionar mais animais diferentes, como pássaros ou peixes,
// você pode simplesmente criar novas classes que implementam a interface Animal
// e implementar o método emitirSom() de acordo com o som específico de cada animal.
