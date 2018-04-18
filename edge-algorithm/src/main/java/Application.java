import java.time.Duration;
import java.time.Instant;

import core.StringAnalysisUtils;

public class Application {
    public static void main(String[] args) throws Exception {

//        String s = "abcd#abaababaabaabcdaababa";

//        String s = new String(Files.readAllBytes(Paths.get("D:\\Projects\\arithmetic2\\Reference" +
//                "-arithmetic-coding\\string-algorithms\\edge-algorithm\\src\\main\\java\\data.txt")));
//        System.out.println(Arrays.toString(StringAnalysisUtils.getMaxBorderArray(s)));
//        s = s.substring(1);
        StringBuilder builder = new StringBuilder();
        builder.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        for (int i=0; i< 1300000;i++)
            builder.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Instant start = Instant.now();
        StringAnalysisUtils.getMaxBorderArray(builder.toString());
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));
    }
}
