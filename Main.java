/**
 *  This pattern provides one of the best ways to create an object.
 *  An object is created without exposing the creation logic to the client
 *  and refers to newly created object using a common interface.
 */
package factory_method;

/**
 * @author Rick
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		Shape rectangle = shapeFactory.getShape("Rectangle");
		Shape square = shapeFactory.getShape("square");
		
		circle.draw();
		rectangle.draw();
		square.draw();
	}

}
