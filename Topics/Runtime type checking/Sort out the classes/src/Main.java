class Sort {
    public static void sortShapes(Shape[] array,
                                  List<Shape> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        // write your code here
        for (Shape shape : array) {
            if (Square.class.isInstance(shape)) {
                squares.add((Square) shape);
            } else if (Polygon.class.isInstance(shape)) {
                polygons.add((Polygon) shape);
            } else if (Circle.class.isInstance(shape)) {
                circles.add((Circle) shape);
            } else {
                shapes.add(shape);
            }
        }
    }

    public static void main(String[] args) {

    }
}

//Don't change classes below
class Shape { }
class Polygon extends Shape { }
class Square extends Polygon { }
class Circle extends Shape { }