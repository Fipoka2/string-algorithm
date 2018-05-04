import java.util.ArrayList;
import java.util.List;

import core.StringAnalysisUtils;

public class MaxBorderSearcher implements ICanSearch {

    @Override
    public List<Integer> search(String baseStr, String find) {
        String str = find + "@" + baseStr;
        List<Integer> ans = new ArrayList<>();
        int[] arr = StringAnalysisUtils.getMaxBorderArray(str);
        for (int i = find.length(); i < str.length(); i++) {
            if (arr[i] >= find.length())
                ans.add(i - find.length());
        }
        return ans;
    }
}
