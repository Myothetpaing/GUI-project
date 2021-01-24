import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class MenuPage {

	private JFrame frmMenuPage;
	private JTextField textID;
	private JTextField textName;
	private JTextField textEmail;
	private JTextField textPsn;
	private CardLayout card = new CardLayout();
	private JTextField totalNum;
	
	public void run() {
				try {
					MenuPage window = new MenuPage();
					window.frmMenuPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	
	public MenuPage() {
		initialize();
	}
	static boolean isValidEmail(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}

	private void initialize() {
		frmMenuPage = new JFrame();
		frmMenuPage.setTitle("Menu Page");
		frmMenuPage.getContentPane().setBackground(Color.GRAY);
		frmMenuPage.setBounds(100, 100, 843, 528);
		frmMenuPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuPage.getContentPane().setLayout(null);
		
		JPanel parentPanel = new JPanel();
		parentPanel.setBounds(193, 0, 636, 491);
		frmMenuPage.getContentPane().add(parentPanel);
		parentPanel.setLayout(card);
		
		JPanel homePnl = new JPanel();
		homePnl.setBackground(Color.LIGHT_GRAY);
		parentPanel.add(homePnl, "homePnl");
		homePnl.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(128, 42, 379, 82);
		homePnl.add(lblNewLabel);
		
		totalNum = new JTextField();
		totalNum.setForeground(Color.BLACK);
		totalNum.setBackground(Color.LIGHT_GRAY);
		totalNum.setEditable(false);
		totalNum.setText("Total number of employee : 0");
		totalNum.setHorizontalAlignment(SwingConstants.CENTER);
		totalNum.setFont(new Font("Tahoma", Font.BOLD, 19));
		totalNum.setBounds(128, 245, 379, 49);
		homePnl.add(totalNum);
		totalNum.setColumns(10);
		
		JPanel regPnl = new JPanel();
		regPnl.setBackground(Color.LIGHT_GRAY);
		parentPanel.add(regPnl, "regPnl");
		regPnl.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Management System");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2.setBounds(128, 10, 379, 82);
		regPnl.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Employee ID : ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(26, 119, 135, 36);
		regPnl.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Name : ");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(89, 197, 72, 36);
		regPnl.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Email : ");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(92, 275, 69, 36);
		regPnl.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Position : ");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(68, 358, 93, 36);
		regPnl.add(lblNewLabel_4_3);
		
		textID = new JTextField();
		textID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textID.setBounds(190, 119, 256, 36);
		regPnl.add(textID);
		textID.setColumns(10);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textName.setColumns(10);
		textName.setBounds(190, 197, 256, 36);
		regPnl.add(textName);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textEmail.setColumns(10);
		textEmail.setBounds(190, 275, 256, 36);
		regPnl.add(textEmail);
		
		textPsn = new JTextField();
		textPsn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPsn.setColumns(10);
		textPsn.setBounds(190, 358, 256, 36);
		regPnl.add(textPsn);
		
		JPanel disPnl = new JPanel();
		disPnl.setBackground(Color.LIGHT_GRAY);
		parentPanel.add(disPnl, "disPnl");
		disPnl.setLayout(null);

		JTable table = new JTable();
		Object[] columns = {"ID", "Name", "Email", "Position"};
		DefaultTableModel model = new DefaultTableModel();
		
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setBackground(Color.white);
		table.setSelectionBackground(Color.blue);
		table.setGridColor(Color.black);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		
		JScrollPane pane = new JScrollPane(table);
		pane.setForeground(Color.gray);
		pane.setBackground(Color.white);
		pane.setBounds(40, 104, 513, 295);
		disPnl.add(pane);
		
        Object[] rows = new Object[4];
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textName.getText();
				String email = textEmail.getText();
				String psn = textPsn.getText();
				String id = textID.getText();
				
				if (name.equals("")|| email.equals("")|| psn.equals("")||id.equals("")) {
					JOptionPane.showMessageDialog(regPnl, "Input fields cannot be empty!!");
				}else if (!isValidEmail(email)){
					JOptionPane.showMessageDialog(regPnl, "Enter valid Email");
				}else if(Integer.parseInt(id)<=0 ) {
					JOptionPane.showMessageDialog(regPnl, "Enter a valid ID");
				}
				else {
					rows [0] = id;
					rows [1] = name;
					rows [2] = email;
					rows [3] = psn;
					model.addRow(rows);
					JOptionPane.showMessageDialog(regPnl,"Saved successfully");
					
				}
				textName.setText("");
				textID.setText("");
				textEmail.setText("");
				textPsn.setText("");
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSave.setBounds(347, 421, 99, 29);
		regPnl.add(btnSave);
		
				
		JLabel lblNewLabel_3 = new JLabel("Employee Management System");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_3.setBounds(128, 10, 379, 82);
		disPnl.add(lblNewLabel_3);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
				}else {
					JOptionPane.showMessageDialog(frmMenuPage, "Select a row to delete");
				}
				
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnRemove.setBounds(507, 452, 99, 29);
		disPnl.add(btnRemove);
		
		
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(parentPanel, "homePnl");
				totalNum.setText("Total number of employee : "+table.getRowCount());
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHome.setBounds(41, 96, 112, 39);
		frmMenuPage.getContentPane().add(btnHome);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(parentPanel,"regPnl");
				
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRegister.setBounds(41, 220, 112, 39);
		frmMenuPage.getContentPane().add(btnRegister);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(parentPanel, "disPnl");
				
			}
		});
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDisplay.setBounds(41, 342, 112, 39);
		frmMenuPage.getContentPane().add(btnDisplay);
	}
}
