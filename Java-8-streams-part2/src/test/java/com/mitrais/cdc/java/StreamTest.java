package com.mitrais.cdc.java;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class StreamTest {
    @Test
    public void AllStreamTest() {
        StreamExamples SE = new StreamExamples();
        //test case for uppercaseWithoutMap()
        assertThat(SE.uppercaseWithoutMap(), is(equalTo("HIHELLOHOLABYEGOODBYEADIOS")));
        assertTrue(SE.uppercaseWithoutMap() != null);

        //test case for uppercaseWithMap()
        assertThat(SE.uppercaseWithMap(), is(equalTo("HIHELLOHOLABYEGOODBYEADIOS")));
        assertTrue(SE.uppercaseWithMap() != null);

        //test case for wordsWithComma()
        assertThat(SE.wordsWithComma(), is(equalTo("hi,hello,hola,bye,goodbye,adios")));
        assertTrue(SE.wordsWithComma() != null);

        //test case for numberOfCharacters()
        assertThat(SE.numberOfCharacters(), is(equalTo(26)));
        assertTrue(SE.numberOfCharacters() != 0);
        assertTrue(SE.numberOfCharacters() > 0);

        //test case for numberOfWordsWithH()
        assertThat(SE.numberOfWordsWithH(), is(equalTo(3)));
        assertTrue(SE.numberOfWordsWithH() != 0);
        assertTrue(SE.numberOfWordsWithH() > 0);
    }

}
