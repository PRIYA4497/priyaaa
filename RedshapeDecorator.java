package com.decorator;

public class RedshapeDecorator extends Shapedecorator
{
	
    public RedshapeDecorator(Shape ds)
    { 
    	super(ds);
    }
	public void draw()
	{
	  ds.draw();
	  setRedBorder(ds);
	}
    
	private void setRedBorder(Shape ds1)
	{
		System.out.println("Border color : red ");
	}
}
