package code;

/**
 * Інтерфейс фабрики для створення ітераторів обходу структури.
 */
public interface SearchFactory {
	/**
	 * Створює ітератор для обходу структури.
	 * 
	 * @param start Компонент, з якого буде почато обхід.
	 * @return Iterator для виконання обходу.
	 */
	Iterator createSearch(Component start);
}
