package solutions;

public class SimplePigLatin {
    public String pigIt(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");

        for (String word : words) {
            if (Character.isLetter(word.charAt(0))) {
                result.append(word.substring(1)).append(word.charAt(0)).append("ay ");
            } else {
                result.append(word).append(" ");
            }
        }

        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }
}