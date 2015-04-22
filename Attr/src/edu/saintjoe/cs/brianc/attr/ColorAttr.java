package edu.saintjoe.cs.brianc.attr;
	// Thaddeus Albert Commenting a subclass of Attr, called ColorAttr
	public class ColorAttr extends Attr {
		  //myColor is an ADDITIONAL data member of the Color Attr class
		  private ScreenColor myColor; // The decoded color
		  // This constructor takes a name and a value
		  // constructor No 1
		  public ColorAttr(String name, Object value) {
			// Super means call the parent class constructor
			// Note that the parent must have a constructor
			// with the indicated signature (e.g. name, value)
		    super(name, value);
		    System.out.println("C1");
		    decodeColor();
		    }
		  // constructor No 2
		  // This constructor takes a name only 
		  public ColorAttr(String name) {
			// This calls the ColorAttr constructor witch matches the parameters
		    this(name, "Transparent");
		    System.out.println("C2");
		    }
		  // This constructor takes a name and a screen color
		  // constructor No 3
		  public ColorAttr(String name, ScreenColor value) {
		    super(name, value.toString());
		    System.out.println("C3");
		    myColor = value;
		    }
		  // THIS is an example of method overriding !!!!!!
		  public Object setValue(Object newValue)  {
			    // do superclass stuff first
			    Object retval = super.setValue(newValue);
			    decodeColor();
			    return retval;
			    }
		  /** Set value to ScreenColor, not description */
		  public ScreenColor setValue(ScreenColor newValue) {
			    // do superclass first
			    super.setValue(newValue.toString());
			    ScreenColor oldValue = myColor;
			    myColor = newValue;
			    return oldValue;
			    }

		  /** Return decoded ScreenColor object */
		  public ScreenColor getValue() {
			    return myColor;
			    }

			  /** Set ScreenColor from description */
			  protected void decodeColor() {
			    if(getValue() == null)
			        myColor = null;
			    else
			      myColor = new ScreenColor(getvalue());
			    }
			}

