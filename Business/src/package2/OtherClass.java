package package2;

// can we access the private in same package? no we cannot line 7
public class OtherClass {
    public void method1(){
        ClassB classB = new ClassB();
//      classB.privateMethod();
        classB.protectedMethod();
        classB.packageProtected();
    }
}
