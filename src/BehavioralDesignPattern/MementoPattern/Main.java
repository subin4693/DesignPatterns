package BehavioralDesignPattern.MementoPattern;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        editor.setText("Hello");
        System.out.println("Current text: " + editor.getText());
        history.push(editor.save());

        editor.setText("hello world");
        System.out.println("Current text: " + editor.getText());
        history.push(editor.save());

        editor.setText("hello world! welcome to  memento pattern");
        System.out.println("Current text " + editor.getText());

        Memento previousState = history.pop();
        editor.restore(previousState);
        System.out.println("After undo text" + editor.getText());

        previousState = history.pop();
        editor.restore(previousState);
        System.out.println("After second undo text: " + editor.getText());
    }
}
