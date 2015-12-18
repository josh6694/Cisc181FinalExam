package QuestionA;

import java.util.Date;

public interface iPersonReadWrite {
	// all methods that set Values 
	public void setFirstName(String FirstName);
	public void setMiddleName(String MiddleName);
	public void setLastName(String LastName);
	public void setDOB(Date DOB);
	public void setAddress(String newAddress);
	public void setPhone(String newPhone_number);
	public void setEmail(String newEmail);
	public void PrintName();
	public void PrintDOB();
	public int PrintAge();

}
