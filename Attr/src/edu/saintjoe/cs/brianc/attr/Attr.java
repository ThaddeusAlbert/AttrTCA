package edu.saintjoe.cs.brianc.attr;
// cannot change name, but you can change the value -
public class Attr {
	  // Once I create an object and give it a name, it CANNOT be changed>
	  private final String name;
	  // Value
	  private Object value = null;
	  // One parameter constructor i know the name i don't know the value
	  public Attr(String name) {
	    this.name = name;
	    }
	  // Tow parameter constructor i know BOTH the name and the value
	  public Attr(String name, Object value) {
	    this.name = name;
	    this.value = value;
	    }
	  // Accessor or "getter"
	  public String getname() {
	    return name;
	    }
	  // Accessor or "getter"
	  public Object getvalue() {
	    return value;
	    }
	  // Mutator or "setter" for data member called "value"
	  public Object setValue(Object newValue) {
	    Object oldVal = value;
	    value = newValue;
	    return oldVal;
	    }
	  // All classes should have a "toString" method to visualize their contents. print out
	  public String toString() {
	    return name + "='" + value + "'";
	    }
	}
