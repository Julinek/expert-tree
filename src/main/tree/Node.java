package main.tree;

/**
 * Klasa implementuje w�ze� drzewa binarnego, przechowuj�cy warto�� typu String.
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
	 * @param value warto�� w�z�a
	 */
	public Node(String value) {

		this.value = value;
		System.out.println("Name of node: " + value);
		// TODO
	}

	/**
	 * Dodaje warto�� do drzewa binarnego, Je�eli jeszcze nie ma takiej warto�ci -
	 * dodaje nowy w�ze� {@code Node} Je��li ju� istnieje taka warto�� w drzewie -
	 * zwraca ten w�ze�
	 * 
	 * @param value warto�� dodana do drzewa
	 * 
	 * @return w�ze� drzewa zawieraj�cy warto��
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
	 * Zwraca {@code Node} o warto�ci value, lub null je�li w drzewie nie ma takiej
	 * warto�ci.
	 */
	public Node getNode(String Value) {
		// TODO

		return null;
	}

	/**
	 * @return true, dany obiekt node jest cz�ci� drzewa, w przeciwnym razie false;
	 */
	public boolean hasNode(Node node) {
		return false;
	}

	/**
	 * @return true, je�li w drzewie wyst�puje dana warto��, w przeciwnym razie
	 *         false;
	 */
	public boolean hasValue(String value) {
		return false;
	}
}