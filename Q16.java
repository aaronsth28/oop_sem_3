public class Q16 {
    String author ="James Clear";
    String title = "Atomic Habits";
    int year = 2018;


    @Override
    public String toString() {
        return "Book: \"" + title + "\", Author: " + author + ", Year: " + year;
    }

    public static void main(String[] args) {
        Q16 obj = new Q16();
        System.out.println(obj);

    }
}
