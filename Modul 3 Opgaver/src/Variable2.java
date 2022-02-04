public class Variable2 {


    public static void main(String[] args) {


        double jan11970 = 1631100157;
        double antaldage = 250;

        double antalaar = (int)(jan11970/60/60/24)/365;

        System.out.println("Antal år " + antalaar + " og Antal dage " + antaldage);

        int months = 1;
        System.out.println(months);

        months+= 0.5;
        System.out.println(months);

        months+= 0.5;
        System.out.println(months);
        //dette forekommer da datatypen er int, så den kan slet ikke tage kommatal, hvilket vil sige
        //at hvis man ligger et kommatal til, så skærer den det bare fra, og den vil ikke nå 2
        // selvom at 1+0.5+0.5 originalt ville være 2

        //En værdi er noget man tillæger en variable. En variable i sig selv har ikke en værdi, men kan pege på en.






    }



}
