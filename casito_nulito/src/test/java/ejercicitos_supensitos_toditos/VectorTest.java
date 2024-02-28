import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @Test
    void testSumaVectorial() {
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(4, 5, 6);
        Vector resultado = vector1.sumaVectorial(vector2);
        assertEquals(5, resultado.getX());
        assertEquals(7, resultado.getY());
        assertEquals(9, resultado.getZ());
    }

    @Test
    void testProductoVectorial() {
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(4, 5, 6);
        Vector resultado = vector1.productoVectorial(vector2);
        assertEquals(-3, resultado.getX());
        assertEquals(6, resultado.getY());
        assertEquals(-3, resultado.getZ());
    }

    @Test
    void testImprimeVector() {
        Vector vector = new Vector(1, 2, 3);
        // Aquí puedes redirigir la salida estándar para capturarla y luego verificarla
        // utilizando aserciones.
        // Por ejemplo, puedes usar ByteArrayOutputStream y System.setOut() para redirigir
        // la salida estándar y luego verificarla con assertEquals.
        // Aquí te dejo un ejemplo básico sin redirección de salida:
        vector.imprimeVector();
        // Asegúrate de verificar la salida esperada en la consola.
    }

    @Test
    void testFree() {
        Vector vector = new Vector(1, 2, 3);
        // Aquí puedes realizar cualquier verificación necesaria para asegurarte de que
        // el método free() se comporta como se espera.
        // Por ejemplo, puedes verificar si el objeto vector se ha liberado correctamente
        // utilizando aserciones.
        // Aquí te dejo un ejemplo básico:
        vector.free();
        assertNull(vector.getX());
        assertNull(vector.getY());
        assertNull(vector.getZ());
    }
}
