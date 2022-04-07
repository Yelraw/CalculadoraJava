package Visao;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}
	
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(51, 51, 51));
		this.setSize(new Dimension(334, 510));
		getContentPane().setLayout(new MigLayout("", "[][300px:300px:300px,grow]", "[110px:110px,grow][45px:45px][255px:255px,grow][33px:33px]"));
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBackground(new Color(51, 51, 51));
		getContentPane().add(panelLogo, "cell 1 0,grow");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/LogoCal.png")));
		GroupLayout gl_panelLogo = new GroupLayout(panelLogo);
		gl_panelLogo.setHorizontalGroup(
			gl_panelLogo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLogo.createSequentialGroup()
					.addGap(67)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(68, Short.MAX_VALUE))
		);
		gl_panelLogo.setVerticalGroup(
			gl_panelLogo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLogo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(5))
		);
		panelLogo.setLayout(gl_panelLogo);
		
		textField = new JTextField();
		textField.setFont(new Font("Impact", Font.PLAIN, 25));
		textField.setEditable(false);
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.DARK_GRAY);
		getContentPane().add(textField, "cell 1 1,grow");
		textField.setColumns(10);
		
		JPanel panelTeclado = new JPanel();
		panelTeclado.setBackground(new Color(51, 51, 51));
		getContentPane().add(panelTeclado, "cell 1 2,grow");
		
		JButton btnBotao_7 = new JButton("");
		btnBotao_7.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/N7.png")));
		btnBotao_7.setForeground(Color.DARK_GRAY);
		btnBotao_7.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_8 = new JButton("");
		btnBotao_8.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/N8.png")));
		btnBotao_8.setForeground(Color.DARK_GRAY);
		btnBotao_8.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_9 = new JButton("");
		btnBotao_9.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/N9.png")));
		btnBotao_9.setForeground(Color.DARK_GRAY);
		btnBotao_9.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_4 = new JButton("");
		btnBotao_4.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/N4.png")));
		btnBotao_4.setForeground(Color.DARK_GRAY);
		btnBotao_4.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_5 = new JButton("");
		btnBotao_5.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/N5.png")));
		btnBotao_5.setForeground(Color.DARK_GRAY);
		btnBotao_5.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_6 = new JButton("");
		btnBotao_6.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/N6.png")));
		btnBotao_6.setForeground(Color.DARK_GRAY);
		btnBotao_6.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_1 = new JButton("");
		btnBotao_1.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/N1.png")));
		btnBotao_1.setForeground(Color.DARK_GRAY);
		btnBotao_1.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_2 = new JButton("");
		btnBotao_2.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/N2.png")));
		btnBotao_2.setForeground(Color.DARK_GRAY);
		btnBotao_2.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_3 = new JButton("");
		btnBotao_3.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/N3.png")));
		btnBotao_3.setForeground(Color.DARK_GRAY);
		btnBotao_3.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_ponto = new JButton("");
		btnBotao_ponto.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/PONTO.png")));
		btnBotao_ponto.setForeground(Color.DARK_GRAY);
		btnBotao_ponto.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_0 = new JButton("");
		btnBotao_0.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/N0.png")));
		btnBotao_0.setForeground(Color.DARK_GRAY);
		btnBotao_0.setBackground(Color.DARK_GRAY);
		
		JButton btnBotao_igual = new JButton("");
		btnBotao_igual.setIcon(new ImageIcon(Tela.class.getResource("/Imagens/=.png")));
		btnBotao_igual.setForeground(Color.DARK_GRAY);
		btnBotao_igual.setBackground(Color.DARK_GRAY);
		GroupLayout gl_panelTeclado = new GroupLayout(panelTeclado);
		gl_panelTeclado.setHorizontalGroup(
			gl_panelTeclado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTeclado.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_panelTeclado.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelTeclado.createSequentialGroup()
							.addComponent(btnBotao_ponto, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBotao_0, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBotao_igual, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelTeclado.createSequentialGroup()
							.addComponent(btnBotao_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBotao_2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBotao_3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelTeclado.createSequentialGroup()
							.addComponent(btnBotao_4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBotao_5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBotao_6, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelTeclado.createSequentialGroup()
							.addComponent(btnBotao_7, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBotao_8, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBotao_9, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panelTeclado.setVerticalGroup(
			gl_panelTeclado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTeclado.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelTeclado.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBotao_7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBotao_9, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBotao_8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelTeclado.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBotao_4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBotao_5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBotao_6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelTeclado.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBotao_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBotao_2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBotao_3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addGroup(gl_panelTeclado.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnBotao_ponto, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBotao_0, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBotao_igual, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
		);
		panelTeclado.setLayout(gl_panelTeclado);
		
		JButton btnCE = new JButton("CE");
		btnCE.setFont(new Font("Impact", Font.PLAIN, 18));
		btnCE.setForeground(Color.WHITE);
		btnCE.setBorder(null);
		btnCE.setBackground(new Color(204, 0, 0));
		btnCE.setPreferredSize(new Dimension(50, 25));
		getContentPane().add(btnCE, "flowx,cell 1 3");
		
		JButton btn_soma = new JButton("+");
		btn_soma.setPreferredSize(new Dimension(45, 25));
		btn_soma.setForeground(Color.WHITE);
		btn_soma.setFont(new Font("Impact", Font.PLAIN, 18));
		btn_soma.setBorder(null);
		btn_soma.setBackground(Color.DARK_GRAY);
		getContentPane().add(btn_soma, "cell 1 3");
		
		JButton btn_sub = new JButton("-");
		btn_sub.setPreferredSize(new Dimension(45, 25));
		btn_sub.setForeground(Color.WHITE);
		btn_sub.setFont(new Font("Impact", Font.PLAIN, 18));
		btn_sub.setBorder(null);
		btn_sub.setBackground(Color.DARK_GRAY);
		getContentPane().add(btn_sub, "cell 1 3");
		
		JButton btn_multi = new JButton("x");
		btn_multi.setPreferredSize(new Dimension(45, 25));
		btn_multi.setForeground(Color.WHITE);
		btn_multi.setFont(new Font("Impact", Font.PLAIN, 18));
		btn_multi.setBorder(null);
		btn_multi.setBackground(Color.DARK_GRAY);
		getContentPane().add(btn_multi, "cell 1 3");
		
		JButton btn_div = new JButton("\u00F7");
		btn_div.setPreferredSize(new Dimension(45, 25));
		btn_div.setForeground(Color.WHITE);
		btn_div.setFont(new Font("Impact", Font.PLAIN, 18));
		btn_div.setBorder(null);
		btn_div.setBackground(Color.DARK_GRAY);
		getContentPane().add(btn_div, "cell 1 3");
		
		JButton btn_raiz = new JButton("\u221A");
		btn_raiz.setPreferredSize(new Dimension(45, 25));
		btn_raiz.setForeground(Color.WHITE);
		btn_raiz.setFont(new Font("Impact", Font.PLAIN, 18));
		btn_raiz.setBorder(null);
		btn_raiz.setBackground(Color.DARK_GRAY);
		getContentPane().add(btn_raiz, "cell 1 3");
		
		btnBotao_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preenchePainel("0");
			}
		});
		
		btnBotao_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preenchePainel("1");
			}
		});
		
		btnBotao_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preenchePainel("2");
			}
		});
		
		btnBotao_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preenchePainel("3");
			}
		});
		
		btnBotao_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preenchePainel("4");
			}
		});
		
		btnBotao_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preenchePainel("5");
			}
		});
		
		btnBotao_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preenchePainel("6");
			}
		});
		
		btnBotao_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preenchePainel("7");
			}
		});
		
		btnBotao_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preenchePainel("8");
			}
		});
		
		btnBotao_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preenchePainel("9");
			}
		});
		
		btnBotao_ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().isEmpty()){
					if(textField.getText().contains(".")){
						JOptionPane.showMessageDialog(null, "Já existe um ponto no número inserido!");
					}else{
						preenchePainel(".");
					}
				}
			}
		});
		
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaPainel();
			}
		});
		
		btn_soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btn_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btn_raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnBotao_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
	
	public void preenchePainel(String num) {
		String valorCampo = this.textField.getText();
		this.textField.setText(valorCampo + num); 
	}
	
	public void limpaPainel() {
		this.textField.setText("");
	}
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
}
