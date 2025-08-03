package com.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		List<Patient> q = new ArrayList<>();
		
		q.add(new Patient("Aarif", "Headache", 3));
		q.add(new Patient("Raza", "F", 1));
        q.add(new Patient("Mohan", "Fever", 2));
		
        Collections.sort(q);
        System.out.println(q);
        for(Patient p: q) {
        	System.out.println(p);
        }
	}

}
