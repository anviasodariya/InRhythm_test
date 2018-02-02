package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;





@RunWith(MockitoJUnitRunner.class)

public class testcase {
	
	@SuppressWarnings("deprecation")
	@Test
	public void test()
	{
		String result="6 and jumped";
		String stringToTest="The cow jumped over the moon";
		String resultToTest=CountLengthOfWord.countlengthofword(stringToTest);
		Assert.assertEquals(result,resultToTest);
	}
	
	
	

}
