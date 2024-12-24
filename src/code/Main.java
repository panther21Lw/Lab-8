package code;

/**
 * Головний клас програми, що демонструє роботу ітераторів BFS та DFS
 * у композитній структурі.
 */
public class Main {

	/**
	 * Виконавчий клас програми.
	 * 
	 * @param args Параметри командного рядка.
	 */
	public static void main(String[] args) {
		
		Composite root = new Composite("I");
		Composite subT1 = new Composite("II");
		Composite subT2 = new Composite("III");
		Composite subT3 = new Composite("IV");
		Composite subT4 = new Composite("V");
		Composite subT5 = new Composite("VI");
		Composite subT6 = new Composite("VII");

		subT4.add(subT5);
		subT2.add(subT3);
		subT2.add(subT6);
		subT1.add(subT2);
		root.add(subT1);
		root.add(subT4);

		subT3.add(new Leaf(24));
		subT3.add(new Leaf(25));
		subT3.add(new Leaf(26));
		subT3.add(new Leaf(27));
		subT3.add(new Leaf(28));

		subT6.add(new Leaf(19));
		subT6.add(new Leaf(20));

		subT2.add(new Leaf(23));
		subT2.add(new Leaf(22));
		subT2.add(new Leaf(21));

		subT5.add(new Leaf(17));
		subT5.add(new Leaf(18));

		subT4.add(new Leaf(16));
		subT4.add(new Leaf(15));

		subT1.add(new Leaf(12));
		subT1.add(new Leaf(13));
		subT1.add(new Leaf(14));

		root.add(new Leaf(11));

		
		SearchFactory factory = new BFSFactory(); // створюємо пошук в ШИРИНУ
		
		selectAlgorithm(factory, root, "BFS works ..... ");
		//Змінимо тип фабрики, та разом з нею і спосіб обходу
		
		System.out.println();
		
		factory = new DFSFactory();
		selectAlgorithm(factory, root, "DFS works ..... ");

	}
	
		/**
		 * Обирає алгоритм для обходу та виконує його.
		 * 
		 * @param factory Фабрика для створення ітератора.
		 * @param root Кореневий елемент структури.
		 * @param toPrint Текст, що виводиться перед виконанням.
		 */
		private static void selectAlgorithm(SearchFactory factory, Composite root, String toPrint) {
			Iterator iterator = factory.createSearch(root); 
			System.out.println(toPrint);
			while (iterator.hasNext()) {
				iterator.next().operation();
		} 
	}
}
