package pl.itblues;

import org.apache.bcel.Repository;

public class JavaVersions {

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        var c = Repository.lookupClass("pl.itblues.JavaVersions");
        System.out.println("Java version= " + c.getMajor());

        Thread.sleep(10_000);
    }

}