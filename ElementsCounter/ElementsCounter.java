/*92. Write a Java program to count the number of even and odd elements in a given array of integers.*/

class ElementsCounter{
    int evenElements;
    int oddElements;
    int sum;
    
    void count(int[] numArray){
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] % 2 == 0) evenElements++;
            else oddElements++;
            sum += numArray[i];
        }
        
        System.out.println("Even elements: " + evenElements);
        System.out.println("Odd elements: " + oddElements);
        System.out.println("Sum of all elements: " + sum);
    }
}