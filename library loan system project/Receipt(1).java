


public class Receipt {
    private Client client;
    private Lending_Service lending_Service;

    
    
    
    public Receipt(Client client, Lending_Service lending_Service) {
        this.client = new Client(client);
        this.lending_Service = new Lending_Service(lending_Service);
    }

    public Receipt() {
        this.client = null;
        this.lending_Service = null;
    }
    public Receipt(Receipt rc){
        this.client = rc.client;
        this.lending_Service = rc.lending_Service;
    }

    public Client getClient() {
        return  new Client (this.client);
    }

    public void setClient(Client client) {
        this.client = new Client(client);
    }

    public Lending_Service getLending_Service() {
        return new Lending_Service(this.lending_Service);
    }

    public void setLending_Service(Lending_Service lending_Service) {
        this.lending_Service = new Lending_Service(lending_Service);
    }
      
    @Override
    public String toString(){
      return "\t\t\t\t\t\t\t RECEIPT "+"\n"+this.client+"\n"+"----------------------"+this.lending_Service+"\n";
    }
    
    

}
