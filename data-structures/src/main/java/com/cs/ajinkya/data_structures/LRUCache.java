package com.cs.ajinkya.data_structures;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LRUCache {

	LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
	int capacity;
	int count;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.count = 0;
	}

	public int get(int key) {
		if (map.get(key) != null) {
			int result = map.get(key);
			map.remove(key);
			map.put(key, result);
			return result;

		}
		return -1;
	}

	public void put(int key, int value) {
		if (map.get(key) != null) {
			map.remove(key);
			map.put(key, value);
		} else {
			if (count < capacity) {
				map.put(key, value);
				count++;
			} else {
				Entry<Integer, Integer> entry = map.entrySet().iterator().next();
				int oldestKey = entry.getKey();
				map.remove(oldestKey);
				map.put(key, value);
			}

		}

	}

}
