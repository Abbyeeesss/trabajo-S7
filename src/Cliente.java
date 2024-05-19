import java.util.ArrayList;
import java.util.List;

public class Cliente {
    int id;
    String nombre;

    Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String toString() {
        return "Cliente:" + "id=" + id + ", nombre='" + nombre + '\'' + '}';
    }
}