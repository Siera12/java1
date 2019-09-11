class Payment{
	double amount;

	Payment(double p){
	amount=p;
	}
	
	void paymentDetails(){
		System.out.println("Hey User you need to make payment of Rs."+amount);
	}	
}

class CashPayment extends Payment{
	CashPayment(double am){
	super(am);
	}
	void cashPaymentDetail(){
	paymentDetails();
	System.out.println("Mode of payment is cash");
	}
	
}

class CreditCardPayment extends Payment{
	long creditCardNumber;
	String nameOnCard;
	int cvv;
	String expiryDate;
	
	CreditCardPayment(long ccn,String noc,int cv,String ed){
	super(double ccp);

	long creditCardNumber=ccn;
	String nameOnCard=noc;
	int cvv=cv;
	String expiryDate=ed;
	}
	
	void creditCardPaymentDetails(){
	System.out.println("Amount to be paid:"+ amount+" Card Detail:\n" );
	}
}

class PaymentMain{
	public static void main(String[] args){
	CashPayment p1=new CashPayment(5000);
	p1.cashPaymentDetail();

	//new CreditCardPayment(5986,"Sunil",744,"dec");
	}
}