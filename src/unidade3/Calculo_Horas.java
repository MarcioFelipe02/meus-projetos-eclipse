package unidade3;

import javax.swing.JOptionPane;

public class Calculo_Horas {

	public static void main(String[] args) {
		int dias = Integer.parseInt((JOptionPane.showInputDialog("Informa o número de dias da viagem")));
		int horas = Integer.parseInt((JOptionPane.showInputDialog("Informa quantidade de horas")));
		int total_horas = (dias*24) + horas;
		JOptionPane.showMessageDialog(null, "O valor total da viagem em horas foi de "+total_horas);
		

	}

}
