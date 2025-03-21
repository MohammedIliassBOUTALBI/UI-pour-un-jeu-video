package jeuvideo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Perso  {

	private JFrame f;
	private ImageIcon img;
	private JLabel background ;
	//private JPanel p;
	private JButton start;
	public Perso(){
		
    f = new JFrame("Home Page");
	f.setSize(728, 409);
	
    img = new ImageIcon(this.getClass().getResource("/Background.jpg"));
	background = new JLabel(img);
	background.setSize(728,409);
	f.add(background);
	f.setVisible(true);
	
	/*p = new JPanel();
	f.getContentPane().add(p);
	*/
	/*background.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
	
	JPanel p1 = new JPanel();
	p1.setLayout(new GridLayout(1,2));
	
	p1.add(new JLabel(" Nom                          "));*/
	 start = new JButton("Start");
	 start.setBounds(315,180 , 100, 50);
	 start.setBackground(Color.WHITE);
	 
	//p1.add(nom);
	//p.add(p1);
	background.add(start);
	start.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JFrame f2 = new JFrame("Spécifier les caractéristiques d'un personnage");
			f2.setSize(728, 409);
			f2.setVisible(true);			
			JPanel p = new JPanel();
			f2.getContentPane().add(p);
			//p.setBackground(Color.CYAN);
			
			p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
			
			JPanel p222222 = new JPanel();
			p222222.setLayout(new FlowLayout());
			p222222.add(new JLabel(""));
			
			p.add(p222222);
			
			JPanel p1 = new JPanel();
			p1.setLayout(new GridLayout(1,2));
			
			p1.add(new JLabel("			Nom                          "));
			JTextField nom = new JTextField(20);
			p1.add(nom);
			
			p.add(p1);
			
			JPanel p22 = new JPanel();
			p22.setLayout(new FlowLayout());
			p22.add(new JLabel(""));
			
			p.add(p22);
			
			JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout(1,2));
			p2.add(new JLabel("			Sexe                             "));
			String[] numbers = {"Masculain","Féminin"};
			JList<String> maListe = new JList<>(numbers);
			JComboBox<String> def1 = new JComboBox<>(numbers);
			p2.add(def1);
			
			p.add(p2);
			
			JPanel p222 = new JPanel();
			p222.setLayout(new FlowLayout());
			p222.add(new JLabel(""));
			
			p.add(p222);
			
			JPanel p3 = new JPanel();
			p3.setLayout(new GridLayout(1,2));
			
			p3.add(new JLabel("			Taille                          "));
			JTextField taille = new JTextField(20);
			p3.add(taille);
			
			p.add(p3);
			
			JPanel p2222 = new JPanel();
			p2222.setLayout(new FlowLayout());
			p2222.add(new JLabel(""));
			
			p.add(p2222);
			
			JPanel p4 = new JPanel();
			p4.setLayout(new GridLayout(1,2));
			p4.add(new JLabel("			Couleur de cheveux                             "));
			String[] numbers2 = {"Noire","Maron","Brun","Chatain","Blond"};
			JList<String> maListe2 = new JList<>(numbers2);
			JComboBox<String> def2 = new JComboBox<>(numbers2);
			p4.add(def2);
			
			p.add(p4);
			
			JPanel p22222 = new JPanel();
			p22222.setLayout(new FlowLayout());
			p22222.add(new JLabel(""));
			
			p.add(p22222);
			
			JPanel p5 = new JPanel();
			p5.setLayout(new GridLayout(1,4));
			
			p5.add(new JLabel("			Age                          "));
			JRadioButtonMenuItem rouge = new JRadioButtonMenuItem("0 à 18 ans");
			JRadioButtonMenuItem vert = new JRadioButtonMenuItem("18 à 30 ans");
			JRadioButtonMenuItem vert1 = new JRadioButtonMenuItem("30 à 50 ans");
			p5.add(rouge);
			p5.add(vert);
			p5.add(vert1);
			ButtonGroup groupe = new ButtonGroup();
			groupe.add(rouge);
			groupe.add(vert);
			groupe.add(vert1);
			
			p.add(p5);
			
			JPanel p2222222 = new JPanel();
			p2222222.setLayout(new FlowLayout());
			p2222222.add(new JLabel(""));
			
			p.add(p2222222);
			
			JPanel p11 = new JPanel();
			
			JButton butt1 = new JButton("Quitter");
			JButton butt4 = new JButton("Valider");
			p11.setLayout(new FlowLayout());
			p11.add(butt1);
			p11.add(butt4);
			
			p.add(p11);
			
			butt4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String n2 = nom.getText();
					String n3 = taille.getText();
					
					JOptionPane.showMessageDialog(null,"Le Nom :"+n2+"\n"+"La Taille : "+n3);
					
					
				}
			});
			butt1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane d = new JOptionPane();
					d.showMessageDialog(null, "Vous allez quitter la fenetre", "Quitter", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					
				}
			});
		}
	});
	
	
	
	
	
	
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Perso();
	}

}
