package com.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;

class Studentdb {
	String std_name;
	int std_id;
	long std_contact_no;

	Studentdb(String std_name, int std_id, long std_contact_no) {
		this.std_name = std_name;
		this.std_id = std_id;
		this.std_contact_no = std_contact_no;
	}

	@Override
	public String toString() {
		return "StudentDataBase [std_name=" + std_name + ", std_id=" + std_id + ", std_contact_no=" + std_contact_no
				+ "]";
	}

}

public class ForEachUsingLambda {
	public static void main(String[] args) {
		Studentdb std1 = new Studentdb("namitha", 101, 8123578130l);
		Studentdb std2 = new Studentdb("nishvika", 102, 9448664895l);
		ArrayList<Object> l1 = new ArrayList<Object>();
		l1.add(std1);
		l1.add(std2);
		Iterator<Object> itr1 = l1.listIterator(1);
		l1.forEach(obj -> System.out.println(obj));
	}
}
