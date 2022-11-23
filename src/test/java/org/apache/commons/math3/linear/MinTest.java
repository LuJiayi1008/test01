package org.apache.commons.math3.linear;

import static org.junit.Assert.*;

import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEvaluateDoubleArrayIntInt() {
		//fail("Not yet implemented");
		Min min = new Min(); 
		double[] values = new double[] { 10.20,1.13,11.23,7.24,9.1,1.13,11.23,7.8,6.5 }; 
        System.out.println("Min: " +min.evaluate(values)); 
	}

	@Test
	public void testClear() {
		//fail("Not yet implemented");
		Min min = new Min(); 
		double[] values = new double[] { 10.20,1.13,11.23,7.24,9.1,1.13,11.23,7.8,6.5 }; 
		int i;
		for(i=0;i<values.length;i++)
		{
			min.increment(values[i]);
		}
		min.clear();
		System.out.println("LengthAfterClear:"+min.getN());
	}

	@Test
	public void testGetResult() {
		//fail("Not yet implemented");
		double[] values = new double[] { 10.20,1.13,11.23,7.24,9.1,1.13,11.23,7.8,6.5 }; 
		Min min = new Min(); 
		int i;
		for(i=0;i<values.length;i++)
		{
			min.increment(values[i]);
		}
		System.out.println("Result:"+min.getResult());
	}

	@Test
	public void testIncrement() {
		//fail("Not yet implemented");
		double[] values = new double[] { 10.20,1.13,11.23,7.24,9.1,1.13,11.23,7.8,6.5 }; 
		Min min = new Min(); 
		int i;
		for(i=0;i<values.length;i++)
		{
			min.increment(values[i]);
		}
		System.out.println("Length:"+i);
	}

}
