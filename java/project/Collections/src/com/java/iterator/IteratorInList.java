package com.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;

class StudentDataBase {
	String std_name;
	int std_id;
	long std_contact_no;

	StudentDataBase(String std_name, int std_id, long std_contact_no) {
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

public class IteratorInList {
	public static void main(String[] args) {
		StudentDataBase std1 = new StudentDataBase("namitha", 101, 8123578130l);
		StudentDataBase std2 = new StudentDataBase("nishvika", 102, 9448664895l);
		ArrayList<Object> l1 = new ArrayList<Object>();
		l1.add(std1);
		l1.add(std2);
		Iterator<Object> itr1= l1.listIterator(1);//0 1 2 3 if we give 1 starts display from 1 index
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}
