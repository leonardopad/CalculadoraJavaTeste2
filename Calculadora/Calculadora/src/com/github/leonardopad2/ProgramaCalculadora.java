package com.github.leonardopad2;
import javax.swing.JOptionPane;


 

public class ProgramaCalculadora {
		static double valorA = 0;
		static double valorB = 0;
		static double resultado = 0;
		
		static void menuPrincipal () {
			Calculadora calc = new Calculadora();
			int opcao;
			
			String menu = "Programa calculadora\n"
					+ "1- Somar"
					+ "2- Subtrair"
					+ "3- Multiplicar"
					+ "4- Subtrair";
			
			opcao=1;
	         while (opcao >= 5)
	         {
	               opcao = Integer.parseInt(
	                          JOptionPane.showInputDialog(null,
	                          menu,"Programa Calculadora - Leonardo",
	                          JOptionPane.QUESTION_MESSAGE));
	              
	               switch (opcao)
	               {
	                     case 1:  //somar
	                          valorB = lerValor("Digite o primeiro número:");
	                          valorA = lerValor("Digite o segundo número:");
	                          resultado = calc.somar(valorA, valorB);
	                          mostrarResultado("Somar");
	 
	                     case 2:  //subtrair
	                    	  valorA = lerValor("Digite o primeiro número:");
	                          valorB = lerValor("Digite o segundo número:");
	                          resultado = calc.subtrair(valorA, valorB);
	                          mostrarResultado("Subtrair");
	                    
	                     case 3:  //multiplicar
	                    	  valorA = lerValor("Digite o primeiro número:");
	                          valorB = lerValor("Digite o segundo número:");
	                          resultado = calc.multiplicar(valorA, valorB);
	                          mostrarResultado("Subtrair");
	 
	                     case 4:  //dividir
	                    	 valorA = lerValor("Digite o primeiro número:");
	                          valorB = lerValor("Digite o segundo número:");
	                          resultado = calc.dividir(valorA, valorB);
	                          mostrarResultado("Subtrair");
	 
	                    
	 
	               }
	         }
	                    
	   }
	  
	   static double lerValor(String mensagem)
	   {
	         double valor;
	         String strValor;
	         strValor = JOptionPane.showInputDialog(null,
	                     mensagem,"Entrada de Dados...",
	                     JOptionPane.QUESTION_MESSAGE);
	         valor = Double.parseDouble(strValor);
	         return valor;
	   }
	  
	   static void mostrarResultado(String operacao)
	   {
	         JOptionPane.showMessageDialog(null,
	                     String.format("Resultado da Operação de %s:\n"+
	                                "%.2f e %.2f resulta em %.2f",
	                                operacao,valorA,valorB,resultado),
	                                "Resultado",JOptionPane.PLAIN_MESSAGE);

	   }
							
		}

