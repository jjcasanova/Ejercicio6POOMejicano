
public class restaurante {

	private double kpapas=0, kchocos=0;
	
	public restaurante() {
		
	}

	protected void addChocos(double kchocos){
		this.kchocos+=kchocos;
	}
	
	protected void addPapas(double kpapas){
		this.kpapas+=kpapas;
	}
	
	protected int getComensales(){
		int comensales=0;
		for (double p=0,c=0;p<=kpapas && c<=kchocos;p+=0.334,c+=0.167){
			comensales++;
		}
		return comensales;
	}
	
	protected double showChocos(){
		return this.kchocos;
	}
	
	protected double showPapas(){
		return this.kpapas;
	}
}
