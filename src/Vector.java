

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int nachaloX, int konecX, int nachaloY, int konecY, int nachaloZ, int konecZ) {
        this.x = konecX-nachaloX;
        this.y = konecY-nachaloY;
        this.z = konecZ-nachaloZ;
    }

    public Vector(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
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

    public static Vector vectorSum(Vector...vectors){
        int sumX=0;
        int sumY=0;
        int sumZ=0;
        for (int i = 0; i < vectors.length ; i++) {
            sumX+=vectors[i].x;
            sumY+=vectors[i].y;
            sumZ+=vectors[i].z;
        }
        return new Vector(sumX, sumY, sumZ);
    }

    public static Vector vectorRazn(Vector...vectors){
        int sumX=vectors[0].x;
        int sumY=vectors[0].y;
        int sumZ=vectors[0].z;
        for (int i = 1; i < vectors.length ; i++) {
            sumX-=vectors[i].x;
            sumY-=vectors[i].y;
            sumZ-=vectors[i].z;

        }
        return new Vector(sumX, sumY, sumZ);
    }

    public static Vector vectorUmn(Vector vec1, Vector vec2){
        int sumX;
        int sumY;
        int sumZ;

        sumX=(vec1.y * vec2.z) - (vec1.z * vec2.y);
        sumY=(-1*((vec1.x * vec2.z) - (vec1.z * vec2.x)));
        sumZ=(vec1.x * vec2.y) - (vec1.y * vec2.x);

        return new Vector(sumX, sumY, sumZ);
    }

    public static Vector vectorInkrement(Vector vec1, Vector vec2){
        int sumX;
        int sumY;
        int sumZ;

        sumX=vec1.x+vec2.x;
        sumY=vec1.y+vec2.y;
        sumZ=vec1.z+vec2.z;

        return new Vector(sumX, sumY, sumZ);
    }

    public static Vector vectorDekrement(Vector vec1, Vector vec2){
        int sumX;
        int sumY;
        int sumZ;

        sumX=vec1.x-vec2.x;
        sumY=vec1.y-vec2.y;
        sumZ=vec1.z-vec2.z;

        return new Vector(sumX, sumY, sumZ);
    }

    public static int[] scalarPr(Vector[] vectors){
        int sumX=0;
        int sumY=0;
        int sumZ=0;

        for (int i = 0; i < vectors.length ; i++) {
            sumX+=vectors[i].x;
            sumY+=vectors[i].y;
            sumZ+=vectors[i].z;
        }

        return new int[] {sumX, sumY, sumZ};
    }

    public static double[]  length (Vector[] vectors,int n){
        double[] lengs = new double[n];

        for (int i = 0; i < vectors.length ; i++) {
            lengs[i]=Math.sqrt(Math.pow(vectors[i].x, 2) + Math.pow(vectors[i].y, 2) + Math.pow(vectors[i].z, 2));
        }
        return lengs;
    }







    public static int scalarPrForAngle(Vector...vectors){
        int[] arr = scalarPr(vectors);
        int sum=0;
        for (int i: arr) {
            sum+=i;
        }
        return sum;
    }

    public static double lengthForAngle (Vector vector){
        double lengs;

            lengs=Math.sqrt(Math.pow(vector.x, 2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2));

        return lengs;
    }

    public static double[] angleBetwVect(Vector[] vectors){
        double[] angles = new double[vectors.length-1];

        for (int i = 0; i < vectors.length-1 ; i++) {
            angles[i]=Math.toDegrees(Math.acos(scalarPrForAngle(vectors[i], vectors[i+1]) / (lengthForAngle(vectors[i]) * lengthForAngle(vectors[i+1]))));
            System.out.println("угол между векторами: " + angles[i]);
        }
        return angles;

    }





//    public static void main(String[] args) {
//        Vector vec1 = new Vector(5, 8, 3, 8, 2,6);
//        Vector vec2 = new Vector(10, 10, 1, 5,3,4);
//        Vector vec3 = new Vector(3,11,4,9,4,6);
//        Vector vec4 = new Vector(7,15,6,15,6,9);
//
//        System.out.println(vec1.toString());
//        System.out.println(vec2.toString());
//
//        Vector vec5 = vectorUmn(vec1, vec2);
//
//        System.out.println(vec5.toString());
//
//        Vector[] vectors = {vec1, vec2};
//
//        length(vectors, vectors.length);
//
//        angleBetwVect(vectors);
//    }
}
