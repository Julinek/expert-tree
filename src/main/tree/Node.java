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
	


	/**
	 * Konstruktor
	 * 
	 * @param value wartoœæ wêz³a
	 */
	public Node(String value) {
		if(root == null) root = this;
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
		
		if(hasValue(value)) return getNode(value);
	else if (root == null)
			root = new Node(value);
		else {
			Node actual = root;
			Node parent = null;
			while (actual != null) {
				parent = actual;
				if (actual.value.compareTo(value) < 0) {
					actual = actual.left;
				} else {
					actual = actual.right;
				}
			}

			if (parent.value.compareTo(value) < 0) {
				parent.left = new Node(value);
				parent.left.parent = parent;
			} else {
				parent.right = new Node(value);
				parent.right.parent = parent;
			}
		}

		return parent;

		// TODO

	}

	/**
	 * Zwraca {@code Node} o wartoœci value, lub null jeœli w drzewie nie ma takiej
	 * wartoœci.
	 */
	public Node getNode(String value) {
		Node actual = root;
		if(!hasValue(value)) return null;
		
		while(actual.value != value && root != null)
		{
			if (actual.value.compareTo(value) < 0) {
				actual = actual.left;
			} else {
				actual = actual.right;
			}
		}
		
		return actual;
		// TODO

	}

	/**
	 * @return true, dany obiekt node jest czêœci¹ drzewa, w przeciwnym razie false;
	 */
	public boolean hasNode(Node node) {
		Node actual = root;
		String value = node.value;
		while((actual.value != value)  && (root != null))
		{
			if (actual.value.compareTo(value) < 0) {
				if(actual.left == null) return false;
				actual = actual.left;
			} else {
				if(actual.right == null) return false;
				actual = actual.right;
			}
		}
		
		return true;
		
		}

	/**
	 * @return true, jeœli w drzewie wystêpuje dana wartoœæ, w przeciwnym razie
	 *         false;
	 */
	public boolean hasValue(String value) {
		Node actual = root;
		
		while((actual.value != value)  && (root != null))
		{
			if (actual.value.compareTo(value) < 0) {
				if(actual.left == null) return false;
				actual = actual.left;
			} else {
				if(actual.right == null) return false;
				actual = actual.right;
			}
		}
		
		return true;
	}
}