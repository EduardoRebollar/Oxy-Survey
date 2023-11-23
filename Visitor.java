import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
class Visitor {

    private String email;
    // FIXME add additional member variables here
    private String age;
    private String name;
    private String country_code;
    private String phone;
    private String reason;
    /**
     * Get the visitor's email
     *
     * @return  The visitor's email
     */
    public String getEmail() {
        return this.email;
    }

    public String getAge() {
        return this.age;
    }

    public String getName(){
        return this.name;
    }
    public String getCountry_code(){
        return this.country_code;
    }
    public String getPhone(){
        return this.phone;
    }

    public String getReason(){
        return this.reason;
    }
    /**
     * Set the visitor's email
     *
     * @param email  The new email
     * @return      true if the email is valid, false otherwise
     **/
    public boolean setEmail(String email) {
        // email is notoriously difficult to validate, so we will only do the minimum here
        // https://haacked.com/archive/2007/08/21/i-knew-how-to-validate-an-email-address-until-i.aspx/
        if (email.contains("@")) {
            this.email = email.trim();
            return true;
        }
        System.out.println("Please enter a valid email that contains the @ symbol.");
        return false;
    }

    // FIXME add additional getters and setters here
    public boolean setAge(String age){
        String digits = "\\d+";
        if (age.matches(digits)) {
            if (Integer.parseInt(age) < 117 && Integer.parseInt(age) > 0) {
                this.age = age;
                return true;
            }
        }
        System.out.println();
        System.out.println("Please enter one valid age (only digits).");
        return false;
    }

    public boolean setName(String name){
        if (!Objects.equals(name, "")){
            this.name = name;
            return true;
        }
        System.out.println();
        return false;
    }
    public boolean setCountry_code(String country_code){
        if (country_code.length() < 10 && hasAnyOf("0123456789", country_code)){
            this.country_code = country_code;
            return true;
        }
        System.out.println();
        return false;
    }
    public boolean setPhone(String phone){
        if (phone.length() == 10 && hasAnyOf("0123456789", phone)){
            this.phone = phone;
            return true;
        }
        System.out.println();
        return false;
    }

    public boolean setReason(String reason){
        if (!Objects.equals(reason, "")){
            this.reason = reason;
            return true;
        }
        System.out.println();
        return false;
    }
    /**
     * Search for characters in a string.
     *
     * Examples:
     *
     * hasAnyOf("", "0123") returns false
     * hasAnyOf("0", "0123") returns true
     * hasAnyOf("Justin", "0123456789") returns false
     *
     * @param haystack  The string to be searched through.
     * @param needle    The characters to search for.
     * @return         True if the haystack contains any needle
     */
    public static boolean hasAnyOf(String haystack, String needles) {
        // check for each undesirable character
        for (int i = 0; i < needles.length(); i++) {
            if (haystack.contains(String.valueOf(needles.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check for other characters in a string.
     *
     * Examples:
     *
     * hasOnly("", "0123") returns true
     * hasOnly("0", "0123") returns true
     * hasOnly("Justin", "0123456789") returns false
     *
     * @param haystack  The string to be searched through.
     * @param needle    The characters to search for.
     * @return         True if the haystack only contains needles
     */
    public static boolean hasOnly(String haystack, String needles) {
        for (int i = 0; i < haystack.length(); i++) {
            if (!needles.contains(String.valueOf(haystack.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}