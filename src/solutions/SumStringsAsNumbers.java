package solutions;

public class SumStringsAsNumbers {
    public static String sumStrings(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? Character.getNumericValue(a.charAt(i--)) : 0;
            int digitB = (j >= 0) ? Character.getNumericValue(b.charAt(j--)) : 0;

            int sum = digitA + digitB + carry;
            carry = sum / 10;
            int digitSum = sum % 10;

            result.insert(0, digitSum);
        }

        int startIdx = 0;
        while (startIdx < result.length() - 1 && result.charAt(startIdx) == '0') {
            startIdx++;
        }

        return result.substring(startIdx);
    }
}