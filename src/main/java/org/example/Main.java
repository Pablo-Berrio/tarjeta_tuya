package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        //EL ESTUDIANTE TIENE EN CUENTA QUE ES MAS PRUDENTE PONER TIPO DE DATO Y NOMBRE DE VARIABLE POR LINEA DE CODIGO
        //PERO COMO YA QUIERE SER UN PROGRAMADOR MUY TESO ENTONCES PUSO TODAS LAS VARIUABLES EN UNA MISMA LINEA DEPENDIENDO EL TIPO DE DATO.

        //TIPOS DE DATOS Y NOMBRE DE VARIABLES CUYO VALOR SERA INGRESADO POR TECLADO.
        String nombreCliente, apellidosCliente, edadCliente;
        Integer usosTarjetaUltimoMes, totalComprasProductosAlimenticios, totalComprasProductosAseo, totalOtrosProductos;
        Integer totalDeudaCliente;
        byte puntajeCredito;

        //PEDIR DATOS DE ENTRADA POR CONSOLA
        System.out.println("Buen dia apreciado cliente, te pedimos cordialmente que por favor digites los datos a continuacion: ");
        System.out.print("nombre completo: ");
        nombreCliente=entradaTeclado.nextLine();
        System.out.print("apellidos: ");
        apellidosCliente=entradaTeclado.nextLine();
        System.out.print("edad: ");
        edadCliente=entradaTeclado.nextLine();
        System.out.print("numero de veces en que has utilizado tu tarjeta durante el ultimo mes: ");
        usosTarjetaUltimoMes=entradaTeclado.nextInt();
        System.out.print("monto total en pesos de sus compras en productos de aseo en nuestros púntos de venta durante el ultimo mes: ");
        totalComprasProductosAseo=entradaTeclado.nextInt();
        System.out.print("monto total en pesos de sus compras en productos alimenticios en nuestros púntos de venta durante el ultimo mes: ");
        totalComprasProductosAlimenticios=entradaTeclado.nextInt();
        System.out.print("monto total en pesos de sus compras en otros productos  en nuestros púntos de venta durante el ultimo mes: ");
        totalOtrosProductos=entradaTeclado.nextInt();
        System.out.print("puntaje de credito en nuestra compañia en un rango del 1 al 9: ");
        puntajeCredito=entradaTeclado.nextByte();

        totalDeudaCliente=totalOtrosProductos+totalComprasProductosAlimenticios+totalComprasProductosAseo;

        //CONDICIONAR E IMPRIMIR UN RESULTADO DEPENDIENDO EL PUNTAJE DE CREDITO DEL CLIENTE
        if (puntajeCredito==1){
            Double totalApagarConAuxilio=totalDeudaCliente-(totalDeudaCliente*0.25);
            System.out.println("Tu total a pagar por tener tu puntaje de credito en 1 es: "+totalApagarConAuxilio);
        } else if (puntajeCredito==2) {
            Double totalApagarConAuxilio=totalDeudaCliente-(totalDeudaCliente*0.20);
            System.out.println("Tu total a pagar por tener tu puntaje de credito en 2 es: "+totalApagarConAuxilio);
        } else if (puntajeCredito==3) {
            Double totalApagarConAuxilio=totalDeudaCliente-(totalDeudaCliente*0.15);
            System.out.println("Tu total a pagar por tener tu puntaje de credito en 3 es: "+totalApagarConAuxilio);
        } else if (puntajeCredito==4) {
            Double totalApagarConAuxilio=totalDeudaCliente-(totalDeudaCliente*0.1);
            System.out.println("Tu total a pagar por tener tu puntaje de credito en 4 es: "+totalApagarConAuxilio);
        }else if (puntajeCredito==5 || puntajeCredito==6 || puntajeCredito==7 ||puntajeCredito==8 ||puntajeCredito==9){
            System.out.println("APRECIADO USUARIO NOS PERMITIMOS INFORMARTE QUE TU PUNTAJE ACTUAL DE CREDITO NO TE PERMITE RECIBIR NINGUN TIPO DE BENEFICIO.");
        }else {
            System.out.println("tu puntaje de credito ingresado no se encuentra dentro del rango requerido, por favor verifica tu respuesta.");
        }

    }
}