import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chat extends JFrame {
	JButton btnParceiro = new JButton("Conectar");
	JTextField textParceiro = new JTextField();
	JTextArea  textMsg = new JTextArea();
	static JTextArea  textConversa = new JTextArea();
	JButton btnEviar = new JButton("Enviar");
	JLabel labelApelido = new JLabel();
	JTextField textApelido = new JTextField();
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
//				Thread rec = new Thread(new Receiver(textConversa));
//				rec.start();

	}
	public Chat() 
	{
		setSize(600, 800);       
		setTitle("Sistema "); 

		JPanel painel = new JPanel();
		painel.setLayout(null);        

		//label
		
		labelApelido = new JLabel("Apelido");
		painel.add(labelApelido);
		labelApelido.setBounds(15, 35, 300, 55);

		//text        

		painel.add(textApelido);
		textApelido.setBounds(120, 50, 120, 25);

		//label
		JLabel label = new JLabel();
		label = new JLabel("IP do Parceiro:");
		painel.add(label);
		label.setBounds(15, 5, 300, 55);

		//text        

		painel.add(textParceiro);
		textParceiro.setBounds(120, 20, 150, 25);


		btnParceiro.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();

				if(obj==btnParceiro){
					String text = textParceiro.getText();
					if(!text.isEmpty()) {
						send = new Sender(text);

						rec = new Thread(new Receiver(textConversa));
						rec.start();
						System.out.println("Conectado com IP: "+ text);
					}

				}

			}});
		painel.add(btnParceiro);
		btnParceiro.setBounds(300, 20, 100, 25);

		painel.add(textConversa);
		textConversa.setBounds(30, 80, 400, 400);


		painel.add(textMsg);
		textMsg.setBounds(30, 500, 400, 80);


		btnEviar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();

				if(obj==btnEviar){
					String text = textMsg.getText();
					String msg;
					if(!text.isEmpty()) {
						msg = textApelido.getText()+": "+text;
						send.enviar(msg);
						textMsg.setText("");
					}
				}

			}});
		painel.add(btnEviar);
		btnEviar.setBounds(250, 700, 100, 25);

		add(painel);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}  

}
