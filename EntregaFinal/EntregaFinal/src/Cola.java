import java.util.LinkedList;

public class Cola {
    private LinkedList<String> elementos;

    public Cola() {
        elementos = new LinkedList<>();
    }

    public void encolar(String dato) {
        elementos.addLast(dato);
    }

    public String desencolar() {
        if (!elementos.isEmpty()) {
            return elementos.removeFirst();
        } else {
            return null;
        }
    }

 
    public String verPrimero() {
        if (!elementos.isEmpty()) {
            return elementos.getFirst();
        } else {
            return null;
        }
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.encolar("Luis");
        cola.encolar("María");

        System.out.println("El primero en la cola es: " + cola.verPrimero());
    }
}
