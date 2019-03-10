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
		node.addValue("C");

		assertTrue("Znajduje w�asn� warto��", node.hasValue("A"));
		assertFalse("Nie znajduje brakuj�cej warto�ci", node.hasValue("B"));
		assertTrue("Znajduje w�asn� warto��", node.getRight().hasValue("C"));

	}

	@Test
	public void hasNode_simple() {
		Node node = new Node("A");
		node.addValue("B");
		Node node2 = new Node("C");
		assertTrue("Znajduje w�asny w�ze�", node.hasNode(node.getNode("B")));
		assertFalse("Nie znajduje brakuj�cego w�z�a", node.hasNode(node2));
	}

	@Test
	public void getNode_simple() {
		Node node = new Node("A");
		node.addValue("B");

		assertEquals("Znajduje w�ze�", node, node.getNode("A"));
		assertEquals("Znajduje w�ze�", node.getRight(), node.getNode("B"));
		assertEquals("Zwraca nul gdy nie ma w�z�a", null, node.getNode("C"));

	}

	// TODO napisz pozosta�� testy
}
