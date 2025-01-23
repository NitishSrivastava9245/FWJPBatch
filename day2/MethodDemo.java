class MethodDemo
{
    int a,b;//instance variable
    static int x=100;
void add()
{
  System.out.println("Sum :"+(a+b));
}

void sub()
{
  System.out.println("Difference :"+(a-b));
}
void add1()
{
    int sum= a+b+100;//local variable
    System.out.println("Sum : "+sum);
x=x+100;
System.out.println("x : "+x);
}

}