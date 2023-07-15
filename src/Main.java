import java.util.SortedMap;

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

    public static void task1() {
        System.out.println("Задача 1" + "\n");
        byte tiny = 66;
        short small = 150;
        int bigger = 1200;
        long large = 23500090l;
        float huge = 7.42f;
        double theBiggest = 3.14159265;

        System.out.println("Значение переменной " + "tiny" + ", с типом " + "byte, равно: " + tiny);
        System.out.println("Значение переменной " + "small" + ", с типом " + "short, равно: " + small);
        System.out.println("Значение переменной " + "bigger" + ", с типом " + "int, равно: " + bigger);
        System.out.println("Значение переменной " + "large" + ", с типом " + "long, равно: " + large);
        System.out.println("Значение переменной " + "huge" + ", с типом " + "float, равно: " + huge);
        System.out.println("Значение переменной " + "theBiggest" + ", с типом " + "double, равно: " + theBiggest);
    }

    public static void task2(){
        System.out.println("\n" + "Задача 2" + "\n");

        float a = 27.12f;
        long b = 987678965549l;
        double c = 2.386;
        int d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);


    }

    public static void task3() {
        System.out.println("\n" + "Задача 3" + "\n");

        short paper = 480;
        byte lClass = 23;
        byte aClass = 27;
        byte eClass = 30;
        int amountStudents  = lClass + aClass + eClass;

        System.out.println("Общее количество учеников во всех трёх классах — " + amountStudents + " человек.");
        System.out.println("На " + amountStudents + " учеников было куплено 480 листов бумаги, значит, \nна каждого ученика рассчитано " + (paper/amountStudents) + " листов бумаги.");

    }

    public static void task4() {
        System.out.println("\n" + "Задача 4" + "\n");
        byte amountOfBottles = 16;
        int amountPerMinute = amountOfBottles/2;
        int timeOfWork;

        timeOfWork = 20;
        System.out.println("За 20 минут машина произвела " + (timeOfWork*amountPerMinute) + " штук бутылок.");

        timeOfWork = 24*60;
        System.out.println("За сутки машина произвела " + (timeOfWork*amountPerMinute) + " штук бутылок.");

        timeOfWork *= 3;
        System.out.println("За 3 дня машина произвела " + (timeOfWork*amountPerMinute) + " штук бутылок.");
        // Предположим, что в месяце 30 дней
        timeOfWork *= 10;
        System.out.println("За месяц машина произвела " + (timeOfWork*amountPerMinute) + " штук бутылок.");

    }

    public static void task5() {
        System.out.println("\n" + "Задача 5" + "\n");
        byte cansAmount = 120;
        byte whiteCans = 2;
        byte brownCans = 4;
        int cansOnClass = whiteCans + brownCans;
        int amountOfClasses = cansAmount/cansOnClass;

        System.out.println("В школе, где " + amountOfClasses + " классов, нужно " + (amountOfClasses*whiteCans) + " банок белой краски и " + (amountOfClasses*brownCans) + " банок коричневой краски.");


    }

    public static void  task6() {
        System.out.println("\n" + "Задача 6" + "\n");
        byte bananas = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte eggs = 4;
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int sportNutrition = (bananas*bananaWeight) + (milk*milkWeight) + (iceCream*iceCreamWeight) + (eggs*eggWeight); //Как я понял, что количество продуктов тоже нужно инициировать в переменные?

        System.out.println("Вес спортзавтрака составляет " + sportNutrition + " грамм. Или " + ((float)sportNutrition/1000) + " килограмм.");
    }

    public static void task7() {
        System.out.println("\n" + "Задача 7" + "\n");
        byte excessWeight = 7;
        int excessWeight2 = (short)excessWeight*1000;
        short weightLose1 = 250;
        short weightLose2 = 500;
        int days1 = excessWeight2/weightLose1;
        int days2 = excessWeight2/weightLose2;

        System.out.println("Если спортсмен будет терять каждый день по " + weightLose1 + " грамм, то ему понадобится " + days1 + " дней для похудения.");
        System.out.println("Если спортсмен будет терять каждый день по " + weightLose2 + " грамм, то ему понадобится " + days2 + " дней для похудения.");

    }

    public static void task8() {
        System.out.println("\n" + "Задача 8" + "\n");
        int paydayMasha = 67760;
        int paydayDenis = 83690;
        int paydayKristina  = 76230;
        float annualIncreace = 10/100f;
        float payDayM = paydayMasha*annualIncreace;
        float payDayD = paydayDenis*annualIncreace;
        float payDayK = paydayKristina*annualIncreace;

        System.out.println("Маша теперь получает " + (paydayMasha+(int)payDayM) + " рублей. Годовой доход вырос на " + (int)payDayM + " рублей.");
        System.out.println("Денис теперь получает " + (paydayDenis+(int)payDayD) + " рублей. Годовой доход вырос на " + (int)payDayD + " рублей.");
        System.out.println("Кристина теперь получает " + (paydayKristina+(int)payDayK) + " рублей. Годовой доход вырос на " + (int)payDayK + " рублей.");

    }

}