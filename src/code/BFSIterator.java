package code;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що реалізує ітератор {@link Iterator} для обходу структури в ширину (BFS). 
 */
public class BFSIterator implements Iterator{
	/**
	 * Список для зберігання черги компонентів під час обходу.
	 */
	private List<Component> q = new ArrayList<>();
	/**
	 * Поточний індекс ітератора.
	 */
	private int index = 0;
	
	/**
	 * Конструктор для ініціалізації BFS.
	 * 
	 * @param start Початковий компонент для обходу.
	 */
	public BFSIterator(Component start) {
		q.add(start);
	}
	
	/**
	 * Перевіряє, чи існує у списку компонентів наступний елемент.
	 * 
	 * @return boolean значення, яке означає існування наступного елемента.
	 */
	@Override
	public boolean hasNext() {
		return index < q.size();
	}
	
	/**
	 * Повертає наступний елемент.
	 */
	@Override
	public Component next() {
		Component current = q.get(index++);
		if (current instanceof Composite) {
			q.addAll(((Composite) current).getChildren());
		}
		return current;
	}
}
