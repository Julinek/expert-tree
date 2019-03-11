package main.tree;

/**
 * Klasa implementuje wêze³ drzewa binarnego, przechowuj¹cy wartoœæ typu String.
 * 
 * 
 * @author ckjulinek
 */
public class Node {

	/**
	 * wartoœæ wêz³a
	 * 
	 */
	private String value = null;
	/**
	 * rodzic wêz³a
	 */
	private Node parent = null;
	/**
	 * lewy syn wêz³a
	 */
	private Node left = null;
	/**
	 * prawy syn wêz³a
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
	 * Zwraca korzeñ drzewa
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
	 * @param value wartoœæ wêz³a
	 */
	public Node(String value) {
		this.value = value;
		this.parent = null;
		this.left = null;
		this.right = null;

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
	 * Zwraca {@code Node} o wartoœci value, lub null jeœli w drzewie nie ma takiej
	 * wartoœci.
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
	 * @return true, dany obiekt node jest czêœci¹ drzewa, w przeciwnym razie false;
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
	 * @return true, jeœli w drzewie wystêpuje dana wartoœæ, w przeciwnym razie
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