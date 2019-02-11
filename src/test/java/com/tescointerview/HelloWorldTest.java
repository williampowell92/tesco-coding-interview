package com.tescointerview;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
    private HelloWorld helloWorld;

    @Before
    public void setup() {
        helloWorld = new HelloWorld();
    }

    @Test
    public void helloWorld() {
        assertEquals("Hello, world!", helloWorld.helloWorld());
    }
}