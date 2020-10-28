package ro.mta.facc.selab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main( String args[] ) {
        // String to be scanned to find the pattern.
        String line = "This order 133 was placed for QT3000! OK?";
        String pattern = "(\\d+)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);

        // Randoms
        if (m.find( )) {
            System.out.println(m.groupCount());
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        }else {
            System.out.println("NO MATCH");
        }
    }
}