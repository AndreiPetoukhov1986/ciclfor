public class Main {
    public static void main(String[] args) {
        task1();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8();
        task9();
        task10();
    }
    public static void task1 () {
        System.out.println("Задача №1");
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }

    }
    public static void task2 () {
        System.out.println("Задача №2");
        for (int i=10; i>=1; i--) {
            System.out.println(i);
        }
    }

    public static void task3 (){
        System.out.println("Задача №3");
        for (int i=0; i<17; i=i+2) {
            System.out.println(i);

                }
    }

    public static void task4 () {
        System.out.println("Задача №4");
        for (int i=10; i>=-10; i--) {
            System.out.println(i);

        }
        }


    public static void task5 (){
        System.out.println("Задача №5");

        for (int year = 1904; year<=2096; year++){
            if(year%4==0 && year%100 !=0 || year%400==0){
                System.out.println(year+"год является высокосным");}
        }
    }
    public static void task6 (){
        System.out.println("Задача №6");
        for (int i = 7; i <=98 ; i=i+7) {
            System.out.println(i);
            
        }
        
        
    }
    public static void task7 () {
        System.out.println("Задача №7");
        for (int i = 1; i <=512; i=i*2) {
            System.out.println(i);
        }
    }
    public static void task8 () {
        System.out.println("Задача №8");
        int sum = 29000;
        int accumulation = 0;
        for (int i = 1; i <=12; i++) {
            accumulation+=sum;
            System.out.println("Месяц: "+ i +" сумма накоплений равна =  " + accumulation);
        }
    }

    public static void task9 () {
        System.out.println("Задача №9");
        int sum = 29000;
        double accumulation = 0;
         for (int i = 1; i <=12; i++) {
            accumulation+=sum;
   accumulation=accumulation+accumulation/100;
            System.out.printf("Месяц: "+ i +" сумма накоплений равна =  %.2f%n" , accumulation, "евро");
        }
    }
    public static void task10 () {
        System.out.println("Задача №10");
        int a = 2;
        int b = 0;
        for (int i = 1; i <=10 ; i++) {
            b = a*i;
            System.out.println(a +"*"+ i +"="+b);
        }
        }
    }



