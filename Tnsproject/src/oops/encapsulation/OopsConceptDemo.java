package oops.encapsulation;

public class OopsConceptDemo {
	//var declaration,data members
	private int serialNum;
	private String name;
	private int age;
	
	//get,set method
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;//this reffer a current value
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override//annotation first letter uppercase
	public String toString() {
		return "OopConceptDemo [serial number="+ serialNum +","+"name="+name+", age="+ age +"]"; 
	}
	
}