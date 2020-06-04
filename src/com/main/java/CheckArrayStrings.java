package com.main.java;

import java.util.*;

public class CheckArrayStrings {

	static void checkMagazine(String[] magazine, String[] note) {

		HashMap<String, Integer> magazines = new HashMap<>();
		for (int i = 0; i < magazine.length; i++) {
			String word = magazine[i];
			magazines.put(word, magazines.getOrDefault(word, 0) + 1);
		}
		HashMap<String, Integer> ransom = new HashMap<>();
		for (int i = 0; i < note.length; i++) {
			String word = note[i];
			ransom.put(word, ransom.getOrDefault(word, 0) + 1);
		}

		Optional<Integer> res = ransom.entrySet().stream()
				.map(e -> magazines.getOrDefault(e.getKey(), 0) - e.getValue()).filter(e -> e < 0).findFirst();

		System.out.println(res.isPresent() ? "No" : "Yes");

	}

	public static void main(String[] args) {
		String[] magazine = { "Hello ", " how", " are", " you", " welcome", " to", " Tutorialspoint" };
		String[] note = { "Hello ", " hoytytw", " are" };
		checkMagazine(magazine, note);
	}
}
