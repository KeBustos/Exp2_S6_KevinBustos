/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teatromorov3;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class TeatroMoroV3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int menuInicial;
        int opcionZona;
        String zona = "";
        int opcionFila;
        String filaSeleccionada = "";
        int asiento;
        String asientoSeleccionado = "";
        int valor = 0;

        for(;;) // For inicial
            {
                System.out.println("1. Reservar entrada");
                System.out.println("2. Comprar entrada");
                System.out.println("3. modificar entrada existente");
                System.out.println("4. imprimir boleta");
                System.out.println("5. Salir");

                System.out.print("Ingrese opcion: ");
                menuInicial = sc.nextInt();
                
                if(menuInicial == 1 || menuInicial == 2)
                {
                    for(;;)
                    {
                        System.out.println("\nPlano del teatro: ");
                        System.out.println("1. Zona A: Fila del 1 al 5");
                        System.out.println("   Valor zona A: $20.000");
                        System.out.println("2. Zona B: Fila del 6 al 10");
                        System.out.println("   Valor zona B: $15.000");
                        System.out.println("3. Zona C: Filas del 11 al 15");
                        System.out.println("   Valor zona C: $10.000");
                        System.out.println("4. Cancelar \n");
                        System.out.print("Seleccione la zona que decea: ");
                        opcionZona = sc.nextInt();

                        if(opcionZona == 1 || opcionZona == 2 || opcionZona == 3 || 
                           opcionZona == 4)
                        {// if opcionZona

                            if(opcionZona == 1)
                            {// if opcionZona 1
                                zona = "Zona A";
                                for(;;)
                                {
                                    System.out.print("\nSeleccione la fila del 1 al 5: ");
                                    opcionFila = sc.nextInt();

                                    if(opcionFila == 1 || opcionFila == 2 || opcionFila == 3 
                                       || opcionFila == 4 || opcionFila == 5)
                                    {
                                        filaSeleccionada = "" + opcionFila;

                                        for(;;)
                                        {
                                            System.out.print("\nSeleccione su asiento del 1 al 10: ");
                                            asiento = sc.nextInt();

                                            if(asiento == 1 || asiento == 2 || asiento == 3 || 
                                               asiento == 4 || asiento == 5 || asiento == 6 ||
                                               asiento == 7 || asiento == 8 || asiento == 9||
                                               asiento == 10)
                                            {
                                                asientoSeleccionado = "" + asiento;
                                                valor = 20000;
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Asiento no encontrado, intente de nuevo.");
                                            }
                                        }
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Fila no encontrada, intente de nuevo.");
                                    }
                                }// for fila
                                break;
                            }// if opcionZona 1
                            else if(opcionZona == 2)
                            {// else if opcionZona 2
                                zona ="Zona B";
                                for(;;)
                                {
                                    System.out.print("Seleccione fila del 6 al 10: ");
                                    opcionFila = sc.nextInt();
                                    if(opcionFila == 6 || opcionFila == 7 || opcionFila == 8 
                                      || opcionFila == 9 || opcionFila == 10)
                                    {
                                        filaSeleccionada = "" + opcionFila;

                                        for(;;)
                                        {
                                            System.out.println("Seleccione su asiento del 1 al 10: ");
                                            asiento = sc.nextInt();

                                            if(asiento == 1 || asiento == 2 || asiento == 3 || 
                                               asiento == 4 || asiento == 5 || asiento == 6 ||
                                               asiento == 7 || asiento == 8 || asiento == 9||
                                               asiento == 10)
                                            {
                                                asientoSeleccionado = "" + asiento;
                                                valor = 15000;
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Asiento no encontrado, intente de nuevo.");
                                            }
                                        }
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Fila no encontrada, intente de nuevo.");
                                    }
                                }
                                break;
                            }// else if opcionZona 2
                            else if(opcionZona == 3)
                            {// else if opcionZona 3
                                zona = zona + "Zona C";
                                for(;;)
                                {// for opcion fila
                                    System.out.print("Seleccione fila del 11 al 15: ");
                                    opcionFila = sc.nextInt();
                                    if(opcionFila == 11 || opcionFila == 12 || opcionFila == 13 
                                       || opcionFila == 14 || opcionFila == 15)
                                    {
                                        filaSeleccionada = "" + opcionFila;
                                        for(;;)
                                        {    
                                            System.out.print("Seleccione su asiento del 1 al 10: ");
                                            asiento = sc.nextInt();
                                            if(asiento == 1 || asiento == 2 || asiento == 3 || 
                                               asiento == 4 || asiento == 5 || asiento == 6 ||
                                               asiento == 7 || asiento == 8 || asiento == 9||
                                               asiento == 10)
                                            {
                                                asientoSeleccionado = "" + asiento;
                                                valor = valor + 10000;
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Asiento no encontrado, intente de nuevo.");
                                            }
                                        }
                                        break;
                                    }// if opcion fila
                                    else
                                    {
                                        System.out.println("Fila no encontrada, intente de nuevo.");
                                    }// else opcion fila
                                }// for opcion fila
                                break;
                            }// else if opcionZona 3
                            else if(opcionZona == 4)
                            {// else if opcionZona 4
                                System.out.println("Saliendo de la seleccion de zona...");
                                break;
                            }// else if opcionZona 4
                            else
                            {// else opcionZona 1
                                System.out.println("Opcion no valida, vuelva a intentar.");
                            }// else opcionZona 1
                        }//opcionZona
                        else
                        {// else opcionZona
                            System.out.println("Opcion no valida, vuelva a intentar.");
                        }// else  opcionZona
                    }
                }
                else if(menuInicial == 3)
                {
                    for(;;)
                    {
                        System.out.println("\n\n\nSu asiento es: " + zona + "Fila: " + filaSeleccionada + "Asiento: " + asientoSeleccionado
                                        + "\nValor: " + valor);
                        
                        System.out.println("\nPlano del teatro: ");
                        System.out.println("1. Zona A: Fila del 1 al 5");
                        System.out.println("   Valor zona A: $20.000");
                        System.out.println("2. Zona B: Fila del 6 al 10");
                        System.out.println("   Valor zona B: $15.000");
                        System.out.println("3. Zona C: Filas del 11 al 15");
                        System.out.println("   Valor zona C: $10.000");
                        System.out.println("4. Cancelar \n");
                        System.out.print("Seleccione la zona que decea: ");
                        opcionZona = sc.nextInt();

                        if(opcionZona == 1 || opcionZona == 2 || opcionZona == 3 || 
                           opcionZona == 4)
                        {// if opcionZona

                            if(opcionZona == 1)
                            {// if opcionZona 1
                                zona = "Zona A";
                                for(;;)
                                {
                                    System.out.print("\nSeleccione la fila del 1 al 5: ");
                                    opcionFila = sc.nextInt();

                                    if(opcionFila == 1 || opcionFila == 2 || opcionFila == 3 
                                       || opcionFila == 4 || opcionFila == 5)
                                    {
                                        filaSeleccionada = "" + opcionFila;

                                        for(;;)
                                        {
                                            System.out.print("\nSeleccione su asiento del 1 al 10: ");
                                            asiento = sc.nextInt();

                                            if(asiento == 1 || asiento == 2 || asiento == 3 || 
                                               asiento == 4 || asiento == 5 || asiento == 6 ||
                                               asiento == 7 || asiento == 8 || asiento == 9||
                                               asiento == 10)
                                            {
                                                asientoSeleccionado = "" + asiento;
                                                valor = 20000;
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Asiento no encontrado, intente de nuevo.");
                                            }
                                        }
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Fila no encontrada, intente de nuevo.");
                                    }
                                }// for fila
                                break;
                            }// if opcionZona 1
                            else if(opcionZona == 2)
                            {// else if opcionZona 2
                                zona ="Zona B";
                                for(;;)
                                {
                                    System.out.print("Seleccione fila del 6 al 10: ");
                                    opcionFila = sc.nextInt();
                                    if(opcionFila == 6 || opcionFila == 7 || opcionFila == 8 
                                      || opcionFila == 9 || opcionFila == 10)
                                    {
                                        filaSeleccionada = "" + opcionFila;

                                        for(;;)
                                        {
                                            System.out.println("Seleccione su asiento del 1 al 10: ");
                                            asiento = sc.nextInt();

                                            if(asiento == 1 || asiento == 2 || asiento == 3 || 
                                               asiento == 4 || asiento == 5 || asiento == 6 ||
                                               asiento == 7 || asiento == 8 || asiento == 9||
                                               asiento == 10)
                                            {
                                                asientoSeleccionado = "" + asiento;
                                                valor = 15000;
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Asiento no encontrado, intente de nuevo.");
                                            }
                                        }
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Fila no encontrada, intente de nuevo.");
                                    }
                                }
                                break;
                            }// else if opcionZona 2
                            else if(opcionZona == 3)
                            {// else if opcionZona 3
                                zona = zona + "Zona C";
                                for(;;)
                                {// for opcion fila
                                    System.out.print("Seleccione fila del 11 al 15: ");
                                    opcionFila = sc.nextInt();
                                    if(opcionFila == 11 || opcionFila == 12 || opcionFila == 13 
                                       || opcionFila == 14 || opcionFila == 15)
                                    {
                                        filaSeleccionada = "" + opcionFila;
                                        for(;;)
                                        {    
                                            System.out.print("Seleccione su asiento del 1 al 10: ");
                                            asiento = sc.nextInt();
                                            if(asiento == 1 || asiento == 2 || asiento == 3 || 
                                               asiento == 4 || asiento == 5 || asiento == 6 ||
                                               asiento == 7 || asiento == 8 || asiento == 9||
                                               asiento == 10)
                                            {
                                                asientoSeleccionado = "" + asiento;
                                                valor = valor + 10000;
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Asiento no encontrado, intente de nuevo.");
                                            }
                                        }
                                        break;
                                    }// if opcion fila
                                    else
                                    {
                                        System.out.println("Fila no encontrada, intente de nuevo.");
                                    }// else opcion fila
                                }// for opcion fila
                                break;
                            }// else if opcionZona 3
                            else if(opcionZona == 4)
                            {// else if opcionZona 4
                                System.out.println("Saliendo de la seleccion de zona...");
                                break;
                            }// else if opcionZona 4
                            else
                            {// else opcionZona 1
                                System.out.println("Opcion no valida, vuelva a intentar.");
                            }// else opcionZona 1
                        }//opcionZona
                        else
                        {// else opcionZona
                            System.out.println("Opcion no valida, vuelva a intentar.");
                        }// else  opcionZona
                    }
                }
                else if(menuInicial == 4)
                {
                    System.out.print("===== BOLETA ====="
                            + "\nZona: "+ zona
                            + "\nFila: "+ filaSeleccionada
                            + "\nAsiento: "+ asientoSeleccionado
                            + "\nvalor: "+ valor
                            + "\n==================\n\n\n");
                }
                else if(menuInicial == 5)
                {
                    System.out.print("Saliendo del sistema...");
                    break;
                }


            } // for inicial
    }
}


