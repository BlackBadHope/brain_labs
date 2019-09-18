package ProgrammStore;

public class StartTheProgram {
    //    day+month circle is HERE + StatusCheck(BetaTest)
    static int month = 1;

    public static void main(String[] args) {
        for (int i = 1; i < 33; i++) {
            System.out.println("Welcome to the " + ParentStore.storeName + ". Day " + i + ". Month " + month);
            if (i >= 32) {
                month++;
                break;
            }
            for (int j = 0; j < 24; j++) {
                if (j >= 9 && j <= 22) {
                    ParentStore.setIsOpen(true);
                    System.out.println("Is store open? " + ParentStore.isOpen);
                }
                if (j < 9 || j > 22) {
                    ParentStore.setIsOpen(false);
                    System.out.println("Is store open? " + ParentStore.isOpen);
                }
                if (i >= 1) {
                    System.out.println("hour " + j + ". Day is " + i + " ");
                    if (j >= 23) {
                        break;
                    }
                }
            }
        }
    }
}
