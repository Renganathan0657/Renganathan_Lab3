package com.dsa.findingpairwithgivensum.main;

import com.dsa.findingpairwithgivensum.service.FindingPairWithSum;
import com.dsa.findingpairwithgivensum.service.Node;

public class Driver {

	public static void main(String[] args) {
		Node root = null;
		FindingPairWithSum objPair = new FindingPairWithSum();
		root = objPair.insert(root, 40);
		root = objPair.insert(root, 10);
		root = objPair.insert(root, 20);
		root = objPair.insert(root, 30);
		root = objPair.insert(root, 50);
		root = objPair.insert(root, 60);
		root = objPair.insert(root, 70);
		
		int sum = 150;
		objPair.pairWithSum(root, sum);
	}
}
