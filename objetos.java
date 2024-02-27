public class Objetos {
    public static class Vector3D {
        int x, y, z;
    }

    public static void main(String[] args) {
        Vector3D v1 = new Vector3D();
        Vector3D v2 = new Vector3D();
        Vector3D v3 = new Vector3D();
        Vector3D vs = new Vector3D();
        Vector3D vp = new Vector3D();

        v1.x = 1;
        v1.y = 0;
        v1.z = 0;

        v2.x = 0;
        v2.y = 1;
        v2.z = 0;

        v3.x = 0;
        v3.y = 0;
        v3.z = 1;

        // Suma
        vs.x = v1.x + v2.x;
        vs.y = v1.y + v2.y;
        vs.z = v1.z + v2.z;
        System.out.printf("La suma es %d, %d, %d\n\n", vs.x, vs.y, vs.z);

        // Producto
        vp.x = vs.y * v3.z - vs.z * v3.y;
        vp.y = vs.x * v3.z - vs.z * v3.x;
        vp.z = vs.x * v3.y - vs.y * v3.x;
        System.out.printf("El producto es %d, %d, %d\n\n", vp.x, vp.y, vp.z);
    }
}
