class Game {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Status status = new Status();
        status.setNextAction("show actions");

        boolean exit = false;

        while(!exit) {
            status = Controller.getNextAction(status);

            if(status.getNextAction().equals("show actions")) {
                status = Controller.showAllActions(status);
            }
            else if(status.getNextAction().equals("exit")) {
                exit = true;
            }
            else {
                status = Controller.validateAction(status);
            }
        }
    }
}