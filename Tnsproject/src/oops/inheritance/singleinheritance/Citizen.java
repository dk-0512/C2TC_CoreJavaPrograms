package oops.inheritance.singleinheritance;

public class Citizen {
	private String name; 
    private String aadharno;
    private String aadress;
    private long phone;
    
    public Citizen() {
    	System.out.println("citizen object created");
    }
    public Citizen(String name,String aadharno,String aadress,long phone) {
    	this.name=name;
    	this.aadharno=aadharno;
    	this.aadress=aadress;
    	this.phone=phone;
    }
    //getter,setter
    public String getname() {
    	return name;
    }
    public void setname(String name) {
    	this.name=name;
    }
    public String getaadharno() {
    	return aadharno;
    }
    public void setaadharno(String aadharno) {
    	this.aadharno=aadharno;
    }
    public String getaadress() {
    	return aadress;
    }
    public void setaadrass(String aadress) {
    	this.aadress=aadress;
    }
    public long getphone() {
    	return phone;
    }
    public void setphone(long phone) {
    	this.phone=phone;
    }
	@Override
	public String toString() {
		return "citizen[name="+name+",aadharno="+aadharno+",aadress="+aadress+"phone="+phone+"]";
		
	}
}
