package conversorMonedas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class VentanaHome extends JFrame{
	private JButton monedas;
	private JButton temperatura;
	
	public VentanaHome() {
		super("Conversor");
		setSize(400,300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		
		//Botones
		monedas = new JButton("Conversor de Monedas");
		temperatura = new JButton("Conversor de Temperatura");
		
		monedas.setBounds(100,50,200,40);
		temperatura.setBounds(100,150,200,40);
		
		monedas.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				VentanaMonedas vm = new VentanaMonedas();
				dispose();
			}
			
		});
		
		temperatura.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				VentanaTemperatura vt = new VentanaTemperatura();
				dispose();
			}
			
		});
		
		
		add(monedas);
		add(temperatura);
		
	}
}
