package edu.wsb;

public class Main {

    public static void main(String[] args) {
        System.out.println("hej wsb");

        String a = new StringUtils().getFirstLetter("wsb");
        System.out.println("pierwsza litera to:" + a);

        String b = new StringUtils().getLastLetter("JUnit");
        System.out.println("ostatnia litera to " + b);

        String c = new StringUtils().getLastLetter("Studia podyplomowe");
        System.out.println("ostatnia litera to " + c);

        String d = new StringUtils().getLastLetter("");
        System.out.println("ostatnia litera to " + d);

        String e = new StringUtils().getLastLetter(null);
        System.out.println("ostatnia litera to " + e);
    }


}
