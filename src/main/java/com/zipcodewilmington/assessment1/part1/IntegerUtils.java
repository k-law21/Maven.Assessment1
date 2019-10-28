package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        for (int i = 0; i <= n; ++i) {
            // sum = sum + i;
            sum += i;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {

        int prod = 1;
        for (int i = 1; i <= n; ++i) {
            // sum = sum + i;
            prod *= i;
        }
        return prod;
    }
        /**
         * @param val integer value input by client
         * @return integer with identical digits in the reverse order
         */
        public static Integer reverseDigits (Integer val){

            int rev_num = 0;
            while(val > 0)
            {
                rev_num = rev_num * 10 + val % 10;
                val = val / 10;
            }
            return rev_num;
        }

}


