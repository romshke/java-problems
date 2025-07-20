class ArmstrongNumber {
    static String checkArmstrong(int number) {
        int sum = 0, temp = number, digits = String.valueOf(number).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        if (sum == number) {
            return number + " is an Armstrong number!";
        } else {
            return number + " is not an Armstrong number!";
        }
    }
}
