package atm;

import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class execution {
	public void successView(int id) throws SQLException {
		home home = new home();
		Commons commons = new Commons();
		JFrame frame =(JFrame) commons.Frame();
		JLabel sucss = new JLabel("TRANSACTION SUCCESS.");
		sucss.setBounds(0, 280, 600, 50);
		sucss.setHorizontalAlignment(JLabel.CENTER);
		sucss.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(sucss);
		atm.home homeome;
		homeome.homeView(id);
		frame.setVisible(true);
	}
	
	public void detailView(String num, String pin) {
		Commons commons = new Commons();
		JFrame frame =(JFrame) commons.Frame();
		JLabel sucss = new JLabel("REMEMBER THE DETAILS!!!");
		sucss.setBounds(0, 200, 600, 50);
		sucss.setHorizontalAlignment(JLabel.CENTER);
		sucss.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(sucss);
		JTextField number = new JTextField("CARD NUMBER : " + num);
		number.setBounds(0, 300, 600, 50);
		number.setEditable(false);
		number.setHorizontalAlignment(JLabel.CENTER);
		number.setFont(new Font("Rockwell", Font.BOLD, 20));
		frame.add(number);
		JTextField pinno = new JTextField("DEFAULT PIN : " + pin);
		pinno.setBounds(0, 400, 600, 50);
		pinno.setHorizontalAlignment(JLabel.CENTER);
		pinno.setEditable(false);
		pinno.setFont(new Font("Rockwell", Font.BOLD, 20));
		frame.add(pinno);
		frame.setVisible(true);
	}
}