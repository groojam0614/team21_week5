package cnu.lecture.tdd1;

public class Appcontroller {
	public User user = new User();
	   public calculateBill cal;
	   
	   public void run(){
	      setInput();
	      this.cal = new calculateBill(user);
	      printBill();
	   }
	   
	   public void setInput(){
	      this.user.setGrade('s');
	      this.user.setMin(521);
	      this.user.setLineNum(5);
	   }
	   
	   public void printBill(){
	      double bil = cal.calBasicBill() + cal.calAddBill() + cal.calFamilyDiscount();
	      System.out.printf("금액 : %.2f\n",bil);
	   }
}
