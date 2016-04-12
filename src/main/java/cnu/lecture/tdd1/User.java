package com.your.dream.real;

public class User {
	private int lineNum;
	private int min;
	private Grade grade;
	
	
	public int getLineNum() {
		return lineNum;
	}
	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(char input) {
		if(input == 'g' || input == 'G'){
			this.grade = new Gold();
		}else{
			this.grade = new Silver();
		}
	}
	
	
}
