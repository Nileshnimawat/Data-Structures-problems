public class prime {
    public static void main(String[] args) {
        for( int i= 2; i <= 100; i++){
            boolean flag = true;
          for( int j=2; j < i; j++){
                if(i % j == 0){
                     flag = false;  
                     break;
                     }
    }
           if(flag == true){
             System.out.print(i+" ");
     }
     
    }
}
}
