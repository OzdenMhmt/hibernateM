package h2_emmeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h1_anotasyonlar.H01_Sehir;

public class H3_SaveFetch {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Ogrenci.class).buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

//		H2_Dersler ders1 = new H2_Dersler("muzik", "matematik");
//
//		H1_Ogrenci ogrenci1 = new H1_Ogrenci(13, "Mehmet Ozden", 1453, ders1);
//
//		s.save(new H1_Ogrenci(13,"Mehmet Ozbay",93,new H2_Dersler("beden","fizik")));
		
		//System.out.println(s.get(H1_Ogrenci.class, 12));
		System.out.println(s.get(H1_Ogrenci.class, 13).getOgrAd());
		
		tx.commit();
		sf.close();
		s.close();
	}

}
