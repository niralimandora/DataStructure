import java.util.Scanner;

public class a38n {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] a = new int[n];
Stack s = new Stack(a);
s.push(1);
s.push(2);
s.push(3);
s.push(4);
s.push(5);
s.push(6);
s.push(7);
s.push(8);
s.push(9);
s.push(10);
s.display();
s.pop();
s.display();
System.out.println("enter element");
int ele3 = sc.nextInt();
System.out.println("enter element no");
int ele1 = sc.nextInt();
s.change(ele3, ele1);
s.display();
System.out.println("enter element no2");
int ele2 = sc.nextInt();
s.peep(ele2);
s.display();

}

}

class Stack {
int[] a;
int top;

Stack(int[] a) {
this.a = a;
top = -1;
}

void push(int ele) {
if (top == a.length - 1) {
System.out.println("Stack is full.");
} else {
top++;
a[top] = ele;
}
}

void pop() {
if (top == -1) {
System.out.println("Stack is empty.");
} else {
top--;
}
}

void display() {
for (int i = 0; i <= top; i++) {

System.out.print(a[i] + " ");
}
System.out.println();
}

void change(int ele3, int ele1) {
if (top - ele3 + 1 <= 0) {
System.out.println("stack underflow");
} else {
a[top - ele3 + 1] = ele1;
}
}
void peep(int ele2) {
if (top - ele2 + 1 <= 0) {
System.out.println("stack underflow");
} else {
System.out.println(a[top - ele2 + 1]);
}
}
}
