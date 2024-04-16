package stringproblems;

public class ExtraDigits {
    public static void main(String[] args) {
        String input = "a1s2d3f4g5h";
        String sri="";
//        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
           char c = input.charAt(i);
            if (Character.isDigit(c)) {
//                output.append(c);
            	sri+=Character.getNumericValue(c);
            }
        }

//        String result = sri.toString();
        System.out.println("Output: " + (sri));
    }
}

