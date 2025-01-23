class Demo
{
  public static void main(String args[])
{
    //create an object of MethodDemo.
    MethodDemo md1=new MethodDemo();
md1.a=10;
md1.b=20;
md1.add();

md1.a=1000;
md1.b=599;
md1.sub();
MethodDemo md2=new MethodDemo();

md2.a=100;
md2.b=50;
md2.add();
md2.sub();

System.out.println("x : "+MethodDemo.x);
System.out.println("x : "+md1.x);

}
}


