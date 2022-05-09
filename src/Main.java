public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        //При вычислении переменной 'c' в знаменателе получился ноль, а на ноль делить нельзя.
        //Поэтому одно из возможных решений проблемы это обработать исключение.

        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException exception) {
            System.out.println("Делить на ноль нельзя");
        }
    }
}