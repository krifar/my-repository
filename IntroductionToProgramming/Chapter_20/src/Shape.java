
 public abstract class Shape {
     double height;
     double width;


     public abstract double calculateSurface(double height, double width);
}

 class Triangle extends Shape {

     public Triangle(double height, double width) {
         this.height = height;
         this.width = width;
     }

     @Override
     public double calculateSurface(double height, double width) {
            return (height*width)/2;
     }
 }

 class Rectangle extends Shape {

     public Rectangle(double height, double width) {
         this.height = height;
         this.width = width;
     }

     @Override
     public double calculateSurface(double height, double width) {
         return height*width;
     }
 }

 class Circle extends Shape {
     private double radius;

     public Circle(double radius) {
         this.radius = radius;

         this.width = radius;
         this.height = radius;
     }

     @Override
     public double calculateSurface(double height, double width) {
         return Math.PI * Math.pow((this.radius/2), 2);
     }

     public static void main(String[] args) {
         Shape[] arr = new Shape[6];

         arr[0] = new Circle(4.6);
         arr[1] = new Triangle(1.6, 3);
         arr[2] = new Triangle(47, 26);
         arr[3] = new Rectangle(15.5, 16.2);
         arr[4] = new Rectangle(20, 10);
         arr[5] = new Rectangle(3, 5.5);

         Double[] surfaces = new Double[6];
         surfaces[0] = arr[0].calculateSurface(arr[0].height, arr[0].width);
         surfaces[1] = arr[1].calculateSurface(arr[1].height, arr[1].width);
         surfaces[2] = arr[2].calculateSurface(arr[2].height, arr[2].width);
         surfaces[3] = arr[3].calculateSurface(arr[3].height, arr[3].width);
         surfaces[4] = arr[4].calculateSurface(arr[4].height, arr[4].width);
         surfaces[5] = arr[5].calculateSurface(arr[5].height, arr[5].width);
     }
 }
