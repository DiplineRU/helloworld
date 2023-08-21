public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир!");
        System.out.println("Hello world!");

        //домашка
        //Задача 1.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Переменная dog " + dog);
        System.out.println("Переменная cat " + cat);
        System.out.println("Переменная paper " + paper);
        System.out.println("---------------------------------------------");

        //Задача 2.
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println("Переменная dog " + dog);
        System.out.println("Переменная cat " + cat);
        System.out.println("Переменная paper " + paper);
        System.out.println("---------------------------------------------");

        //Задача 3.
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Переменная dog " + dog);
        System.out.println("Переменная cat " + cat);
        System.out.println("Переменная paper " + paper);
        System.out.println("---------------------------------------------");

        //Задача 4.
        var friend = 19;
        friend = (friend + 2) / 7;
        System.out.println("Переменная friend " + friend);
        System.out.println("---------------------------------------------");

        //Задача 5.
        var frog = 3.5;
        frog = frog * 10 / 3.5 + 4;
        System.out.println("Переменная frog " + frog);
        System.out.println("---------------------------------------------");

        //Задача 6.
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeightSeondBoxer = firstBoxer + secondBoxer;
        System.out.println("Масса двух боксеров " + totalWeightSeondBoxer);
        var weightDiffrence = secondBoxer - firstBoxer;
        System.out.println("Разница между массами бойцов " + weightDiffrence + " кг!");
        System.out.println("---------------------------------------------");

        //Задача 7.
        var firstSolution = secondBoxer - firstBoxer;
        var secondSolution = secondBoxer % firstBoxer;

        //В условии не написано вывести на консоль результат, но все равно ответ правильный (4.5)
        //System.out.println(firstSolution);
        //System.out.println(secondSolution);

        //Задача 8.
        var totalHours = 640;
        var totalEmployees = totalHours / 8;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        var hourseForOneEmployees = totalHours / totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + hourseForOneEmployees + " часов работы может быть поделено между сотрудниками");


    }
}