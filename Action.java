class Action {
    private String name;
    private boolean locked;
    private Action[] actionsToUnlock;

    private static Action[] allActions = null;

    public void validate() {
        for(Action action : actionsToUnlock) {
            action.setLocked(false);
        }
    }

    public static Action[] getAllActions() {
        if(allActions == null) {
            Action makeProject = new Action("make project", true, new Action[]{});
            Action listenCourse = new Action("listen course", true, new Action[]{});
            allActions = new Action[] {
                new Action("do quest", false, new Action[]{listenCourse, makeProject}),
                listenCourse,
                makeProject,
                new Action("show actions", false, new Action[]{}),
                new Action("exit", false, new Action[]{})
            };
        }
        return allActions;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Action(String name, boolean locked, Action[] actionsToUnlock) {
        this.name = name;
        this.locked = locked;
        this.actionsToUnlock = actionsToUnlock;
    }
}