package com.solution.ladder;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PairTest extends TestCase {

	public void testgetWord1() {
		Assert.assertEquals("helloo",new Pair("helloo",1).getWord());
	}
	
	
	public void testgetWord2() {
		Assert.assertEquals("cat",new Pair("cat",1).getWord());
	}
	
	
	public void testgetWord3() {
		Assert.assertEquals("lwkqemqwe",new Pair("lwkqemqwe",1).getWord());
	}
	
	
	public void testgetStep1() {
		Assert.assertEquals(2,new Pair("cat",2).getStep());
	}
	
	
	public void testgetStep2() {
		Assert.assertEquals(10,new Pair("dog",10).getStep());
	}
	
	
	public void testgetStep3() {
		Assert.assertEquals(120,new Pair("pig",120).getStep());
	}
	
}
