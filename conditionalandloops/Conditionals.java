package conditionalandloops;

public class Conditionals {
    public static void main(String[] args) {
        /*
         if else statement
         Systax:
         if(Condition){
         do this 
         } else { do this 
          }
         */
        int salary =25000;
        // if (salary>10000){
        //     salary+=2000;
        // } else {
        //     salary+=1000;
        // }
        // System.out.println(salary);
        /*
         Multi if else statement
         if(Condition){
         do this 
         }else if(Condition){
         do this
         }else{
         do this}
         */
        if (salary>10000) {
            salary+=2000;
          
        } else if(salary>20000){
            salary+=1000;
        
            
        }else{
            salary+=3000;
        }
        System.out.println(salary);

    }
    
}