package p3;

public class MyClass
{
	   int x;
	   int p;
	   String abc;
	   
	   MyClass(int x,int p,String abc)
	   {
		   this.x = x;
		   this.p = p;
		   this.abc = abc;
	   }
	   
	   public String doThings()
	   {
		   // this holding current calling object
		   System.out.println(this);
		   abc = x+p+" ";
		   return abc;
	   }
	}