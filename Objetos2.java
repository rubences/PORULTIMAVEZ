import java.util.Scanner;

public class Objetos2 {
    public static void main(String[] args) {
        Vector v1 = new Vector(1, 0, 0);
        Vector v2 = new Vector(0, 1, 0);
        Vector v3 = new Vector(0, 0, 1);
        Vector vs, vp;

        vs = v1.sumaVectorial(v2);
        System.out.println("La suma es ");
        vs.imprimeVector();

        vp = vs.productoVectorial(v3);
        System.out.println("El producto es ");
        vp.imprimeVector();

        v1.free();
        v2.free();
        v3.free();
        vs.free();
        vp.free();
    }
}


