package paquetecuentas;

public class Cuentas {
	private double saldo;

	public String toString() {
		return ("ToString: " + obtener());
	}

	public double validasaldo() {

		if (saldo > 0.0) {
			saldo = saldo;
		}
		return saldo;
	}

	public double abonar(double monto) {
		saldo = saldo + monto;
		return saldo;
	}

	public double obtener() {

		return (saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
