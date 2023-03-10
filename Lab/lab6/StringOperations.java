public class StringOperations {
    public static void main(String[] args) {
       
        String str = "Welcome to Java World";  // create a string

        
        char fifthChar = str.charAt(4);   // return the character at 5th position and display it
        System.out.println("Character at 5th position: " + fifthChar);
        
        // compare the above string with "Welcome" lexicographically ignore case difference and display the result
        boolean lexicographicComparison = str.regionMatches(true, 0, "Welcome", 0, 7);
        System.out.println("Lexicographic Comparison of 'Welcome' with the given string: " + lexicographicComparison);
        
        
        String concatenatedStr = str.concat("- Let us learn");
        System.out.println("Concatenated String: " + concatenatedStr);
        
        // return the position of the first occurrence of character 'a' and display it
        int firstOccurrence = str.indexOf('a');
        System.out.println("Position of first occurrence of 'a': " + firstOccurrence);
        
        // replace all the occurrences of 'a' character with the new 'e' and display it
        String replacedStr = str.replace('a', 'e');
        System.out.println("Replaced String: " + replacedStr);
        
        // return the substring between 4th position and 10th position and display it
        String subStr = str.substring(4, 10);
        System.out.println("Substring between 4th and 10th position: " + subStr);
        
        // return the lowercase of the string and display it
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseStr);
    }
}
