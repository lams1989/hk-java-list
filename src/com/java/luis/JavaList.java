package com.java.luis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int L = sc.nextInt();
			lista.add(L);
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			String query = sc.next();
			if (query.equals("Insert")) {
				int index = sc.nextInt();
				int value = sc.nextInt();
				lista.add(index, value);
			}
			if (query.equals("Delete")) {
				int index = sc.nextInt();
				lista.remove(index);
			}
		
		}
		sc.close();
		for(Integer listSolution : lista) {
			System.out.print(listSolution + " ");
		}
		
	}

}
