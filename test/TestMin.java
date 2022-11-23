import org.apache.commons.math3.stat.descriptive.rank.Min;

public class TestMin {
	public static void main(String[] args)
	{
		TestMin myTest= new TestMin();
		myTest.testEvaluate();
		myTest.testIncrement();
		myTest.testGetResult();
		myTest.testClear();
		}
	public void testEvaluate()
	{
		Min min = new Min(); 
		double[] values = new double[] { 10.20,1.13,11.23,7.24,9.1,1.13,11.23,7.8,6.5 }; 
        System.out.println("Min: " +min.evaluate(values)); 
	}
	
	public void testIncrement()
	{
		Min min = new Min(); 
		double[] values = new double[] { 10.20,1.13,11.23,7.24,9.1,1.13,11.23,7.8,6.5 }; 
		int i;
		for(i=0;i<values.length;i++)
		{
			min.increment(values[i]);
		}
		System.out.println("Length:"+i);
	}
	
	
	public void testGetResult()
	{
		double[] values = new double[] { 10.20,1.13,11.23,7.24,9.1,1.13,11.23,7.8,6.5 }; 
		Min min = new Min(); 
		int i;
		for(i=0;i<values.length;i++)
		{
			min.increment(values[i]);
		}
		System.out.println("Result:"+min.getResult());
	}
	
	
	public void testClear()
	{
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
}


