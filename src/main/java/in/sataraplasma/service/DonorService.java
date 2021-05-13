package in.sataraplasma.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;



import in.sataraplasma.db.DonorMasterDao;
import in.sataraplasma.db.DonorMasterDaoImpl;
import in.sataraplasma.db.DonorMasterEnt;
import in.sataraplasma.db.utils.ApplicationMessages;
import in.sataraplasma.entity.ResponseEntity;

@Component
public class DonorService {
	
	private final DonorMasterDao dao;
	
	public DonorService() {
		dao = new DonorMasterDaoImpl();
	}

	public ResponseEntity save(DonorMasterEnt inputEnt) {
		// TODO Auto-generated method stub
		DonorMasterEnt ent = dao.save(inputEnt);
		ResponseEntity responseEntity = new ResponseEntity();
		responseEntity.setData(ent);		
		return responseEntity;
	}

	public ResponseEntity getAll() {
		// TODO Auto-generated method stub
		ResponseEntity responseEntity = new ResponseEntity();
		List<DonorMasterEnt> donorList = null;
		donorList = dao.getAllDonorMasterDetails();
		donorList = donorList.stream().filter(p -> p.getMarkedForDeletion().equals("N")).collect(Collectors.toList());
		responseEntity.setData(donorList);
		responseEntity.setMessage(ApplicationMessages.donorDataList);
		responseEntity.setStatus(ApplicationMessages.SUCCESS);
		return responseEntity;
	}

	public ResponseEntity getDonorProfile(String mailId, String password) {
		// TODO Auto-generated method stub
		ResponseEntity responseEntity = new ResponseEntity();
		List<DonorMasterEnt> donorList = null;
		donorList = dao.getAllDonorMasterDetails();
		List<DonorMasterEnt> donorProfile = donorList.stream().filter(p -> p.getMailId().equals(mailId)
																	 && p.getPassword().equals(password)
																	 && p.getMarkedForDeletion().equals("N")
																		)
															  .collect(Collectors.toList());															
		if (donorProfile != null && donorProfile.size() > 0 ) {
			responseEntity.setData(donorProfile);
			responseEntity.setMessage(ApplicationMessages.donorDataList);
			responseEntity.setStatus(ApplicationMessages.SUCCESS);
		}else
		{
			responseEntity.setMessage(ApplicationMessages.donorDataList);
			responseEntity.setStatus(ApplicationMessages.SUCCESS);
		}
		
		return responseEntity;
	}

	public ResponseEntity cancelDonorRegistration(int donorId) {
		// TODO Auto-generated method stub
		DonorMasterEnt ent = new DonorMasterEnt();
		ent.setDonorId(donorId);
		DonorMasterEnt donorEnt = dao.getDonorMasterDetailsByID(ent);
		if (donorEnt != null) {
			donorEnt.setMarkedForDeletion("Y");
			dao.update(donorEnt);
		}
		ResponseEntity responseEntity = new ResponseEntity();
		responseEntity.setMessage(ApplicationMessages.donorDataList);
		responseEntity.setStatus(ApplicationMessages.SUCCESS);
		return responseEntity;
	}

}
