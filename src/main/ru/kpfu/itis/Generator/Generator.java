package main.ru.kpfu.itis.Generator;

public class Generator {
    public static String generate(int serialNumber) {
        if(serialNumber == 0){
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append("1");

        //Идея состоит в том, чтобы считать количество повторяющихся цифр и записывать их количество, затем само число.
        for (int i = 1; i < serialNumber; i++) {
            StringBuilder tempSB = new StringBuilder();
            for (int j = 0; j < result.length(); j++) {
                int count = 1;
                while (j + 1< result.length() && result.charAt(j) == result.charAt(j+1)){
                    count++;
                    j++;
                }
                tempSB.append(count).append(result.charAt(j));
            }
            result = tempSB;
        }
        return result.toString();
    }



}

