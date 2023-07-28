package conversorMonedas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class VentanaMonedas extends JFrame{
	private JButton regresar;
	private JButton convertir;
	private JTextField texto1, texto2; //Input para convertir y convertido
	private JLabel l1, l2,l3; //Etiquetas
	private String opcion[] = {"De Pesos a Dólar","De Dólar a Pesos","De Pesos a Euros","De Euros a Pesos","De Pesos a Libras Esterlinas","De Libras Esterlinas a Pesos"
			,"De Pesos a Yen Japonés","De Yen Japonés a Pesos","De Pesos a Won sul-coreano","De Won sul-coreano a Pesos"};
	private JComboBox select;
	private function monedas = new function();
	
	
	public VentanaMonedas() {
		super("Conversor de Monedas");
		setSize(400,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		
		//Botones
		regresar = new JButton("Regresar");
		convertir = new JButton("Convertir");
		
		regresar.setBounds(60,300,100,40);
		convertir.setBounds(180,300,100,40);
		
		//Etiquetas
				l1 = new JLabel("Elija la moneda a la que desea convertir");
				l2 = new JLabel("Ingrese la cantidad que desea convertir");
				l3 = new JLabel("La cantidad es");
				
				l1.setBounds(50,50,300,30);
				l2.setBounds(50,110,300,30);
				l3.setBounds(50,170,250,30);
				
				texto1 = new JTextField();
				texto1.setBounds(50,140,250,30);
				texto2 = new JTextField();
				texto2.setBounds(50,200,250,30);
				
				//Opciones
				select = new JComboBox(opcion);
				select.setBounds(50,80,250,30);
				
				int a = select.getSelectedIndex();
				String data = opcion[a];
				
				
		regresar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				VentanaHome vh = new VentanaHome();
				dispose();
			}
			
		});
		
		convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String miInput = texto1.getText();

				double conv = Double.parseDouble(miInput);
				int comb = select.getSelectedIndex();
				DecimalFormat format = new DecimalFormat("#.00");
				
				
				
				texto2.setText(String.valueOf(
						format.format(monedas.ConvertirMonedas(conv,comb))
						
						));
			}
		});
		
		
		
		
		add(regresar);
		add(convertir);
		add(l1);
		add(l2);
		add(l3);
		add(texto1);
		add(texto2);
		add(select);
		
		
	}
}
