// Interface specifies behavior; implementations supply concrete payment logic.
interface Payment {void pay(double amount);}
class UpiPayment implements Payment {public void pay(double amount){System.out.println("Paid via UPI: "+amount);}}
public class PaymentDemo {public static void main(String[]args){Payment p=new UpiPayment();p.pay(500);}}
