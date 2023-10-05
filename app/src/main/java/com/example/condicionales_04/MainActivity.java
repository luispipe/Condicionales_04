package com.example.condicionales_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //En java las comparaciones dentro de un condicional
        // deben ser de elementos del mismo tipo de dato
        // eje: if(5>6){} if("2"=="5"){} if(true!=false){} if('a'!='b'){}

        int valor1= 143;
        int valor2= 56;
        int valor3= 207;
        int valor4= 98;

        ;
        /*El usuario me ingresa por el sistema un número
        * y debo decir si este es mayor a los valores que ya tengo
        * */
        int valorSistema= 193;
        if (valorSistema>valor1){
            if (valorSistema>valor2){
                if (valorSistema>valor3){
                    if(valorSistema>valor4){
                        System.out.println("Si es mayor");
                    }else {
                        System.out.println("No es mayor");
                    }
                }else{
                    System.out.println("No es mayor");
                }
            }else{
                System.out.println("No es mayor");
            }
        }else{
            System.out.println("No es mayor");
        }

        //Segunda
        if(valorSistema>valor1 && valorSistema>valor2 && valorSistema>valor3
            && valorSistema>valor4){
            System.out.println("Es mayor");
        }else{
            System.out.println("Es menor");
        }

        //Tercera
        if(valorSistema<valor1 || valorSistema<valor2 || valorSistema<valor3
                || valorSistema<valor4){
            System.out.println("Es menor");
        }else{
            System.out.println("Es mayor");
        }

        //Quarta

        if (valorSistema<valor1){
            System.out.println("Es menor");
        } else if (valorSistema<valor2) {
            System.out.println("Es menor");
        } else if (valorSistema<valor3) {
            System.out.println("Es menor");
        } else if (valorSistema<valor4) {
            System.out.println("Es menor");
        } else {
            System.out.println("Es mayor");
        }

        if (valorSistema>valor1){
            System.out.println("Es mayor a valor 1");
        }
        if (valorSistema>valor2){
            System.out.println("Es mayor a valor 2");
        }
        if (valorSistema>valor3){
            System.out.println("Es mayor a valor 3");
        }
        if (valorSistema>valor4){
            System.out.println("Es mayor a valor 4");
        }

        //Operadores Lógicos
        //son las operaciones que podemos realizar dentro de un condicional
        /*
        *  == --> Igualdad, Verifica que un valor A es igual a un valor B
        *  != --> Desigualdad ó Diferente de, Verifica que un valor A es diferente de un valor B
        *  >  --> Mayor que, Verifica que un valor A es mayor a un valor B
        *  <  --> Menor que, Verifica que un valor A es menor a un valor B
        *  >= --> Mayor o igual, Verifica que un valor A sea mayor o igual a un valor B
        *  <= --> Menor o igual, Verifica que un valor A sea menor o igual a un valor B
        *  || --> Conjunción, Permite agrupar varias condiciones y da verdadero si
        *         se cumple al menos 1 condición
        *  && --> Disyunción, Permite agrupar varias condiciones y da verdadero
        *         si se cumplen todas las condiciones.
        *  !  --> Negación, Permite validar la opción falsa
        *
        * */

        if(5==5){
            System.out.println("Son iguales");
        }else{
            System.out.println("no son iguales");
        }

        if (5!=5){
            System.out.println("No son iguales");
        }else{
            System.out.println("Son iguales");
        }

        // bateria del celular
        int bateria= 50;
        // 50>90
        if(bateria>90){
            System.out.println("La bateria esta casí completa");
        }
        // 50<15
        if (bateria<15){
            System.out.println("Necesita cargar el celular");
        }

        if (bateria>=50){
            System.out.println("La bateria esta en más de la mitad");
        }
        if (bateria<=49){
            System.out.println("La bateria esta en menos de la mitad");
        }

        if (bateria==100){
            System.out.println("bateria cargada");
        }

        if (!(bateria==100)){
            System.out.println("La bateria no esta cargada");
        }





    }
}