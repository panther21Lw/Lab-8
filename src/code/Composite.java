package code;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас композитного компонента, що може містити інші компоненти.
 */
public class Composite implements Component{
	/**
	 * Це поле представляє список дочірніх компонентів.
	 */
	private List<Component> children = new ArrayList<>();
	/**
	 * Ім'я композитного компонента.
	 */
	private String name;
	
	/**
	 * Конструктор для створення композитного компонента.
	 * 
	 * @param name Ім'я компонента.
	 */
	public Composite (String name) {
		this.name = name;
	}
	
	/**
	 * Додає дочірній елемент.
	 * 
	 * @param component Дочірній елемент.
	 */
	public void add(Component component) {
		children.add(component);
	}
	
	/**
	 * Видаляє дочірній елемент.
	 * 
	 * @param component Дочірній елемент.
	 */
	public void remove(Component component) {
		children.remove(component);
	}
	
	/**
	 * Повертає список дочірніх компонентів.
	 * 
	 * @return Список дочірніх компонентів.
	 */
	public List<Component> getChildren(){
		return children;
	}
	
	/**
	 * Виконує операцію над композитом. 
	 * Виводить у консоль повідомлення про те, що це композит з конкретним ім'ям.
	 */
	@Override
	public void operation() {
		System.out.println("Composite: " + name);
		/*
		for(Component child : children) {
			child.operation();
		}
		*/
	}
}
