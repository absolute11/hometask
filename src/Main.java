public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(3, 2);
        int b = calc.minus.apply(2,1);
        int c;//ошибка заключалась в том, что выбрасовалось исключение,в котором говорилось о том, что на ноль делить нельзя
        if (b != 0) {
            c = calc.devide.apply(a, b);
        } else {
            System.out.println("Ошибка: деление на ноль");
            return;
        }
         c = calc.devide.apply(a, b);
        calc.println.accept(c);

    }
}