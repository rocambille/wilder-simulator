class Controller {
    public static Status showAllActions(Status status) {
        Action[] actions = Action.getAllActions();

        Console.printActionList(actions);

        return status;
    }

    public static Status getNextAction(Status status) {
        String action = Console.getNextAction();

        status.setNextAction(action);

        return status;
    }

	public static Status validateAction(Status status) {
        System.out.println("dans validate");
        Action action = Action.getAllActions()[
            Integer.valueOf(
                status.getNextAction()
            ) - 1
        ];
        action.validate();
		return status;
	}
}