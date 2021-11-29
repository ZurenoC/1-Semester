public class Lektion {

    public static void main(String[] args) {

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int monthNumber = 0;
        for(int daysInAMonth : months)

        {
            System.out.println("Month " + ++monthNumber + " has " + daysInAMonth + " days");
        }


        // for(int i = 0; i < months.length; i++)


            //System.out.println("Month " + (i+1) + " has " + months[i] + " days ");


    }
}
