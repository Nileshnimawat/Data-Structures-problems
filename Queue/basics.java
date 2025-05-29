//using array implementation
// Using array implementation
public class basics {
    public static class Queue {
        int arr[] = new int[10];
        int size = 0;
        int front = -1;
        int rare = -1;

        void add(int val) throws Exception {
            if (size == arr.length-1) {
                throw new Exception("Queue is full");
            }
            if (front == -1){
                front = rare = 0;
                arr[rare] = val;
            } else{
            arr[++rare] = val;
            }
            size++;
        }

        int remove() throws Exception {
            if (size() == 0) {
                throw new Exception("Queue is empty");
            }
            int n = arr[front];
            front++;
            size--;
            return n;
        }

        int peek() throws Exception {
            if (size() == 0) {
                throw new Exception("Queue is empty");
            }
            // No need to check if size is 0 here because remove method already has this check.
            return arr[front];
        }

        int size() {
            return size;
        }

        void display() throws Exception{
            if (size() == 0) {
                throw new Exception("Queue is empty");
            }
            for (int i = front; i <= rare; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        try {
            q.display();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            q.display();

            q.remove();
            System.out.println(q.peek());
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.display();
            System.out.println(q.peek());
         
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
