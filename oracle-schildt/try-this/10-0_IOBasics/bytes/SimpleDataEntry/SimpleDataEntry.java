class SimpleDataEntry {
    byte data[] = new byte[10];
		System.out.println("Letras, quero letras...");
		System.in.read(data);
		System.out.println("Letras oferecidas: ");
		for(int i = 1; i < data.length; i++) {
        System.out.print(i + " ");
        System.out.println((char) data[i]);
    }
		System.out.println(data.length);
		System.out.println();
}