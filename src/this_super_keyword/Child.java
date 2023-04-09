package this_super_keyword;

public class Child extends Parent
{
	
	static int a =20;
	int c =30;
	
	public void method1()
	{
	//	int a=40;
		System.out.println("I am called from Child Class ");
		System.out.println("a="+this.a);
		System.out.println("I am called from Parent Class ");
		System.out.println("c="+super.c);
		System.out.println("I am called from Child Class ");
		System.out.println("a="+this.c);
		
		System.out.println("Note");
		System.out.println("To Call a GLobal VAribale From Other Classs Use **** super ***** keyword");
		System.out.println("To Call a GLobal VAribale From Same Classs Use **** this ***** keyword");
	}
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.method1();
		
	}

}
