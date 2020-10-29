package todomvc.ui;

import net.serenitybdd.screenplay.targets.Target;

public class TodoList {
    public static final Target ITEMS = Target.the("Todo items").locatedBy(".todo-list li");
    public static Target NEW_TODO = Target.the("New Todo field").locatedBy(".new-todo");
}
