package test.tree;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.tree.Node;

public class NodeTest {

	@Test
	public void hasValue_simple() {
		Node node = new Node("A");
		assertTrue("Znajduje w³asn¹ wartoœæ", node.hasValue("A"));
		assertFalse("Nie znajduje brakuj¹cej wartoœci", node.hasValue("B"));
	}
	
	// TODO napisz pozosta³ê testy
}
