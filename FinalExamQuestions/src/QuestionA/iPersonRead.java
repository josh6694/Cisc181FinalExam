package QuestionA;

import java.util.Date;

public interface iPersonRead {
	/// all methods that get values 
	public String getFirstName();
	public String getMiddleName();
	public String getLastName();
	public Date getDOB();
	public String getAddress();
	public String getPhone();
	public String getEmail();
	public void PrintName();
	public void PrintDOB();
	public int PrintAge();

}
