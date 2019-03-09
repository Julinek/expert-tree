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
	


	/**
	 * Konstruktor
	 * 
	 * @param value warto�� w�z�a
	 */
	public Node(String value) {
		if(root == null) root = this;
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
	 * Zwraca {@code Node} o warto�ci value, lub null je�li w drzewie nie ma takiej
	 * warto�ci.
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
	 * @return true, dany obiekt node jest cz�ci� drzewa, w przeciwnym razie false;
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
	 * @return true, je�li w drzewie wyst�puje dana warto��, w przeciwnym razie
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