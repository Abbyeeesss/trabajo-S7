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
        return "Reserva{" +
                "id=" + id +
                ", habitacionId=" + habitacionId +
                ", clienteId=" + clienteId +
                '}';
    }
}