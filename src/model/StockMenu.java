package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class StockMenu {
	private static List<Product> stock = new ArrayList<Product>();
	
	public static void main(String[] args) {
		// variavel que irah conter as opcoes do menu
				int op_menu;
				// laco de execucao
				while(true) {
			
					op_menu = menu();
					
					if(op_menu == 1) {
						Product temp = inputValues();
						if(temp != null) stock.add(temp);
					}
					else if(op_menu == 2) {
						print();
					}
					// caso a opcao seja 0, quebra o laco
					else if(op_menu == 0) break;
					else {
						// se opcao nao corresponder a nenhum das opcoes acima 
						// serah informado ao usuario que a opcao escolhida eh invalida
						JOptionPane.showMessageDialog(null, "Opção inválida!");
					}
				}
	}
	public static int menu() {
		// exibe o menu
		String temp = JOptionPane.showInputDialog(
				"<html><style>"
				+ "h3{ margin-top: 2px; margin-bottom: 2px;}"
				+ "</style>"
				+ "<h1>MENU</h1>"
				+ "<h3>1 - Cadastrar Produto</h3>"
				+ "<h3>2 - Imprimir</h3>"
				+ "<h3>0 - Sair</h3></html>");
		// tenta capturar a opcao do usuario
		try {
			// caso o usuario pressione cancelar, serah retornado '0'
			return Integer.parseInt((temp==null?"0":temp));
		}catch(Exception e) {
			// se houver algum erro na conversao da opcao,
			// a funcao retornarah '-1'
			return -1;
		}
	}
	public static Product inputValues() {
		String name;
		Integer amount;
		Float price;
		String temp;
		
		while(true) {
			temp = JOptionPane.showInputDialog("Informe o nome do produto:");
			
			if(temp == null)return null;
			if(!temp.equals("")) break;
			
			JOptionPane.showMessageDialog(null, "Entrada Inválida!");
		}
		name = temp;
		
		while(true) {
			temp = JOptionPane.showInputDialog(
					"Informe a quantidade de itens disponíveis:");
			
			if(temp == null)return null;
			
			try {
				amount = Integer.parseInt(temp);
				break;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Entrada Inválida!");
			}
		}
		
		while(true) {
			temp = JOptionPane.showInputDialog(
					"Informe o valor do produto:");
			
			if(temp == null)return null;
			
			try {
				price = Float.parseFloat(temp);
				break;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Entrada Inválida!");
			}
		}
		
		return new Product(name, amount, price);
	}
	
	public static void print() {
		String temp = "<html><style>h3{ margin-top: 2px;"
				+ "margin-bottom: 2px;}</style>";
		for (Product result : stock) {
			temp += "<h3>"+result+"</h3>";
		}
		JOptionPane.showMessageDialog(null, temp+"</html>");
	}
}
