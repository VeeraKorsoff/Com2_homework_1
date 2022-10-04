public class Main {
    public static void main(String[] args) {

        //HW 1
        int ROWS = 5;
        int COLS = 5;

        for (int r = 1; r <= ROWS; r++) {
            for (int c = 1; c <= COLS; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        System.out.println(); //devides part one and two

        int rows = 5;
        int cols = 5;
        int plus = 0;

        for (int R = 1; R <= rows; R++) {
            for (int C = plus + 1; C <= cols; C++) {
                System.out.print(C + " ");
            }
            System.out.println();
            plus++;
            cols++;
        }

        System.out.println(); //devides the exercises

        //HW 2
        boolean FLAG = false;
        int[] aa = {4, 7, 34, 6, -94};
        int[] bb = {346, 95, -475, 9, 4};

        for (int m = 0; m <= 4; m++) {
            for (int d = 0; d <= 4; d++)
                if (aa[m] == bb[d]) {
                    FLAG = true;
                    break;
                }
        }
        System.out.println(FLAG);

        System.out.println(); //devides the exercises

        //HW 3
        int[] nums = {3, 7, 4};

        for (int k = 0; k < 3; k++) {
            int l = 0;
            for (l = 0; l < 3; l++)
                if (k != l)
                    System.out.println(10 * nums[k] + nums[l]);
        }

        System.out.println(); //devides the exercises

        //HW4
        int LINES = 6;

        for (int r = 1; r <= LINES; r++) {
            for (int c = 6; c >= r; c--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); //devides the exercises

        int lines = 6;

        for (int R = 1; R <= lines; R++) {
            for (int t = 1; t <= R; t++)
                System.out.print("*");
            for (int k = 5; k >= R; k--)
                System.out.print("-");
            System.out.println();
        }
    }
}