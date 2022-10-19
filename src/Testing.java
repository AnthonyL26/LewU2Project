public class Testing {
    public static void main(String[] args) {
        // Not Part of the Main program
        int x1 = -1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 10;
        double a = ((double) y2 - y1) / ((double) x2 - x1);
        System.out.println((double) Math.round(a * 100) / 100);
    }
}
