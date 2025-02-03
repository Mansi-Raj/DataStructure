package SlidingWindow;

public class NoOfVowelsInKLenSubstring {
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
            if (i >= k && vowels.indexOf(s.charAt(i - k)) != -1) {
                count--;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
