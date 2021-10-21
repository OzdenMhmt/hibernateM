package h01_anotasyonlar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//Burada tüm importlar hibernate den yapilacak.
public class H02_Save {
	public static void main(String[] args) {
		
		//SQL verilerinin oldugu cfg.xml classina baglandik. Bu sayede SQL e baglanmis olduk ve H_Sehir Classina islem yapacagimizi belirtiyoruz;
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H01_Sehir.class);
		
		//işlem yapacağımız alanlar için (session) için parent alan oluşturduk;
		SessionFactory sf = con.buildSessionFactory(); 
		 
		
		//parent alandan kendimize kücük alanlar actik;
		Session s = sf.openSession(); 
		
		//
		Transaction tx=s.beginTransaction();
		
		
		H01_Sehir sehir1= new H01_Sehir(34, "Istanbul",10000000);
		H01_Sehir sehir2= new H01_Sehir(35, "Izmir",2500000);
		
		s.save(sehir1);
		s.save(sehir2);
		tx.commit();
		
	}
}