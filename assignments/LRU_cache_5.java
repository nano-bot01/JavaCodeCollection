package Assignments;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;

class LRUCache {
	// store keys of cache
	private Deque<Integer> doublyQueue;

	// store references of key in cache
	private HashSet<Integer> hashSet;

	// maximum capacity of cache
	private final int CACHE_SIZE;

	LRUCache(int capacity) {
		doublyQueue = new LinkedList<>();
		hashSet = new HashSet<>();
		CACHE_SIZE = capacity;
	}

	//Method to Refer the page within the LRU cache
	public void refer(int page) {

		if (!hashSet.contains(page)) {
			//if hash set does not contain the page
			//and if LRU cache is full then removing last element or less used
			if (doublyQueue.size() == CACHE_SIZE) {
				int last = doublyQueue.removeLast();
				hashSet.remove(last);
			}
		}
		else {
			//if page is found then removing it from list
			//so as to bring it to the front
			doublyQueue.remove(page);
		}
		//pushing the page into cache  upfront
		doublyQueue.push(page);
		hashSet.add(page);
	}

	// display contents of LRU cache
	public void display() {
		Iterator<Integer> itr = doublyQueue.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}

public class LRU_cache_5 {
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(4);
		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.refer(1);
		cache.refer(4);
		cache.refer(5);
		cache.refer(2);
		cache.refer(2);
		cache.refer(1);

		System.out.println("After Referencing the left pages in Cache:-");
		cache.display();
	}
}