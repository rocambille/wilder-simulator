import java.util.Scanner;

class Console {
    public final static Scanner scanner = new Scanner(System.in);

    public static void printActionList(Action[] actions) {
        System.out.println("What you can do:");

        int i = 1;
        for(Action action : actions) {
            if(!action.isLocked()) {
                System.out.println(i + " " + action.getName());
            }
            i++;
        }
    }
    public static String getNextAction() {
        System.out.println("What do you want to do?");

        String action = scanner.nextLine();

        return action;
    }
}