package com.wingmantech.dependencyInversionDemo;

/**
 Author: Monte Wingle
 Created: March 12, 2013
 */
public class Dependency2 {
    public static void printHelloWorld() {
        Dependency3.printHelloWorld();
    }
}
