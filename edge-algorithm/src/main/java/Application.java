
public class Application {
    public static void main(String[] args) throws Exception {

        MaxBorderSearcher maxBorderSearcher = new MaxBorderSearcher();
        StringSearcher searcher  = new StringSearcher(maxBorderSearcher);
        searcher.findFromFile();
    }
}
