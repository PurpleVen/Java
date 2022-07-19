class AAA{
    int a,b;
    AAA(int aa, int bb)
    {
        a=aa;
        b=bb;
        System.out.println("Inside A's constructor");
    }

    void disp(){
        System.out.println("");
    }
}

class BBB extends AAA{
    BBB
}

class CCC extends BBB{
    CCC(){
        System.out.println("");
    }
}
public class CallingCons {
    public static void main(String args[])
    {
        CCC c =new CCC();
        AAA r;
        AAA a = new AAA(1,2);
        AAA b = new AAA(10,20);
        b.a=a.a;
        b.b=a.b;
        a.disp();
        b.disp();
    }
}
