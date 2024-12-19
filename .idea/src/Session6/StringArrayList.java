package Session6;


import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();

        strList.add("Artem");
        strList.add("Vlad");
        strList.add("Igor");
        strList.add("Vitalii");

        System.out.println(strList);
        strList.remove (  0);
        System.out.println(strList);
       System.out.println(strList.size()); //total in array
    }
}