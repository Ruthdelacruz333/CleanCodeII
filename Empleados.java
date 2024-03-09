

package com.mycompany.empleados;

public class Empleados {

    public static void main(String[] args) {
        // Creación de una estructura de datos para un empleado
        Empleado empleado1 = new Empleado("Ruth" , 19 , 26530000);

        // Accediendo a los atributos y métodos del objeto Empleado
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Salario: " + empleado1.getSalario());
    
        // Modificación directa del salario
        empleado1.setsalario(7500.000);
        System.out.println("Nuevo salario: " + empleado1.getSalario());
        
        // Modificando el salario del empleado
        try {
            empleado1.setSalario(-2800.00); // Intente establecer un salario negativo para provocar una excepción
            System.out.println("Nuevo salario: " + empleado1.getSalario());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
