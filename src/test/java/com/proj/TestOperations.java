package com.proj;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Assert;


public class TestOperations {

	@Test
	public void testAdd() {
		Assert.assertEquals(Operations.add(1.5F, 3.5F), 5F, 0);
	}
	
	@Test
	public void testSub() {
		Assert.assertEquals(Operations.sub(1.5F, 3.5F), -2F, 0);
	}
	
	@Test
	public void testMul() {
		Assert.assertEquals(Operations.mul(1.5F, 2F), 3F, 0);
	}
	
	@Test
	public void testDiv() {
		Assert.assertEquals(Operations.div(3F, 1.5F), 2F, 0);
	}
	
	
}
