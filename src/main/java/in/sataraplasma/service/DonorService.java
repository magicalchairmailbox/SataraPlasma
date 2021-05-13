package in.sataraplasma.service;

import java.util.List;

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
		responseEntity.setData(donorList);
		responseEntity.setMessage(ApplicationMessages.courseDataList);
		responseEntity.setStatus(ApplicationMessages.SUCCESS);
		return responseEntity;
	}

}
