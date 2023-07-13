package mx.com.ComversorMonedas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Panel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import java.awt.Scrollbar;
import java.awt.List;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import java.awt.Choice;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

/**
 * Menu va crear la vnetana principal del programa en donde se podra elegir la opcion a realizar 
 * 
 * @autor AldoRJ
 * @version 1.0
 * 
 */

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * Lanza la aplicaccion y crea una instancia de Menu.
	 * @param fraame
	 * instancia Menu con visibilidad  = true para que la ventana pueda verse
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * Instancia los detalles de la aplicacion de la ventana con tamaño y posicion.
	 */
	public Menu() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 402);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titulo = DefaultComponentFactory.getInstance().createTitle("Menu Conversor");
		Titulo.setFont(new Font("VT323", Font.BOLD, 28));
		Titulo.setBounds(331, 33, 202, 39);
		contentPane.add(Titulo);
		
		Label label = new Label("Elige el tipo de conversor que deseas usar: ");
		label.setFont(new Font("VT323", Font.BOLD, 22));
		label.setBounds(217, 115, 420, 21);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Conversor de Monedas", "Conversor de Tiempo", "Calculo de Perimetro para Figuras"}));
		comboBox.setFont(new Font("VT323", Font.PLAIN, 22));
		comboBox.setToolTipText("");
		comboBox.setBounds(250, 169, 330, 24);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Iniciar ");
		btnNewButton.setFont(new Font("VT323", Font.BOLD, 22));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(190, 282, 126, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cerrar");
		btnNewButton_1.setFont(new Font("VT323", Font.BOLD, 22));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(525, 282, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel label_1 = DefaultComponentFactory.getInstance().createLabel("");
		label_1.setIcon(new ImageIcon(Menu.class.getResource("/mx/com/fuentes/142-1421531_e.png")));
		label_1.setBounds(95, 22, 199, 59);
		contentPane.add(label_1);
	}
}
