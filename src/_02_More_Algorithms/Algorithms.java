package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (!eggs.get(i).equals("whole")) {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int pearlCounter = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearlCounter = pearlCounter + 1;
			}
		}
		return pearlCounter;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (tallest < peeps.get(i)) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longestWord = new String();
		longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}

		return longestWord;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		String SOS = new String();
		SOS = " ... --- ... ";
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).equals(SOS)) {
				return true;
			}
		}
		return false;
	}

	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i <unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size()-1; j++) {
				if(unsortedSequences.get(j).length()>unsortedSequences.get(j+1).length()) {
					String temp = unsortedSequences.get(j); 
					unsortedSequences.set(j, unsortedSequences.get(j+1)); 
					unsortedSequences.set(j+1,temp); 
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		for (int i = 0; i < words.size(); i++) {
			for (int k = 0; k < words.size()-1; k++) {
				if(words.get(k).compareTo(words.get(k+1))>0) {
					String temp = words.get(k); 
					words.set(k, words.get(k+1)); 
					words.set(k+1,temp); 
				}
			}
		}
		return words;
	}
}
