package com.example.unittest;

import android.test.AndroidTestCase;

public class CalcTest extends AndroidTestCase {

	//���Է���
	public void testAdd(){
		Calc calc = new Calc();
		int result = calc.add(5, 3);
		//����
		assertEquals(result, 8);
	}
}
