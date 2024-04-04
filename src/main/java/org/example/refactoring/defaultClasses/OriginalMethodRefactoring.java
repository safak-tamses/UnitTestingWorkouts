package org.example.refactoring.defaultClasses;

public class OriginalMethodRefactoring {
    private final IncludeSomeMethodRefactoring otherClass;

    public OriginalMethodRefactoring(IncludeSomeMethodRefactoring otherClass) {
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

    // Public metotlar aracılığıyla private metodları test etmek için eklenmiş metodlar
    public Integer testSomePrivateMethod(Integer val) {
        return somePrivateMethod(val);
    }

    public String testSomePrivateMethod2(String val) {
        return somePrivateMethod2(val);
    }

    public String functionToTest(String val, Integer val1){
        String otherClassValue = otherClass.someFunc(val);
        Integer inSameClassFuncValue = somePrivateMethod(val1);
        String inSameClassFuncValue1 = somePrivateMethod2(val);

        return otherClassValue + inSameClassFuncValue + inSameClassFuncValue1;
    }
}
