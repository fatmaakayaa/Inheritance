package inheritance;

public class CustomerManager {
    public void add(Customer customer) { //extends eden sýnýflarýn metotlarýný tutabilir
    	
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