package Lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class winningNum {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size() < 3) {
         set.add((int) (Math.random() * 25) + 1);
        }
    
     	ArrayList<Integer> ComLotto = new ArrayList<Integer>(set);
		Collections.sort(ComLotto);
		System.out.println(ComLotto);
		
	}

}