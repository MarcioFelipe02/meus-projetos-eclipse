package unidade3;

import javax.swing.JOptionPane;

public class EscreveVariaveis {

	public static void main(String[] args) {
		//String fruta = "Banana";
		var valor = 3.50;
		var fruta = JOptionPane.showInputDialog("Digite a Fruta");
		JOptionPane.showMessageDialog(null,"O Valor da "+fruta+" é de "+valor);
		
				
				
		 
	}

}
