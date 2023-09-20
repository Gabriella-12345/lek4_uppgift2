import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
    Scanner läsare = new Scanner(System.in);
    

        System.out.println("Hej!"); 

        System.out.print("Skriv ditt för- och efternamn, tack:");

        String ord = läsare.nextLine(); //*Skapat en string som heter: ord  */

        System.out.println("Längden på ditt namn är: " + ord.length() + " " + "ord"); //* räknar längden */ 


        System.out.print("skriv in EFTERNAMN här:");
        String test = läsare.nextLine();
        System.out.println(test);
        
        String data = (ord);

        int plats1 = data.indexOf(" ");

        String namn_1 = data.substring(0,plats1);

        // int plats2 = data.indexOf(" ", plats1+1);

        String namn_2 = data.substring(plats1,data.length());

        System.out.println("förnamn: "+namn_1+" efternamn:"+namn_2 );

        System.out.println("Heter du "+ namn_1 +" i efternamn ?" );
        String boo = läsare.nextLine();

        boolean svar = boo.contains(namn_1) == false;
        boolean svar2 = boo.contains(namn_2) == true;
        System.out.println(svar);




        // int boo = "namn_2"; 
        // System.out.println(boo.contains("namn_2"));
        

    }

}
