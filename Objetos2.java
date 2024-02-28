

public class Objetos2 extends Vector{

    @Override
    public void free() {
        // TODO Auto-generated method stub
        super.free();
    }
    @Override
    public void imprimeVector() {
        // TODO Auto-generated method stub
        super.imprimeVector();
    }
    @Override
    public Vector productoVectorial(Vector vector) {
        // TODO Auto-generated method stub
        return super.productoVectorial(vector);
    }
    @Override
    public Vector sumaVectorial(Vector vector) {
        // TODO Auto-generated method stub
        return super.sumaVectorial(vector);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    public Objetos2(int x, int y, int z) {
        super(x, y, z);
    }
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
    @Override
    public String toString() {
        return "Objetos2 []";
    }
}


