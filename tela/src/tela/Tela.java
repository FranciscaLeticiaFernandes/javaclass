package tela;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame {
	JLabel lbltext = new JLabel("nome");//jlabel é pra adicionar um nome dentro da janela- no parenteses nois nomeia isso
	JTextField txtnome =new JTextField(); //textfield é pra adicionar uma barra dentro da janela
	JButton button = new JButton ("cadastrar");

	
	  public Tela() {
		  super("demonio");//super é o nome da janela
		  Container ctn = this.getContentPane();//essse container sozinho é a janela
		  lbltext.setBounds(20,20,100,30);//
		  ctn.add(lbltext);
		  
		  ctn.add(txtnome);
		  txtnome.setBounds(60,20,200,30);
		  ctn.add(button);//vc adiciona o nome antes do "new"
		  button.setBounds(90,60,100,100);
		  
		  
		  this.setLayout(null);
		  this.setSize(400,400);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  
		  
	  }
	  public static void main(String args[]) {
       Tela t= new Tela();		  
	  }

}
