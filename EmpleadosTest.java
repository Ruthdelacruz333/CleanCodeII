
import com.mycompany.empleados.Empleado;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadosTest {
    
    public EmpleadosTest() {
    }
       @BeforeAll
    public static void setUpAll() {
        System.out.println("Esto es una configuracion inicial antes de ejecutar todas las pruebas");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Esto se inicia antes de ejecutar cada prueba");
    }
    @Test
    public void testConstructor() {
        Empleado empleado1 = new Empleado("Ruth", 30, 2500.00);
        assertEquals("Ruth", empleado1.getNombre());
        assertEquals(30, empleado1.getEdad());
        assertEquals(2500.00, empleado1.getSalario(), 0.01);
    }

  @Test
public void testSetSalario() {
    Empleado empleado1 = new Empleado("Ruth", 30, 2500.00);

    // Probar establecer un salario positivo
    empleado1.setSalario(2800.00);
    assertEquals(2800.00, empleado1.getSalario(), 0.01);

    // Probar establecer un salario igual a cero
    empleado1.setSalario(0.00);
    assertEquals(0.00, empleado1.getSalario(), 0.01);
}
    @AfterEach
    public void tearDown() {
        System.out.println("Este metodo realiza una limpieza despues de ejecutar cada una de las pruebas");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("Este metodo realiza una limpieza despues de ejecutar todas las pruebas de los test realizados");
    }
}
