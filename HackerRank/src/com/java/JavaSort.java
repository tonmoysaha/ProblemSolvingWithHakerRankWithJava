package com.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList, comparatorCGPA.reversed());
		Collections.sort(studentList, comparatorName);
		Collections.sort(studentList, comparatorId);

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}

	static final Comparator<Student> comparatorCGPA = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return Double.compare(o1.getCgpa(), o2.getCgpa());
		}
	};

	static final Comparator<Student> comparatorName = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			if (o1.getCgpa() == o2.getCgpa()) {
				return o1.getFname().compareTo(o2.getFname());
			}
			return 0;

		}
	};

	static final Comparator<Student> comparatorId = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			if (o1.getFname().equals(o2.getFname())) {
				return Integer.compare(o1.getId(), o2.getId());
			}
			return 0;

		}
	};
}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

}