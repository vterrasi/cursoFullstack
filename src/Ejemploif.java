public class Ejemploif {
    public static void main() {
            byte aByte = 8;
            short aShort = 2;
            int aInt = 3;
            long aLong = 4;

            float aFloat = 5;
            double aDouble = 6;

            boolean bool = true;

            char c = 'c';
            String s = "Kirena";

            if (aShort > aByte) {
                System.out.println("aShort > aByte");

            } else {
                System.out.println("aShort = aByte");
            }

            if (aInt > aShort) {
                if (aInt > aByte) {
                    System.out.println("aInt > aShort y aInt > aByte");



                }
            }

            if (c == 'a'){
                System.out.println("Es una a");
            } else if (c == 'b') {
                System.out.println("Es una b");
            } else {
                System.out.println();
            }
            //if (bool == true){
            if (bool) {
                System.out.println("El boolean es true");
            }

                }
        }

