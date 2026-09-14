package pa.gob.dntic.laboratorio17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void suma_dos_numeros() {
        assertEquals(10, calculadora.suma_dos_numeros(4, 6));
        assertEquals(0, calculadora.suma_dos_numeros(-3, 3));
    }

    @Test
    void sumarDeberiaRetornarLaSumaCorrecta() {
        assertEquals(10, calculadora.sumar(4, 6));
        assertEquals(-2, calculadora.sumar(3, -5));
    }

    @Test
    void restarDeberiaRetornarLaDiferenciaCorrecta() {
        assertEquals(3, calculadora.restar(10, 7));
        assertEquals(-1, calculadora.restar(2, 3));
    }

    @Test
    void multiplicarDeberiaRetornarElProductoCorrecto() {
        assertEquals(24, calculadora.multiplicar(6, 4));
        assertEquals(-12, calculadora.multiplicar(-3, 4));
    }

    @Test
    void dividirDeberiaRetornarElCocienteCorrecto() {
        assertEquals(5, calculadora.dividir(20, 4));
        assertEquals(-2, calculadora.dividir(-8, 4));
    }

    @Test
    void dividirEntreCeroDeberiaLanzarExcepcion() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.dividir(10, 0)
        );

        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @Test
    void moduloDeberiaRetornarElRestoCorrecto() {
        assertEquals(2, calculadora.modulo(10, 8));
        assertEquals(1, calculadora.modulo(7, 3));
    }

    @Test
    void moduloEntreCeroDeberiaLanzarExcepcion() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.modulo(10, 0)
        );

        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @Test
    void potenciaDeberiaRetornarElResultadoCorrecto() {
        assertEquals(8, calculadora.potencia(2, 3));
        assertEquals(1, calculadora.potencia(5, 0));
        assertEquals(25, calculadora.potencia(5, 2));
    }

    @Test
    void potenciaConExponenteNegativoDeberiaLanzarExcepcion() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.potencia(2, -1)
        );

        assertEquals("El exponente no puede ser negativo", exception.getMessage());
    }
}
