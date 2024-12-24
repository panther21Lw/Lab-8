package code;

/**
 * Фабрика для створення DFS ітератора.
 */
public class DFSFactory implements SearchFactory{
	
	/**
	 * Повертає DFS {@link Iterator} ітератор, із вказаним кореневим компонентом.
	 * 
	 * @param start Кореневий компонент.
	 * @return DFS-ітератор.
	 */
	@Override
	public Iterator createSearch(Component start) {
		return new DFSIterator(start);
	}
}
