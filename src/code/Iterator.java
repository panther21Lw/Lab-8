package code;

/**
 * Цей інтерфейс визначає методи для навігації по колекції.
 * Він містить методи для переходу до наступного елемента та перевірки доступності елеметів.
 */
public interface Iterator {
	/**
	 * Визначає, чи існує елемент після поточного.
	 *
	 * @return Логічне значення наявності наступного елемента (true або false).
	 */
	boolean hasNext();

	/**
	 * Повертає елемент за поточним індексом.
	 *
	 * @return Елемент типу {@link Component}.
	 */
	Component next();
}
