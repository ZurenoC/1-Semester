public class Branches {

    public static void main(String[] args) {


        int secSinceNewYear = 29816000;
        int jul = 30931200;

        float price = (float) 599.95;

        if (secSinceNewYear < 30000000 && secSinceNewYear > 25000000) {
            price = (float) (price*0.70);
            System.out.println(price);
        }
        else
            System.out.println(price);











    }



}
