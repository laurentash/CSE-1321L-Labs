import java.util.Scanner;
public class Assignment1A {

    public static void main (String[] args) {


        String scheme;
        String subdomain;
        String SLDomain;
        String TLDomain;
        String subdirectory;

        Scanner scan = new Scanner (System.in);


        System.out.print ("Enter the Scheme: ");
        scheme = scan.next();

        System.out.print ("Enter the Subdomain: ");
        subdomain = scan.next();

        System.out.print ("Enter the Second-level domain: ");
        SLDomain = scan.next();

        System.out.print ("Enter the Top-level domain: ");
        TLDomain = scan.next();

        System.out.print ("Enter the Subdirectory: ");
        subdirectory = scan.next();

        System.out.println("Scheme: " + scheme );
        System.out.println("Subdomain: " + subdomain );
        System.out.println("Second-level domain: " + SLDomain );
        System.out.println("Top-Level Domain: " + TLDomain );
        System.out.println("Subdirectory: " + subdirectory );

        System.out.println("Your URL is: ");
        System.out.println(scheme + "://" + subdomain + "." + SLDomain + "." + TLDomain + "/" + subdirectory);


    }

}
