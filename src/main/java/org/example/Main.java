package org.example;

import org.example.reflection.defaultClasses.IncludeSomeMethodReflection;
import org.example.reflection.defaultClasses.OriginalMethodReflection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IncludeSomeMethodReflection otherClass = new IncludeSomeMethodReflection();
        OriginalMethodReflection originalMethodReflection = new OriginalMethodReflection(otherClass);
        System.out.println(originalMethodReflection.functionToTest("testing is success", 13));
    }
}