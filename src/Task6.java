public class Task6 {
    public static void main(String[] args) {
        int columns = 5;
        int rows = 5;

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
            rows--;
        }
    }
}
