package h2_emmeddable;

import javax.persistence.Embeddable;

@Embeddable
public class H2_Dersler {


		private String secmeli;
		private String zorunlu;
		public H2_Dersler(String secmeli, String zorunlu) {
			super();
			this.secmeli = secmeli;
			this.zorunlu = zorunlu;
		}
		public H2_Dersler() {
			super();
		}
		@Override
		public String toString() {
			return "H2_Dersler [secmeli=" + secmeli + ", zorunlu=" + zorunlu + "]";
		}
		public String getSecmeli() {
			return secmeli;
		}
		public void setSecmeli(String secmeli) {
			this.secmeli = secmeli;
		}
		public String getZorunlu() {
			return zorunlu;
		}
		public void setZorunlu(String zorunlu) {
			this.zorunlu = zorunlu;
		}
		

	}
	

