public class Larger {


        public static void main(String[] args) {

            int n[] = {15,75,87,20,45,50,3,1,4};
            int largest = 0;
            
            for(int i = 0 ; i < n.length; i++ ) {
                if (n[i] > largest) {
                    largest =  n[i];
                }
                
            }
            System.out.println("Largest is " + largest);
    
        }
    
    
    
}
