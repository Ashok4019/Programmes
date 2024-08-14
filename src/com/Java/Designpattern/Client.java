package com.Java.Designpattern;

//Step 1: Define the interface for the product
interface Product {
 void display();
}

//Step 2: Create concrete classes that implement the interface
class ConcreteProduct1 implements Product {
 @Override
 public void display() {
     System.out.println("This is ConcreteProduct1");
 }
}

class ConcreteProduct2 implements Product {
 @Override
 public void display() {
     System.out.println("This is ConcreteProduct2");
 }
}

//Step 3: Create a factory interface
interface ProductFactory {
 Product createProduct();
}

//Step 4: Implement concrete factories that implement the factory interface
class ConcreteProduct1Factory implements ProductFactory {
 @Override
 public Product createProduct() {
     return new ConcreteProduct1();
 }
}

class ConcreteProduct2Factory implements ProductFactory {
 @Override
 public Product createProduct() {
     return new ConcreteProduct2();
 }
}

//Step 5: Client code uses the factory to create objects
public class Client {
 public static void main(String[] args) {
     // Using ConcreteProduct1Factory to create ConcreteProduct1
     ProductFactory factory1 = new ConcreteProduct1Factory();
     Product product1 = factory1.createProduct();
     product1.display();

     // Using ConcreteProduct2Factory to create ConcreteProduct2
     ProductFactory factory2 = new ConcreteProduct2Factory();
     Product product2 = factory2.createProduct();
     product2.display();
 }
}

