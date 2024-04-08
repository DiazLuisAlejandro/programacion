import java.util.ArrayList;
import java.util.List;

public class NodoMain {

    static Nodo nodo9=new Nodo(false,null);
    static Nodo nodo8=new Nodo(false,null );
    static Nodo nodo7=new Nodo(false,null );
    static List<Nodo>nodoshijos1= List.of(new Nodo[]{nodo7, nodo8, nodo9});
    static Nodo nodo6=new Nodo(true,nodoshijos1 );
    static List<Nodo>nodoshijos2= List.of(new Nodo[]{nodo7});
    static Nodo nodo5=new Nodo(true, nodoshijos2);
    static List<Nodo>nodoshijos3= List.of(new Nodo[]{nodo5, nodo6});
    static Nodo nodo4=new Nodo(false, null);
    static Nodo nodo3=new Nodo(true,nodoshijos3 );
    static Nodo nodo2=new Nodo(false,null);
    static List<Nodo>nodoshijos4= List.of(new Nodo[]{nodo2, nodo3, nodo4});
    static Nodo nodo1=new Nodo(true,nodoshijos4);

    static List<Nodo> nodo=List.of(new Nodo[]{nodo1});

    public static void main(String[] args) {
        //System.out.println(buscarNodos(nodo));
    }


    /*
    public static List buscarNodos(List<Nodo> nodo){
        Nodo nodo= nodo.get(0);
            if (nodo==null){
                return nodo;
            }

        return buscarNodos(nodo);
    }
    */

}
