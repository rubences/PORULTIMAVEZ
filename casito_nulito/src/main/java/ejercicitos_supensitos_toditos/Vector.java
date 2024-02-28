class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector sumaVectorial(Vector vector) {
        int sumX = this.x + vector.x;
        int sumY = this.y + vector.y;
        int sumZ = this.z + vector.z;
        return new Vector(sumX, sumY, sumZ);
    }

    public Vector productoVectorial(Vector vector) {
        int prodX = this.y * vector.z - this.z * vector.y;
        int prodY = this.z * vector.x - this.x * vector.z;
        int prodZ = this.x * vector.y - this.y * vector.x;
        return new Vector(prodX, prodY, prodZ);
    }

    public void imprimeVector() {
        System.out.println("(" + this.x + ", " + this.y + ", " + this.z + ")");
    }

    public void free() {
        // Perform any necessary cleanup here
    }
}
