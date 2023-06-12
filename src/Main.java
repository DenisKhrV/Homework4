public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int age=18;
        if(age>=18){
            System.out.println("Если возраст человека равен " +age+", то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен "+age+ ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        int temp=5;
        if(temp<5){
            System.out.println("На улице "+temp+ " градусов, нужно надеть шапку.");
        }
        else{
            System.out.println("На улице "+temp+ " градусов, можно идти без шапки.");
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        int speed=70;
        if(speed>60){
            System.out.println("Если скорость "+speed+", то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость "+speed+", то можно ездить спокойно.");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int age=7;
        if(age<2){
            System.out.println("Если возраст человека равен "+age+", то ему пора спать.");
        }
        else if(age>=2&&age<6){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад.");
        }
        else if(age>=7&age<18){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу.");
        }
        else if(age>=18&age<24){
            System.out.println("Если возраст человека равен "+age+", то его место в университете.");
        }
        else if(age>=24&age<60){
            System.out.println("Если возраст человека равен "+age+", то ему пора ходить на работу.");
        }
        else if(age>=60){
            System.out.println("Если возраст человека равен "+age+", то он может отдохнуть.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 12;
        boolean canOnlyRideIfAccompaniedByAnAdult = age >= 5 && age < 14;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе.");
        }
        else if (canOnlyRideIfAccompaniedByAnAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6(){
        System.out.println("Задача 6");
        int wagonCapacity=102;
        int seatPlace=60;
        int people=12;
        int freeSeats=seatPlace-people;
        int freeStandPlace=wagonCapacity-seatPlace-people;
        boolean thereIsSeatPlace=people<seatPlace;
        if(people>=wagonCapacity){
            System.out.println("Мест в вагоне нет. Вагон полностью забит");
        }
        else {
            if (thereIsSeatPlace) {
                System.out.println("В вагоне есть "+freeSeats+" сидячих и 42 стоячих мест.");
            } else {
                System.out.println("В вагоне есть" + freeStandPlace + " стоячих мест.");
            }
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        int one=22;
        int two=12;
        int three=7;
        if(one>=two&&one>=three){
            System.out.println("Первое число "+one+" самое большое");
        }
        else {
            if(two>=one&&two>=three){
                System.out.println("Второе число "+two+ " самое большое.");
            }
            else{
                    System.out.println("Третье число "+three+ " самое большое.");
                }
            }
        }
    }
