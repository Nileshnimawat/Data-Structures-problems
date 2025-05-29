public class minHeapImplementation {
    public static class MinHeap{
        int arr[] = new int[50];
        int index = 1;
        void swap(int arr[],int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        void add(int val){
            arr[index] = val;
            int i = index;
            index++;
            while(i != 1){
                if(arr[i] < arr[i/2]) swap(arr, i, i/2);
                else break;
                i = i/2;
            }
        }
        int peek(){
            return arr[1];
        }
        int remove(){
            int i=1;
            int x = arr[1];
          arr[1] = arr[index-1];
          index--;
          while(true){
            int left = 2*i;
            int right = 2*i+1;
            if(left >= index-1) break;
            if(right >= index-1){
                if(arr[left] < arr[right] && arr[left] < arr[i]){
                    swap(arr, i, left);
                }
                else break; 
            }
            if(arr[left] < arr[right]){
                if(arr[left] < arr[i]){
                swap(arr, i, left);
                i = left;
                }
                else break;
            }
            else {
                if(arr[left] > arr[right]){
                    if(arr[right] < arr[i]){
                        swap(arr, i, left);
                        i = right;
                        }
                        else break;
            }
        }
          }
          return x;
        }

        void display(){
            for(int i = 1; i < index; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MinHeap pq = new MinHeap();
        pq.add(5);  
        pq.add(6); 
        pq.add(3);
        pq.add(2);  
        pq.add(1);      
        pq.display();        
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
        pq.display();
       
    }
}
