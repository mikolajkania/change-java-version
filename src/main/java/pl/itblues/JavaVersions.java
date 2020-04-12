package pl.itblues;

import org.apache.bcel.Repository;

public class JavaVersions {

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        // var is available since Java 10
        var c = Repository.lookupClass("pl.itblues.JavaVersions");

        String msg = "   Compiled Java version= " + c.getMajor();
        System.out.println(msg);
        System.out.println("Runtime Java version= " + System.getProperty("java.version"));

        // strip method is available since Java 11, but can't be used even with Jabel
        // System.out.println(msg.strip());

        // text blocks can be used since Java 13
        System.out.println(
                        """
                        From Gdańsk
                        with love!
                        """);


        Thread.sleep(10_000);
    }

}