
public class Radio {
	public double estaciona; 
	public double estacionf; // variables
	public int maxam;
	public int minam;
	public double maxfm;
	public double minfm;
	public int volumen;
	public Radio(){  // constructor
		maxam = 1610; 
		minam = 530;
		minfm = 87.9;
		maxfm = 107.9;
		volumen = 0; 
	}
	public double aestacion(double est,String  emi ){ // aumentar la estación
	if (emi == "A.M"){
		if (est == maxam){
			est = minam;
		}
		else{
		est = est + 4;
		}
	}
	if (emi == "F.M"){
		if (est == maxfm){
			est = minfm;
		}
		else{
		est = est + 0.4;
		}
	}
		return est;
	}
	public double destacion(double est,String  emi ){ // disminuir estación
	if (emi == "A.M"){
		if (est == minam){
			est = maxam;
		}
		else{
		est = est - 4;
		}
	}
	if (emi == "F.M"){
		if (est == minfm){
			est = maxfm;
		}
		else{
		est = est - 0.4;
		}
	}
		return est;
	}
}

	
