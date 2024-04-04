package org.example.reflection.defaultClasses;

public class OriginalMethodReflection {
    private final IncludeSomeMethodReflection otherClass;

    public OriginalMethodReflection(IncludeSomeMethodReflection otherClass) {
        this.otherClass = otherClass;
    }

    private Integer somePrivateMethod(Integer val){
        return val + 1;
    }
    private String somePrivateMethod2(String val){
        if (val.equals("test")){
            return val;
        }
        return val + " testVal " + val;
    }

    public String functionToTest(String val, Integer val1){
        String otherClassValue = otherClass.someFunc(val);
        Integer inSameClassFuncValue = somePrivateMethod(val1);
        String inSameClassFuncValue1 = somePrivateMethod2(val);

        return otherClassValue + inSameClassFuncValue + inSameClassFuncValue1;
    }
}
