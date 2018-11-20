
// DONE Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Color Picker");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// DONE Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(400,600);
		
		// DONE Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();	
		
		// DONE Creare la stringa HTML per il wireframe
		sb.append("<html><body>");
		sb.append("<h1>Color Picker</h1>");
		
		// Create div for table
		sb.append("<div style='display:table'>");

		// create the first row
		sb.append("<div style='display:table-row'>");

		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("<b>Name</b>");
		sb.append("</div>");
		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("<b>Hex</b>");
		sb.append("</div>");
		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("<b>RGB</b>");
		sb.append("</div>");

		// close first row
		sb.append("</div>");
		
		
		// create the second row
		sb.append("<div style='display:table-row'>");

		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Persian Green");
		sb.append("</div>");
		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("#00A693");
		sb.append("</div>");
		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("0,166,147");
		sb.append("</div>");

		// close second row
		sb.append("</div>");
		
		
		// create the 3 row
		sb.append("<div style='display:table-row'>");

		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Venice Blue");
		sb.append("</div>");
		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("#055989");
		sb.append("</div>");
		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("5,89,137");
		sb.append("</div>");

		// close 3 row
		sb.append("</div>");
		
		
		// create the 4 row
		sb.append("<div style='display:table-row'>");

		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Pale Blue");
		sb.append("</div>");
		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("#73D1E4");
		sb.append("</div>");
		// create cell
		sb.append("<div style='display:table-cell'>");
		sb.append("115,209,228");
		sb.append("</div>");

		// close 4 row
		sb.append("</div>");
		
		
		
		
		//close table
		sb.append("</div>");

		// DONE Convertire lo StringBuilder in String
		String str = sb.toString();
		
		// DONE Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(str));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

