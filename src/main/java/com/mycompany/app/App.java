package com.mycompany.app;


/**
 * Hello world!
 *
 */ 
public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Kseniia Andreeva <kseniia.andreeva@diffblue.com>" );
//        System.out.println( maskString("Kseniia Andreeva")+" " +maskEmail("kseniia.andreeva@diffblue.com"));
//
//        System.out.println( "L Y <the@mail.ua>\n" );
//        System.out.println( maskString("L Y")+" " +maskEmail("the@mail.ua"));
//
//        System.out.println( "L Y exam@x.com" );
//        System.out.println( maskString("L Y")+" " +maskEmail("exam@x.com"));

    }

    public boolean ifYes(String s) {
        return "Yes".equals(s);
    }


    public boolean ifYes2(String s) {
        return "Yes".equals(s);
    }
    public boolean ifYes3(String s) {
        return "Yes".equals(s);
    }


//    /**
//     * Masks an email address to obscure sensitive information while retaining enough detail for
//     * identification purposes
//     *
//     * <p>examples: maskEmail("example@example.com") returns "ex***e@ex***e.com";
//     * maskEmail("exam@x.com") returns "ex***m@***.com"; maskEmail("") returns "***"
//     *
//     * @param email The email address to be masked.
//     * @return The masked email address.
//     */
//    private static String maskEmail(String email) {
//        String[] parts = email.split("@");
//        // broken or empty email
//        if (parts.length != 2) {
//            return maskString(email);
//        }
//
//        String localPart = parts[0];
//        String domainPart = parts[1];
//
//        String maskedLocalPart = maskString(localPart);
//        String maskedDomainPart = maskDomain(domainPart);
//
//        return maskedLocalPart + "@" + maskedDomainPart;
//    }
//
//    /**
//     * Masks the domain portion of an email address to obscure the full domain name, while keeping the
//     * top-level domain visible
//     *
//     * <p>example: maskDomain("example.com") returns "ex***e.com"
//     *
//     * @param domain The domain part of the email address.
//     * @return The masked domain.
//     */
//    private static String maskDomain(String domain) {
//        int lastDotIndex = domain.lastIndexOf('.');
//        if (lastDotIndex == -1) {
//            return maskString(domain);
//        }
//        String domainName = domain.substring(0, lastDotIndex);
//        String tld = domain.substring(lastDotIndex);
//        String maskedDomainName = maskString(domainName);
//
//        return maskedDomainName + tld;
//    }
//
//    /**
//     * Masks a string by obscuring part of its characters, while keeping the string partially
//     * recognizable. If the string length is 3 or less, the entire string is masked. Otherwise, the
//     * first 2 characters and the last character are kept visible.
//     *
//     * <p>examples: maskString("example") returns "ex***e"; maskString("ex") returns "***"
//     *
//     * @param str The string to be masked.
//     * @return The masked string.
//     */
//    private static String maskString(String str) {
//        int length = str.length();
//        if (length <= 3) {
//            return "***";
//        } else {
//            return str.substring(0, 3) + "***";
//        }
//    }
}
