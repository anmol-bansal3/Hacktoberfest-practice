//LIFO
import java.util.*;
import java.lang.*;
import java.util.Stack;
public class stack {
    static final int max=1000;
    int top;
    int a[]=new int[max];
    boolean isEmpty() {
    return(top<0);
    }
    stack()
    {
        top = -1;
    }

    boolean push(int x){
        if(top>=(max-1)){
            System.out.println("String overflow");
            return true;
        }
        else
        {
            a[++top]=x;
            System.out.println("Stack Underflow");
            return false;
        }
    }
    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }

    public static void main(String args[]){
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop()+" Popped from the top");
        System.out.println(s.peek()+" is the peek element");
    }
}
