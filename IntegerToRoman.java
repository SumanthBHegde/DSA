class Solution {
    public String intToRoman(int num) {
    //     int n = num;
    //     int p = 0;
    //     int i = 1;
    //     String result = ""; 
    //     while(n>0){
    //         int digit = n % 10;
    //         p = (digit)*i;
            
    //         String part = "";
    //         if (p != 0) {
    //             if (i == 1) { // ones place
    //                 part = buildRoman(digit, "I", "V", "X");
    //             } else if (i == 10) { // tens place
    //                 part = buildRoman(digit, "X", "L", "C");
    //             } else if (i == 100) { // hundreds place
    //                 part = buildRoman(digit, "C", "D", "M");
    //             } else { // thousands place
    //                 part = "M".repeat(digit);
    //             }
    //         }

    //         result = part + result;
    //         i *= 10;
    //         n /= 10;
    //     }

    //     return result;
    // }

    // private String buildRoman(int digit, String one, String five, String ten) {
    //     if (digit <= 3) {
    //         return one.repeat(digit);
    //     } else if (digit == 4) {
    //         return one + five;
    //     } else if (digit == 5) {
    //         return five;
    //     } else if (digit <= 8) {
    //         return five + one.repeat(digit - 5);
    //     } else { // digit == 9
    //         return one + ten;
    //     }


        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(symbols[i]);
            }
        }

        return result.toString();

    }
}
