public class Main {
    public static void main(String[] args) throws Exception{
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
        //в данном случае в методе divide делитель равен нулю. Чтобы избежать ошибки, можно
        //обернуть в try{}catch(ArithmeticException...) 6 и 7ю строки кода  Второй вариант -
        //в классе Calculator переопределить метод divide: (x, y) -> y!= 0 ? x / y : 0 ; однако это не совсем
        //корректно с точки зрения арифметики.
    }
}
