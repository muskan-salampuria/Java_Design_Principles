package mathOperations;

public class division extends operations{
	public float Calc(float x, float y)
	{
		try
		{
		if(y==0)
			throw new Exception("divide by zero");
		else
			return(x/y);
		}
		catch(Exception e) {}
	return(x/y);
	}
}