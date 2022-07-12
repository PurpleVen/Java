class A{
    int i;
    void sayhello(){
        System.out.println("Hello from the A class ");
    }
}

class B extends A {
    int i;

    B(int a, int b){
        super.i=a;
        i=b;
    }

    void sayhello(){
        System.out.println("Hello from the B class ");
    }

    void show(){
        System.out.println("i in superclass: " +super.i);
        System.out.println("i in subclass: " +i);

        sayhello();
        super.sayhello();
    }
}

class UseSuper {
    public static void main(String args[])
    {
        B subOb = new B(1,2);

        subOb.show();
    }
}
