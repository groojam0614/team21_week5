package com.your.dream.real;

public class calculateBill {
	public User user;
	private int familyDiscount = 5;
	int lineNum;
	
	public calculateBill(User iuser){
		this.user = iuser;
		this.lineNum = user.getLineNum();
	}
	
	public double calBasicBill(){
		if(3 <  lineNum )
			return user.getGrade().getter_basicBill() + 2*user.getGrade().lineAddBill ;
		else if (0 < lineNum )
			return user.getGrade().getter_basicBill() + (lineNum-1)*user.getGrade().lineAddBill;
		else{
			System.out.println("error lineNum :" + lineNum);
			return 0;
		}
	}
	
	public double calAddBill(){
		int limitMin = user.getGrade().getter_limitMin();
		int min = user.getMin();
		
		if( limitMin < min )
			return (min-limitMin)* user.getGrade().getter_minBill();
		else if( 0 < min)
			return 0;
		else{
			System.out.println("error min value");
			return 0;
		}
	}
	
	public int calFamilyDiscount(){	
		if( lineNum > 3 )		
			return familyDiscount * (lineNum-3);
		return 0;
	}
	
}
