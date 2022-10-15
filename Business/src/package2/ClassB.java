package package2;

public class ClassB {
    public void publicMethod(){
        System.out.println("this is the public method of ClassB");
        privateMethod(); //this prints out here and then goes to classA
    }

    private void privateMethod(){
        System.out.println("this is the private method of ClassB");
    }
    protected void protectedMethod(){
        System.out.println("this is the protected method of ClassB");
    }

    void packageProtected(){
        System.out.println("this is the packageProted method of ClassB");
    }

}
