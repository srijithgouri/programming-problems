package stringproblems;

public class ExtractDigitSum {
    public static void main(String[] args) {
        String input = "[a1s2d3f4g5h]";
        //StringBuilder output = new StringBuilder();
        int sum=0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
          
            if (Character.isDigit(c)) {
                //output.append(c);
            	sum+=Character.getNumericValue(c); 
            }
        }
      //  String result = output.toString();
        System.out.println("Output: " + sum);
        
    }
}
