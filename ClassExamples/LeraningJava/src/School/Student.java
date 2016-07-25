package School;

import java.util.Scanner;

public class Student 
{
	private static int countStudent=0;
	private String name;
	private String midName;
	private String surname;
	private String specialty;
	private University university;
	private String email;
	private String phoneNum;
	public Student()
	{
		name=null;
		midName=null;
		surname=null;
		specialty=null;
		university=null;
		email=null;
		phoneNum=null;
		countStudent++;
	}
	public Student(University university)
	{
		this.university=university;
	}
	public Student(String name,String surname,University university,String email)
	{
		this.name=name;
		this.surname=surname;
		this.university=university;
		this.email=email;
		countStudent++;
	}
	public Student(String name,University university)
	{
		this.name=name;
		this.university=university;
		countStudent++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMidName() {
		return midName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void showStudent()
	{
		System.out.print("Name "+this.getName()+" Mid name "+this.getMidName()+" Surname "+this.getSurname()+" Specialty "+this.getSpecialty()+" University "+this.getUniversity()+" \nEmail "+this.getEmail()+" Phone number "+this.getPhoneNum()+"\n");
		
	}
	public void writeStudent(Scanner input)
	{
		System.out.print("Set name: ");
		this.setName(input.nextLine());
		System.out.println();
		System.out.print("Set mid name: ");
		this.setMidName(input.nextLine());
		System.out.println();
		System.out.print("Set surname :");
		this.setSurname(input.nextLine());
		System.out.println();
		System.out.print("Set specialty :");
		this.setSpecialty(input.nextLine());
		System.out.println();
		System.out.print("Set email :");
		this.setEmail(input.nextLine());
		System.out.println();
		System.out.print("Set phone number: ");
		this.setPhoneNum(input.nextLine());
		System.out.println();
	}
	
}
