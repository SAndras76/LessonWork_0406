package main.tasks;

public class MirrorArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 5, 5, 4, 3, 2, 2, 1};

        boolean isMirrorArray = numbers.length > 0;

        for (int i = 0; i < numbers.length / 2; i++) {
            int iFromEnd = numbers.length - 1 - i;

            if (numbers[i] != numbers[iFromEnd]) {
                isMirrorArray = false;
                break;
            }
        }

        System.out.println("Is the array a mirror array? " + isMirrorArray);
    }

    /**
     * Megállapítja egy egész számokat tartalmazó tömbről, hogy az tükörtömb-e vagy sem.
     *
     * Tükörtömb az a tömb, amely "visszafelé olvasva" ugyanaz, mint rendesen olvasva.
     * Például:
     *      [1, 1]
     *      [1, 2, 1]
     *      [1, 2, 2, 1]
     *
     * Nem tükörtömbök például:
     *      []
     *      [0, 1]
     *      [1, 2, 3]
     *      [1, 2, 3, 1]
     */
    public static boolean isMirrorArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int iFromEnd = array.length - 1 - i;

            if (array[i] != array[iFromEnd]) {
                return false;
            }
        }

        return array.length > 0;
    }

}
