package in.sataraplasma.db;

import java.util.ArrayList;
public interface DonorMasterDao
{
	public DonorMasterEnt save(DonorMasterEnt ent);

	public DonorMasterEnt update(DonorMasterEnt ent);

	public ArrayList<DonorMasterEnt> getAllDonorMasterDetails();

	public DonorMasterEnt getDonorMasterDetailsByID(DonorMasterEnt ent);
}