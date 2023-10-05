package com.example.condicionales_04;

public class EjemploSwitch {

    public void pruebasSwitch(){
    /*
    *   Una aplicación bancaria en la que el usuario indica la
    *   opción que desea realizar:
    *   1. Contactar un asesor
    *   2. Bloquear tarjetas
    *   3. Activar productos
    *   4. Consultar productos
    * */

    int opcion= 3;

    if (opcion==1){
        System.out.println("Contactar asesor");
    } else if (opcion==2) {
        System.out.println("Bloquear tarjetas");
    } else if (opcion==3) {
        System.out.println("Activar Productos");
    } else if (opcion==4) {
        System.out.println("Consultar Productos");
    }else{
        System.out.println("La opción no es valida");
    }

    switch (opcion){
        case 1:
            System.out.println("Contactar asesor");
            break;
        case 2:
            System.out.println("Bloquear Tarjetas");
            break;
        case 3:
            System.out.println("Activar productos");
            break;
        case 4:
            System.out.println("Consultar Prodcutos");
            break;
        default:
            System.out.println("Opción invalida");
    }

    /*
    *   dado el día de la semana indicar lo siguiente:
    *   lunes --> "Inicio de semana"
    *   martes -->
    * */




    }


}
