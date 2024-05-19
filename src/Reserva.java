import java.util.ArrayList;
import java.util.List;

public class Reserva {
    int id;
    int habitacionId;
    int clienteId;

    Reserva(int id, int habitacionId, int clienteId) {
        this.id = id;
        this.habitacionId = habitacionId;
        this.clienteId = clienteId;
    }

    public String toString() {
        return "\nReserva"+ "id:" + id + "\nhabitacionId:" + habitacionId + "\nclienteId:" + clienteId;
    }
}