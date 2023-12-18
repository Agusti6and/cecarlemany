package org.CECarlemany;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion,opcion2,opcion3,opcion4;
        Scanner in = new Scanner(System.in);

        // Menu
        do {
            System.out.println("\n**********************");
            System.out.println("[Centro] : Selecciona una opción:\n" +
                    "1-Datos del Centro\n" +
                    "2-Catálogo de Montañas\n" +
                    "3-Catálogo de Expediciones\n" +
                    "4-Gestión de Expedicionarios\n"+
                    "5-Salir del programa");

            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    //centro1.datosCentro();
                    break;
                case 2:
                    do {
                        System.out.println("[Montañas] : Selecciona una opción:\n" +
                                "21-Listado de montañas\n" +
                                "22-Añadir una montaña\n" +
                                "5-Salir a menú principal");

                        opcion2 =in.nextInt();
                        switch (opcion2) {
                            case 5:
                                break;
                            case 21:
                                //centro1.datosMontanas();
                                break;
                            case 22:
                                // Añadir una montaña y añadirla al catálogo
                                //if (centro1.newMontana()){
                                //    System.out.println("Montaña añadido correctamente\n");
                                //}
                                //else System.out.println("Montaña ya existente\n");
                                break;
                            default:
                                System.out.println("Opcion de Montañas no disponible\n");
                        }


                    }while(opcion2!=5);
                    break;

                case 3:
                    do {
                        System.out.println("[Expediciones] : Selecciona una opción:\n" +
                                "31-Listado de expediciones\n" +
                                "32-Detalle de una expedicion\n"+
                                "33-Crear una expedicion\n" +
                                "34-Quitar una expedición\n"+
                                "5-Salir a menú principal");

                        opcion3 = in.nextInt();
                        switch (opcion3) {
                            case 5:
                                break;
                            case 31:
                                // Listado de expediciones
                                //centro1.datosExpediciones();
                                break;
                            case 32:
                                // Detalle de una expedición


                                break;
                            case 33:
                                // Crear una expedición
                                break;
                            case 34:
                                // Quitar una expedición
                                break;

                            default:
                                System.out.println("Opcion de Expediciones no disponible\n");
                        }


                    }while(opcion3!=5);
                    break;

                case 4:
                    do {
                        System.out.println("[Expedicionarios] : Selecciona una opción:\n" +
                                "41-Listado de expedicionarios\n" +
                                "42-Crear un expedicionario\n" +
                                "43-Quitar un expedicionario\n"+
                                "5-Salir a menú principal");

                        opcion3 = in.nextInt();
                        switch (opcion3) {
                            case 5:
                                break;
                            case 31:
                                // Listado de expediciones
                                break;
                            case 32:
                                // Crear una expedicion
                                break;
                            case 33:
                                // Quitar una expedicion
                                break;
                            default:
                                System.out.println("Opcion de Expediciones no disponible\n");
                        }

                    }while(opcion3!=5);
                    break;

                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opcion de Centro no disponible\n");
            }

        }while(opcion!=5);


    }
}