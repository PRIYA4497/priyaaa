package com.decorator;

public abstract class Shapedecorator implements Shape
{
	protected Shape ds;
	
	public Shapedecorator(Shape ds)
	{
		this.ds = ds;
	}
	
	public void draw()
	{
		ds.draw();
	}
}

