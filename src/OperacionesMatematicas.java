public class OperacionesMatematicas {
    public int suma(int a, int b) {
        return a + b;
    }

    public int suma(int a, int b, int c) {
        return a + b + c + 5;
    }

    public double suma(double a, double b) {
        return a + b + 2.0;
    }

    public static void main(String[] args) {
        OperacionesMatematicas operaciones = new OperacionesMatematicas();

        int resultadoentero = operaciones.suma(3, 7);
        System.out.println("Suma de enteros: " + resultadoentero);

        int sumabonus = operaciones.suma(4, 10, 6);
        System.out.println("Suma de tres enteros: " + sumabonus);

        double sumadecimales = operaciones.suma(4.5, 6.1);
        System.out.println("Suma decimales: " + sumadecimales);
    }
}
