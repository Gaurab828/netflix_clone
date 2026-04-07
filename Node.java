public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front = null;
    Node rear = null;

    // INSERT (enqueue)
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // DELETE (dequeue)
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }
    // DISPLAY
    void display() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(60);
        q.enqueue(80);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();
    }
} 
    

