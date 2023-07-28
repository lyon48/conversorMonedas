package conversorMonedas;

public class function {
	
	public double ConvertirMonedas(double m, int c) {
		switch(c) {
			case 0:
				return m/16.84;
			case 1:
				return m*16.84;
			case 2:
				return m/18.51;
			case 3:
				return m*18.51;
			case 4:
				return m*0.046;
			case 5:
				return m/0.046;
			case 6:
				return m*0.12;
			case 7:
				return m/0.12;
			case 8:
				return m*76.16;
			case 9: 
				return m/76.16;
			default:
				return 0;
		}
	}
}
