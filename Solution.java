package org.dummy.emp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		while (i < 3) {
			i++;
			//System.out.println("Enter Id: ");
			//int id = Integer.valueOf(bf.readLine());
			System.out.println("Enter Name: ");
			String name = bf.readLine();
			System.out.println("Enter Emailid: ");
			String emailId = bf.readLine();
			System.out.println("Enter Phone Number: ");
			long phone = Long.valueOf(bf.readLine());
			// System.out.println("Enter Gender: ");
			// boolean gender = Boolean.valueOf(bf.readLine());
			Classobject employee = new Classobject( name, emailId, phone);
			System.out.println("Id: " + employee.getId());
			System.out.println("NAME: " + employee.getName());
			System.out.println("EMAILID: " + employee.getEmailId());
			System.out.println("PHONE: " + employee.getPhone());
			// System.out.println("GENDER: " + employee.isGender());
			session.save(employee);
		}
		session.getTransaction().commit();
		session.close();
	}

}
