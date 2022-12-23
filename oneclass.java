package Pr1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.SystemColor;
import java.awt.Panel;

public class oneclass extends JFrame {

	private JFrame frame;
	private JTextField txtPlace;
	private JTextField txtSchedule;
	private JTextField txtCost;
	private final JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oneclass window = new oneclass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public oneclass() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Team Project");
		frame.setBounds(100, 100, 500, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JPanel titlePage = new JPanel();
		titlePage.setBackground(Color.LIGHT_GRAY);
		titlePage.setBounds(0, 0, 494, 571);
		frame.getContentPane().add(titlePage);
		titlePage.setLayout(null);
		
		JLabel titleLabel = new JLabel("PC Security Check Program");
		titleLabel.setBackground(Color.WHITE);
		titleLabel.setForeground(Color.BLACK);
		titleLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		titleLabel.setBounds(85, 120, 347, 74);
		titlePage.add(titleLabel);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 494, 571);
		titlePage.add(panel);
		
		JButton btnnext = new JButton("\uBA54\uB274 \uC124\uC815");
		btnnext.setBackground(Color.PINK);
		btnnext.setFont(new Font("굴림", Font.PLAIN, 18));
		btnnext.setBounds(321, 449, 136, 38);
		titlePage.add(btnnext);
		
			
			
			
		
			final JPanel startPage = new JPanel();
			startPage.setBackground(Color.WHITE);
			startPage.setBounds(0, 0, 494, 571);
			frame.getContentPane().add(startPage);
			startPage.setLayout(null);
			startPage.setVisible(false);
			
			JButton Menu6_Delete = new JButton("Delete");
			Menu6_Delete.setBounds(357, 464, 95, 23);
			startPage.add(Menu6_Delete);
			
			JButton Menu5_Delete = new JButton("Delete");
			Menu5_Delete.setBounds(135, 464, 95, 23);
			startPage.add(Menu5_Delete);
			
			JButton Menu4_Delete = new JButton("Delete");
			Menu4_Delete.setBounds(357, 313, 95, 23);
			startPage.add(Menu4_Delete);
			
			JButton Menu3_Delete = new JButton("Delete");
			Menu3_Delete.setBounds(135, 313, 95, 23);
			startPage.add(Menu3_Delete);
			
			JButton Menu2_Delete = new JButton("Delete");
			Menu2_Delete.setBounds(357, 158, 95, 23);
			startPage.add(Menu2_Delete);
			
			JButton Menu1_Delete = new JButton("Delete");
			Menu1_Delete.setBounds(135, 158, 95, 23);
			startPage.add(Menu1_Delete);
			
			JButton btnMenu5 = new JButton("Menu5");
			btnMenu5.setBounds(30, 357, 200, 130);
			startPage.add(btnMenu5);
			
			JButton btnMenu2 = new JButton("Menu2");
			btnMenu2.setBounds(252, 51, 200, 130);
			startPage.add(btnMenu2);
			
			JButton btnMenu4 = new JButton("Menu4");
			btnMenu4.setBounds(252, 206, 200, 130);
			startPage.add(btnMenu4);
			
			JButton btnMenu3 = new JButton("Menu3");
			btnMenu3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnMenu3.setBounds(30, 206, 200, 130);
			startPage.add(btnMenu3);
			
			JButton btnMenu6 = new JButton("Menu6");
			btnMenu6.setBounds(252, 357, 200, 130);
			startPage.add(btnMenu6);
			
			JButton btnMenu1 = new JButton("Menu1");
			btnMenu1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnMenu1.setBounds(30, 51, 200, 130);
			startPage.add(btnMenu1);
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					startPage.setVisible(false);
				    titlePage.setVisible(true);
				}
			});
			btnNewButton.setBounds(351, 502, 101, 38);
			startPage.add(btnNewButton);
			
			JMenuBar menuBar_1 = new JMenuBar();
			menuBar_1.setBounds(0, 0, 486, 23);
			startPage.add(menuBar_1);
			
			JMenu mnNewMenu = new JMenu("Menu Select");
			menuBar_1.add(mnNewMenu);
			
			JMenu MenuSelect_Menu1 = new JMenu("Menu1");
			mnNewMenu.add(MenuSelect_Menu1);
			
			JMenu MenuSelect_Menu2 = new JMenu("Menu2");
			mnNewMenu.add(MenuSelect_Menu2);
			
			JMenu MenuSelect_Menu3 = new JMenu("Menu3");
			mnNewMenu.add(MenuSelect_Menu3);
			
			JMenu MenuSelect_Menu4 = new JMenu("Menu4");
			mnNewMenu.add(MenuSelect_Menu4);
			
			JMenu MenuSelect_Menu5 = new JMenu("Menu5");
			mnNewMenu.add(MenuSelect_Menu5);
			
			JMenu MenuSelect_Menu6 = new JMenu("Menu6");
			mnNewMenu.add(MenuSelect_Menu6);
			
			JButton btnNewButton_1 = new JButton("운영체제 업데이트 확인");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String os = System.getProperty("os.name").toLowerCase();		
					
					if(os.contains("win")) {
						System.out.println("os : " + "Windows");			
					}
					else if(os.contains("mac")) {
						System.out.println("os : " + "Mac");			
					}
					else if(os.contains("uix")) {
						System.out.println("os : " + "Unix");			
					}
					else if(os.contains("linux")) {
						System.out.println("os : " + "Linux");			
					}
					else {
						System.out.println("os : " + "None");			
					}
				}
				
		
				
				
				
			});
			
			JButton btnNewButton_2 = new JButton("패스워드 설정 확인");
			btnNewButton_2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					
				}
				
			});
			
			
			MenuSelect_Menu1.add(btnNewButton_1);
			
			JButton btnNewButton_21 = new JButton("패스워드 설정 확인");
			MenuSelect_Menu1.add(btnNewButton_21);
			
			JButton btnNewButton_3 = new JButton("활성화된 계정 확인");
			MenuSelect_Menu1.add(btnNewButton_3);
			
			JButton btnNewButton_4 = new JButton("원격 PC 확인");
			MenuSelect_Menu1.add(btnNewButton_4);
			
			JButton btnNewButton_5 = new JButton("미사용 ActiveX 확인");
			MenuSelect_Menu1.add(btnNewButton_5);
			
			JButton btnNewButton_6 = new JButton("방화벽 설정 확인");
			MenuSelect_Menu1.add(btnNewButton_6);
			
			JButton btnNewButton_7 = new JButton("시작 프로그램 점검");
			MenuSelect_Menu1.add(btnNewButton_7);
			
			JButton btnNewButton_8 = new JButton("화면 보호기 설정 확인");
			MenuSelect_Menu1.add(btnNewButton_8);
			
			JButton btnNewButton_9 = new JButton("공유 폴더 확인");
			MenuSelect_Menu1.add(btnNewButton_9);
			
			JButton btnNewButton_10 = new JButton("백신 설치 확인");
			MenuSelect_Menu1.add(btnNewButton_10);
			
			MenuSelect_Menu2.add(btnNewButton_1);
			
			JButton btnNewButton_11 = new JButton("패스워드 설정 확인");
			MenuSelect_Menu2.add(btnNewButton_11);
			
			JButton btnNewButton_12 = new JButton("활성화된 계정 확인");
			MenuSelect_Menu2.add(btnNewButton_12);
			
			JButton btnNewButton_13 = new JButton("원격 PC 확인");
			MenuSelect_Menu2.add(btnNewButton_13);
			
			JButton btnNewButton_14 = new JButton("미사용 ActiveX 확인");
			MenuSelect_Menu2.add(btnNewButton_14);
			
			JButton btnNewButton_15 = new JButton("방화벽 설정 확인");
			MenuSelect_Menu2.add(btnNewButton_15);
			
			JButton btnNewButton_16 = new JButton("시작 프로그램 점검");
			MenuSelect_Menu2.add(btnNewButton_16);
			
			JButton btnNewButton_17 = new JButton("화면 보호기 설정 확인");
			MenuSelect_Menu2.add(btnNewButton_17);
			
			JButton btnNewButton_18 = new JButton("공유 폴더 확인");
			MenuSelect_Menu2.add(btnNewButton_18);
			
			JButton btnNewButton_19 = new JButton("백신 설치 확인");
			MenuSelect_Menu2.add(btnNewButton_19);
			
			MenuSelect_Menu3.add(btnNewButton_1);
			
			JButton btnNewButton_20 = new JButton("패스워드 설정 확인");
			MenuSelect_Menu3.add(btnNewButton_20);
			
			JButton btnNewButton_211 = new JButton("활성화된 계정 확인");
			MenuSelect_Menu3.add(btnNewButton_211);
			
			JButton btnNewButton_22 = new JButton("원격 PC 확인");
			MenuSelect_Menu3.add(btnNewButton_22);
			
			JButton btnNewButton_23 = new JButton("미사용 ActiveX 확인");
			MenuSelect_Menu3.add(btnNewButton_23);
			
			JButton btnNewButton_24 = new JButton("방화벽 설정 확인");
			MenuSelect_Menu3.add(btnNewButton_24);
			
			JButton btnNewButton_25 = new JButton("시작 프로그램 점검");
			MenuSelect_Menu3.add(btnNewButton_25);
			
			JButton btnNewButton_26 = new JButton("화면 보호기 설정 확인");
			MenuSelect_Menu3.add(btnNewButton_26);
			
			JButton btnNewButton_27 = new JButton("공유 폴더 확인");
			MenuSelect_Menu3.add(btnNewButton_27);
			
			JButton btnNewButton_28 = new JButton("백신 설치 확인");
			MenuSelect_Menu3.add(btnNewButton_28);
			
			MenuSelect_Menu4.add(btnNewButton_1);
			
			JButton btnNewButton_29 = new JButton("패스워드 설정 확인");
			MenuSelect_Menu4.add(btnNewButton_29);
			
			JButton btnNewButton_30 = new JButton("활성화된 계정 확인");
			MenuSelect_Menu4.add(btnNewButton_30);
			
			JButton btnNewButton_31 = new JButton("원격 PC 확인");
			MenuSelect_Menu4.add(btnNewButton_31);
			
			JButton btnNewButton_32 = new JButton("미사용 ActiveX 확인");
			MenuSelect_Menu4.add(btnNewButton_32);
			
			JButton btnNewButton_33 = new JButton("방화벽 설정 확인");
			MenuSelect_Menu4.add(btnNewButton_33);
			
			JButton btnNewButton_34 = new JButton("시작 프로그램 점검");
			MenuSelect_Menu4.add(btnNewButton_34);
			
			JButton btnNewButton_35 = new JButton("화면 보호기 설정 확인");
			MenuSelect_Menu4.add(btnNewButton_35);
			
			JButton btnNewButton_36 = new JButton("공유 폴더 확인");
			MenuSelect_Menu4.add(btnNewButton_36);
			
			JButton btnNewButton_37 = new JButton("백신 설치 확인");
			MenuSelect_Menu4.add(btnNewButton_37);
			
			MenuSelect_Menu5.add(btnNewButton_1);
			
			JButton btnNewButton_38 = new JButton("패스워드 설정 확인");
			MenuSelect_Menu5.add(btnNewButton_38);
			
			JButton btnNewButton_39 = new JButton("활성화된 계정 확인");
			MenuSelect_Menu5.add(btnNewButton_39);
			
			JButton btnNewButton_40 = new JButton("원격 PC 확인");
			MenuSelect_Menu5.add(btnNewButton_40);
			
			JButton btnNewButton_41 = new JButton("미사용 ActiveX 확인");
			MenuSelect_Menu5.add(btnNewButton_41);
			
			JButton btnNewButton_42 = new JButton("방화벽 설정 확인");
			MenuSelect_Menu5.add(btnNewButton_42);
			
			JButton btnNewButton_43 = new JButton("시작 프로그램 점검");
			MenuSelect_Menu5.add(btnNewButton_43);
			
			JButton btnNewButton_44 = new JButton("화면 보호기 설정 확인");
			MenuSelect_Menu5.add(btnNewButton_44);
			
			JButton btnNewButton_45 = new JButton("공유 폴더 확인");
			MenuSelect_Menu5.add(btnNewButton_45);
			
			JButton btnNewButton_46 = new JButton("백신 설치 확인");
			MenuSelect_Menu5.add(btnNewButton_46);
			
			MenuSelect_Menu6.add(btnNewButton_1);
			
			JButton btnNewButton_47 = new JButton("패스워드 설정 확인");
			MenuSelect_Menu6.add(btnNewButton_47);
			
			JButton btnNewButton_48 = new JButton("활성화된 계정 확인");
			MenuSelect_Menu6.add(btnNewButton_48);
			
			JButton btnNewButton_49 = new JButton("원격 PC 확인");
			MenuSelect_Menu6.add(btnNewButton_49);
			
			JButton btnNewButton_50 = new JButton("미사용 ActiveX 확인");
			MenuSelect_Menu6.add(btnNewButton_50);
			
			JButton btnNewButton_51 = new JButton("방화벽 설정 확인");
			MenuSelect_Menu6.add(btnNewButton_51);
			
			JButton btnNewButton_52 = new JButton("시작 프로그램 점검");
			MenuSelect_Menu6.add(btnNewButton_52);
			
			JButton btnNewButton_53 = new JButton("화면 보호기 설정 확인");
			MenuSelect_Menu6.add(btnNewButton_53);
			
			JButton btnNewButton_54 = new JButton("공유 폴더 확인");
			MenuSelect_Menu6.add(btnNewButton_54);
			
			JButton btnNewButton_55 = new JButton("백신 설치 확인");
			MenuSelect_Menu6.add(btnNewButton_55);
			
			JMenu mnNewMenu_1 = new JMenu("Bookmark");
			menuBar_1.add(mnNewMenu_1);
			
			JMenu mnNewMenu_2 = new JMenu("Set");
			menuBar_1.add(mnNewMenu_2);
		
		btnnext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				startPage.setVisible(true);
			    titlePage.setVisible(false);
				
			}
			
		});
	}
}
