public class Suma {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 3;
        int resultado = sumar(num1, num2, num3);
        System.out.println("La suma de los tres números es: " + resultado);
    }
    
    public static int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
public class Coche {

    private int numPuertas;

    public Coche() {
        this.numPuertas = 0;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void agregarPuerta() {
        this.numPuertas++;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }
}
