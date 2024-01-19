package ies.puerto.abstrac;

public abstract class RegularesAbstract {
    public float base;
    public float altura;

    public  RegularesAbstract(float base, float altura){
        this.base=base;
        this.altura=altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
