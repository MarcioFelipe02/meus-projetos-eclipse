package unidade3;

import javax.swing.JOptionPane;

public class Numero {

	public static void main(String[] args) {
		int numero = Integer.parseInt((JOptionPane.showInputDialog("Informa o número ")));
		int anterior = numero -1; 
		int posterior = numero +1;
		JOptionPane.showConfirmDialog(null, "O valor do numero anterior="+anterior+" e o posterior="+posterior);

	}

}
