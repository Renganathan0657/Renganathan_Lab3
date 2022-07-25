package com.dsa.balancingbracket.main;

import com.dsa.balancingbracket.service.BalancingBrackets;

public class BalancingDriver {

	public static void main(String[] args) {
	 
		BalancingBrackets objBalBrack = new BalancingBrackets ();
		String brackets = "{{[()]}}";
		Boolean result;
		result = objBalBrack.bracketChecking(brackets);
		if(result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered String does not contain Balanced Brackets");
		}
	}

