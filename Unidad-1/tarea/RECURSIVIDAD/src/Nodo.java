import java.util.List;

public class Nodo{
    boolean padre;

    List<Nodo> nodoshijos;

    public Nodo(boolean padre, List<Nodo> nodoshijos) {
        this.padre = padre;
        this.nodoshijos = nodoshijos;
    }

    public boolean isPadre() {
        return padre;
    }

    public void setPadre(boolean padre) {
        this.padre = padre;
    }

    public List<Nodo> getNodoshijos() {
        return nodoshijos;
    }

    public void setNodoshijos(List<Nodo> nodoshijos) {
        this.nodoshijos = nodoshijos;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "padre=" + padre +
                ", nodoshijos=" + nodoshijos +
                '}';
    }
}
