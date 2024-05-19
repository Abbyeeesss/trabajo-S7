import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    int id;
    String descripcion;

    Habitacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    public String toString() {
        return
                "\nHabitacion:" + "\nid:" + id + "\ndescripcion:" + descripcion;
    }
}