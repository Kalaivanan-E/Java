

// method overloading

class Reactangle{
    public int area(int side){
        return side * side;
    }

    public int area(int length, int width){
        return length * width;
    }

    public double area(double radius){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Reactangle ra1 = new Reactangle();

        System.out.println(" Area of Square: "+ ra1.area(5));
        System.out.println(" Area of reactangle: "+ ra1.area(4,6));
        System.out.println(" Area of circle: "+ ra1.area(3.5));
    }
    
}
