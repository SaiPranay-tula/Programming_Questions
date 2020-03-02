/*Given an array of integers, find the most occurring element of the array and return any one of its indexes randomly with equal probability.

if no duplicate elements found print -1.
Examples:

input =15
-1 4 9 7 7 2 7 3 0 9 6 5 7 8 9
output =
3 4 6 12

  
Element with maximum frequency present at index 6
Element with maximum frequency present at Index 3
Element with maximum frequency present at index 4
Element with maximum frequency present at index 12

All outputs above have equal probability.print index increasing order.
*/
import java.util.*;
class Test{
    
    public static void main(String ar[]){
        
        Scanner sc=new Scanner(System.in);
       
        
        int a=sc.nextInt();
        int a1=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a;i++){
        a1=sc.nextInt();
        list.add(a1);
        }
      //  System.out.println(list);
        
        int v=0,l=0,f=0;
        for(int i=0;i<a;i++)
        {
        l=Collections.frequency(list,list.get(i));
        if(l>v&& list.get(i)!=f){
            v=l;
            f=list.get(i);
        }
        
        }
        
        
     //   System.out.println(f);
        int count=0,h=0;
        for(int i=0;i<a;i++)
        {
            if(list.contains(f)){
	  //  System.out.println(list.indexOf(f)+"index");
            System.out.print(list.indexOf(f)+count+" ");
            h=list.indexOf(f);
            list.remove(h);
//System.out.println(list+"list");
            count++;
            }
        }
        
    }
    
    
}