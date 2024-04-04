package org.example.refactoring.testClasses;

import org.example.refactoring.defaultClasses.IncludeSomeMethodRefactoring;
import org.example.refactoring.defaultClasses.OriginalMethodRefactoring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OriginalMethodReflectionTestRefactoringTest {

    @Test
    public void testSomePrivateMethod() {
        OriginalMethodRefactoring originalMethod = new OriginalMethodRefactoring(new IncludeSomeMethodRefactoring());
        assertEquals(5, originalMethod.testSomePrivateMethod(4));
    }

    @Test
    public void testSomePrivateMethod2() {
        OriginalMethodRefactoring originalMethod = new OriginalMethodRefactoring(new IncludeSomeMethodRefactoring());
        assertEquals("test", originalMethod.testSomePrivateMethod2("test"));
    }

}
