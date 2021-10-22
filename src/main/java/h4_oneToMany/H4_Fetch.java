package h4_oneToMany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H4_Fetch {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(H1_Ogrenci.class)
				.addAnnotatedClass(H2_Kitap.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		for (H2_Kitap w : session.get(H1_Ogrenci.class, 111).getKitapListesi()) {
			System.out.println("kitaplar "+w);
}
		
		
		tx.commit();

	}

}
