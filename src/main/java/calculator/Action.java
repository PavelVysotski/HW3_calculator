package calculator;

public class Action {
    public static void worker() {
        boolean firstLoop = true;
        while (firstLoop) {
            double a = CommandReader.readNumber("Введите первое число: ");
            double b = CommandReader.readNumber("Введите второе число: ");

            boolean secondLoop = true;
            while (secondLoop) {
                System.out.println("1.Сложение.");
                System.out.println("2.Вычитание.");
                System.out.println("3.Умножение.");
                System.out.println("4.Деление.");
                System.out.println("5.Ввести новые числа.");
                System.out.println("6.Выйти из программы \"калькулятор.\"");
                int choice = CommandReader.readChoice("Выберите операцию над числами: ");
                switch (choice) {
                    case 1:
                        System.out.println(MathOperation.addition(a, b));
                        break;
                    case 2:
                        System.out.println(MathOperation.subtraction(a, b));
                        break;
                    case 3:
                        System.out.println(MathOperation.multiplication(a, b));
                        break;
                    case 4:
                        System.out.println(MathOperation.division(a, b));
                        break;
                    case 5:
                        secondLoop = false;
                        break;
                    case 6:
                        firstLoop = false;
                        secondLoop = false;
                        break;
                    default:
                        System.out.println("Не верный выбор, повторите действие.");

                }
            }
        }
    }
}
