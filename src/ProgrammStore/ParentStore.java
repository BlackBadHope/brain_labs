package ProgrammStore;

public class ParentStore {
    private static String[] storeNames = {"Amstor", "Silpo", "ATB", "GoodMarket"};
    public static String storeName = storeNames[(int) (Math.random() * 3)];
    public static boolean isOpen;

    public boolean getIsOpen() {
        return this.isOpen;
    }

    public static void setIsOpen(boolean value) {
        isOpen = value;
    }
}