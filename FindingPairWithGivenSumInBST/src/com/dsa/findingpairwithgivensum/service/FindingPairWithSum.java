package com.dsa.findingpairwithgivensum.service;
import java.util.*;
public class FindingPairWithSum {
	public Node insert (Node root, int key) {
		if(root == null) 
			return new Node(key);
		if (key < root.nodeData )
			root.leftNode = insert(root.leftNode , key);
		if (key > root.nodeData )
			root.rightNode = insert(root.rightNode , key);
		return root;
		}
	public Boolean findPairUtil (Node root, int sum, HashSet<Integer> set) {
		if(root == null)
		return false;
		if(findPairUtil(root.leftNode, sum, set))
		return true;
		//int pair = sum -root.nodeData;
		if(set.contains(sum - root.nodeData)) {
			//if(set.contains(pair)) {
		//System.out.println("the pair is (" + root.nodeData + "," + pair+")");
				System.out.println("the pair is (" + root.nodeData + "," + (sum-root.nodeData )+")");
		return true;
		}else
			set.add(root.nodeData);
		return findPairUtil(root.rightNode, sum, set);
		}
	public void pairWithSum (Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if(!findPairUtil(root, sum, set))
			System.out.println("nodes are not found");
		}
}
