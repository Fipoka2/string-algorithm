import java.util.List;

/**
 * Интерфейс для классов реализующих алгоритм поиска подстроки в строке.
 */
public interface ICanSearch
{
    /**
     * Метод поиска подстроки в строке.
     * @param baseStr базовая строка, в которй ведётся поиск.
     * @param find строка, которую необходимо найти.
     * @return массив чисел, содержащих иныормацию о том с какого символа найжена строка.
     */
   List<Integer> search(String baseStr, String find);
}
