package com.mywork.javaannotations;

/**
 * @author ManiKanta Kandagatla
 *
 */
public class JavaAnnotationsDemo {

	public static void main(String[] args) {
		learnUsageofAnnotation();
		learnUsageOfAnnotationsWithInheritance();
	}

	private static void learnUsageOfAnnotationsWithInheritance() {
		System.out.println("Referring annotations with inheritance");
		I20 i20 = new I20();
		Class klass = i20.getClass();
		Vehicle v= (Vehicle)klass.getAnnotation(Vehicle.class);
		System.out.println("Invented by: "+ v.inventedBy() + "\n" + "Type: " + v.type());
	}

	private static void learnUsageofAnnotation() {
		System.out.println("Referring annotations without inheritance");
		Car c = new Car("Hyundai", "i20");
		Class klass = c.getClass();
		Vehicle v = (Vehicle)klass.getAnnotation(Vehicle.class);
		System.out.println("Invented by: "+ v.inventedBy() + "\n" + "Type: " + v.type()+"\n\n");
	}
}
