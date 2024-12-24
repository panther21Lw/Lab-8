package code;

/**
 * Клас, що реалізує {@link Component} для представлення листкового елемента 
 * у композитній структурі.
 */
public class Leaf implements Component{
	/**
	 * Ідентифікатор листка.
	 */
	private int id;
	
	/**
	 * Конструктор для створення листка.
	 * 
	 * @param id Ідентифікатор листка.
	 */
	public Leaf(int id) {
		this.id = id;
	}
	
	/**
	 * Виконує оперіцію над листком.
	 * Виводить у консоль повідомлення про листок з ідентифікатором.
	 */
	@Override
	public void operation() {
		System.out.println("Leaf with id: " + id);
	}
}
