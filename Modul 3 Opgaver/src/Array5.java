public class Array5 {


    public static void main(String[] args) {


        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < 20; i++) {
            if (i % 4 == 0) {
                months[1] = 29;
                for (int j = 0; j < months.length; j++) {
                    System.out.print(months[j] + " ");
                }
                System.out.println();

            } else {
                months[1] = 28;
                for (int k = 0; k < months.length; k++) {
                    System.out.print(months[k] + " ");
                }
                System.out.println();
            }
        }


    }
}








