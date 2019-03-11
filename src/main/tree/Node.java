package main.tree;

/**
 * Klasa implementuje w�ze� drzewa binarnego, przechowuj�cy warto�� typu String.
 * 
 * 
 * @author ckjulinek
 */
public class Node {

	/**
	 * warto�� w�z�a
	 * 
	 */
	private String value = null;
	/**
	 * rodzic w�z�a
	 */
	private Node parent = null;
	/**
	 * lewy syn w�z�a
	 */
	private Node left = null;
	/**
	 * prawy syn w�z�a
	 */
	private Node right = null;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * Zwraca korze� drzewa
	 */
	public Node treeRoot() {
		Node actual = this;

		while (actual.parent != null) {
			actual = actual.parent;
		}
		return actual;
	}

	/**
	 * Konstruktor
	 * 
	 * @param value warto�� w�z�a
	 */
	public Node(String value) {
		this.value = value;
		this.parent = null;
		this.left = null;
		this.right = null;

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

		if (hasValue(value))
			return getNode(value);
		else {
			Node actual = treeRoot();
			Node parent = null;
			while (actual != null) {
				parent = actual;
				if (actual.value.compareTo(value) > 0) {
					actual = actual.left;
				} else {
					actual = actual.right;
				}
			}

			if (parent.value.compareTo(value) > 0) {
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
		Node actual = treeRoot();
		if (!hasValue(value))
			return null;

		while (actual.value != value) {
			if (actual.value.compareTo(value) > 0) {
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
		Node actual = treeRoot();
		String value = node.value;
		while (!actual.value.equals(node.value)) {
			if (actual.value.compareTo(value) > 0) {
				if (actual.left == null)
					return false;
				actual = actual.left;
			} else {
				if (actual.right == null)
					return false;
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
		Node actual = treeRoot();

		while (!actual.value.equals(value)) {
			if (actual.value.compareTo(value) > 0) {
				if (actual.left == null)
					return false;
				actual = actual.left;
			} else {
				if (actual.right == null)
					return false;
				actual = actual.right;
			}
		}

		return true;
	}

	/**
	 * przechodzi przez cale drzewo
	 */
	private boolean goThroughTree() {
		Node actual = treeRoot();
		while (!actual.value.equals(value)) {
			if (actual.value.compareTo(value) > 0) {
				if (actual.left == null)
					return false;
				actual = actual.left;
			} else {
				if (actual.right == null)
					return false;
				actual = actual.right;
			}
		}
		
		return true;
	}
	
	
}