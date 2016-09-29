package 抽奖;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.*;
import java.io.*;


public class Lottery extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	
	private RandomNum randomThread = new RandomNum();
	private JTextField textField_3 = new JTextField();
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_4=new JTextField();
	private int Max=0;
	private  int Min=0;
	/*InputStreamReader isr =new InputStreamReader(System.in);
	BufferedReader bfr = new BufferedReader(isr);
	InputStreamReader isr1 =new InputStreamReader(System.in);
	BufferedReader bfr1 = new BufferedReader(isr1);*/

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lottery frame = new Lottery();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lottery() {
		/*try{
		 Max =Integer.parseInt(bfr.readLine());
		  Min =Integer.parseInt(bfr1.readLine());
		}catch(IOException e)
		{
			e.printStackTrace();
		}*/
		
		setResizable(false);
		setTitle("\u62BD\u5956");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u968F\u673A\u62BD\u5956");
		lblNewLabel.setFont(new Font("华文行楷", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField("");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u968F\u673A\u62BD\u5956\u7684\u4E2D\u5956\u53F7\u7801\u662F\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 25));
		
		textField_5 = new JTextField("");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("\u5F00\u59CB");
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(final ActionEvent e)
			{
				do_startButton_actionPerformed(e);
			}
		});
		
		JButton button = new JButton("\u62BD\u5956");
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(final ActionEvent e)
			{
				do_lotteryButton_actionPerformed(e);
			}
		});
		
		JButton button_1 = new JButton("\u9000\u51FA");
		
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(final ActionEvent e)
			{
				do_exitButton_actionPerformed(e);
			}
		});
		
		textField_1 = new JTextField("");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField("");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		textField_3.setColumns(10);
		
		lblNewLabel_2 = new JLabel("\u53D6\u503C\u8303\u56F4\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 25));
		
		lblNewLabel_3 = new JLabel("\uFF1A");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		textField_4.setColumns(10);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(4)
												.addComponent(lblNewLabel_2)
												.addGap(18)
												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(29)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addGap(25)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(32)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addGap(80)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(17)
										.addComponent(textField_5, 121, 121, 121))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(55)
										.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(52)
											.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel_3)
											.addGap(18)
											.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(19)))
							.addGap(93))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3))
							.addGap(104)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(56)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton)
								.addComponent(button)
								.addComponent(button_1))
							.addGap(35))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(124)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(216, Short.MAX_VALUE))))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	class RandomNum extends Thread{
	
		
		private boolean stop = false;
		public void run()
		{
			while(!stop)
			{
				Max = Integer.parseInt(textField_4.getText());
				Min = Integer.parseInt(textField_3.getText());
				final int  num1;
				final int num2;
				 if(Min>=0&&Max<=999)
				 {
					 if(Min>=0&&Max<=9)
					 {
						 try{
								Thread.sleep(1);
								}catch(InterruptedException e){
									e.printStackTrace();						
								}
								 num2 =(int)(Math.random()*10);   //生成随机数
								EventQueue.invokeLater(new Runnable(){
									public void run()
									{
										textField_2.setText(num2+"");
									}
								});
					 }
					 else if(Max>9&&Max<=99)
					 {
						 try{
								Thread.sleep(1);
								}catch(InterruptedException e){
									e.printStackTrace();						
								}
							 num1 =(int)(Math.random() * 10 % (Max/10+1));   //生成随机数
								EventQueue.invokeLater(new Runnable(){
									public void run()
									{
										textField_1.setText(num1+"");
									}
								});
								
								try{
									Thread.sleep(1);
									}catch(InterruptedException e){
										e.printStackTrace();						
									}
								    if(num1==(Max/10))
								    {
								   num2 =(int)(Math.random()*10%(Max%10+1));
								    
								    }else{
								   num2 =(int)(Math.random()*10);   //生成随机数
								    }
									EventQueue.invokeLater(new Runnable(){
										public void run()
										{
											textField_2.setText(num2+"");
										}
									});
					 }
					 else{
					
						
					try{
					Thread.sleep(1);
					}catch(InterruptedException e){
						e.printStackTrace();						
					}
				    final int num =(int)(Math.random()*10%(Max/100+1));   //生成随机数
				   
					EventQueue.invokeLater(new Runnable(){
						public void run()
						{
							textField.setText(num+"");
						}
					});
					
					try{
						Thread.sleep(1);
						}catch(InterruptedException e){
							e.printStackTrace();						
						}
					 if(num == Max/100)
					    {
					    	num1 = (int)(Math.random()*10%((Max%100)/10+1));
					    }
					 else{
					       num1 =(int)(Math.random()*10);   //生成随机数
					     }
						EventQueue.invokeLater(new Runnable(){
							public void run()
							{
								textField_1.setText(num1+"");
							}
						});
						
						try{
							Thread.sleep(1);
							}catch(InterruptedException e){
								e.printStackTrace();						
							}
						if(num==Max/100&& num1==Max%100/10)
						{
							num2 = (int)(Math.random()*10%(Max%100%10+1)); 
						}
						else
						{
						    num2 =(int)(Math.random()*10);   //生成随机数
						}
							
						EventQueue.invokeLater(new Runnable(){
								public void run()
								{
									textField_2.setText(num2+"");
								}
							});
					 }
								
						/*		try{
									Thread.sleep(1);
									}catch(InterruptedException e){
										e.printStackTrace();						
									}*/
				 }
				
			}
		}
		public void stopLottery()
		{
			this.stop = true;
		}
	}
	protected void do_startButton_actionPerformed(final ActionEvent e)
	{
		textField_5.setText("");
		if(randomThread != null)
		{
			randomThread.stopLottery();
		}
		randomThread = new RandomNum();
		randomThread.start();
	}
	protected void do_lotteryButton_actionPerformed(final ActionEvent e)
	{
		if(randomThread != null)
		{
			randomThread.stopLottery();
		}
		try{
			randomThread.join();
			
		}catch(InterruptedException e1)
		{
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable(){
			public void run()
			{
				String code ="";
				code+=textField.getText();
				code+=textField_1.getText();
				code+=textField_2.getText();
				textField_5.setText(code);
			}
		});
	}
	protected void do_exitButton_actionPerformed(final ActionEvent e)
	{
		System.exit(0);
	}
}
