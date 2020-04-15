package String;

public class OperasiString {
    public static void main(String[] args) {
        String Kota = "Yogyakarta";
        System.out.println(Kota);

        char[] UniskaChar = {'U','N','I','S','K','A'};
        String UniskaString = new String(UniskaChar);
        System.out.println(UniskaString);

        System.out.println(Kota.toUpperCase());
        System.out.println(Kota.toLowerCase());
        System.out.println(Kota.substring(5));
        System.out.println(Kota.substring(0,4));
    }
}
