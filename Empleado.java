
package com.mycompany.empleados;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
     public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
}
      public Empleado() {
        this.nombre = "";
        this.edad = -1;
        this.salario = 0;
}    
      public String getNombre() {
        return nombre;
      }
      public void setnombre(String nombre){
          this.nombre = nombre;
      }
      
       public int getEdad() {
        return edad;
    }
       public void setedad(int edad){
           this.edad = edad;
       }
       public double getSalario(){
           return salario;
       }
       public void setsalario(double salario){
           this.salario = salario;
       }
       
           public void setSalario(double salario) {
        // Validar que el salario no sea negativo
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
      
}
}
