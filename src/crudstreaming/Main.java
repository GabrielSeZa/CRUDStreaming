package crudstreaming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ServicioDAO dao = new ServicioDAO();
        int opcion;

        do {
            System.out.println("\n===== MENU CRUD SERVICIOS =====");
            System.out.println("1. Agregar servicio");
            System.out.println("2. Listar servicios");
            System.out.println("3. Actualizar precio");
            System.out.println("4. Eliminar servicio");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del servicio: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese el tipo (Streaming o Licencia): ");
                    String tipo = sc.nextLine();

                    System.out.print("Ingrese el precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    ServicioStreaming servicio = new ServicioStreaming(nombre, tipo, precio);
                    dao.crear(servicio);
                    break;

                case 2:
                    dao.leer();
                    break;

                case 3:
                    System.out.print("Ingrese el ID del servicio a actualizar: ");
                    int idActualizar = sc.nextInt();

                    System.out.print("Ingrese el nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    sc.nextLine();

                    dao.actualizar(idActualizar, nuevoPrecio);
                    break;

                case 4:
                    System.out.print("Ingrese el ID del servicio a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();

                    dao.eliminar(idEliminar);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }

        } while (opcion != 5);

        sc.close();
    }
}