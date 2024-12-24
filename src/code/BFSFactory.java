package code;

/**
 * Фабрика для створення BFS ітератора.
 */
public class BFSFactory implements SearchFactory{
	
	/**
	 * Повертає BFS {@link Iterator} ітератор, із вказаним кореневим компонентом.
	 * 
	 * @param start Кореневий компонент.
	 * @return BFS-ітератор.
	 */
	@Override
	public Iterator createSearch(Component start) {
		return new BFSIterator(start);
	}
}
