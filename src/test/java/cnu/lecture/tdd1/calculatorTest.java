package cnu.lecture.tdd1;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	@Test
	public void testGoldBasicBill(){
		Gold gold = new Gold();
		assertEquals(49.95, gold.getter_basicBill(), 2);		
	}
	@Test
	public void testGoldLineBill(){
		Gold gold = new Gold();
		assertEquals(14.50, gold.getter_lineBill(), 2);
	}
	@Test
	public void testGoldMinAddBill(){
		Gold gold = new Gold();
		assertEquals(0.45, gold.getter_minBill(), 2);
	}
	@Test
	public void testGoldLimitMin(){
		Gold gold = new Gold();
		assertEquals(1000, gold.getter_limitMin());
	}
	
	@Test
	public void testSilverBasicBill(){
		Silver silver = new Silver();
		assertEquals(29.95, silver.getter_basicBill(), 2);
	}
	@Test
	public void testSilverLineBill(){
		Silver silver = new Silver();
		assertEquals(21.50, silver.getter_lineBill(), 2);
	}
	@Test
	public void testSilverMinAddBill(){
		Silver silver = new Silver();
		assertEquals(0.54, silver.getter_minBill(), 2);
	}
	@Test
	public void testSilverLimitMin(){
		Silver silver = new Silver();
		assertEquals(500, silver.getter_limitMin());
	}
	
	@Test
	public void testUserLineNum(){
		User user = new User();
		user.setLineNum(3);
		assertEquals(3, user.getLineNum());
	}
	@Test
	public void testUserMin(){
		User user = new User();
		user.setMin(790);
		assertEquals(790, user.getMin());
	}
	@Test
	public void testUserGoldGrade(){
		User user = new User();
		Gold gold = new Gold();
		user.setGrade('g');
		assertEquals(gold.getter_basicBill(), user.getGrade().getter_basicBill(), 2);
		assertEquals(gold.getter_lineBill(), user.getGrade().getter_lineBill(), 2);
		assertEquals(gold.getter_minBill(), user.getGrade().getter_minBill(), 2);
		assertEquals(gold.getter_limitMin(), user.getGrade().getter_limitMin());
	}	
	@Test
	public void testUserSilverGrade(){
		User user = new User();
		Silver silver = new Silver();
		user.setGrade('s');
		assertEquals(silver.getter_basicBill(), user.getGrade().getter_basicBill(), 2);
		assertEquals(silver.getter_lineBill(), user.getGrade().getter_lineBill(), 2);
		assertEquals(silver.getter_minBill(), user.getGrade().getter_minBill(), 2);
		assertEquals(silver.getter_limitMin(), user.getGrade().getter_limitMin());
	}
	
	@Test
	public void testCalLineBillGoldCase1(){
		User user = new User();
		user.setGrade('g');
		user.setLineNum(2);
		calculateBill cBill = new calculateBill(user);
		assertEquals(64.45, cBill.calBasicBill(), 2);
	}
	@Test
	public void testCalLineBillGoldCase2(){
		User user = new User();
		user.setGrade('g');
		user.setLineNum(4);
		calculateBill cBill = new calculateBill(user);
		assertEquals(83.95, cBill.calBasicBill(), 2);
	}
	@Test
	public void testCalLineBillGoldCase3(){
		User user = new User();
		user.setGrade('g');
		user.setLineNum(-1);
		calculateBill cBill = new calculateBill(user);
		assertNull(cBill.calBasicBill());
	}
	@Test
	public void testCalLineBillSilverCase1(){
		User user = new User();
		user.setGrade('s');
		user.setLineNum(2);
		calculateBill cBill = new calculateBill(user);
		assertEquals(51.45, cBill.calBasicBill(), 2);
	}
	@Test
	public void testCalLineBillSilverCase2(){
		User user = new User();
		user.setGrade('s');
		user.setLineNum(4);
		calculateBill cBill = new calculateBill(user);
		assertEquals(77.95, cBill.calBasicBill(), 2);
	}
	@Test
	public void testCalLineBillSilverCase3(){
		User user = new User();
		user.setGrade('s');
		user.setLineNum(-1);
		calculateBill cBill = new calculateBill(user);
		assertNull(cBill.calBasicBill());
	}
	
	@Test
	public void testCalAddBillGoldCase1(){
		User user = new User();
		user.setGrade('g');
		user.setMin(1001);
		calculateBill cBill = new calculateBill(user);
		assertEquals(0.45, cBill.calAddBill(), 2);
	}
	@Test
	public void testCalAddBillGoldCase2(){
		User user = new User();
		user.setGrade('g');
		user.setMin(999);
		calculateBill cBill = new calculateBill(user);
		assertEquals(0, cBill.calAddBill(), 2);
	}
	@Test
	public void testCalAddBillGoldCase3(){
		User user = new User();
		user.setGrade('g');
		user.setMin(-1);
		calculateBill cBill = new calculateBill(user);
		assertNull(cBill.calBasicBill());
	}
	@Test
	public void testCalAddBillSilverCase1(){
		User user = new User();
		user.setGrade('s');
		user.setMin(520);
		calculateBill cBill = new calculateBill(user);
		assertEquals(10.8, cBill.calAddBill(), 2);
	}
	@Test
	public void testCalAddBillSilverCase2(){
		User user = new User();
		user.setGrade('s');
		user.setMin(499);
		calculateBill cBill = new calculateBill(user);
		assertEquals(0, cBill.calAddBill(), 2);
	}
	@Test
	public void testCalAddBillSilverCase3(){
		User user = new User();
		user.setGrade('s');
		user.setMin(-1);
		calculateBill cBill = new calculateBill(user);
		assertNull(cBill.calBasicBill());
	}
	
	@Test
	public void testCalFamilyCase1(){
		User user = new User();
		user.setLineNum(4);
		calculateBill cBill = new calculateBill(user);
		assertEquals(5, cBill.calFamilyDiscount());
	}
	@Test
	public void testCalFamilyCase2(){
		User user = new User();
		user.setLineNum(2);
		calculateBill cBill = new calculateBill(user);
		assertEquals(0, cBill.calFamilyDiscount());
	}
	
	@Test
	public void testPrintBillCase1(){
		
	}
	@Test
	public void testPrintBillCase2(){
		
	}
	@Test
	public void testPrintBillCase3(){
		
	}
	@Test
	public void testPrintBillCase4(){
		
	}
	@Test
	public void testPrintBillCase5(){
		
	}
	@Test
	public void testPrintBillCase6(){
		
	}
}