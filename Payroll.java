class Employpayroll{

public double totalpayrates(int reulartime, int overtime){
  Double totalPay;
  int c= 800*reulartime;
  int d = 1600*overtime;
 totalPay = (double)c+d;
 return totalPay;
}
}
public class Payroll{

    public static void main (String a[]){
    
Employpayroll obj1 = new Employpayroll();
System.out.println(obj1.totalpayrates(30,8)+ " Taka");
}
    
}