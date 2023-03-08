package com.decorator;
public class DecoratorPatterndemo{
public static void main(String[] args) 
{
	Shape circle = new Circle();
	
	Shape redcircle = new RedshapeDecorator(new Circle());
	Shape redrectangle = new RedshapeDecorator(new Rectangle());

	System.out.println("Circle with normal border");
	circle.draw();

	System.out.println("Circle with red border");
	redcircle.draw();
	System.out.println("Rectangle with red border");
	redrectangle.draw();
	
}
}


