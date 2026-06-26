public class TaskLinkedList {

    private Node head;


    public void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }


    public Task searchTask(int taskId) {

        Node current = head;

        while (current != null) {

            if (current.task.taskId == taskId) {
                return current.task;
            }

            current = current.next;
        }

        return null;
    }


    public void traverseTasks() {

        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }


    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        Node current = head;

        while (current.next != null &&
                current.next.task.taskId != taskId) {

            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task not found.");
            return;
        }

        current.next = current.next.next;

        System.out.println("Task deleted successfully.");
    }
}