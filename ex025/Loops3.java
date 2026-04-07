public class Loops3 {
    public static String stripConsonants(String input){
        String vowels = "aeiouy";
        String result = "";

        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            if (vowels.indexOf(c) != -1){
                result += c;
            }
        }
        return result;
    }
}
