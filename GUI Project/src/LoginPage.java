import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class LoginPage {

	private JFrame frmLoginPage;
	private JTextField username;
	private JPasswordField password;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LoginPage() {
		initialize();
	}

	private void initialize() {
		frmLoginPage = new JFrame();
		frmLoginPage.setTitle("Login Page");
		frmLoginPage.getContentPane().setBackground(new Color(211, 211, 211));
		frmLoginPage.setBounds(100, 100, 843, 528);
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginPage.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(407, 0, 422, 491);
		frmLoginPage.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pne\\Documents\\IMG_0725.JPG"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
		
		JLabel welcomeText = new JLabel("Welcome Back!");
		welcomeText.setFont(new Font("Arial", Font.BOLD, 20));
		welcomeText.setBounds(108, 30, 146, 40);
		frmLoginPage.getContentPane().add(welcomeText);
		
		JLabel usernameText = new JLabel("Username :");
		usernameText.setBackground(new Color(255, 255, 255));
		usernameText.setForeground(new Color(0, 0, 0));
		usernameText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		usernameText.setBounds(10, 132, 124, 29);
		frmLoginPage.getContentPane().add(usernameText);
		
		JLabel passwordText = new JLabel("Password  :");
		passwordText.setForeground(new Color(0, 0, 0));
		passwordText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordText.setBounds(10, 232, 124, 29);
		frmLoginPage.getContentPane().add(passwordText);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setBackground(new Color(128, 128, 128));
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 19));
		loginBtn.setBounds(141, 366, 88, 29);
		frmLoginPage.getContentPane().add(loginBtn);
		
		loginBtn.addActionListener(new ActionListener() {
		
		

				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					String usname = username.getText();
					String psw = password.getText();
					
					
					if (usname.equals("mtp53") && psw.equals("mtp5303")) {
						JOptionPane.showMessageDialog(frmLoginPage, "Login Successful");
						MenuPage mnPage = new MenuPage();
						mnPage.run();
						
					}
					else JOptionPane.showMessageDialog(frmLoginPage,"Invalid username or password!");}
		}
					
				);
		
		
		username = new JTextField();
		username.setBackground(new Color(255, 255, 255));
		username.setFont(new Font("Tahoma", Font.PLAIN, 18));
		username.setBounds(157, 135, 228, 29);
		frmLoginPage.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 18));
		password.setBounds(157, 232, 228, 29);
		frmLoginPage.getContentPane().add(password);
		
		
		
		
		}
}
		


