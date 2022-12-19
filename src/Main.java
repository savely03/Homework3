public class Main {
    public static void main(String[] args) {
        task1_2_3();
        task4_5();
        task6_7();
        task8();
    }

    public static void task1_2_3() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.printf("Task1:\n dog: %s, cat: %s, paper: %s\n", dog, cat, paper);

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.printf("Task2\n dog: %s, cat: %s, paper: %s\n", dog, cat, paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.printf("Task3\n dog: %s, cat: %s, paper: %s\n", dog, cat, paper);
    }

    public static void task4_5() {
        var friend = 19;
        System.out.println("Task4:");
        System.out.println(" friend: " + friend);
        friend += 2;
        System.out.println(" friend: " + friend);
        friend /= 7;
        System.out.println(" friend: " + friend);

        System.out.println("Task5:");
        var frog = 3.5;
        System.out.println(" frog: " + frog);
        frog *= 10;
        System.out.println(" frog: " + frog);
        frog /= 3.5;
        System.out.println(" frog: " + frog);
    }

    public static void task6_7() {
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var total = boxer1 + boxer2;
        System.out.println("Task6:");
        System.out.println(" Общий вес двух боксеров: " + total + " кг.");
        var diff1 = boxer2 - boxer1;
        System.out.println(" Разница в весе двух боксеров: " + diff1 + " кг.");

        System.out.println("Task7:");
        var diff2 = boxer2 - boxer1;
        System.out.println(" 1 способ разницы: " + diff2 + " кг.");
        var diff3 = boxer2 % boxer1;
        System.out.println(" 2 способ разницы: " + diff3 + " кг.");
    }

    public static void task8() {
        System.out.println("Task8: ");
        var totalHours = 640;
        var empHours = 8;
        var totalEmp = 640 / empHours;
        System.out.println(" Всего работников в компании: " + totalEmp + " чел.");

        totalEmp += 94;
        totalHours = totalEmp * 8;
        System.out.println(" Если в компании работает " + totalEmp + " человек, " +
                "то всего " + totalHours + " часов работы между сотрудниками.");
    }
}