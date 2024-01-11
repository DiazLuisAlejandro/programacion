package Animalillo;

public class AppAnimal {

    //static Animal animal;
    static Gato gato;
    static Perro perro;

    static Loro loro;

    static Serpiente serpiente;


    public static void main(String[] args) {
        //animal= new Animal();
        //System.out.println("Sonido animal: "+animal.suSonido());
        gato=new Gato("Meowth",52);
        System.out.println("Sonido animal: "+gato.suSonido());
        System.out.println(gato.toString());
        perro=new Perro("Fidough",926);
        System.out.println("Sonido animal: "+perro.suSonido());
        System.out.println(perro.toString());
        loro=new Loro("Chatot",441);
        System.out.println("Sonido animal: "+loro.suSonido());
        System.out.println(loro.toString());
        serpiente=new Serpiente("Ekans",23);
        System.out.println(serpiente.suSonido());
        System.out.println(serpiente.toString());
    }
}
