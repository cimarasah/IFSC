import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Chat extends JFrame {
	JButton btnParceiro = new JButton("Conectar");
	JTextField textParceiro = new JTextField();
	JTextField textMsg = new JTextField();
	JButton btnEviar = new JButton("Enviar");
	Sender send;
	Thread rec;
	public static void main(String[] args) {


		Chat chat = new Chat();

		//		Scanner sc = new Scanner(System.in); 
		//		System.out.println("Digite o IP do parceiro:");
		//		String texto = sc.next(); 
		//		
		//		Thread send = new Thread(new Sender(texto));
		//		send.start();
		//		Thread rec = new Thread(new Receiver());
		//		rec.start();

	}
	public Chat() 
	{
		setSize(600, 400);       
		setTitle("Sistema "); 

		JPanel painel = new JPanel();
		painel.setLayout(null);        

		//label
		JLabel label = new JLabel();
		label = new JLabel("IP do Parceiro:");
		painel.add(label);
		label.setBounds(15, 5, 300, 55);

		//text        

		painel.add(textParceiro);
		textParceiro.setBounds(120, 20, 120, 25);


		btnParceiro.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();

				if(obj==btnParceiro){
					String text = textParceiro.getText();
					if(!text.isEmpty()) {
						send = new Sender(text);

						rec = new Thread(new Receiver());
						rec.start();
						System.out.println("Conectado com IP: "+ text);
					}

				}

			}});
		painel.add(btnParceiro);
		btnParceiro.setBounds(250, 20, 100, 25);


		painel.add(textMsg);
		textMsg.setBounds(120, 100, 300, 100);


		btnEviar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();

				if(obj==btnEviar){
					String text = textMsg.getText();
					if(!text.isEmpty()) {
						send.enviar(text);
						textMsg.setText("");
					}
				}

			}});
		painel.add(btnEviar);
		btnEviar.setBounds(250, 250, 100, 25);

		add(painel);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}  

}
