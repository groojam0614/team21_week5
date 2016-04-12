package com.your.dream.real;

public class Gold extends Grade{

	Gold(){
		basicBill = 49.95;
		lineAddBill = 14.5;
		minAddBill = 0.45;
		limitMin = 1000;
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
