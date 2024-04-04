package org.example.reflection.testClasses;

import org.example.reflection.defaultClasses.IncludeSomeMethodReflection;
import org.example.reflection.defaultClasses.OriginalMethodReflection;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class OriginalMethodReflectionTest {
    @Test
    public void testSomePrivateMethod() throws Exception {
        OriginalMethodReflection originalMethodReflection = new OriginalMethodReflection(new IncludeSomeMethodReflection());

        // Reflection ile somePrivateMethod metodunu elde etme
        Method privateMethod = OriginalMethodReflection.class.getDeclaredMethod("somePrivateMethod", Integer.class);
        privateMethod.setAccessible(true); // Erişim iznini ayarlama

        // Metodu çağırma ve sonucu kontrol etme
        Integer result = (Integer) privateMethod.invoke(originalMethodReflection, 4);
        assertEquals(5, result.intValue());
    }

    @Test
    public void testSomePrivateMethod2() throws Exception {
        OriginalMethodReflection originalMethodReflection = new OriginalMethodReflection(new IncludeSomeMethodReflection());

        // Reflection ile somePrivateMethod2 metodunu elde etme
        Method privateMethod = OriginalMethodReflection.class.getDeclaredMethod("somePrivateMethod2", String.class);
        privateMethod.setAccessible(true); // Erişim iznini ayarlama

        // Metodu çağırma ve sonucu kontrol etme
        String result = (String) privateMethod.invoke(originalMethodReflection, "test");
        assertEquals("test", result);
    }
}
