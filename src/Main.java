public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задача 1");
        byte a = 1;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 1000;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 32000;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 100000L;
        System.out.println("Значение переменной d с тимпом long равно " + d);
        float e = 3.5f;
        System.out.println("Значение переменной e с тимпом float равно " + e);
        double f = 7.2234;
        System.out.println("Значение переменной f с типом double равно " + f);

        // task 2
        System.out.println("Задача 2");
        float g = 27.12f;
        long h = 987678965549L;
        float i = 2.786f;
        short j = 569;
        int k = 27897;
        byte l = 67;

        // task 3
        System.out.println("Задача 3");
        var liudmilaPavlovna = 23;
        var annaSergeevna = 27;
        var ekaterinaAndreevna = 30;
        var paper = 480;

        var numberStudent = liudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperStudent = paper / numberStudent;
        System.out.println("На каждого ученика расчитано " + paperStudent + " листов бумаги");

        // task 4
        System.out.println("Задача 4");
        byte bottle = 16;
        byte minutes = 2;
        int oneMinuteBottle = bottle / minutes;
        int twentyMinutesBottle = oneMinuteBottle * 20;
        System.out.println("За 20 минут машина произвела " + twentyMinutesBottle + " бутылок");
        int minutesDay = 60 * 24;
        int bottleDay = oneMinuteBottle * minutesDay;
        System.out.println("За сутки машина произвела " + bottleDay + " бутылок");
        int freeDayBottles = bottleDay * 3;
        System.out.println("За три дня машина произвела " + freeDayBottles + " бутылок");
        int monthBottles = bottleDay * 30;
        System.out.println("За 1 месяц машина произвела " + monthBottles + " бутылок");

        // task 5
        System.out.println("Задача 5");
        byte banks = 120;
        byte oneClassroomWhite = 2;
        byte oneClassroomBrown = 4;

        int banksClassroom = oneClassroomBrown + oneClassroomWhite;
        int numberClassroom = banks / banksClassroom;
        int numberBanksWhite = numberClassroom * oneClassroomWhite;
        int numberBanksBrown = numberClassroom * oneClassroomBrown;
        System.out.println("В школе, где " + numberClassroom + " классов, нужно " + numberBanksWhite + " бвнок белой краски и " + numberBanksBrown + " банок коричневой краски.");

        // task 6
        System.out.println("Задача 6");
        short bananaWeight = 5 * 80;
        short milksWeight = (200 / 100) * 105;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;

        int breakfastWeight = bananaWeight + milksWeight + iceCreamWeight + eggsWeight;
        float breakfastWeightKg = breakfastWeight / 1000f;

        System.out.println("Вес завтрака " + breakfastWeight + " гр ( " + breakfastWeightKg + " кг)");

        // task 7
        System.out.println("Задача 7");
        short sportsmanWeight = 7 * 1000;
        short weightMin = 250;
        short weightMax = 500;

        double numberDayMin = (double) sportsmanWeight / weightMin;
        double numberDayMax = (double) sportsmanWeight / weightMax;
        double averageWeight = (weightMin + weightMax) / 2D;
        double averageDay = sportsmanWeight / averageWeight;

        System.out.println(numberDayMin);
        System.out.println(numberDayMax);
        System.out.println(averageDay);

        // task 8
        System.out.println("Задача 8");
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;

        double salaryMasha = masha + (masha / 10);
        double salaryDenis = denis + (denis / 10);
        double salaryKristina = kristina + (kristina / 10);
        double mashaSalaryYear = (salaryMasha * 12) - (masha * 12);
        double denisSalaryYear = (salaryDenis * 12) - (denis * 12);
        double kristinaSalaryYear = (salaryKristina * 12) - (kristina * 12);

        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + mashaSalaryYear + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + denisSalaryYear + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + kristinaSalaryYear + " рублей.");


    }
}