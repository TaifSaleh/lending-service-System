
import java.util.Scanner;
import java.io.*;
public class Client {

    private String firstName;
    private String lastName;
    private String phoneNumber;

   public Client() {
        this.firstName = " ";
        this.lastName = " ";
        this.phoneNumber = " ";
    }

    public Client(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    public Client( Client c){
        this.firstName = c.firstName;
        this.lastName = c.lastName;
        this.phoneNumber = c.phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {

     return "Client First Name: " + this.firstName + "\n" + "Client Last Name: "
                +this.lastName +" \n"+ "Client Phone Number: " + this.phoneNumber;
       
    }

    public void info_file() throws IOException {
        FileWriter fwrite = new FileWriter("Client.txt", true);
        fwrite.write("\n"+"First Name:"+this.firstName +"\t\n");
        fwrite.write("Last Name:"+this.lastName +"\t\n");
        fwrite.write("Phone Number:"+this.phoneNumber +"\t\n");
        fwrite.write("---------------------");
        fwrite.close();
    }

    public void display_info() throws FileNotFoundException {
        File file2 = new File("Client.txt");
        Scanner input = new Scanner(file2);
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }

        input.close();
    }

}
