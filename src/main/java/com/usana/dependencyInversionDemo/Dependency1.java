package com.usana.dependencyInversionDemo;

/**
 * Created with IntelliJ IDEA.
 * User: winglem
 * Date: 3/12/13
 * Time: 10:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dependency1 {
    public static void printHelloWorld() {
        Dependency2.printHelloWorld();
    }
}
