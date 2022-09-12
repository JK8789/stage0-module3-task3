package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 10;
        int thirdNumber = 100;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        int linkToFirst = firstNumber;
        int linkToSecond = secondNumber;
        int linkToThird = thirdNumber;
        firstNumber = 15;
        secondNumber = 6;
        thirdNumber = 4;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
