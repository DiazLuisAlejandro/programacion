package Animalillo;

public class Serpiente extends Animal implements IAnimal {

    public Serpiente (String nombre, int chip){
        super(nombre, chip);
    }
    @Override
    public String suSonido() {
        return "shhhhhhhhhh";
    }
}
