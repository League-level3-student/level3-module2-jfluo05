package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(!eggs.get(i).equals("whole")) {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int pearlCounter=0;
		// TODO Auto-generated method stub
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)==true) {
				pearlCounter=pearlCounter+1;
			}
		}
		return pearlCounter;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallest=0;
		for (int i = 0; i < peeps.size(); i++) {
			if(tallest<peeps.get(i)) {
				tallest=peeps.get(i);
			}
			}
		return 0;
	}
}
