package solutions;

public class FakeBinary {
    public String fakeBin(String numberString) {
        char[] charArr = numberString.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.getNumericValue(charArr[i]) < 5) {
                charArr[i] = '0';
            } else {
                charArr[i] = '1';
            }
        }
        return new String(charArr);
    }
}