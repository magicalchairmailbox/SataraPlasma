package in.sataraplasma.db;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.sataraplasma.db.utils.HibernateUtils;

import org.hibernate.Query;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("deprecation")
public class DonorMasterDaoImpl implements DonorMasterDao
{
	public DonorMasterEnt save(DonorMasterEnt ent)
	{
		Session session = null;
		Transaction transaction = null;
		try
		{
			session = HibernateUtils.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			DonorMasterDto dto = new DonorMasterDto();
			dto.setFullName(ent.getFullName());
			dto.setBloodGroup(ent.getBloodGroup());
			dto.setMobileNumber(ent.getMobileNumber());
			dto.setAlternateNumber(ent.getAlternateNumber());
			dto.setMailId(ent.getMailId());
			dto.setCity(ent.getCity());
			dto.setTaluka(ent.getTaluka());
			dto.setDistrict(ent.getDistrict());
			dto.setState(ent.getState());
			dto.setCountry(ent.getCountry());
			dto.setIsAlreadyDonated(ent.getIsAlreadyDonated());
			dto.setMarkedForDeletion(ent.getMarkedForDeletion());
			dto.setPositiveDate(ent.getPositiveDate());
			dto.setPinCode(ent.getPinCode());
			dto.setPassword(ent.getPassword());
			session.save(dto);
			transaction.commit();
			ent.setDonorId(dto.getDonorId());
			return ent;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if(transaction != null)
				transaction.rollback();
		}
		finally
		{
			if(session != null)
				session.close();
		}
		return null;
	}
	public DonorMasterEnt update(DonorMasterEnt ent)
	{
		Session session = null;
		Transaction transaction = null;
		try
		{
			session = HibernateUtils.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			DonorMasterDto dto = (DonorMasterDto) session.get(DonorMasterDto.class,ent.getDonorId());
			dto.setFullName(ent.getFullName());
			dto.setBloodGroup(ent.getBloodGroup());
			dto.setMobileNumber(ent.getMobileNumber());
			dto.setAlternateNumber(ent.getAlternateNumber());
			dto.setMailId(ent.getMailId());
			dto.setCity(ent.getCity());
			dto.setTaluka(ent.getTaluka());
			dto.setDistrict(ent.getDistrict());
			dto.setState(ent.getState());
			dto.setCountry(ent.getCountry());
			dto.setIsAlreadyDonated(ent.getIsAlreadyDonated());
			dto.setMarkedForDeletion(ent.getMarkedForDeletion());
			dto.setPositiveDate(ent.getPositiveDate());
			dto.setPinCode(ent.getPinCode());
			dto.setPassword(ent.getPassword());
			session.update(dto);
			transaction.commit();
			return ent;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if(transaction != null)
				transaction.rollback();
		}
		finally
		{
			if(session != null)
				session.close();
		}
		return null;
	}
	public DonorMasterEnt getDonorMasterDetailsByID(DonorMasterEnt ent)
	{
		Session session = null;
		Transaction transaction = null;
		try
		{
			session = HibernateUtils.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			DonorMasterDto dto = (DonorMasterDto) session.get(DonorMasterDto.class,ent.getDonorId());
			ent.setFullName(dto.getFullName());
			ent.setBloodGroup(dto.getBloodGroup());
			ent.setMobileNumber(dto.getMobileNumber());
			ent.setAlternateNumber(dto.getAlternateNumber());
			ent.setMailId(dto.getMailId());
			ent.setCity(dto.getCity());
			ent.setTaluka(dto.getTaluka());
			ent.setDistrict(dto.getDistrict());
			ent.setState(dto.getState());
			ent.setCountry(dto.getCountry());
			ent.setIsAlreadyDonated(dto.getIsAlreadyDonated());
			ent.setMarkedForDeletion(dto.getMarkedForDeletion());
			ent.setPositiveDate(dto.getPositiveDate());
			ent.setPinCode(dto.getPinCode());
			ent.setPassword(dto.getPassword());
			transaction.commit();
			return ent;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if(transaction != null)
				transaction.rollback();
		}
		finally
		{
			if(session != null)
				session.close();
		}
		return null;
	}
	public ArrayList<DonorMasterEnt> getAllDonorMasterDetails()
	{
		ArrayList<DonorMasterEnt> donormasterEntList = new ArrayList<>();
		Session session = null;
		Transaction transaction = null;
		try
		{
			session = HibernateUtils.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			@SuppressWarnings("unchecked")
			Query<DonorMasterDto> query = session.createQuery(" From DonorMasterDto ");
			List<DonorMasterDto> donormasterDtoList = query.list();
			for(DonorMasterDto dto : donormasterDtoList)
			{
				DonorMasterEnt ent = new DonorMasterEnt();
				ent.setDonorId(dto.getDonorId());
				ent.setFullName(dto.getFullName());
				ent.setBloodGroup(dto.getBloodGroup());
				ent.setMobileNumber(dto.getMobileNumber());
				ent.setAlternateNumber(dto.getAlternateNumber());
				ent.setMailId(dto.getMailId());
				ent.setCity(dto.getCity());
				ent.setTaluka(dto.getTaluka());
				ent.setDistrict(dto.getDistrict());
				ent.setState(dto.getState());
				ent.setCountry(dto.getCountry());
				ent.setIsAlreadyDonated(dto.getIsAlreadyDonated());
				ent.setMarkedForDeletion(dto.getMarkedForDeletion());
				ent.setPositiveDate(dto.getPositiveDate());
				ent.setPinCode(dto.getPinCode());
				ent.setPassword(dto.getPassword());
				donormasterEntList.add(ent);
			}
			transaction.commit();
			return donormasterEntList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if(transaction != null)
				transaction.rollback();
		}
		finally
		{
			if(session != null)
				session.close();
		}
		return donormasterEntList;
	}
	
	public static  void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println("hii");
		DonorMasterDaoImpl impl = new  DonorMasterDaoImpl();
		impl.getAllDonorMasterDetails();

	}
}