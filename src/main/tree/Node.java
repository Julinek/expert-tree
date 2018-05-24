package main.tree;

/**
 * Klasa implementuje wêze³ drzewa binarnego, przechowuj¹cy wartoœæ typu String.
 * 
 * 
 * @author ckjulinek
 */
public class Node {

	/**
	 * Konstruktor
	 * @param value wartoœæ wêz³a
	 */
	public Node(String value) {
		// TODO
	}
	
	/**
	 * Dodaje wartoœæ do drzewa binarnego, 
	 * Je¿eli jeszcze nie ma takiej wartoœci - dodaje nowy wêze³ {@code Node}
	 * Je¿êli ju¿ istnieje taka wartoœæ w drzewie - zwraca ten wêze³
	 * @param value wartoœæ dodana do drzewa
	 * 
	 * @return wêze³ drzewa zawieraj¹cy wartoœæ
	 */
	public Node addValue(String Value) {
		// TODO
		return null;
	}

	/**
	 * Zwraca {@code Node} o wartoœci value, lub null jeœli w drzewie nie ma takiej wartoœci.
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
	 * @return true, jeœli w drzewie wystêpuje dana wartoœæ, w przeciwnym razie false;
	 */
	public boolean hasValue(String value) {
		return false;
	}
}
