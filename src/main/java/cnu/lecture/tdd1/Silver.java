package cnu.lecture.tdd1;

public class Silver extends Grade{
	
	Silver(){
		basicBill = 29.95;
		lineAddBill = 21.5;
		minAddBill = 0.54;
		limitMin = 500;
	}
	
	double getter_basicBill(){
		return basicBill;
	}
	double getter_lineBill(){
		return lineAddBill;
	}
	double getter_minBill(){
		return minAddBill;
	}
	int getter_limitMin(){
		return limitMin;
	}
}
