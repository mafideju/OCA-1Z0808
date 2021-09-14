class Help {
	public static void main(String[] args) throws java.io.IOException {
 			
		char ignore, choice;
			

		for ( ; ; ) {
			do {
				System.out.println("Ajuda com:");
				System.out.println("\t1. If");
				System.out.println("\t2. Switch");
				System.out.println("\t3. For");	
				System.out.println("\t4. While");
				System.out.println("\t5. Do-While");
				System.out.println("\t6. Break");
				System.out.println("\t7. Continue");
				System.out.print("Escolha uma opção: (s para sair)\n");

				choice = (char) System.in.read();

				do ignore = (char) System.in.read(); while(ignore != '\n');

			} while(choice < '1' | choice > '7' & choice != 's');
		
			if (choice == 's') break; 

			switch(choice) {
				case '1':
					System.out.println("The If:\n");
					System.out.println("if (condition) { return: JAVA_CODE; }");
					System.out.println("else { return: OTHER_JAVA_CODE; }");
					break;
				case '2':
					System.out.println("The switch:\n");
					System.out.println("switch(expression) {");
					System.out.println("    case variable_1:");
					System.out.println("\treturn { JAVA_CODE }");
					System.out.println("\tbreak");
					System.out.println("}");
					break;
				case '3':
					System.out.println("The for:\n");
					System.out.println("for(init, condition, iteration) {");
					System.out.println("\treturn { JAVA_CODE }");
					System.out.println("}");
					break;
				case '4':
					System.out.println("The while:\n");
					System.out.println("while (condition) {");
					System.out.println("\tJAVA_CODE_HERE ");
						System.out.println("}");
					break;
				case '5':
					System.out.println("The do-while:\n");
					System.out.println("do {");
					System.out.println("\tJAVA_CODE_HERE ");
					System.out.println("} while(condition)");
					break;
				case '6':
					System.out.println("The break:\n");
					System.out.println("\tbreak; break label;");
					break;
				case '7':
					System.out.println("The continue:\n");
					System.out.println("\tcontinue; continue label");
					break;
				default:
					System.out.println("Opção não encontrada. Tente novamente!");
			}
			System.out.println();
		}
	}
}
