package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<T> implements Iterable<T>{

	private Node<T> head;
	private Node<T> tail;
 	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean remove(int index) {

		//make sure it's in bounds,  then have previous node link to node after node at index and vice versa

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}

		Node<T> prevNode = head;
		Node<T> currentNode = head.next;

		for (int i = 0; i < index ; i++) {
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}

		if(currentNode == head) {
			head = head.next;
		}
		else {
			prevNode.next = currentNode.next;
		}
		if (currentNode == tail){
			tail = prevNode;
		}

		size--;
		return true;
	}

	public T get(int index) {

		Node<T> currentNode = null;

			for (int i = 0; i < index; i++) {
				currentNode = currentNode.getNext();
			}

		return currentNode.getData();
	}

	public void add(T obj) {

		if (size == 0) {

			head = new Node<T>(obj, null);

		}
		else {

			Node<T> currentNode = head;

			while (currentNode.getNext() != null) {

				currentNode = currentNode.getNext();
			}
			currentNode.setNext(new Node<T>(obj, null));
		}
		size++;
	}


	public void add(int index, T obj){
		//to-do
		size++;
	}


	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(head);
	}


	private class MyIterator<T> implements Iterator<T> {
		private Node<T> node;

		public MyIterator(Node<T> node) {
			//to-do
		}
		@Override
		public boolean hasNext() {
			//to-do

			return false;
		}

		@Override
		public T next() {
			//to-do

			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}
}
