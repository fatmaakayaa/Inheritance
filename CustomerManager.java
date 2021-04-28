package inheritance;

public class CustomerManager {
    public void add(Customer customer) { //extends eden s�n�flar�n metotlar�n� tutabilir
    	
    	System.out.println(customer.customerNumber + " kaydedildi. ");
    }
    
    //bulk insert
    public void addMultiple(Customer[] customers) {
    	for(Customer costumer : customers) {
    		add(costumer);
    	}
    	
    }

}
//SOLID - Open Closed principle