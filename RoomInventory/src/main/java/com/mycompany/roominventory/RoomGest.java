/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roominventory;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class RoomGest {

    //metodo estatico para correr el menu de la gestion de habitaciones
    public static void runGest() {

        // se declara el scanner y una variable para salir del menu(ciclo)
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
      
        // se reciben los inputs por teclado
        System.out.print("Ingrese el número de habitaciones grandes: ");
        int largeRooms = scanner.nextInt();

        System.out.print("Ingrese el número de habitaciones medianas: ");
        int mediumRooms = scanner.nextInt();

        System.out.print("Ingrese el número de habitaciones pequeñas: ");
        int smallRooms = scanner.nextInt();

        // declaracion de un objeto ManageInventory para Gestionar las habitaciones
        ManageInventory inventory = new ManageInventory(largeRooms, mediumRooms, smallRooms);

        //ciclo while con la variable(exit) anteriormente declarada para el menu
        while (!exit) {
            List<Room> availableRooms = inventory.listAvailableRooms();
            List<Room> unavailableRooms = inventory.listUnavailableRooms();
            List<Room> unavailableRoomsm = inventory.listUnavailableRoomsPerMaintenance();

            System.out.println("Habitaciones Disponibles:");
            for (Room room : availableRooms) {
                System.out.println(room.toString());
            }

            System.out.println("Habitaciones Ocupadas:");
            for (Room room : unavailableRooms) {
                System.out.println(room.toString());
            }

            System.out.println("Habitaciones Ocupadas por mantenimiento:");
            for (Room room : unavailableRoomsm) {
                System.out.println(room.toString());
            }

            System.out.print("¿Desea modificar el estado de una habitación? (si/no): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("si")) {
                System.out.print("Ingrese el tipo de habitación (A/B/C): ");
                String roomType = scanner.next();

                System.out.print("Ingrese el número de habitación: ");
                int roomNumber = scanner.nextInt();

                System.out.print("¿La habitación está disponible? (true/false): ");
                boolean newStatus = scanner.nextBoolean();
                boolean maintenance = false;

                if (!newStatus) {
                    System.out.print("¿La habitación está en mantenimiento? (true/false): ");
                    maintenance = scanner.nextBoolean();
                }

                inventory.modifyRoomStatus(availableRooms, roomType, roomNumber, newStatus, maintenance);
            }

            System.out.print("¿Desea conocer o modificar el inventario de alguna habitación? (si/no): ");
            String inventoryResponse = scanner.next();

            if (inventoryResponse.equalsIgnoreCase("si")) {
                System.out.print("Ingrese el tipo de habitación (A/B/C): ");
                String roomType = scanner.next();

                System.out.print("Ingrese el número de habitación: ");
                int roomNumber = scanner.nextInt();

                Room targetRoom = null;
                for (Room room : availableRooms) {
                    if (room.getType().equalsIgnoreCase(roomType) && room.getRoomNo() == roomNumber) {
                        targetRoom = room;
                        break;
                    }
                }

                if (targetRoom != null) {
                    targetRoom.displayInventory();

                    System.out.print("¿Desea modificar el inventario? (si/no): ");
                    String modifyResponse = scanner.next();

                    if (modifyResponse.equalsIgnoreCase("si")) {

                        System.out.println("Seleccione el elemento de inventario que desea modificar:");
                        System.out.println("1. Toallas");
                        System.out.println("2. Sábanas");
                        System.out.println("3. Televisor");
                        System.out.println("4. Sofa");

                        // Leer la opción del usuario
                        int option = scanner.nextInt();

                        // Validar la opción seleccionada
                        if (option < 1 || option > 4) {
                            System.out.println("Opción de inventario no válida.");
                        } else {
                            // Solicitar la nueva cantidad al usuario
                            System.out.print("Ingrese la nueva cantidad: ");
                            int newQuantity = scanner.nextInt();

                            // modifica el item del objeto (Room) targetRoom  que este en el puesto option y le da el valor de newQuantity con el metodo de Room modifyInventory
                            targetRoom.modifyInventory(option, newQuantity);
                            targetRoom.displayInventory();

                        }
                    } else {
                        System.out.println("Habitación " + roomType + roomNumber + " no encontrada o no está disponible.");
                    }
                }
            }

            System.out.print("¿Desea salir? (si/no): ");
            String exitResponse = scanner.next();
            exit = exitResponse.equalsIgnoreCase("si");
        }

    }

}
