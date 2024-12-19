package souhail;
public class CHIFFRE_TO_ROMAINS_ {
    public static String convert(int nbr){
        String[] romains = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] chiffre = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String res = "";
        
        for(int i=0;i<chiffre.length;i++){
            while(nbr>=chiffre[i]){
                res = res + romains[i];
                nbr = nbr - chiffre[i];

            }
        }
        return res;

}

}


