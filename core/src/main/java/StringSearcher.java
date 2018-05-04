import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class StringSearcher
{
    ICanSearch searcher;

    public StringSearcher(ICanSearch searcher) {
        this.searcher = searcher;
    }

    public void find() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести строку в которой искать? Y/N");
        scanner.nextLine();
        String str;
        switch (scanner.nextLine().toUpperCase()) {
            case "Y": {
                System.out.println("Введите строку");
                str = scanner.nextLine();
                break;
            }
            case "N": {
                str = "abc";
                break;
            }
            default: {
                str = "abc";
                break;
            }
        }
        System.out.println("Введите строку, которую хотите найти");
        String findStr = scanner.nextLine();
        search(str, findStr);
    }

    public void findFromFile() throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести путь к файлу в котором искать? Y/N");
        scanner.nextLine();
        String path;
        switch (scanner.nextLine().toUpperCase()) {
            case "Y": {
                System.out.println("Введите путь к файлу");
                path = scanner.nextLine();
                break;
            }
            case "N": {
                Properties prop = new Properties();
                prop.load(StringSearcher.class.getClassLoader().getResourceAsStream("filepath.properties"));
                path = prop.getProperty("file");
                break;
            }
            default: {
                Properties prop = new Properties();
                prop.load(StringSearcher.class.getClassLoader().getResourceAsStream("filepath.properties"));
                path = prop.getProperty("file");
                break;
            }
        }
        // \uFEFF  первый символ
        String str = new String(Files.readAllBytes(Paths.get(path)));
        System.out.println("Введите строку, которую хотите найти");
        String findStr = scanner.nextLine();
        search(str, findStr);
    }

    private void search(String str, String find) {
        List<Integer> array;
        Instant start = Instant.now();
        array = searcher.search(str, find);
        Instant end = Instant.now();
        System.out.println("Длительность поиска: " + Duration.between(start, end));
        System.out.println(array);
    }
}
