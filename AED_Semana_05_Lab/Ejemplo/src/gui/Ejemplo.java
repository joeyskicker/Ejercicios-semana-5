package gui;

import semana_05.Arreglo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ejemplo extends JFrame implements ActionListener {
	
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
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setTitle("Ejemplo - Semana_05");
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
	
	//  Declaración global
	Arreglo a = new Arreglo();
	
	/** 
     * 	        .----.----.----.----.----.----.----.
     *	n  ==>  | 25 | 27 | 22 | 24 | 29 | 20 | 23 |
     *          '----'----'----'----'----'----'----'
     *            0    1    2    3    4    5    6   
	 */
	
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
		/**
		 * Visualiza los números del arreglo
		 */			
 		txtS.setText("");
 	 	for (int i=0; i<a.tamanio(); i++)
 			imprimir("n[" + i + "] :  " + a.obtener(i));		
	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		/**
		 * Muestra un reporte del arreglo
         */		
    	imprimir();    	
    	imprimir("capacidad máxima del arreglo :  " + a.tamanio());    	
    	imprimir("suma de todos los números :  " + a.sumaNumeros());
    	imprimir("posición del primer número menor a 25 :  " + 
    	         a.posPrimerNumeroMenorA25());
	}
	protected void actionPerformedBtnGenerar(ActionEvent arg0) {
		/**
		 * Remplaza los números actuales por otros aleatorios de 3 cifras
         */		
		a.generar();
		imprimir();
    	imprimir("Los números han sido cambiados. Pulse [Listar]");
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}