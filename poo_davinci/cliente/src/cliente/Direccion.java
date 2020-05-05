package cliente;

public class Direccion {
        public String address;
        public  int numero;
		public String getaddress() {
			return address;
		}
		public void setaddress(String address) {
			this.address = address;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public String toString () {
			return "Calle :" + address + "Numero: " + numero;
		}
}
