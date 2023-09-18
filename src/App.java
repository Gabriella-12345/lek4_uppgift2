public class App {
    public static void main(String[] args) throws Exception {
    Scanner text = new scanner(System.in);
//*Uppgift a */

        System.out.print("Var god att skriv en mening:");

//* uppgigt b*/

        String ord = text.nextline(); //*Skapat en string som heter: ord  */
        
        System.out.println("Längden på din menning: " + ord.lenght());
    
    }
}
