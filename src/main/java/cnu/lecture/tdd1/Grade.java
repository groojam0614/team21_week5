package cnu.lecture.tdd1;

public class Grade {
	double basicBill;
	double lineAddBill;
	double minAddBill;
	int limitMin;
	
	public Grade(){
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
