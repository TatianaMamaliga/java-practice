package solutions;

public class StringEndsWith {
        public boolean firstSolution(String str, String ending) {
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

        public boolean secondSolution(String str, String ending){
            if (str.isEmpty()) {
                return false;
            }
            if (ending.length() > str.length()) {
                return false;
            }
            return str.endsWith(ending);
        }
}