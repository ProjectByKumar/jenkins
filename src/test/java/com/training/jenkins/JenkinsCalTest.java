package com.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;


public class JenkinsCalTest {
	
	@org.testng.annotations.Test
	public void testMulNum() {
		JenkinsCal jen =  new JenkinsCal();
		assertEquals(10, jen.mulnum(2,5));
	
	}
	
	@org.testng.annotations.Test
	public void testAddNum() {
		JenkinsCal jen =  new JenkinsCal();
		assertEquals(7, jen.addnum(2,5));
	
	}

}
