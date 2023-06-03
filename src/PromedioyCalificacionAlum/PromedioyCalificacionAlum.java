package PromedioyCalificacionAlum;
import java.util.Scanner;
public class PromedioyCalificacionAlum {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("BIENVENIDOS");
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = lectura.nextLine();
        System.out.println("INGRESA TUS CALIFICACIONES");
        int[] calif = new int[5];
        for (int i = 0; i < calif.length; i++) {
            System.out.println(" Ingresa la calificacion : " + (i+1));
            calif[i] = lectura.nextInt();
        }

        double prom = 0;
        prom=promedio(calif);

        char calfinal='A';
        calfinal=CalificacionFinal(prom);

        imprimir(nombre,calif,prom,calfinal);

    }
    public static double promedio(int[] calif) {
        int suma = 0;
        for (int i = 0; i < calif.length; i++) {
            suma = suma + calif[i];
        }
        double promedio = suma / calif.length;
        return promedio;

    }
    public static char CalificacionFinal (double promedio) {
        if (promedio >= 91) {
            return 'A';
        } else if (promedio >= 81) {
            return 'B';
        } else if (promedio >= 71) {
            return 'C';
        } else if (promedio >= 61) {
            return 'D';
        } else if (promedio >= 51) {
            return 'E';
        } else {
            return 'F';
        }

    }

    public static void imprimir(String nombre,int[] calif,double prom,char calfinal){

        System.out.println("Nombre: " + nombre);
        for (int i = 0; i < calif.length; i++) {
            System.out.println( (i+1)+ " Calificaciones : " + calif[i]);

        }
        System.out.println("PROMEDIO: " + prom);
        System.out.println("CALIFICACION:"+ calfinal);

    }
}



























