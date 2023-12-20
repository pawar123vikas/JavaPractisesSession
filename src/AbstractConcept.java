
public abstract class AbstractConcept implements A {

	/*
	 if we delacred any abstract method in class that class should be abstract. will get
	 compiler error that "The abstract method AbstractMethod in type AbstractConcept 
	can only be defined by an abstract class"
	*/
	/*
	 * 1.Abstract class contain both concrete and abstract methods
	 * 2.Abstract class contain only concrete methods as well, its not mandtaory abstract methods in
	 * abstract class
	 * 3.There are two ways to implement the abstract methods in sub class(extending class)
	 *   3.a.1 add unimplemented methods extending class
	 *   3.a.2 make type extending class as abstract
	 * 4. abstract can implement the interface
	 * 5.static methods are allowed
	 * 6.both consturctor and parametersied contrtscur and private construcor are allowed in abstract class
	 * 7.abstarct method can throws exception checked or unchecked
	 * 8.public and protected access modifier allowed for abstract method
	 * 9.Abstract class can not be final and static
	 * 10.Abstract class only be public abstract
	 * 11.Asbtract class can not be final + abstract coz abstract methods needs to be implemented 
	 *    therefore it is overridden in sub class. final class rsetricting it to override 
	 * 12.can not create instance of abstract class, but still we have constrctor and data members
	 * every object having its default and specific behavoirs, we can put those default and specific
	 * behaviours in common mehtod or in construcor    
	 */
	
	private AbstractConcept() {
		System.out.println("default constractor");
	}
	
	public AbstractConcept(int a) {
		System.out.println("parameterise construcor " +a);
	}
	
	
	public abstract void AbstractMethod() throws ClassCastException;  
	
	static void staticMethod() {
		System.out.println("static block");
	}
	
	public void display() {
		System.out.println("in abstract class display method");
	}
	
	public static void main(String[] args) {

		
		
		
	}

}
