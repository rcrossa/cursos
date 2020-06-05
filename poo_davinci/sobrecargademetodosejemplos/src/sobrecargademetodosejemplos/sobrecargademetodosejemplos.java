package sobrecargademetodosejemplos;

public class sobrecargademetodosejemplos {
 
	int store;
	public int store(int sumuno, int sumdos ) {
		return sumdos + sumdos;
		
	}
	public int store(double sumuno, int sumdos ) {
		return sumdos + sumdos;
		
	}
	public int getStore() {
		return store;
	}
	public void setStore(int store) {
		this.store = store;
	}
	
}
