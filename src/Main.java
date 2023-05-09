// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2 () {
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            dog = dog + 4;
            cat = cat + 4;
            paper = paper + 4;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
    }
    public static void task3 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        var SumWeights = WeightBoxer1 + WeightBoxer2;
        var WeightDifference = WeightBoxer2 - WeightBoxer1;
        System.out.println("Общий вес боксеров: " + SumWeights + " кг");
        System.out.println("Разница в весе боксеров: " + WeightDifference + " кг");
        }
        public static void task7 () {
            var WeightBoxer1 = 78.2;
            var WeightBoxer2 = 82.7;
            var SumWeights = WeightBoxer1 + WeightBoxer2;
            var WeightDifference = WeightBoxer2 - WeightBoxer1;
            var WeightDifferenceInProcent = (WeightBoxer2 / WeightBoxer1) % SumWeights;
            System.out.println("Разница в весе боксеров: " + WeightDifference + " кг");
            System.out.println("Разница в весе боксеров: " + WeightDifferenceInProcent + " процентов");
        }
        public static void task8 (){
        var HoursOfWeek = 640;
        var WorkHoursOfOneWoker = 8;
        var SumWokers = HoursOfWeek / WorkHoursOfOneWoker;
            System.out.println("Всего работников в компании — " + SumWokers + " человек");
            var NewSumWokers = SumWokers + 94;
            var NewHoursOfWeek = NewSumWokers * 8;
            System.out.println("Если в компании работает " + NewSumWokers + " человек");
            System.out.println("то всего " + NewHoursOfWeek + " часов работы может быть поделено между сотрудниками");
        }
}




