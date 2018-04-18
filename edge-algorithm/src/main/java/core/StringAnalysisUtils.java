package core;

/**
 * Класс, содержащий методы предварительного анализа строк.
 */
public final class StringAnalysisUtils {

    /**
     * Получить массив максимальных граней подстрок.
     * @param stringData - строка.
     * @return массив максимальных граней
     */
    public static int[] getMaxBorderArray(String stringData) {
        Integer len = stringData.length();
        int[] arr = new int[len];
        arr[0] = 0;

        for (int i = 0; i < len - 1; i++) {
            int t = arr[i];
            while (t > 0 && (stringData.charAt(i + 1) != stringData.charAt(t))) {
                t = arr[t - 1];
            }
            if (stringData.charAt(i+1) == stringData.charAt(t))
                arr[i + 1] = t + 1;
            else
                arr[i + 1] = 0;
        }
//        for (int idx = 0; idx<arr.length; idx++)
//            if (arr[idx] > 12)
//                System.out.println(idx);

        return arr;
    }

    /**
     *
     * @param stringData
     * @return
     */
    public static int[] getMaxBlockArrray(String stringData) {
        Integer len = stringData.length();
        int[] arr = new int[len];
        arr[0] = 0;
        int l = 0;
        int r = 0;
        int k;
        int q;

        for (int i = 1; i < len; i++) {
            arr[i] = 0;
            if (i > r) {
                arr[i] = compare(1, i, stringData);
                if (arr[i] > 0) {
                    r = i + arr[i]-1;
                    l = i;
                }
            }
            else {
                k = i - l +1;
                if (arr[k] < r - i + 1)
                    arr[i] = arr[k];
                else {
                    arr[i] = r-i+1;
                    l=i;
                    q = compare(r-i+2,r+1, stringData);
                    if (q>0) {
                        arr[i] = arr[i]+q;
                        r = i+arr[i]-1;
                    }
                }
            }

        }
        return arr;
    }

    /**
     *
     * @param pos1
     * @param pos2
     * @param s
     * @return
     */
    private static int compare(int pos1 , int pos2, String s) {
        Integer len = s.length();
        int j,t;
        if (pos1 > len || pos2 > len)
            return 0;
        else {
            t = len - pos1 < len - pos2 ? len - pos1 : len - pos2;
            j=0;
            while (j<=t && s.charAt(pos1+j)==s.charAt(pos2+j))
                j++;
            return j;
        }
    }
}
