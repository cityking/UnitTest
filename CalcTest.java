package com.example.unittest;

import android.test.AndroidTestCase;

public class CalcTest extends AndroidTestCase {

	//≤‚ ‘∑Ω∑®
	public void testAdd(){
		Calc calc = new Calc();
		int result = calc.add(5, 3);
		//∂œ—‘
		assertEquals(result, 8);
	}
}
