package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_05.ArregloSueldos;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_5_2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnReportar;
	private JButton btnGenerar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_5_2 frame = new Problema_5_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_5_2() {
		setTitle("Problema_5_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(71, 11, 89, 23);
		contentPane.add(btnListar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(171, 11, 89, 23);
		contentPane.add(btnReportar);
		
		btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(this);
		btnGenerar.setBounds(271, 11, 89, 23);
		contentPane.add(btnGenerar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 414, 406);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	

	ArregloSueldos as = new ArregloSueldos();
	
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGenerar) {
			actionPerformedBtnGenerar(arg0);
		}
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
	
 		txtS.setText("");
 	 	for (int i=0; i<as.tamanio(); i++){
 			imprimir("n[" + i + "] :  " + decimalFormat(as.obtener(i)));
 	 	}
	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
	
		imprimir();    	
    	imprimir("Tamaño total del arreglo        :  " + as.tamanio());    	
    	imprimir("Promedio de todos los sueldos     :  " + decimalFormat(as.sueldoPromedio()));
    	imprimir("Sueldo mayor                      :  " + decimalFormat(as.sueldoMayor()));
    	imprimir("Sueldo menor                      :  " + decimalFormat(as.sueldoMenor()));
    	imprimir("Cantidad mayores al promedio      :  " + as.cantMayoresSueldoPromedio());
    	imprimir("Cantidad menores al promedio      :  " + as.cantMenoresSueldoPromedio());
    	imprimir("Posición del segundo mayor 850  :  " + as.posSegundoSueldoMayorAlMinimo());
    	imprimir("Posición del último mayor 850 :  " + as.posUltimoSueldoMenorAlMinimo());
	}
	protected void actionPerformedBtnGenerar(ActionEvent arg0) {
		/**
		 * Remplaza los números actuales por otros aleatorios 
         */		
		as.generarSueldos();
		imprimir();
    	imprimir("Los números han sido cambiados.");
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	String decimalFormat(double p){
		return String.format("%.2f",p);
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}
