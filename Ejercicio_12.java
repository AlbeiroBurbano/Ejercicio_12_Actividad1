/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_12;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
     
    Scanner leerporteclado = new Scanner(System.in);
      double horas, salario, retencion, salarioBruto, salarioNeto, porcentaje;
      System.out.println("Ingrese las horas que trabaja el empleado: ");
      horas = leerporteclado.nextInt();
      
      System.out.println("Ingrese la cantidad de dinero que gana por hora el empleado: ");
      salario = leerporteclado.nextInt();
      
      System.out.println("Al ingresar el porcentaje escribalo como el ejemplo: 12.5% se escribe como -> 0,125");
      System.out.println("Ingrese el porcentaje de la retencion de la fuente del salario bruto del empleado, tenga en cuenta el ejemplo anterior: ");
      porcentaje = leerporteclado.nextDouble();
      
      salarioBruto = horas*salario;
      retencion = porcentaje*salarioBruto;
      salarioNeto = salarioBruto - retencion;
      
      System.out.println("El salario bruto del empleado es: $"+salarioBruto);
      System.out.println("La retencion del empleado es: $"+retencion);
      System.out.println("El salario neto del trabajador es: $"+salarioNeto);     
        
    }
}
