public class Objetos {
    public static class Vector3D {
        private int x, y, z;

        public Vector3D(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public Vector3D sum(Vector3D other) {
            int newX = this.x + other.x;
            int newY = this.y + other.y;
            int newZ = this.z + other.z;
            return new Vector3D(newX, newY, newZ);
        }

        public Vector3D crossProduct(Vector3D other) {
            int newX = this.y * other.z - this.z * other.y;
            int newY = this.x * other.z - this.z * other.x;
            int newZ = this.x * other.y - this.y * other.x;
            return new Vector3D(newX, newY, newZ);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }
    }

    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(1, 0, 0);
        Vector3D v2 = new Vector3D(0, 1, 0);
        Vector3D v3 = new Vector3D(0, 0, 1);

        // Suma
        Vector3D vs = v1.sum(v2);
        System.out.printf("La suma es %d, %d, %d\n\n", vs.getX(), vs.getY(), vs.getZ());

        // Producto
        Vector3D vp = vs.crossProduct(v3);
        System.out.printf("El producto es %d, %d, %d\n\n", vp.getX(), vp.getY(), vp.getZ());
    }
}
