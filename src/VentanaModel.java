
public class VentanaModel {
VentanaInterface interactor;	
	
	VentanaModel(VentanaInterface interactor){
		this.interactor=interactor;
	}
	
	public void calculateAnything(String any){
		try {
			int a=Integer.parseInt(any);
			double result=Math.pow(a, 3);
			interactor.showResult(Double.toString(result));
			
		} catch (NumberFormatException e) {
			interactor.showResult("Ingrese un numero valido");
		}
		
	
	}

}
