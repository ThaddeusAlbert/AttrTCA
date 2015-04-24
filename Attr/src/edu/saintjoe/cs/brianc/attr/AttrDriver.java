package edu.saintjoe.cs.brianc.attr;

public class AttrDriver {
	
	public static void main(String[] args) {
		Attr one;
		Attr two;
		Attr three;
		
	one = new Attr("Name", "Thaddeus");
	two = new Attr("Hight", 60);
	three = new Attr("Mystery");
	System.out.println(one.toString());
	System.out.println(two.toString());
	System.out.println(three.toString());
	};
}