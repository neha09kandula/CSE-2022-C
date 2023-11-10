package exercise;

public class squareclass {

		    private int side;
		    int area;
		    int perimeter;
		    public squareclass(int side) {
		        // TODO: Initialize side with the passed
		        this.side=side;
		        if(side<=0)
		        {
		            area=-1;
		            perimeter=-1;
		        }
		        else{
		           area=side*side;
		           perimeter=4*side;
		        }
		    }

		    public int calculateArea() {
		        // TODO: Calculate and return the area of the square
		        return area;
		    }

		    public int calculatePerimeter() {
		        // TODO: Calculate and return the perimeter of the square
		        return perimeter;
		    }
	public static void main(String[]args)
	{
		squareclass square = new squareclass(5);
		System.out.println(square.calculateArea());
		System.out.println(square.calculatePerimeter() );
	}
		}


