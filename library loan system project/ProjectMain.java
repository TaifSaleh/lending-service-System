
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectMain {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<Client> client = new ArrayList<Client>();
        Receipt r = new Receipt();
        Client c = new Client();
        Lending_Service l = new Lending_Service();
        int choice;

        while (true) {
            System.out.println("*** WELCOME TO THE LENDING SERVICE SYSTEM ***");
            System.out.println("");
            System.out.println(" - To Add A New Client >> press 1");
            System.out.println(" - To Obtain The Lending Service >> press 2");
            System.out.println(" - To Receive A Receipt >> press 3");
            System.out.println(" - To Display All Client >> press 4");
            System.out.println(" - To Display All Lending Services >> press 5");
            System.out.println(" - To Exit The System >> press 0 ");
            System.out.println("--------------------------------------------------------");
            System.out.print("Kindly Enter your choice : ");
            choice = input.nextInt();
            System.out.println("\n");
            if(choice == 1) {
                String first_name;
                String last_name;
                String phone_number;
                input.nextLine();
                System.out.println("Kindly Enter Client first name:");
                first_name = input.nextLine();
                c.setFirstName(first_name);
                System.out.println("Kindly Enter Client last name:");
                last_name = input.nextLine();
                c.setLastName(last_name);
                System.out.println("Kindly Enter Client Phone number:");
                phone_number = input.nextLine();
                c.setPhoneNumber(phone_number);
                System.out.println("\nYour information SUCCESSFULLY SAVED! " + "\n");
                client.add(c);
                c.info_file();
            } else if (choice == 2) {

                System.out.println("|| DEAR CLIENT, for the LENDING SERVICE you have to pay 3.00$ per HOUR ||");
                System.out.println("-----------------------------------------------------------");
                System.out.println("Kindly Enter the number of books you want to loan :");
                int numberOb = input.nextInt();
                l.setNumberOfBooks(numberOb);
                System.out.println("Kindly Enter how many hours you want to loan the books:");
                double hoursOl = input.nextDouble();
                l.setHoursOfLending(hoursOl);
                System.out.println(" This is the total price for the service: ");
                System.out.println(l.CalPrice(numberOb, hoursOl)+"$");
                l.lservice_file();
            } else if (choice == 3) {
                
                System.out.println("Dear Client, Here is Your receipt:");
                Receipt rc = new Receipt(c, l);
                System.out.println(rc.toString());
                System.out.println("THANK YOU, visit us again! "+"\n");

            } else if (choice == 4) {
                c.display_info();
            } else if (choice == 5) {
                l.display_lservice();
            }
            else if (choice == 0){
               break;
            } 
                    

        }

    }

}
