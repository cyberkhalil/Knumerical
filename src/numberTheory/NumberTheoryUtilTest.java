//package numberTheory;
//
//import java.util.ArrayList;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//public class NumberTheoryUtilTest {
//
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    public NumberTheoryUtilTest() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of divisors method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testDivisors() {
//        System.out.println("divisors");
//        long number = -12L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        expResult.add(1L);
//        expResult.add(2L);
//        expResult.add(3L);
//        expResult.add(4L);
//        expResult.add(6L);
//        expResult.add(12L);
//        expResult.add(-1L);
//        expResult.add(-2L);
//        expResult.add(-3L);
//        expResult.add(-4L);
//        expResult.add(-6L);
//        expResult.add(-12L);
//        ArrayList<Long> result = NumberTheoryUtil.divisors(number);
//        assertEquals(expResult, result);
//
//        System.out.println("divisors");
//        number = -1L;
//        expResult = new ArrayList<>();
//        expResult.add(1L);
//        expResult.add(-1L);
//        result = NumberTheoryUtil.divisors(number);
//        assertEquals(expResult, result);
//
//        System.out.println("divisors");
//        number = 1L;
//        expResult = new ArrayList<>();
//        expResult.add(1L);
//        result = NumberTheoryUtil.divisors(number);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of isPrime method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testIsPrime() {
//        System.out.println("isPrime");
//        long number = 200000000L;
//        boolean expResult = false;
//        boolean result = NumberTheoryUtil.isPrime(number);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of gcd method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testGcd_long_long() {
//        System.out.println("gcd");
//        long a = 1000L;
//        long b = -7L;
//        long expResult = 1L;
//        long result = NumberTheoryUtil.gcd(a, b);
//        assertEquals(expResult, result);
//
//    }
//
//    /**
//     * Test of lcm method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testLcm() {
//        System.out.println("lcm");
//        long a = 1000L;
//        long b = -7L;
//        long expResult = 7000L;
//        long result = NumberTheoryUtil.lcm(a, b);
//        assertEquals(expResult, result);
//    }
//
////    /**
////     * Test of remainder method, of class NumberTheoryUtil.
////     */
////    @Test
////    public void testRemainder() {
////        System.out.println("remainder");
////        long[] line = {1000, -143, -7, 1};
////        long[] expResult = {1, 1000, 143, -7};
////        long[] result = NumberTheoryUtil.remainder(line);
////        assertArrayEquals(expResult, result);
////    }
//    /**
//     * Test of diophantineSolve method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testDiophantineSolve() {
//        System.out.println("diophantineSolve");
//        long xCoefficient = 172L;
//        long yCoefficient = 20L;
//        long expression = 1000L;
//        long[] expResult = {500, 5, -4250, -43};
//        long[] result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
//        assertArrayEquals(expResult, result);
//
//        xCoefficient = 54L;
//        yCoefficient = 21L;
//        expression = 906L;
//        expResult = new long[]{604, 7, -1510, -18};
//        result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
//        assertArrayEquals(expResult, result);
//
//        xCoefficient = 18L;
//        yCoefficient = 5L;
//        expression = 48L;
//        expResult = new long[]{96, 5, -336, -18};
//        result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
//        assertArrayEquals(expResult, result);
//
//        xCoefficient = 123L;
//        yCoefficient = 360L;
//        expression = 99L;
//        expResult = new long[]{1353, 120, -462, -41};
//        result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
//        assertArrayEquals(expResult, result);
//
//        xCoefficient = 158L;
//        yCoefficient = -57L;
//        expression = 7L;
//        expResult = new long[]{-154, -57, -427, -158};
//        result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
//        assertArrayEquals(expResult, result);
//
//        xCoefficient = 95L;
//        yCoefficient = 25L;
//        expression = 1500L;
//        expResult = new long[]{-300, 5, 1200, -19};
//        result = NumberTheoryUtil.diophantineSolve(xCoefficient, yCoefficient, expression);
//        assertArrayEquals(expResult, result);
//
//    }
//
//    /**
//     * Test of primeDivisors method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testPrimeDivisors() {
//        System.out.println("primeDivisors");
//        long number = -1L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        ArrayList<Long> result = NumberTheoryUtil.primeDivisors(number);
//        assertEquals(expResult, result);
//
//        System.out.println("primeDivisors");
//        number = 31L;
//        expResult = new ArrayList<>();
//        expResult.add(31L);
//        result = NumberTheoryUtil.primeDivisors(number);
//        assertEquals(expResult, result);
//
//        System.out.println("primeDivisors");
//        number = 124L;
//        expResult = new ArrayList<>();
//        expResult.add(2L);
//        expResult.add(31L);
//        result = NumberTheoryUtil.primeDivisors(number);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primeDivisors method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2PrimeDivisors() {
//        System.out.println("2 primeDivisors");
//        long number = 1234L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        expResult.add(2L);
//        expResult.add(617L);
//        ArrayList<Long> result = NumberTheoryUtil.primeDivisors(number);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of gcdAsLinearCombination method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testGcdAsLinearCombination() {
//        System.out.println("gcdAsLinearCombination");
//        long a = 184L;
//        long b = 222L;
//        long[] expResult = {2, 35, 184, -29, 222};
//        long[] result = NumberTheoryUtil.gcdAsLinearCombination(a, b);
//        assertArrayEquals(expResult, result);
//    }
//
//    /**
//     * Test of gcdAsLinearCombination method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2GcdAsLinearCombination() {
//        System.out.println("2 gcdAsLinearCombination");
//        long a = 10L;
//        long b = 5L;
//        long[] expResult = {5, 1, 5, 0, 10};
//        long[] result = NumberTheoryUtil.gcdAsLinearCombination(a, b);
//        assertArrayEquals(expResult, result);
//    }
//
//    /**
//     * Test of gcdAsLinearCombination method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test3GcdAsLinearCombination() {
//        System.out.println("3 gcdAsLinearCombination");
//        long a = -10L;
//        long b = 5L;
//        long[] expResult = {5, 1, 5, 0, -10};
//        long[] result = NumberTheoryUtil.gcdAsLinearCombination(a, b);
//        assertArrayEquals(expResult, result);
//    }
//
//    /**
//     * Test of gcdAsLinearCombination method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test4GcdAsLinearCombination() {
//        System.out.println("4 gcdAsLinearCombination");
//        long a = -3L;
//        long b = 2L;
//        long[] expResult = {1, 1, - 3, 2, 2};
//        long[] result = NumberTheoryUtil.gcdAsLinearCombination(a, b);
//        assertArrayEquals(expResult, result);
//    }
//
//    /**
//     * Test of gcdAsLinearCombination method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test5GcdAsLinearCombination() {
//        System.out.println("gcdAsLinearCombination");
//        long a = 7L;
//        long b = -5L;
//        long[] expResult = {1, 3, 7, 4, -5};
//        long[] result = NumberTheoryUtil.gcdAsLinearCombination(a, b);
//        assertArrayEquals(expResult, result);
//    }
//
//    /**
//     * Test of primeFactorization method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2PrimeFactorization() {
//        System.out.println("primeFactorization");
//        long number = -10L;
//        ArrayList<String> expResult = new ArrayList<>();
//        expResult.add("2");
//        expResult.add("5");
//        ArrayList<String> result = NumberTheoryUtil.primeFactorization(number);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of mod method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testMod() {
//        System.out.println("mod");
//        long a = -20L;
//        long n = 7L;
//        long expResult = 1L;
//        long result = NumberTheoryUtil.mod(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of isRelativePrime method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testIsRelativePrime() {
//        System.out.println("isRelativePrime");
//        long a = 13L;
//        long b = 24L;
//        boolean expResult = true;
//        boolean result = NumberTheoryUtil.isRelativePrime(a, b);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of gcd method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testGcd_ArrayList() {
//        System.out.println("gcd_ArrayList");
//        long[] array = {84651L, 651L, 854L};
//        long expResult = 7;
//        long result = NumberTheoryUtil.gcd(array);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of gcd method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2Gcd_Array() {
//        System.out.println("2 gcd_Array");
//        long[] array = {84651L, 651L};
//        long expResult = 21;
//        long result = NumberTheoryUtil.gcd(array);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of gcdLines method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testGcdLines() {
//        System.out.println("gcdLines");
//        long a = 172L;
//        long b = 42L;
//        ArrayList<long[]> expResult = new ArrayList<>();
//        expResult.add(new long[]{172, 4, 42, 4});
//        expResult.add(new long[]{42, 10, 4, 2});
//        expResult.add(new long[]{4, 2, 2, 0});
//        ArrayList<long[]> result = NumberTheoryUtil.gcdLines(a, b);
//        for (int i = 0; i < result.size(); i++) {
//            assertArrayEquals(expResult.get(i), result.get(i));
//        }
//    }
//
//    /**
//     * Test of gcdLines method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2GcdLines() {
//        System.out.println("2 gcdLines");
//        long a = -3L;
//        long b = 2L;
//        ArrayList<long[]> expResult = new ArrayList<>();
//        expResult.add(new long[]{-3L, -2L, 2L, 1L});
//        expResult.add(new long[]{2L, 2L, 1L, 0L});
//        ArrayList<long[]> result = NumberTheoryUtil.gcdLines(a, b);
//        for (int i = 0; i < result.size(); i++) {
//            assertArrayEquals(expResult.get(i), result.get(i));
//        }
//    }
//
//    /**
//     * Test of gcdLines method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test3GcdLines() {
//        System.out.println("3 gcdLines");
//        long a = 10L;
//        long b = 5L;
//        ArrayList<long[]> expResult = new ArrayList<>();
//        expResult.add(new long[]{10L, 2L, 5L, 0L});
//        ArrayList<long[]> result = NumberTheoryUtil.gcdLines(a, b);
//        for (int i = 0; i < result.size(); i++) {
//            assertArrayEquals(expResult.get(i), result.get(i));
//        }
//    }
//
//    /**
//     * Test of gcdLines method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test4GcdLines() {
//        System.out.println("4 gcdLines");
//        long a = 4L;
//        long b = 5L;
//        ArrayList expResult = new ArrayList();
//        expResult.add(new long[]{4, 0, 5, 4});
//        expResult.add(new long[]{5, 1, 4, 1});
//        expResult.add(new long[]{4, 4, 1, 0});
//        ArrayList result = NumberTheoryUtil.gcdLines(a, b);
//        for (int i = 0; i < result.size(); i++) {
//            assertArrayEquals((long[]) expResult.get(i), (long[]) result.get(i));
//        }
//    }
//
//    /**
//     * Test of gcdLines method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test5GcdLines() {
//        System.out.println("gcdLines");
//        long a = 184L;
//        long b = 222L;
//        ArrayList expResult = new ArrayList();
//        expResult.add(new long[]{184, 0, 222, 184});
//        expResult.add(new long[]{222, 1, 184, 38});
//        expResult.add(new long[]{184, 4, 38, 32});
//        expResult.add(new long[]{38, 1, 32, 6});
//        expResult.add(new long[]{32, 5, 6, 2});
//        expResult.add(new long[]{6, 3, 2, 0});
//        ArrayList result = NumberTheoryUtil.gcdLines(a, b);
//        for (int i = 0; i < result.size(); i++) {
//            assertArrayEquals((long[]) expResult.get(i), (long[]) result.get(i));
//        }
//    }
//
//    /**
//     * Test of gcdLines method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test6GcdLines() {
//        System.out.println("gcdLines");
//        long a = 7L;
//        long b = -5;
//        ArrayList expResult = new ArrayList();
//        expResult.add(new long[]{7, -1, -5, 2});
//        expResult.add(new long[]{-5, -3, 2, 1});
//        expResult.add(new long[]{2, 2, 1, 0});
//        ArrayList result = NumberTheoryUtil.gcdLines(a, b);
//        for (int i = 0; i < result.size(); i++) {
//            assertArrayEquals((long[]) expResult.get(i), (long[]) result.get(i));
//        }
//    }
//
//    /**
//     * Test of isCongurent method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testIsCongurent() {
//        System.out.println("isCongurent");
//        long a = 10L;
//        long b = 4L;
//        long n = 4L;
//        boolean expResult = false;
//        boolean result = NumberTheoryUtil.isCongurent(a, b, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of linearCongurentSolve method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testLinearCongurentSolve_3args() {
//        System.out.println("linearCongurentSolve");
//        long a = 6L;
//        long c = 3L;
//        long n = 5L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        expResult.add(3L);
//        ArrayList<Long> result = NumberTheoryUtil.linearCongurentSolve(a, c, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of chineseRemainderSolve method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testChineseRemainderSolve() {
//        System.out.println("chineseRemainderSolve");
//        ArrayList<Long[]> equations = new ArrayList<>();
//        equations.add(new Long[]{2L, 3L});
//        equations.add(new Long[]{3L, 5L});
//        equations.add(new Long[]{2L, 7L});
//        long[] expResult = {23L, 105L};
//        long[] result = NumberTheoryUtil.chineseRemainderSolve(equations);
//        Assert.assertArrayEquals(expResult, result);
//    }
//
//    /**
//     * Test of gcd method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testGcd_longArr() {
//        System.out.println("gcd");
//        long[] array = {4, 94, 46, 152};
//        long expResult = 2L;
//        long result = NumberTheoryUtil.gcd(array);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of divisionAlgorithm method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testDivisionAlgorithm() {
//        System.out.println("UniqueRepresntation");
//        long a = 1000L;
//        long b = -7L;
//        long[] expResult = {1000, -142, -7, 6};
//        long[] result = NumberTheoryUtil.divisionAlgorithm(a, b);
//        assertArrayEquals(expResult, result);
//    }
//
//    /**
//     * Test of linearCongurentSolve method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testLinearCongurentSolve() {
//        System.out.println("linearCongurentSolve");
//        long a = 18L;
//        long b = 30L;
//        long n = 42L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        expResult.add(4L);
//        expResult.add(11L);
//        expResult.add(18L);
//        expResult.add(25L);
//        expResult.add(32L);
//        expResult.add(39L);
//        ArrayList<Long> result = NumberTheoryUtil.linearCongurentSolve(a, b, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of linearCongurentSolve method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2LinearCongurentSolve() {
//        System.out.println("2 linearCongurentSolve");
//        long a = 9L;
//        long b = 21L;
//        long n = 30L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        expResult.add(9L);
//        expResult.add(19L);
//        expResult.add(29L);
//        ArrayList<Long> result = NumberTheoryUtil.linearCongurentSolve(a, b, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of decToBinPowerToGetModulo method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testDecToBinPowerToGetModulo() {
//        System.out.println("decToBinPowerToGetModulo");
//        long a = 5L;
//        long power = 110L;
//        long n = 131L;
//        long expResult = 60L;
//        long result = NumberTheoryUtil.decToBinPowerToGetModulo(a, power, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of decToBinPowerToGetModulo method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2DecToBinPowerToGetModulo() {
//        System.out.println("2 decToBinPowerToGetModulo");
//        long a = 19L;
//        long power = 53L;
//        long n = 503L;
//        long expResult = 406L;
//        long result = NumberTheoryUtil.decToBinPowerToGetModulo(a, power, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of tau method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testTau() {
//        System.out.println("tau");
//        long n = 12L;
//        long expResult = 6L;
//        long result = NumberTheoryUtil.tau(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of tau method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2Tau() {
//        System.out.println("tau");
//        long n = 10L;
//        long expResult = 4L;
//        long result = NumberTheoryUtil.tau(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of tau method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test3Tau() {
//        System.out.println("tau");
//        long n = 180L;
//        long expResult = 18L;
//        long result = NumberTheoryUtil.tau(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of tau method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test4Tau() {
//        System.out.println("tau");
//        long n = 9L;
//        long expResult = 3;
//        long result = NumberTheoryUtil.tau(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of tau method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test5Tau() {
//        System.out.println("tau");
//        long n = 20L;
//        long expResult = 6L;
//        long result = NumberTheoryUtil.tau(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of sigma method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testSigma() {
//        System.out.println("sigma");
//        long n = 12L;
//        long expResult = 28L;
//        long result = NumberTheoryUtil.sigma(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of sigma method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2Sigma() {
//        System.out.println("sigma");
//        long n = 10L;
//        long expResult = 18L;
//        long result = NumberTheoryUtil.sigma(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of sigma method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test3Sigma() {
//        System.out.println("sigma");
//        long n = 180L;
//        long expResult = 546L;
//        long result = NumberTheoryUtil.sigma(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of sigma method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test4Sigma() {
//        System.out.println("sigma");
//        long n = 9L;
//        long expResult = 13L;
//        long result = NumberTheoryUtil.sigma(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of sigma method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test5Sigma() {
//        System.out.println("sigma");
//        long n = 20L;
//        long expResult = 42L;
//        long result = NumberTheoryUtil.sigma(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primeFactorization method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testPrimeFactorization_long_boolean() {
//        System.out.println("primeFactorization");
//        long number = -700L;
//        boolean isPow1hidden = false;
//        ArrayList<String> expResult = new ArrayList<>();
//        expResult.add("2^2");
//        expResult.add("5^2");
//        expResult.add("7^1");
//        ArrayList<String> result = NumberTheoryUtil.primeFactorization(number, isPow1hidden);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primeFactorization method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2PrimeFactorization_long_boolean() {
//        System.out.println("primeFactorization");
//        long number = -700L;
//        boolean isPow1hidden = true;
//        ArrayList<String> expResult = new ArrayList<>();
//        expResult.add("2^2");
//        expResult.add("5^2");
//        expResult.add("7");
//        ArrayList<String> result = NumberTheoryUtil.primeFactorization(number, isPow1hidden);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primeFactorization method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test3PrimeFactorization_long_boolean() {
//        System.out.println("primeFactorization");
//        long number = -10L;
//        boolean isPow1hidden = true;
//        ArrayList<String> expResult = new ArrayList<>();
//        expResult.add("2");
//        expResult.add("5");
//        ArrayList<String> result = NumberTheoryUtil.primeFactorization(number, isPow1hidden);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primeFactorization method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test4PrimeFactorization_long_boolean() {
//        System.out.println("primeFactorization");
//        long number = -10L;
//        boolean isPow1hidden = false;
//        ArrayList<String> expResult = new ArrayList<>();
//        expResult.add("2^1");
//        expResult.add("5^1");
//        ArrayList<String> result = NumberTheoryUtil.primeFactorization(number, isPow1hidden);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primeFactorization method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testPrimeFactorization_long() {
//        System.out.println("primeFactorization");
//        long number = -700L;
//        ArrayList<String> expResult = new ArrayList<>();
//        expResult.add("2^2");
//        expResult.add("5^2");
//        expResult.add("7");
//        ArrayList<String> result = NumberTheoryUtil.primeFactorization(number);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primeFactorization method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2PrimeFactorization_long() {
//        System.out.println("2 primeFactorization");
//        long number = -10L;
//        ArrayList<String> expResult = new ArrayList<>();
//        expResult.add("2");
//        expResult.add("5");
//        ArrayList<String> result = NumberTheoryUtil.primeFactorization(number);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testPhi() {
//        System.out.println("phi");
//        long n = 1L;
//        long expResult = 1L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2Phi() {
//        System.out.println("phi");
//        long n = 2L;
//        long expResult = 1L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test3Phi() {
//        System.out.println("phi");
//        long n = 3L;
//        long expResult = 2L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test4Phi() {
//        System.out.println("phi");
//        long n = 4L;
//        long expResult = 2L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test5Phi() {
//        System.out.println("phi");
//        long n = 5L;
//        long expResult = 4L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test6Phi() {
//        System.out.println("phi");
//        long n = 6L;
//        long expResult = 2L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test7Phi() {
//        System.out.println("phi");
//        long n = 7L;
//        long expResult = 6L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test8Phi() {
//        System.out.println("phi");
//        long n = 8L;
//        long expResult = 4L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test9Phi() {
//        System.out.println("phi");
//        long n = 9L;
//        long expResult = 6L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test10Phi() {
//        System.out.println("phi");
//        long n = 10L;
//        long expResult = 4L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test11Phi() {
//        System.out.println("phi");
//        long n = 16L;
//        long expResult = 8L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test12Phi() {
//        System.out.println("phi");
//        long n = 35L;
//        long expResult = 24L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test13Phi() {
//        System.out.println("phi");
//        long n = 90L;
//        long expResult = 24L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test14Phi() {
//        System.out.println("phi");
//        long n = 180L;
//        long expResult = 48L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test15Phi() {
//        System.out.println("phi");
//        long n = 9000L;
//        long expResult = 2400L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of phi method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test16Phi() {
//        System.out.println("phi");
//        long n = 17L; //especially for primes consisting of more tahn two digits
//        long expResult = 16L;
//        long result = NumberTheoryUtil.phi(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testStrPow() {
//        System.out.println("strPow");
//        String s = "2^4";
//        long expResult = 16L;
//        long result = NumberTheoryUtil.strPow(s);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2StrPow() {
//        System.out.println("strPow");
//        String s = "(24)";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            assertEquals(ile.getMessage(), "Cant find '^' char in the given string");
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test3StrPow() {
//        System.out.println("strPow");
//        String s = "(2^4";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            int indexOfPoweSign = s.indexOf('^');
//            final int sLength = s.length();
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected a closing paranthese at char with index" + indexOfPoweSign + " or " + (sLength - 1));
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test4StrPow() {
//        System.out.println("strPow");
//        String s = "2)^4";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected an opening paranthese at char with index 0");
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test5StrPow() {
//        System.out.println("strPow");
//        String s = "(2)^4";
//        long expResult = 16L;
//        long result = NumberTheoryUtil.strPow(s);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test6StrPow() {
//        System.out.println("strPow");
//        String s = "2^(4";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            final int sLength = s.length();
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected a closing paranthese at char with index" + (sLength - 1));
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test7StrPow() {
//        System.out.println("strPow");
//        String s = "(2^(4";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            int indexOfPoweSign = s.indexOf('^');
//            final int sLength = s.length();
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected a closing paranthese at char with index" + indexOfPoweSign + " or " + (sLength - 1));
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test8StrPow() {
//        System.out.println("strPow");
//        String s = "2)^(4";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected an opening paranthese at char with index 0");
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test9StrPow() {
//        System.out.println("strPow");
//        String s = "(2)^(4";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            final int sLength = s.length();
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected a closing paranthese at char with index" + (sLength - 1));
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test10StrPow() {
//        System.out.println("strPow");
//        String s = "2^4)";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            int indexOfPoweSign = s.indexOf('^');
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected an opening paranthese at char with index 0 or " + (indexOfPoweSign + 1));
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test11StrPow() {
//        System.out.println("strPow");
//        String s = "(2^4)";
//        long expResult = 16L;
//        long result = NumberTheoryUtil.strPow(s);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test12StrPow() {
//        System.out.println("strPow");
//        String s = "2)^4)";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected an opening paranthese at char with index 0");
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test13StrPow() {
//        System.out.println("strPow");
//        String s = "(2)^4)";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            int indexOfPoweSign = s.indexOf('^');
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected an opening paranthese at char with index " + (indexOfPoweSign + 1));
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test14StrPow() {
//        System.out.println("strPow");
//        String s = "2^(4)";
//        long expResult = 16L;
//        long result = NumberTheoryUtil.strPow(s);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test15StrPow() {
//        System.out.println("strPow");
//        String s = "(2^(4)";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            int indexOfPoweSign = s.indexOf('^');
//            final int sLength = s.length();
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected a closing paranthese at char with index" + indexOfPoweSign + " or " + (sLength - 1));
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test16StrPow() {
//        System.out.println("strPow");
//        String s = "2)^(4)";
//        try {
//            NumberTheoryUtil.strPow(s);
//            fail("Exception expected");
//        } catch (IllegalArgumentException ile) {
//            assertEquals(ile.getMessage(), "The string does NOT have equal paranthes. expected an opening paranthese at char with index 0");
//        }
//    }
//
//    /**
//     * Test of strPow method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test17StrPow() {
//        System.out.println("strPow");
//        String s = "(2)^(4)";
//        long expResult = 16L;
//        long result = NumberTheoryUtil.strPow(s);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of hasOrder method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testHasOrder() {
//        System.out.println("hasOrder");
//        long a = 2L;
//        long n = 7L;
//        boolean expResult = true;
//        boolean result = NumberTheoryUtil.hasOrder(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of hasOrder method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2HasOrder() {
//        System.out.println("hasOrder");
//        long a = 2L;
//        long n = 8L;
//        boolean expResult = false;
//        boolean result = NumberTheoryUtil.hasOrder(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of order method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testOrder() {
//        System.out.println("order");
//        long a = 2L;
//        long n = 7L;
//        long expResult = 3L;
//        long result = NumberTheoryUtil.order(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of order method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2Order() {
//        System.out.println("order");
//        long a = 2L;
//        long n = 17L;
//        long expResult = 8L;
//        long result = NumberTheoryUtil.order(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of order method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test3Order() {
//        System.out.println("order");
//        long a = 3L;
//        long n = 17L;
//        long expResult = 16L;
//        long result = NumberTheoryUtil.order(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of order method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test4Order() {
//        System.out.println("order");
//        long a = 5L;
//        long n = 17L;
//        long expResult = 16L;
//        long result = NumberTheoryUtil.order(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of order method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test5Order() {
//        System.out.println("order");
//        long a = 3L;
//        long n = 7L;
//        long expResult = 6L;
//        long result = NumberTheoryUtil.order(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of isPrimitiveRoot method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testIsPrimitiveRoot() {
//        System.out.println("isPrimitiveRoot");
//        long a = 2L;
//        long n = 7L;
//        boolean expResult = false;
//        boolean result = NumberTheoryUtil.isPrimitiveRoot(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of isPrimitiveRoot method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2IsPrimitiveRoot() {
//        System.out.println("isPrimitiveRoot");
//        long a = 2L;
//        long n = 17L;
//        boolean expResult = false;
//        boolean result = NumberTheoryUtil.isPrimitiveRoot(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of isPrimitiveRoot method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test3IsPrimitiveRoot() {
//        System.out.println("isPrimitiveRoot");
//        long a = 3L;
//        long n = 17L;
//        boolean expResult = true;
//        boolean result = NumberTheoryUtil.isPrimitiveRoot(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of isPrimitiveRoot method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test4IsPrimitiveRoot() {
//        System.out.println("isPrimitiveRoot");
//        long a = 5L;
//        long n = 17L;
//        boolean expResult = true;
//        boolean result = NumberTheoryUtil.isPrimitiveRoot(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of isPrimitiveRoot method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test5IsPrimitiveRoot() {
//        System.out.println("isPrimitiveRoot");
//        long a = 3L;
//        long n = 7L;
//        boolean expResult = true;
//        boolean result = NumberTheoryUtil.isPrimitiveRoot(a, n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of relativlyPrimes method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testRelativlyPrimes() {
//        System.out.println("relativlyPrimes");
//        long n = 20L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        expResult.add(1L);
//        expResult.add(3L);
//        expResult.add(7L);
//        expResult.add(9L);
//        expResult.add(11L);
//        expResult.add(13L);
//        expResult.add(17L);
//        expResult.add(19L);
//        ArrayList<Long> result = NumberTheoryUtil.relativlyPrimes(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primitiveRoots method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void testPrimitiveRoots() {
//        System.out.println("primitiveRoots");
//        long n = 15L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        ArrayList<Long> result = NumberTheoryUtil.primitiveRoots(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primitiveRoots method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test2PrimitiveRoots() {
//        System.out.println("primitiveRoots");
//        long n = 21L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        ArrayList<Long> result = NumberTheoryUtil.primitiveRoots(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primitiveRoots method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test3PrimitiveRoots() {
//        System.out.println("primitiveRoots");
//        long n = 6L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        expResult.add(5L);
//        ArrayList<Long> result = NumberTheoryUtil.primitiveRoots(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primitiveRoots method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test4PrimitiveRoots() {
//        System.out.println("primitiveRoots");
//        long n = 31L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        expResult.add(3L);
//        expResult.add(17L);
//        expResult.add(24L);
//        expResult.add(22L);
//        expResult.add(12L);
//        expResult.add(11L);
//        expResult.add(21L);
//        ArrayList<Long> result = NumberTheoryUtil.primitiveRoots(n);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of primitiveRoots method, of class NumberTheoryUtil.
//     */
//    @Test
//    public void test5PrimitiveRoots() {
//        System.out.println("primitiveRoots");
//        long n = 7L;
//        ArrayList<Long> expResult = new ArrayList<>();
//        expResult.add(3L);
//        expResult.add(5L);
//        ArrayList<Long> result = NumberTheoryUtil.primitiveRoots(n);
//        assertEquals(expResult, result);
//    }
//}
