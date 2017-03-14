/**
 * Created by Francesco on 10/03/2017.
 */
public class NetString {

    public static String email(String name, String surname, String domain) {
        return name.charAt(0) + surname + "@" + domain;
    }

    public static String homepage(String surname, String domain){
        return "http://"+domain+"/~"+surname;
    }

    public static String userID(String name, String surname){
        String out= ""+name.charAt(0);
        for(int i=0; i<7&&i<surname.length(); i++)
            out+= surname.charAt(i);
        return out;
    }

    public static String password(String name, String surname){
        String out= "";
        for(int i=0; i<3&&i<surname.length(); i++)
            out+= surname.charAt(i);
        for(int i=name.length()-3; i<name.length()&&i>=0; i++)
            out+= name.charAt(i);
        return out;
    }
}
