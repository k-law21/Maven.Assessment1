package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        if (ints.length == 0)
            return null;

        if (ints.length == 1 && ints[0] % 2 > 0)
            return ints;

        int oddCount = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 > 0) {
                oddCount++;
            }
        }

        Integer result[] = new Integer[oddCount];
        oddCount = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 > 0) {
                result[oddCount++] = ints[i];
            }
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        if (ints.length == 0)
            return null;

        if (ints.length == 1 && ints[0] % 2 > 0)
            return ints;

        int evenCount = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                evenCount++;
            }
        }

        Integer result[] = new Integer[evenCount];
        evenCount = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                result [evenCount++] = ints[i];
            }
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {



        return null;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        return null;
    }
}
