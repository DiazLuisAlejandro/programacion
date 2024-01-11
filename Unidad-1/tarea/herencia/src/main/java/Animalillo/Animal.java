package Animalillo;

public abstract class Animal {
     private int chip;
     private String nombre;

     public String suSonido(){
         return "Soy un sonido de animal";
     }

     public Animal(){

     }
     public Animal(String nombre, int chip){
            this.chip=chip;
            this.nombre=nombre;
     }

    public Animal(int chip){

    }
    public Animal(String nombre){

    }

    @Override
    public String toString(){
         return "Nombre: "+nombre+", chip: "+chip;
    }
}
