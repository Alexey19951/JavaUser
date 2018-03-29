public class dz2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.Ploshad(2,2,2);
        triangle.Perimetr(2,3,4);
        Rectangle rectangle = new Rectangle();
        rectangle.Ploshad(2,4);
        rectangle.Perimetr(2,4);
        Circle circle = new Circle();
        circle.Ploshad(2);
        circle.Dlinna(4);

    }
    public static class Triangle {
        int A,S;
        public int Ploshad (int a, int b, int c ){
            S = (a+b+c)/2;
            System.out.println("Площадь треугольника " + S);
            return S;
        }
        public int Perimetr (int a, int b, int c){
            A = a+b+c;
            System.out.println("Периметр треуогольника " + A);
            return A;
        }
    }
    public static class Rectangle {
        int A,S;
        public int Ploshad (int a,int b){
            S = a * b;
            System.out.println("Площадь прямоугольника " + S);
            return S;
            }
            public int Perimetr (int a,int b){
            A = 2*(a+b);
            System.out.println("Периметр прямоугольника " + A);
            return A;
            }
    }
    public static class Circle {
        double A,S;

        public double Ploshad(double a){
          S = (a * a)*Math.PI;
            System.out.println("Площадь окружности " + S);
            return S;
        }
        public double Dlinna(double b){
            A = Math.PI*b*2;
            System.out.println("Длинна окружности " + A);
            return A;
        }







}

}
