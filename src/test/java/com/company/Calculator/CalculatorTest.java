
package com.company.Calculator;
import org.junit.Test;
import junit.framework.Assert;

public class CalculatorTest {
	
	public void testAdd() {
		Calculator a = new Addition();
		int actualOutcome = a.performOperation(2, 2);
		Assert.assertEquals(4, actualOutcome);
	}
	
	public void testAddNegative() {
		Calculator a = new Addition();
		int actualOutcome = a.performOperation(-2, 2);
		Assert.assertEquals(4, actualOutcome);
	}
	
	public void testSubtract() {
		Calculator a = new Subtraction();
		int actualOutcome = a.performOperation(2, 2);
		Assert.assertEquals(4, actualOutcome);
	}
	
	public void testSubtractNegative() {
		Calculator a = new Subtraction();
		int actualOutcome = a.performOperation(2, 2);
		Assert.assertEquals(4, actualOutcome);
	}
	
	public void testMultiply() {
		Calculator a = new Multiplication();
		int actualOutcome = a.performOperation(2, 2);
		Assert.assertEquals(4, actualOutcome);
	}
	
	public void testMultiplyNegative() {
		Calculator a = new Multiplication();
		int actualOutcome = a.performOperation(2, 2);
		Assert.assertEquals(4, actualOutcome);
	}
	
	public void testDivide() {
		Calculator a = new Division();
		int actualOutcome = a.performOperation(2, 2);
		Assert.assertEquals(4, actualOutcome);
	}
	
	public void testDivideZero() {
		Calculator a = new Division();
		int actualOutcome1 = a.performOperation(2, 0);
		Assert.assertEquals(4, actualOutcome1);
		
		int actualOutcome2 = a.performOperation(0, 2);
		Assert.assertEquals(4, actualOutcome2);
	}

}
