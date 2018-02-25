package hibernate_mapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestOnetoOne_pk {

	

	

		public static void main(String[] args)
		{
			
			
			Student student1 = new Student("Shalan", "B.E.");
			Address address1 = new Address("kalewadi", "pune", "India");
			
			 
			
			Session session1 = Hibernate_Utils.getSessionFactory().openSession();
			
			Transaction transaction1 = session1.beginTransaction();
			
			session1.persist(student1);
		
			
			address1.setAddressId(student1.getStudentId());
			student1.setStudentAddress(address1);
			session1.save(student1);
		
			 
			
			
			transaction1.commit();
			session1.close();
			Hibernate_Utils.closeSessionFactory();
		}

	}
	


