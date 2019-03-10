package main;

import java.util.Scanner;

import main.tree.*;

/**
 * 
 * @author ckjulinek
 *
 */
public class Application {
	public static void main(String[] args) {
		System.out.println("Application started");

		// TODO: Utworz taki program który:
		// Powiedzmy inicjuje jakieœ drzewo zawieraj¹ce 10 imion
		// w pêtli pyta o imiê po czym mówi czy jest w root node czy nie.
		// do czasu a¿ powiesz powiedzmy 'bye'
		// ...
		// albo coœ innego tego typu..

		Scanner scaner = new Scanner(System.in);
		Application a = new Application();
		a.generateTree();

		String input = "";

		do {
			System.out.println("Enter the name that you want to chcek, or enter Bye to finish.");
			input = scaner.next();
			if (input.compareTo("Bye") != 0) {
				a.komunikatHasValue(input);
			}

		} while (input.compareTo("Bye") != 0);

		System.out.println("Bye!");
		scaner.close();

	}

	/**
	 * Generuje drzewo binarne z wejœciow¹ list¹ imiom
	 * 
	 * @return root Node
	 */

	Node tree = new Node("D");

	Node generateTree() {

		tree.addValue("A");
		tree.addValue("E");
		tree.addValue("F");
		tree.addValue("Z");
		tree.addValue("D");
		tree.addValue("C");
		tree.addValue("B");
		tree.addValue("H");
		tree.addValue("J");
		tree.addValue("G");

		return tree;

	}

	void komunikatHasValue(String a) {

		if(tree.hasValue(a))
			System.out.println("Tree includes this value!");
		else 
			System.out.println("Tree does not include this value!");
	}

}
