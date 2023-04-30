
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Lending_Service {
    private int numberOfBooks;
    private double hoursOfLending;
    private double price;

    public Lending_Service(int numberOfBooks, double hoursOfLending, double price) {
        this.numberOfBooks = numberOfBooks;
        this.hoursOfLending = hoursOfLending;
       this.price = price;
    }

  public Lending_Service() {
        this.numberOfBooks = 0;
        this.hoursOfLending= 0;
        this.price = 0;
    }
    public Lending_Service(Lending_Service ls){
        this.numberOfBooks = ls.numberOfBooks;
        this.hoursOfLending = ls.hoursOfLending;
        this.price = ls.price;
    }


    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public double getHoursOfLending() {
        return hoursOfLending;
    }

    public void setHoursOfLending(double hoursOfLending) {
        this.hoursOfLending = hoursOfLending;
    }
    public double CalPrice(int numberOfBooks,double hoursOfLending){
          return this.price = (double)this.numberOfBooks*(this.hoursOfLending * 3);
    }
    
    @Override
    public String toString(){
        return "\nNumber of Books: "+this.numberOfBooks+"\n"+"Hours of Lending: " 
                +this.hoursOfLending + "\n"+ "Total Price: "+this.price;
    }
     public void lservice_file() throws IOException {
         
        FileWriter flwrite = new FileWriter("Lending Service.txt", true);
        flwrite.write("\n"+"Number of Books:"+this.numberOfBooks + "\t\n");
        flwrite.write("Hours of Lending:"+this.hoursOfLending + "\t\n");
        flwrite.write("Total Price:"+this.price + "\t\n");
        flwrite.write("---------------------");
        flwrite.close();
    }

    public void display_lservice() throws FileNotFoundException {
        File file3 = new File("Lending Service.txt");
        Scanner input = new Scanner(file3);
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }

        input.close();
    }

    
}


