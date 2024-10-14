package oop.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

  public int id;
  
  public String firstName;
  
  public String lastName;
  
  public Date dob;

  public int getId() {
	return id;
}

  public void setId(int id) {
	this.id = id;
}

  public String getFirstName() {
	return firstName;
}

  public void setFirstName(String firstName) {
	this.firstName = firstName;
}

  public String getLastName() {
	return lastName;
}

  public void setLastName(String lastName) {
	this.lastName = lastName;
}

   public Date getDob() {
	return dob;
}

  public void setDob(Date dob) {
	this.dob = dob;
}
  
   public static void main(String[] args) throws ParseException {
	
	  Person p = new Person();
	  SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
	
	  p.setId(1);
	  p.setFirstName("Neha");
	  p.setLastName("Soni");
	  p.setDob(sdf.parse("2000-03-05"));
	  
	 System.out.println(  p.getId());
	 System.out.println(p.getFirstName());
	 System.out.println(p.getLastName());
	 System.out.println(p.getDob());
   }
	 
	  
	  
}
	
	
	
