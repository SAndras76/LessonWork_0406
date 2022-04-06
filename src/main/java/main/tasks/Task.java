package main.tasks;

import main.WithoutTest;

public class Task {

    /**
     * Megkeresi az n. prímszámot. (Az első prímszám a 2)
     *
     * Biztos lehetsz benne, hogy a bemeneti paraméterként kapott n értéke pozitív egész szám.
     */
    public static int findNthPrime(int n) {
        int checkNumber = 1;
        int counter = 0;

        while (counter < n) {
            checkNumber++;
            if (WithoutTest.isPrime(checkNumber)) {
                counter++;
            }
        }

        return checkNumber;
    }

    /**
     * Megszámolja, hogy adott karakter hányszor szerepel a szövegben.
     *
     * Biztos lehet benne, hogy a szöveg hossza nagyobb 0-nál.
     */
    public static int countLetterInText(String text, char letter) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * Megszámolja, hogy adott elem hányszor szerepel a tömbben.
     */
    public static int countElemInArray(int[] array, int elem) {
        int counter = 0;

        for (int element : array) {
            if (element == elem) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * Megkeresi a tömb legtöbbször előforduló elemét.
     * Holtverseny esetén a legelső találatot adja vissza.
     *
     * Például:
     *      int[] array = {1, 2, 1, 2};
     *          megoldás: 1
     *              noha 1 és 2 is ugyanannyiszor fordul elő a tömbben, de az 1 előbb van
     *      int[] array = {2, 1, 2, 1};
     *          megoldás: 2
     *              ezúttal a 2-t találja meg előbb, ezért ez a megoldás
     */
    public static int findMostFrequentElem(int[] array) {
        int checkedElem = 0;
        int counter = 0;

        for (int elem : array) {
            int occurrence = countElemInArray(array, elem);
            if (occurrence > counter) {
                counter = occurrence;
                checkedElem = elem;
            }
        }

        return checkedElem;
    }

    /**
     * Az array nevű bemeneti paraméterként kapott tömbben minden elem párosával szerepel, kivéve egyetlen elemet.
     * Például:
     *      int[] array = {1, 2, 1, 3, 2, 1, 1};
     *          a megoldás ennél a tömbnél: 3
     *              1 összesen 4-szer szerepel
     *              2 összesen 2-szer szerepel
     *              3 egyedül szerepel
     *
     * A metódus megkeresi a tömbben egyedül, vagyis pár nélkül szereplő elemet, és visszatér az értékével
     *
     * Biztos lehetsz benne, hogy a tömb tartalmaz elemeket (azaz a hossza legalább 1), és csak egy elemnek nincsen párja,
     * valamint egy elemnek biztosan nincsen párja.
     * Az összes többi elem párosával szerepel benne (2-szer, 4-szer, 6-szor stb.)
     */
    public static int findLonelyElem(int[] array) {
        int result = 0;

        for (int elem : array) {
            result ^= elem;
        }

        return result;

        /* explanation
        XOR is a bitwise operator, operates the bits of two numbers
        it returns 1 only if the two bits are different
        if the two bits are the same (no matter that they are 0-0 or 1-1), then 0 will be returned
        because of that, same numbers will "destroy" each other...
        ...because same numbers have same bits, so 0 will be returned
            for example:
                    in binary:      101 ^ 101 = 000
                    in decimal:     5 ^ 5 = 0
        but see what happens if we XOR one different number with two same numbers...
            5 ^ 2 ^ 5 = ?
                first step:
                    in binary:      101 ^ 010 = 111
                    in decimal:     5 ^ 2 = 7
                second step:
                    in binary:      111 ^ 101 = 010
                    in decimal:     7 ^ 5 = 2
            so 5 ^ 2 ^ 5 = 2
        it seems that the "lonely" number is simply added
        Q.E.D.
         */

    }

}
