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

		assertTrue("Znajduje w³asn¹ wartoœæ", node.hasValue("A"));
		assertFalse("Nie znajduje brakuj¹cej wartoœci", node.hasValue("B"));
		assertTrue("Znajduje w³asn¹ wartoœæ", node.getRight().hasValue("C"));

	}

	@Test
	public void hasNode_simple() {
		Node node = new Node("A");
		node.addValue("B");
		Node node2 = new Node("C");
		assertTrue("Znajduje w³asny wêze³", node.hasNode(node.getNode("B")));
		assertFalse("Nie znajduje brakuj¹cego wêz³a", node.hasNode(node2));
	}

	@Test
	public void getNode_simple() {
		Node node = new Node("A");
		node.addValue("B");

		assertEquals("Znajduje wêze³", node, node.getNode("A"));
		assertEquals("Znajduje wêze³", node.getRight(), node.getNode("B"));
		assertEquals("Zwraca nul gdy nie ma wêz³a", null, node.getNode("C"));

	}

	// TODO napisz pozosta³ê testy
}
