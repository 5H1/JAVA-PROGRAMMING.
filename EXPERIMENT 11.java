abstract class Shape{
	int a;
	int b;
	abstract public void printArea(){
	}
}
class Rectangle extends Shape(){
	public Rectangle(int p,int q){
	a=p;
	b=q;
	}
	public void printArea(){
	System.out.println("Rectangle area is "+a*b)
	}
}
class Triangle extends Shape
{
	public Triangle(int p, int q)
	{
		a = p;
		b = q;
	}
	public void printArea()
	{
		System.out.println("Triangle Area => " + (0.5 * a * b));
	}
} 
class Circle extends Shape
{
	public Circle(int p)
	{
		a = p;
	}
	public void printArea()
	{
		System.out.println("Circle Area => " + (3.14 * a * a));
	}
}
public class Experiment 11{
	public static void main(String[] args)
	{
		Rectangle R = new Rectangle(10,20);
		Triangle T = new Triangle(5,10);
		Circle C = new Circle(8);
                	R.printArea();
		T.printArea();
		C.printArea();

		}
}