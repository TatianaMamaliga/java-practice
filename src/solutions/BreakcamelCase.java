package solutions;

public class BreakcamelCase {
    public String solution(String input){
        String output = "";
        for (int i = 0; i < input.length(); i++){
            if (Character.isUpperCase(input.charAt(i))){
                String insertion = " " + input.charAt(i);
                output += insertion;
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }
}