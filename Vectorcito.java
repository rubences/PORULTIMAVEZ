import package.of.Vector;

public class Vectorcito extends Vector {
    private int x;
    private int y;
    private int z;

    public Vector sumaVectorial(Vector v) {
        int newX = this.x + v.x;
        int newY = this.y + v.y;
        int newZ = this.z + v.z;
        return new Vector(newX, newY, newZ);
    }

    public Vector productoVectorial(Vector v) {
        int newX = this.y * v.z - this.z * v.y;
        int newY = this.x * v.z - this.z * v.x;
        int newZ = this.x * v.y - this.y * v.x;
        return new Vector(newX, newY, newZ);
    }

    public void imprimirVector() {
        System.out.println("(" + this.x + " Ux, " + this.y + " Uy, " + this.z + " Uz)");
    }

    public static void main(String[] args) {
        Vector v1 = new Vector(1, 0, 0);
        Vector v2 = new Vector(0, 1, 0);
        Vector v3 = new Vector(0, 0, 1);

        Vector vs = v1.sumaVectorial(v2);
        System.out.print("La suma es ");
        vs.imprimeVector();

        Vector vp = vs.productoVectorial(v3);
        System.out.print("El producto es ");
        vp.imprimeVector();
    }
}

