package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer fatma = new IndividualCustomer();
	    fatma.customerNumber ="12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber ="78910";
      
        SendikaCustomer abc = new SendikaCustomer();
        abc.customerNumber = "9999";
        
        CustomerManager customerManager = new CustomerManager();
        
        Customer[] customers = {fatma, abc, hepsiBurada};
        
        customerManager.addMultiple(customers);
        
        
       // customerManager.add(hepsiBurada);
       // customerManager.add(fatma);
       //customerManager.add(abc);
	}

}
