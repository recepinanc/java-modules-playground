package com.recepinanc.implementation.util;

/**
 * This package is kept internal, and not exposed in the module-info.java
 * Consumer module will not be able to access the methods defined here.
 * It is a good practice to hide the details as much as possible - java modules helps us with that.
 */
public class PrepareMessage {
    public static String prepare(String str) {
        return str.toUpperCase();
    }
}
