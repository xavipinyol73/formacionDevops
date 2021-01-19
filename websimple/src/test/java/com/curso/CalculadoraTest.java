package com.curso;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest 
{

    @Test
    public void testSumarPositivos()
    {
        int resultadoEsperado=14;
        int resultado=Calculadora.suma(9,5);
        assertEquals(resultadoEsperado,resultado );
    }

    @Test
    public void testSumarNegativos()
    {
        int resultadoEsperado=4;
        int resultado=Calculadora.suma(9,-5);
        assertEquals(resultadoEsperado,resultado );
    }
    @Test
    public void testSumarCero()
    {
        int resultadoEsperado=9;
        int resultado=Calculadora.suma(9,0);
        assertEquals(resultadoEsperado,resultado );
    }
    @Test
    public void testSumarTodoNegativos()
    {
        int resultadoEsperado=-14;
        int resultado=Calculadora.suma(-9,-5);
        assertEquals(resultadoEsperado,resultado );
    }
}