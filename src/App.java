import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
    Scanner läsare = new Scanner(System.in);
    

        System.out.println("Hej!"); 

        System.out.print("Skriv ditt för- och efternamn, tack:");

        String ord = läsare.nextLine(); //*Skapat en string som heter: ord  */

        System.out.println("Längden på ditt namn är: " + ord.length()); //* räknar längden */ 


        System.out.print("Välj ett valfritt namn från ditt namn och skriv den här:");
        String test = läsare.nextLine();
        System.out.println(test);
        
        String data = (ord);

        int plats1 = data.indexOf(" ");

        String namn_1 = data.substring(0,plats1);

        int plats2 = data.indexOf(" ", plats1+1);

        String namn_2 = data.substring(plats1,data.length());

        System.out.println("förnamn: "+namn_1+" efternamn:"+namn_2 );

        





        System.out.println("Är det sannt att ditt efternamn är" + namn_2);

    }

}
