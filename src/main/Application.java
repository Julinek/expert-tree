package main;

import main.tree.*;
/**
 * 
 * @author ckjulinek
 *
 */
public class Application {
	public static void main(String[] args) {
		System.out.println("Application started");

		// TODO: Utworz taki program kt�ry:
		// Powiedzmy inicjuje jakie� drzewo zawieraj�ce 10 imion
		// w p�tli pyta o imi� po czym m�wi czy jest w root node czy nie.
		// do czasu a� powiesz powiedzmy 'bye'
		// ...
		// albo co� innego tego typu..
		Node tree = new Node("John");
		tree.addValue("test");
		tree.addValue("aest");
		

		
	}

	
	
	
	/**
	 * Generuje drzewo binarne z wej�ciow� list� imiom
	 * 
	 * @return root Node
	 */
}
