package basics;
public class arrayImplementation {
    public static class arrayStack{
        private int arr[] = new int[10];
        private int index = 0;
        void push(int x){
            arr[index]=x;
            index++;
        }
        int peek(){
            if(index==0){
                System.out.println("stack is empty ");
                return -1;
            }
            return arr[index-1];
        }
        int pop(){
            if(index==0){
                System.out.println("stack is empty ");
                return -1;
            }
            int top =  arr[index-1];
            index--;
            return top;
        }
        void display(){
            for(int i=0;i<index;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return index;
        }
        int capacity(){
            return arr.length;
        }
    }

    public static void main(String[] args) {
        arrayStack st = new arrayStack();
        st.push(1);
        st.display();//1
        st.push(2);
        st.display();//1,2
        st.push(3);
        st.display();//1,2,3
        st.push(4);
        st.display();//1,2,3,4

        //
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.capacity());
    }
}
