class Game {
    public static void showAllActions() {
        String[] actions = Action.getAllActions();

        Console.printActionList(actions);
    }
    public static String getNextAction() {
        String action = Console.getNextAction();

        return action;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        Game.showAllActions();

        boolean exit = false;

        while(!exit) {
            String action = Game.getNextAction();

            if(action.equals("learn")) {
                // learn
            }
            if(action.equals("show actions")) {
                Game.showAllActions();
            }
            if(action.equals("exit")) {
                exit = true;
            }
        }
    }
}