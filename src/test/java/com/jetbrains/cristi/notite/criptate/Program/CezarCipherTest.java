package com.jetbrains.cristi.notite.criptate.Program;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CezarCipherTest {

    @Test
    public void testWeakPass1(){
        String input = "ABC";
        String output = "BCD";
        assertEquals(output, CezarCipher.encrypt(input, 1));
    }

    @Test
    public void testWeakPass2(){
        String input = "ANA";
        String output = "BOB";
        assertEquals(output, CezarCipher.encrypt(input, 1));
    }

    @Test
    public void testWeakPass3(){
        String input = "ABC";
        String output = "EFG";
        assertEquals(output, CezarCipher.encrypt(input, 4));
    }

    @Test
    public void testWeakPass4(){
        String input = "JAVA";
        String output = "NEZE";
        assertEquals(output, CezarCipher.encrypt(input, 4));
    }

    @Test
    public void testWeakPass5(){
        String input = "XYZ";
        String output = "BCD";
        assertEquals(output, CezarCipher.encrypt(input, 4));
    }
}
