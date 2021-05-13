package in.sataraplasma.inputEnt;

import java.io.Serializable;

public class CancelRegistrationInputEnt implements Serializable
{
	private static final long serialVersionUID = 1L; 
	
	private int donorId;

	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
