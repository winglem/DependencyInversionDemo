package com.wingmantech.dependencyInversionDemo;

/**
 Author: Monte Wingle
 Created: March 12, 2013
 */
public class Dependency1 {
    public static void printHelloWorld() {
        Dependency2.printHelloWorld();
    }
}
