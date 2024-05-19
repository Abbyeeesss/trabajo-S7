import java.util.ArrayList;
import java.util.List;

public class Empleado {
    int id;
    String nombre;

    Empleado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}