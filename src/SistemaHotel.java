import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class SistemaHotel {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Habitacion> habitaciones = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Reserva> reservas = new ArrayList<>();
    static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Habitaciones");
            System.out.println("2. Clientes");
            System.out.println("3. Reservas");
            System.out.println("4. Empleados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuHabitaciones();
                    break;
                case 2:
                    menuClientes();
                    break;
                case 3:
                    menuReservas();
                    break;
                case 4:
                    menuEmpleados();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    static void menuHabitaciones() {
        int opcion;
        do {
            System.out.println("\nMenu Habitaciones:");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Volver al menu principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearHabitacion();
                    break;
                case 2:
                    leerHabitaciones();
                    break;
                case 3:
                    actualizarHabitacion();
                    break;
                case 4:
                    eliminarHabitacion();
                    break;
                case 5:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    static void menuClientes() {
        int opcion;
        do {
            System.out.println("\nMenu Clientes:");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Volver al menu principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    leerClientes();
                    break;
                case 3:
                    actualizarCliente();
                    break;
                case 4:
                    eliminarCliente();
                    break;
                case 5:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    static void menuReservas() {
        int opcion;
        do {
            System.out.println("\nMenu Reservas:");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Volver al menu principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearReserva();
                    break;
                case 2:
                    leerReservas();
                    break;
                case 3:
                    actualizarReserva();
                    break;
                case 4:
                    eliminarReserva();
                    break;
                case 5:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    static void menuEmpleados() {
        int opcion;
        do {
            System.out.println("\nMenu Empleados:");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Volver al menu principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearEmpleado();
                    break;
                case 2:
                    leerEmpleados();
                    break;
                case 3:
                    actualizarEmpleado();
                    break;
                case 4:
                    eliminarEmpleado();
                    break;
                case 5:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    // Métodos CRUD para Habitaciones
    static void crearHabitacion() {
        System.out.print("Ingrese ID de la habitación: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Ingrese descripción de la habitación: ");
        String descripcion = scanner.nextLine();
        habitaciones.add(new Habitacion(id, descripcion));
        System.out.println("Habitación creada exitosamente.");
    }

    static void leerHabitaciones() {
        System.out.println("Listado de habitaciones:");
        for (Habitacion hab : habitaciones) {
            System.out.println(hab);
        }
    }

    static void actualizarHabitacion() {
        System.out.print("Ingrese ID de la habitación a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Habitacion habitacion = buscarHabitacion(id);
        if (habitacion != null) {
            System.out.print("Ingrese nueva descripción de la habitación: ");
            String descripcion = scanner.nextLine();
            habitacion.descripcion = descripcion;
            System.out.println("Habitación actualizada exitosamente.");
        } else {
            System.out.println("Habitación no encontrada.");
        }
    }

    static void eliminarHabitacion() {
        System.out.print("Ingrese ID de la habitación a eliminar: ");
        int id = scanner.nextInt();
        Habitacion habitacion = buscarHabitacion(id);
        if (habitacion != null) {
            habitaciones.remove(habitacion);
            System.out.println("Habitación eliminada exitosamente.");
        } else {
            System.out.println("Habitación no encontrada.");
        }
    }

    static Habitacion buscarHabitacion(int id) {
        for (Habitacion hab : habitaciones) {
            if (hab.id == id) {
                return hab;
            }
        }
        return null;
    }

    // Métodos CRUD para Clientes
    static void crearCliente() {
        System.out.print("Ingrese ID del cliente: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();
        clientes.add(new Cliente(id, nombre));
        System.out.println("Cliente creado exitosamente.");
    }

    static void leerClientes() {
        System.out.println("Listado de clientes:");
        for (Cliente cli : clientes) {
            System.out.println(cli);
        }
    }

    static void actualizarCliente() {
        System.out.print("Ingrese ID del cliente a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Cliente cliente = buscarCliente(id);
        if (cliente != null) {
            System.out.print("Ingrese nuevo nombre del cliente: ");
            String nombre = scanner.nextLine();
            cliente.nombre = nombre;
            System.out.println("Cliente actualizado exitosamente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    static void eliminarCliente() {
        System.out.print("Ingrese ID del cliente a eliminar: ");
        int id = scanner.nextInt();
        Cliente cliente = buscarCliente(id);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente eliminado exitosamente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    static Cliente buscarCliente(int id) {
        for (Cliente cli : clientes) {
            if (cli.id == id) {
                return cli;
            }
        }
        return null;
    }

    // Métodos CRUD para Reservas
    static void crearReserva() {
        System.out.print("Ingrese ID de la reserva: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese ID de la habitación: ");
        int habitacionId = scanner.nextInt();
        System.out.print("Ingrese ID del cliente: ");
        int clienteId = scanner.nextInt();
        reservas.add(new Reserva(id, habitacionId, clienteId));
        System.out.println("Reserva creada exitosamente.");
    }

    static void leerReservas() {
        System.out.println("Listado de reservas:");
        for (Reserva res : reservas) {
            System.out.println(res);
        }
    }

    static void actualizarReserva() {
        System.out.print("Ingrese ID de la reserva a actualizar: ");
        int id = scanner.nextInt();
        Reserva reserva = buscarReserva(id);
        if (reserva != null) {
            System.out.print("Ingrese nuevo ID de la habitación: ");
            int habitacionId = scanner.nextInt();
            System.out.print("Ingrese nuevo ID del cliente: ");
            int clienteId = scanner.nextInt();
            reserva.habitacionId = habitacionId;
            reserva.clienteId = clienteId;
            System.out.println("Reserva actualizada exitosamente.");
        } else {
            System.out.println("Reserva no encontrada.");
        }
    }

    static void eliminarReserva() {
        System.out.print("Ingrese ID de la reserva a eliminar: ");
        int id = scanner.nextInt();
        Reserva reserva = buscarReserva(id);
        if (reserva != null) {
            reservas.remove(reserva);
            System.out.println("Reserva eliminada exitosamente.");
        } else {
            System.out.println("Reserva no encontrada.");
        }
    }

    static Reserva buscarReserva(int id) {
        for (Reserva res : reservas) {
            if (res.id == id) {
                return res;
            }
        }
        return null;
    }

    // Métodos CRUD para Empleados
    static void crearEmpleado() {
        System.out.print("Ingrese ID del empleado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Ingrese nombre del empleado: ");
        String nombre = scanner.nextLine();
        empleados.add(new Empleado(id, nombre));
        System.out.println("Empleado creado exitosamente.");
    }

    static void leerEmpleados() {
        System.out.println("Listado de empleados:");
        for (Empleado emp : empleados) {
            System.out.println(emp);
        }
    }

    static void actualizarEmpleado() {
        System.out.print("Ingrese ID del empleado a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Empleado empleado = buscarEmpleado(id);
        if (empleado != null) {
            System.out.print("Ingrese nuevo nombre del empleado: ");
            String nombre = scanner.nextLine();
            empleado.nombre = nombre;
            System.out.println("Empleado actualizado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    static void eliminarEmpleado() {
        System.out.print("Ingrese ID del empleado a eliminar: ");
        int id = scanner.nextInt();
        Empleado empleado = buscarEmpleado(id);
        if (empleado != null) {
            empleados.remove(empleado);
            System.out.println("Empleado eliminado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    static Empleado buscarEmpleado(int id) {
        for (Empleado emp : empleados) {
            if (emp.id == id) {
                return emp;
            }
        }
        return null;
    }
}