package in.sataraplasma.inputEnt;

import java.io.Serializable;

public class LoginInputEnt implements Serializable
{
	private static final long serialVersionUID = 1L; 
	
	private String mailId;
	private String password;
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
