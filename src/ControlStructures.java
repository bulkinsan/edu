import java.math.BigInteger;

public class ControlStructures {
    public static void controlStructures() {
        System.out.println(factorial(10));
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= value; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
            System.out.println(result);
        };
        return result; // your implementation here
    }
}
