package ProgrammStore;

public abstract class HumanGenerator {
    private static String[] names = {"Mihail", "Oleg", "Natasha", "Gena Bukin", "Big Gosha"};
    private static int namesRandom = (int) (Math.random() * 4);
    public static String name = names[namesRandom];
    private static int randomDay = (int) (1 + Math.random() * 30);
    private static int randomMonth = (int) (1 + Math.random() * 11);
    private static int randomYear = (int) (1960 + Math.random() * 60);

    public static int birthday = randomDay;
    public static int birthdmonth = randomMonth;
    public static int birthyear = randomYear;

    public static int phone = 956052887;
    public static String sayHello = "Hello";
    public static String sayGoodbye = "Goodbye";


    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {

            System.out.println(name + ".  Birthday is " + birthday + "." + birthdmonth + "." + birthyear + " year" + "\n Phone is: +380" + phone);
        }
    }
}