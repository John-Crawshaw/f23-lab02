package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;
import edu.cmu.cs.cs214.lab02.shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(29);
        

        Renderer renderer = new Renderer(rectangle);
        Renderer renderer2 = new Renderer(circle);
        Renderer renderer3 = new Renderer(square);

        renderer.draw();
        renderer2.draw();
        renderer3.draw();
    }
}
