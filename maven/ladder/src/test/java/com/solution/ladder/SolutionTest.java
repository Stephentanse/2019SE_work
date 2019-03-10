package com.solution.ladder;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

	
	public void testcanChange1() {
		Assert.assertEquals(false, new Solution().canChange("avc","lls"));
	}
	
	
	public void testcanChange2() {
		Assert.assertEquals(true, new Solution().canChange("posd","posa"));
	}
	
	
	public void testcanChange3() {
		Assert.assertEquals(false, new Solution().canChange("pos","posa"));
	}
	

}
