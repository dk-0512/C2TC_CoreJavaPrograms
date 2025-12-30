package oops.inheritance.singleinheritance;

public class Student extends Citizen{
     private int rollno;
     private String collegeName;
     public Student() {
    	super(); 
     }
     public Student(String name,String aadharno,String aadress,long phone,int rollno,String collegeName) {
    	 super(name,aadharno,aadress,phone);
    	 this.rollno=rollno;
    	 this.collegeName=collegeName;
     }
	 public int getRollno() {
		 return rollno;
	 }
	 public void setRollno(int rollno) {
		 this.rollno = rollno;
	 }
	 public String getCollegeName() {
		 return collegeName;
	 }
	 public void setCollegeName(String collegeName) {
		 this.collegeName = collegeName;
	 }
     @Override
     public String toString() {
    	 return"student[rollno="+rollno+",collegeName="+collegeName+",name="+getname()+",aadharno="+getaadharno()+",aadress="+getaadress()+",phone="+getphone()+"]";
     }
    	 
     
}
 