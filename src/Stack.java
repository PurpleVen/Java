public class Stack {

    int st[] = new int[10];
    int top=-1;

    Stack(){
        top = -1;
    }

    void push(int num){

        if(top==9){
            System.out.println("Stack is FULL");
        }
        else{
            st[++top]=num;
        }
    }

    int pop(){
        if(top<0){
            System.out.println("Stack is EMPTY");
        }
        return st[top--];
    }
}
