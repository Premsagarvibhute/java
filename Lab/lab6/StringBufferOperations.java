public class StringBufferOperations {
    public static void main(String[] args) {
        // create a StringBuffer
        StringBuffer strBuffer = new StringBuffer("This is StringBuffer");

        // add the string "- This is a sample program" to existing string
        strBuffer.append("- This is a sample program");
        System.out.println("Appended String: " + strBuffer);
        
        // insert the string "Object" into the existing string at 21st position 
        strBuffer.insert(21, "Object");
        System.out.println("Inserted String: " + strBuffer);
        
        // reverse the entire string and display it
        strBuffer.reverse();
        System.out.println("Reversed String: " + strBuffer);
        
        // replace the word "Buffer" with "Builder
        strBuffer.replace(strBuffer.indexOf("Buffer"), strBuffer.indexOf("Buffer") + "Buffer".length(), "Builder");
        System.out.println("Replaced String: " + strBuffer);
    }
}
