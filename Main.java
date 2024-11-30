class Shape2D {
   int length;
   int width;

   // Constructor for Shape2D
   Shape2D(int length, int width) {
       this.length = length;
       this.width = width;
   }

   // Method to calculate area
   int area() {
      int resArea= length * width;
      return resArea;
   }

   // Method to calculate perimeter
   int perimeter() {
      int resPerimeter= 2 * (length + width);
      return resPerimeter;
   }
}

// Derived class Rectangle
class Rectangle extends Shape2D {

   // Constructor for Rectangle
   Rectangle(int length, int width) {
       super(length, width); 
   }

   // Method to calculate the diagonal
   double diagonal() {
      double resDiag= Math.sqrt(length * length + width * width);
      return resDiag;
   }
}

// Base class Shape3D extends Shape2D
class Shape3D extends Shape2D {
   int height;

   // Constructor for Shape3D
   Shape3D(int length, int width, int height) {
       super(length, width); 
       this.height = height;
   }

   int volume() {
      int resVol =area() * height;
      return resVol;
   }

   // Method to calculate surface area
   int surfaceArea() {
      int resSA= 2 * (length * width + width * height + height * length);
      return resSA;
   }
}

// Derived class Cuboid extends Shape3D
class Cuboid extends Shape3D {

   Cuboid(int length, int width, int height) {
       super(length, width, height); 
   }
}

// Main class to test the classes
public class Main {
   public static void main(String[] args) {

       Rectangle rectangle = new Rectangle(5, 3);
       System.out.println("Rectangle Area: " + rectangle.area());
       System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
       System.out.println("Rectangle Diagonal: " + rectangle.diagonal());

       Cuboid cuboid = new Cuboid(5, 3, 4);
       System.out.println("Cuboid Volume: " + cuboid.volume());
       System.out.println("Cuboid Surface Area: " + cuboid.surfaceArea());
   }
}
