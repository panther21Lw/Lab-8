package code;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що реалізує ітератор {@link Iterator} для обходу структури в глибину (DFS).
 */
public class DFSIterator implements Iterator{
	/**
	 * Список для зберігання стеку компонентів під час обходу.
	 */
	private List<Component> stack = new ArrayList<Component>();
	
	/**
	 * Конструктор для ініціалізації DFS.
	 * 
	 * @param start Початковий елемент для обходу.
	 */
	public DFSIterator(Component start) {
		stack.add(start);
	}
	
	/**
	 * Перевіряє, чи містить стек наступний елемент.
	 * 
	 * @return true, якщо є наступний елемент.
	 */
	@Override
	public boolean hasNext() {
		return !stack.isEmpty();
	}
	
	/**
	 * Повертає наступний елемент.
	 * 
	 * @return Наступний елемент.
	 */
	@Override
	public Component next() {
		Component current = stack.remove(stack.size() - 1);
		if (current instanceof Composite) {
			List<Component> children = ((Composite) current).getChildren();
			for (int i = children.size() - 1; i >= 0; i--) {
				stack.add(children.get(i));
			}
		}
		return current;
	}
}
