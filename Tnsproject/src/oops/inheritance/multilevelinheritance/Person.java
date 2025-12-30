package oops.inheritance.multilevelinheritance;

import java.util.Date;

public class Person {
     private String name;
     private long contactNo;
     private Date dateOfBirth;
     //constructor
     public Person(String name,long contactNo,Date DateOfBirth) {
    	 super();
    	 this.name=name;
    	 this.contactNo=contactNo;
    	 this.dateOfBirth=DateOfBirth;
     }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public long getContactNo() {
		 return contactNo;
	 }
	 public void setContactNo(long contactNo) {
		 this.contactNo = contactNo;
	 }
	 public Date getDateOfBirth() {
		 return dateOfBirth;
	 }
	 public void setDateOfBirth(Date dateOfBirth) {
		 this.dateOfBirth = dateOfBirth;
	 }
     public Person() {
    	 
     }
     @Override
     public String toString() {
    	 return "Person [name=" + name + ", conatctNo=" + contactNo + ", dateOfBirth=" + dateOfBirth + "]";
 	 
     }
}
