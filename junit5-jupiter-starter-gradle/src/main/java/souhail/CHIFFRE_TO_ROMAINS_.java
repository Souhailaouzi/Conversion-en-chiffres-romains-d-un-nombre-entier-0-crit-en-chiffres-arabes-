package souhail;
public class CHIFFRE_TO_ROMAINS_ {
    public static String convert(int nbr) {
        if (nbr == 1) {
            return "I";  // Cas pour 1
        }
        if (nbr == 5) {
            return "V";  // Cas pour 5
        }
        if (nbr == 10) {
            return "X";  // Cas pour 10
        }
        return "";
    }
}


