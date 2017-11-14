package org.dummy.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="EMPLOYEEE_DETAILS")
public class Classobject {

	public Classobject() {

	}

	public Classobject(String name, String emailId, long phone) {

		//this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		// this.gender = gender;
	}

	@Id
	@GeneratedValue
	@Column(name = "Emp_id")
	private int id;
	@Column(name = "EMP_NAME", length = 150, nullable = true, unique = true)
	private String name;
	@Column(name = "Email_id", length = 100, nullable = true, unique = true)
	private String emailId;
	@Column(name = "Ph_No", length = 12, nullable = false)
	private long phone;
	// private boolean gender;
	@Column(name = "Basic_Salary",length=25)
	private double basicSalary;
	@Column(name = "DA",length=25)
	private float dearnessAllowance;
	@Column(name = "HRA")
	private float houseRentAllowance;
	@Column(name = "PF")
	private float providentFund;
	@Column(name = "TA")
	private float travelAllowance;
	@Transient
	private float netSalary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	/*
	 * public boolean isGender() { return gender; }
	 * 
	 * public void setGender(boolean gender) { this.gender = gender; }
	 */

	/*
	 * public static void main(String args[]) { Classobject employee = new
	 * Classobject(); System.out.println("Object1:"); System.out.println(
	 * "Before setting Values using object1:"); System.out.println("ID: " +
	 * employee.id); System.out.println("NAME: " + employee.name);
	 * System.out.println("EMAIL: " + employee.emailId); System.out.println(
	 * "PHONE: " + employee.phone); System.out.println("GENDER: " +
	 * employee.gender); employee.setId(101); System.out.println("ID: " +
	 * employee.id); employee.setName("Kowss"); System.out.println("NAME: " +
	 * employee.name); employee.setEmailId("ko@gmail.com"); System.out.println(
	 * "EMAIL: " + employee.emailId); employee.setPhone(928437123l);
	 * System.out.println("PHONE: " + employee.phone); employee.setGender(true);
	 * System.out.println("GENDER: " + employee.gender); Classobject employee1 =
	 * new Classobject(); System.out.println("Object2:"); System.out.println(
	 * "Before setting Values using object2:"); System.out.println("ID: " +
	 * employee1.id); System.out.println("NAME: " + employee1.name);
	 * System.out.println("EMAIL: " + employee1.emailId); System.out.println(
	 * "PHONE: " + employee1.phone); System.out.println("GENDER: " +
	 * employee1.gender); employee1.setId(102); System.out.println("ID: " +
	 * employee1.id); employee1.setName("Kav"); System.out.println("NAME: " +
	 * employee1.name); employee1.setEmailId("kaav@gmail.com");
	 * System.out.println("EMAIL: " + employee1.emailId);
	 * employee1.setPhone(88135442); System.out.println("PHONE: " +
	 * employee1.phone); employee1.setGender(true); System.out.println(
	 * "GENDER: " + employee1.gender);
	 * 
	 * }
	 */
};
