package in.sataraplasma.db;
import java.io.Serializable;
public class DonorMasterEnt implements Serializable
{
	private static final long serialVersionUID = 1L; 

	private int donorId;
	private String fullName;
	private String bloodGroup;
	private String mobileNumber;
	private String alternateNumber;
	private String mailId;
	private String city;
	private String taluka;
	private String district;
	private String state;
	private String country;
	private String isAlreadyDonated;
	private String markedForDeletion;
	private String positiveDate;
	private int pinCode;
	private String password;

	public int getDonorId()
	{
		return donorId;
	}
	public void setDonorId(int donorId)
	{
		this.donorId = donorId;
	}
	public String getFullName()
	{
		return fullName;
	}
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	public String getBloodGroup()
	{
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup)
	{
		this.bloodGroup = bloodGroup;
	}
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	public String getAlternateNumber()
	{
		return alternateNumber;
	}
	public void setAlternateNumber(String alternateNumber)
	{
		this.alternateNumber = alternateNumber;
	}
	public String getMailId()
	{
		return mailId;
	}
	public void setMailId(String mailId)
	{
		this.mailId = mailId;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getTaluka()
	{
		return taluka;
	}
	public void setTaluka(String taluka)
	{
		this.taluka = taluka;
	}
	public String getDistrict()
	{
		return district;
	}
	public void setDistrict(String district)
	{
		this.district = district;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getIsAlreadyDonated()
	{
		return isAlreadyDonated;
	}
	public void setIsAlreadyDonated(String isAlreadyDonated)
	{
		this.isAlreadyDonated = isAlreadyDonated;
	}
	public String getMarkedForDeletion()
	{
		return markedForDeletion;
	}
	public void setMarkedForDeletion(String markedForDeletion)
	{
		this.markedForDeletion = markedForDeletion;
	}
	public String getPositiveDate()
	{
		return positiveDate;
	}
	public void setPositiveDate(String positiveDate)
	{
		this.positiveDate = positiveDate;
	}
	public int getPinCode()
	{
		return pinCode;
	}
	public void setPinCode(int pinCode)
	{
		this.pinCode = pinCode;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
}