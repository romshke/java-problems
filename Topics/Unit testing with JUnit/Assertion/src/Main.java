class CalculatorTests {

    void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 5);

        Assertions.assertEquals(10, result);
    }
}