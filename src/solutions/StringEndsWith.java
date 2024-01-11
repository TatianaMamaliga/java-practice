package solutions;

public class StringEndsWith {
        public boolean solution(String str, String ending) {

            boolean isEnding = false;
            if (ending.length() > str.length()) {
                return isEnding;
            }
            if(ending.isEmpty()){
                return true;
            }
            for (int i = 0; i < ending.length(); i++) {
                char endingLetter = ending.charAt(i);
                char strLetter = str.charAt(i + (str.length() - ending.length()));

                if (endingLetter == strLetter) {
                    isEnding = true;
                } else {
                    return false;
                }
            }
            return isEnding;
        }

    public static void main(String[] args) {
        StringEndsWith stringEndsWith = new StringEndsWith();

        String str = "sumo";
        String ending = "umo";

        boolean endsWith = stringEndsWith.solution(str, ending);

        System.out.println(endsWith);
    }
}