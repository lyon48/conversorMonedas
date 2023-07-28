package conversorMonedas;

public class FunctionTemperatura {
	public double ConvertirTemperatura(double m, int o) {
		switch(o) {
		
		//Celsius
		case 0:
			return m*1.8+32;
		case 1:
			return m*+273.15;
		case 2:
			return (m+273.15)*1.8;
		//Farenheit
		case 3:
			return (m-32)/1.8;
		case 4:
			return (m+459.67)/1.8;
		case 5:
			return m+459.67;
		//Kelvin
		case 6:
			return m-273.15;
		case 7:
			return (9*m)-459.67;
		case 8:
			return (m/1.8)-273.15;
		default:
			return 0;
	}
	}
}
