public class Q17 {
    private double width;
    private double height;

    public Q17(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Width: " + width + ", Height: " + height;
    }

    public static void main(String[] args) {
        Q17 q17 = new Q17(50, 50);
        System.out.println(q17);
    }
}
