public class condicionales {
    public static void main(String[] args) {
        /*
        Las condicionales se ejecutan con la palabra
        reservada: if-else
         */

        int edad = -35;
        if (edad>0 && edad<18) {
            System.out.println("Ud es niño o un adulto");
        } else if (edad>=18 && edad<65) {
            System.out.println("Ud es un adulto");
        } else if (edad>65) {
            System.out.println("Ud es un adulto mayor");
        } else {
            System.out.println("Edad errada");
        }
        System.out.println("Proceso terminado");
    }
}
