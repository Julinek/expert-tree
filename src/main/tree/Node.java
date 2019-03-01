package main.tree;

/**
 * Klasa implementuje wêze³ drzewa binarnego, przechowuj¹cy wartoœæ typu String.
 * 
 * 
 * @author ckjulinek
 */
public class Node {

	String value = null;
	Node root = null;
	Node parent;
	Node left = null;
	Node right = null;

	/*
	 * public String getValue() { return value; }
	 * 
	 * public void setValue(String value) { this.value = value; }
	 * 
	 * public Node getParent() { return parent; }
	 * 
	 * public void setParent(Node parent) { this.parent = parent; }
	 * 
	 * public Node getLeft() { return left; }
	 * 
	 * public void setLeft(Node left) { this.left = left; }
	 * 
	 * public Node getRight() { return right; }
	 * 
	 * public void setRight(Node right) { this.right = right; }
	 */

	/**
	 * Konstruktor
	 * 
	 * @param value wartoœæ wêz³a
	 */
	public Node(String value) {

		this.value = value;
		System.out.println("Name of node: " + value);
		// TODO
	}

	/**
	 * Dodaje wartoœæ do drzewa binarnego, Je¿eli jeszcze nie ma takiej wartoœci -
	 * dodaje nowy wêze³ {@code Node} Je¿êli ju¿ istnieje taka wartoœæ w drzewie -
	 * zwraca ten wêze³
	 * 
	 * @param value wartoœæ dodana do drzewa
	 * 
	 * @return wêze³ drzewa zawieraj¹cy wartoœæ
	 */
	public Node addValue(String value) {
		
	
		
		if(root == null)
			root = new Node(value);
			else {
			Node actual = root;
			Node parent = null;
			while(actual != null) {
			parent = actual;               
			if(actual.value.compareTo(value) < 0)
			{actual = actual.left;
			}
			else
			{actual = actual.right;
			}              
			}
			
			if(parent.value.compareTo(value) < 0) {
			parent.left = new Node(value);
			parent.left.parent = parent;
			}
			else {
			parent.right = new Node(value);
			parent.right.parent = parent;
			}
			} 
		
		
		/*if (root == null)
			root = new Node(value);
		else {
			Node actual = root;
			Node parent = null;
			
			while (actual != null) {
				parent = actual;
				if (actual.left == null || actual.right == null) {
					actual = null;
				} else {
					actual = actual.left;
				}

			}*/
			

			/*while (actual != null) {
				parent = actual;
				if (actual.left == null || actual.right == null) {
					actual = null;
				} else {
					actual = actual.left;
				}

			}*/

			/*if (parent.left == null) {
				parent.left = new Node(value);
				parent.left.parent = parent;
				parent = parent.left;
			} else if (parent.right == null) {
				parent.right = new Node(value);
				parent.right.parent = parent;
				parent = parent.left;
			}*/
			// return actual;
			// return null;

		return parent;

		// TODO

	}

	/**
	 * Zwraca {@code Node} o wartoœci value, lub null jeœli w drzewie nie ma takiej
	 * wartoœci.
	 */
	public Node getNode(String Value) {
		// TODO

		return null;
	}

	/**
	 * @return true, dany obiekt node jest czêœci¹ drzewa, w przeciwnym razie false;
	 */
	public boolean hasNode(Node node) {
		return false;
	}

	/**
	 * @return true, jeœli w drzewie wystêpuje dana wartoœæ, w przeciwnym razie
	 *         false;
	 */
	public boolean hasValue(String value) {
		return false;
	}
}