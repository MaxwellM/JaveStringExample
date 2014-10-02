public class Main {

    public static void main(String[] args) {
        // First string to test - can be anything
        String str1 = "Java is fun.";
        // Second string to test - can be anything
        String str2 = "Good Luck!";
        // Creating a new string that is the return of our reverseIt
        //  function that flips str1
        String reverseStr1 = reverseIt(str1);
        // Creating a new string that is the return of our reverseIt
        //  function that flips str2
        String reverseStr2 = reverseIt(str2);
        // Formatted println statement that displays str1 and it's
        //  reverse 'reverseStr1'
        System.out.println("String: " + str1 + "\t Reversed String: " + reverseStr1);
        // Formatted println statement that displays str2 and it's
        //  reverse 'reverseStr2'
        System.out.println("String: " + str2 + "\t\t Reversed String: " + reverseStr2);

        // New string that contains 26 characters, happens to be our alphabet
        String orig = "abcdefghijklmnopqrstuvwxyz";

        // Formatted print statement that displays orig and the reversed
        //  order of the three segments 'threeCut(orig)'
        System.out.println("String: " + orig + "\t Reversed Segements: " + threeCut(orig));

    }

    // Our function that takes a string as input then
    //  returns a new string that is it's reversal
    public static String reverseIt (String source) {
        // i = simple integer : len = the source strings element length
        int i, len = source.length();
        // dest is a string that is assigned to be the length of the source string
        StringBuilder dest = new StringBuilder(len);

        // Our for loop that walks the length of our source string backwards
        for (i = (len -1); i >= 0; i--)
            // We append 'add' the character at each element through our source
            //  string as we walk backwards starting from the rear
            dest.append(source.charAt(i));
        // Returning dest as a string which should be the reversal of our
        //  source string
        return dest.toString();
    }

    // Our function that accepts a string as input then returns a string
    //  that should be segmented in predefined chunks and then reversing
    //  order of those chunks, different from revering the entire string
    //  like we previously did in our last function.
    public static String threeCut (String s){
        // Segment 1 = first 8 characters (remember strings start a 0)
        String newString1 = s.substring(0, 7);
        // Segment 2 = next 7 characters
        String newString2 = s.substring(8, 14);
        // Segment 3 = next 11 characters
        String newString3 = s.substring(15, 26);

        // The source string is then assigned to be the third segment first
        //  followed by the segment finished by the first segment.
        // You can see how the assignment operator is achieving this
        //    by the order to which they are being assigned.
        s = newString3 + newString2 + newString1;

        // Returning the source string in its new format!
        //  i.e. reversed segments.
        return s;
    }

}

