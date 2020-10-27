package com.hrynowieckip.morsecodeapp.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoreTest {

    @Test
    public void morseCodeToText() {
        String x =Core.morseCodeToText("- --- _ .--- . ... - _ - . ... - _ .- .--. .-.. .. -.- .- -.-. .--- .. ");
        System.out.println(x);
        assertEquals("to jest test aplikacji", x);
    }

    @Test
    public void textToMorseCode() {
        String x =Core.textToMorseCode( "To jest test aplikacji");
        System.out.println(x);
        assertEquals("- --- _ .--- . ... - _ - . ... - _ .- .--. .-.. .. -.- .- -.-. .--- .. ", x);
    }
}