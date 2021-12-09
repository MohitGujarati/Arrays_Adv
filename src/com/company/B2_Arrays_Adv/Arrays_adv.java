package com.company.B2_Arrays_Adv;
/*
//collecction framework knowledge is needed in this part of arrays
Prefix is cases the variable to increment or decrement  BEFORE another operation
Postfix  causes the Variable to increment or Decrement AFTER another operation

a++ =postfix
++a=prefix
 */
/*
class Array_Prefix_Postfix{
    public static void main(String[] args) {

        int a=0;
        int b=0;

        if (a++ == ++b){
            System.out.println("Here b is NOT incremented before the  the operation");
            System.out.println("so this line is printed");
        }else
            System.out.println("b is Incremented before the operation so ");
            System.out.print("This line should be printed ");

    }
}

 */// Prefix and Postfix 1
/*
class main{
    public static void main(String[] args) {
        int a=0;
        int b=1;


        // a will be performed before condition is checked and b will be decremented afterwards
        // so after condition now a=1,b=0
        // && a will be performed before and b afterwards

        //      True         True
  //here   //a= 1 ,b=1  && a=0,b=0
        if (++a == b-- && --a == b++){

            System.out.println("a is "+a);
            System.out.println("b is "+b);
        }
        //final output a=0,b=1
    }
}

 *///Prefix and Postfix 2
/*
class main{
    public static void main(String[] args) {
        int a=0;
        int b=0;

        if (++a==b-- && --a==b++){
            // do nothing

        }
        else
            System.out.println("a is "+a);
            System.out.println("b is "+b);
    }
}
 for more detail look- Assignment ,Arithmetic and Unary Operator{Oracle}
 *///Prefix and Postfix 3


/*
class main{
    public static void main(String[] args) {
        int []a={4,-2,-3,4,-1,-2,1,5,-3};
        int n = a.length;
        int max_sub_Array = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {

            int Sum = 0;

            for (int j = i; j < n; j++) {
                Sum += a[j];

                if (Sum > max_sub_Array) {
                    max_sub_Array = Sum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Max sum is "+max_sub_Array);
        System.out.println("Start index "+start+" End index "+end);
    }
}

 */// given an array find  maximum continuous subsequence array (Brut force)

/*
public class Array_Interview {
    public static void main(String[] args) {
        //to solve this we use Kaden's algorithm

        int []a={4,-2,-3,4,-1,-2,1,5,-3};

        int max=Integer.MIN_VALUE;
        int max_end=0,start=0,end=0,search_start=0;

        for (int i=0;i<a.length;i++){
            max_end+=a[i];

            if (max<max_end){
                max=max_end;
                start=search_start;
                end=i;
            }

            if (max_end<0){
                max_end=0;
                search_start=i+1;
            }


        }
        System.out.println("Max sum is "+max);
        System.out.println("Start index "+start+" End index "+end);

    }
}
*///given an array find  maximum continuous subsequence array

/*
import java.util.HashMap;
import java.util.Map;

class main{
    public static void main(String[] args) {

        int a[]={4,3,6,2,1,1};


        Map<Integer,Boolean> no_map=new HashMap<>();
        int max=a.length;

        for (Integer i: a){
            if (no_map.get(i)==null){
                no_map.put(i,true);

            }
            else {
                System.out.println("Repeting no = "+i);
            }
        }
        for (int i=1;i<=max;i++){
            if (no_map.get(i)==null){
                System.out.println("Missing no = "+i);
            }
        }

    }
}

 *///Repeating and missing element in an array

/*
import java.util.Arrays;

class main{
    public static void main(String[] args) {
        int[]a={10,20,30};
        int[]b={40,50,60,70,80};

        int a_len=a.length;
        int b_len=b.length;

        int c_len=a_len+b_len;
        int []c=new int[c_len];

        for (int i=0;i<a.length;i++) {
            c[i] = a[i];
        }
            for (int j=0;j<b.length;j++){

                c[a.length+j]=b[j];

        }
        for (int i=0;i<c.length;i++){
            Arrays.sort(c);
            System.out.print(c[i]+" ");
        }

    }
}
 *///merge two sorted array (brute force)

/*
class main{
    public static void main(String[] args) {

        int []a={1,2,3,5,8,9} ;
        int []b={6,7,10,15} ;

        for (int i=0;i<a.length;i++){
            if (a[i]>b[0]){
                int temp=a[i];
                b[0]=a[i];
                b[0]= temp;

                Arrays.sort(b);
            }
        }

        // just printing the array as i have shown how to merge array in the previous question
        for (int j=0;j<a.length;j++) {
            System.out.print(a[j]+" ");
        }

        for (int j=0;j<b.length;j++) {
            System.out.print(b[j]+" ");
        }


    }
}//merge two sorted array (brutt force two pointer)
*///merge two sorted array// (Method 1 - two pointer/ this is also valid and can be given as 2nd main answer)

/*

class main{
    public static void main(String[] args) {
        int no=4; int space=no;

        for (int i=0;i<no;i++){
            //this loop is space
            for (int s=1;s<=space;s++){
                System.out.print(" ");
            }
           int  number=1;
            for (int j=0;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);

            }
            space--;
            System.out.println(" ");
        }

        //find number at this  position row =5,and column=2

        int row=4;int col=2;
        int rowf=row-1;
        int colf=col-1;
        System.out.println();
        System.out.println((rowf/colf));

    }

}
*///pascals Triangle

/*
class main{
    public static void main(String[] args) {

        int []a={1,2,3,4,5};

        int[] sum =new int [a.length];
        sum[0]=1;


        for (int i=1;i<a.length;i++){
            sum[i]=sum[i-1]*a[i-1];
        }
        int temp=1;
        for (int i=a.length-2;i>=0;i--){
            sum[i]*=a[i+1]*temp;
            temp*=a[i+1];
        }


    }
}

 *////product of elements expect itself value

/*


class Second_Smallest{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of size of array");
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements of array");
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
            //printing array without loop
            System.out.println("Array is "+Arrays.toString(arr));

            int min=Integer.MAX_VALUE;
            int sec_min=Integer.MAX_VALUE;


            for (int i=0;i<n;i++) {
                if (arr[i] == min){
                    sec_min = min;
                }

                else if (arr[i] < min) {
                    sec_min = min;
                    min = arr[i];
                }
                else if (arr[i] < sec_min){
                    sec_min = arr[i];
                }

            }
        System.out.println(" minimum element is "+min);

        System.out.println("Second minimum element is "+sec_min);


        }
    }
--------------------------------------------
        enter number of size of array
        6
        Enter the elements of array
        1
        2
        3
        4
        5
        6
        Array is [1, 2, 3, 4, 5, 6]
        minimum element is 1
        Second minimum element is 2


 */// find Kth  2nd smallest element in a given array

/*
class sort {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

                int low = 0;
                int start = 0;
                int end = nums.length - 1;
                int index=0;

                    while(index <=end && start<end){

                        if(nums[index]==0)
                        {
                            nums[index]=nums[start];
                            nums[start]=0;
                            start++;
                            index++;

                        }
                        else if(nums[index]==2){
                            nums[index]=nums[end];
                            nums[end]=2;
                            end--;

                        }
                        else
                            index++;
                    }

                    for (int i=0;i<nums.length;i++)
                        System.out.print(nums[i]);
                }
            }

 *///sort 0s,1s,& 2s //leetcode sort colour //Dutch national flag algorithm   (imp interview)

/*
class main{
    public static void main(String[] args) {
        int[]a= {0,0,1,0,1,0,1,1,0,0,1,1,1,0,1,0,0,0,0,0,0,0};
        int sum=0;
        int ans=0;

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        hashMap.put(0,-1);

        for (int  i=0;i<a.length;i++){
            if (a[i]==0){
                sum+=-1;

            }else if (a[i]==1){
                sum+=1;
            }
            if (hashMap.containsKey(sum)){
                int index=hashMap.get(sum);
                int len=i-index;
                if (len > ans){
                    ans=len;
                }
            }else {
                hashMap.put(sum,i);
            }
        }
        System.out.println("longest sub sequence array is of   "+ans);

    }
}
*/  //Length of longest sub array contains equal no of Zero and one's <-leetcode  (imp interview)

//

//GFG

/*
class main {
    private static void fun(int[] a) {

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == 0)
            {
                for (int j = i + 1; j < a.length; j++)
                {
                    if (a[j] != 0)
                    {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }

            }

        }
    }

    public static void main(String[] args) {
        int a[] = {10, 2, 0, 0, 8, 12};
        fun(a);

        //after swapping
        for (int k = 0; k < a.length; k++)
            System.out.print(a[k] + " ");
    }
}

 *///move zero at the end

/*
class main{
    private static void fun(int[] a) {

        int count=0;

        for (int i=0;i<a.length;i++){
            if (a[i]!=0){
                int temp=a[i];
                a[i]=a[count];
                a[count]=temp;
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={10,8,00,12,0};
        fun(a);

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }


}

 *///move zero at the end efficient way

/*
class main{
    private static void fun(int[] a) {
        int temp=a[0];
        int n=a.length;
        for (int i=1;i<n;i++){
            a[i-1]=a[i];
        }
        a[n-1]=temp;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        fun(a);

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

 *///left rotation  by 1 in array

/*
class main{
    //this function , rotates the array by one

        private static void fun(int[] a,int n) {
            int temp=a[0];
            for (int i=1;i<n;i++){
                a[i-1]=a[i];
            }
            a[n-1]=temp;
        }
   // here we call the function D thimes so we get the desired output

       static void leftrotation(int a[],int d ){
            int n=a.length-1;
            for (int i=0;i<d;i++)
            {
                fun(a,n);
            }
       }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int n=a.length;
        fun(a,n);

        //d== distance of rotation
        //calling leftrotation d times

        leftrotation(a,2);
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

 *///rotate the array D times bruteforce

/*
class main{
    private static void fun(int[] a, int d,int n) {
        int temp[]=new int[d];

        //this loop makes a temp array of d numbers
        for (int i=0 ; i<d ;i++){
            temp[i]=a[i];
        }
        //after the above loop
        //temp[]={1,2}

        //here we have shifted the elements by d positions ahead
        for (int i=d;i<n;i++){
            a[i-d]=a[i];
        }
        //after the above loop
        //a[]=[3,4,5,4,5]


        // here we want to  rotate D elements ,for that we run more loop and inside
        // the loop we copy the elements from temp to array a

        for (int i=0;i<d;i++){
            a[n-d+i]=temp[i];
        }

        //after the above loop
        //a[]=[3,4,5,1,2]

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        int d=2;
        System.out.println("Before Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        fun(a,d,n);
        System.out.println();
        System.out.println("After Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

 *///rotate the array d times efficient solution O(n) time and O(d) space

/*
class main{
   static void rotation(int a[],int d,int n)
    {

        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);


    }
   static void reverse(int a[],int low ,int high){
        while(low<high)
        {
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;

            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        int d=2;
        int low=0,high=n;

        rotation(a,d,n);
      //  reverse(a,low,high);


        System.out.println("After rev");

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

 */// Reversal algorithm to rotate the array //best way O(n) time and O(1) space

/*
class leader{
     static void fun(int a[]){

         for (int i=0;i<a.length;i++){
             for (int j=i+1;j<a.length;j++)
             {
                 if (a[i] > a[j]){
                    j++;
                 }
                 else if(a[i] < a[j]) {
                     a[i] = a[j];
                 }
                 else if (a[i] == a[j])
                 {
                     a[i]=a[j];
                 }
             }
         }
    }
    public static void main(String[] args) {
        int a[]={7,10,4,3,6,5,2};
        fun(a);


        for (int i=0;i<a.length-1;i++)
            if (a[i]!=a[i+1]){
                System.out.print(a[i]+" ");

            }else
                System.out.print(a[i]+" ");
    }
}

 */ //leaders of the Arrays this solution can be written in an optimized way

/*
class main{
    private static void fun(int[] a) {

        for (int i=0;i<a.length;i++)
        {
            boolean flag=false;

            for (int j=i+1;j<a.length;j++)

                if (a[i]<=a[j]){
                    flag=true;
                    break;

                }
                if (flag==false)
                    System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {

        int a[]={7,10,4,3,6,5,2};
        fun(a);

    }
}
 *///leaders of the Arrays better written

/*
class main{
    private static void fun(int[] a) {
        int n=a.length;

        int current=a[n-1];
        System.out.println(current);

        for (int i=n-2;i>=0;i--){
            if (current<a[i]){

                current=a[i];
                System.out.print(current+" ");
            }
        }

    }
    public static void main(String[] args) {
        int a[]={7,10,4,3,6,5,2};
        fun(a);
    }
}

 *///leaders of the Arrays  best way

/*
class main{
  static   int  fun(int a[]){

        int res=a[1]-a[0];

        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++)

                res=Math.max(res,a[j]-a[i]);
        }
      System.out.println(res);
        return res;
    }


    public static void main(String[] args) {

        int a[]={23,10,6,4,8,1};
        fun(a);

    }
}

 */ //to find max difference brute force

/*
class main{
    static   int  fun(int a[]){

    int res = a[1] - a[0], minVal = a[0];
    	for(int i = 1; i < a.length; i++)
    {
        res = Math.max(res, a[i] - minVal);
        minVal = Math.min(minVal, a[i]);
    }
    	return res;
}


    public static void main(String[] args) {
            int a[]={7,9,5,6,3,2};
            System.out.println( fun(a));

        }
}

 */ //to find max difference  efficient way

/*
class main{
    private static void fun(int[] a) {
        int count=0,i=1;
        while (i<a.length){
            while (i<a.length && a[i]==a[i-1]){
                count++;
                i++;
            }
            System.out.println(a[i-1]+" "+count);
            i++;
            count=1;
        }

        if (a.length==1   || a[a.length-1]!=a[a.length-2])
            System.out.println(a[a.length-1]+" "+1);

    }
    public static void main(String[] args) {
        int a[]={10,10,10,25,30,30};
        fun(a);
    }
}

 *///frequency of numbers in an array

/*
class stocks{
    static int fun(int[] price,int start,int end) {

        if (end <= start)
            return 0;

        int profit = 0;

        for (int i = start; i <= end; i++) {// going index 1 to end
            for (int j = i + 1; j <= end; j++)// j is always ahead of i
                if (price[j] > price[i])// if j is max

                {

                    int curr_profit = price[j] - price[i]//  we calculate profit
                            + fun(price, start, i - 1)// we recursively call LEFT of i
                            + fun(price, j + 1, end);// we recursively call RIGHT of i


                    profit=Math.max(profit,curr_profit);//Then here we take maximum of profit or current profit
                }

        }
        return profit;//return max profit

    }
    public static void main(String[] args) {
        int price[]={1,5,3,8,12};
        int start = 0;
        int end = price.length-1;

        System.out.println (fun(price,start,end));
    }
}

 */// stock buy and sell  brute force(part 1)

/*
class stocks{
    private static int fun(int[] price) {
        int profit=0;
        for (int i=1;i<price.length;i++)

            if (price[i]>price[i-1])
                profit+=(price[i]-price[i-1]);

            return profit;
    }

    public static void main(String[] args) {
        int price[]={1,5,3,1,2,8};
        System.out.println (fun(price));

    }


}

 *///stock buy and sell efficient and easy way(part 2)

/*
class water{
    private static int fun(int[] a) {

                int res = 0;
                int n=a.length;

               //here we are find the max poll form the left side
                for(int i = 1; i < n - 1; i++)
                {
                    int left_max = a[i];
                    for(int j = 0; j < i; j++)
                        left_max = Math.max(left_max, a[j]);

                     // here we are find the max poll of the right side
                    int right_max = a[i];
                    for(int j = i + 1; j < n; j++)
                    right_max = Math.max(right_max, a[j]);

                      // we have found the max poll and now we are calculating the amount of that can be
                      //stored on the top of particular index block which is traversed by a[i] and then adding it in res

                    res = res + (Math.min(left_max, right_max) - a[i]);
                }

                return res;
            }


    public static void main(String[] args) {
        int a[]={3,0,1,2,5};
        System.out.println(fun(a));

    }


}

 */// rain water trapping

 /*
class main{
    private static int  fun(int[] a) {
        int res=0;
        int n=a.length;
        int lMax[] = new int[n];
        int rMax[] = new int[n];



        // find the max poll from left side
        lMax[0] = a[0];
        for(int i = 1; i < n; i++)
            lMax[i] = Math.max(a[i], lMax[i - 1]);

        // finding the max poll from the right side
        rMax[n - 1] = a[n - 1];
        for(int i = n - 2; i >= 0; i--)
            rMax[i] = Math.max(a[i], rMax[i + 1]);


        for(int i = 1; i < n - 1; i++)
            res = res + (Math.min(lMax[i], rMax[i]) - a[i]);

        return res;
    }
    public static void main(String[] args) {
        int a[]={3,0,1,2,5};
        System.out.println(fun(a));

    }
}

 */// rain water trapping efficient way 0(n)

/*
class binary{
    private static int  fun(int[] a) {

        int res=0;
        for (int i=0;i<a.length;i++){
            int count=0;

            for (int j=i;j<a.length;j++){
                if (a[j]==1)count++;
                else break;
            }
            res=Math.max(res,count);
        }

        return res;


    }
    public static void main(String[] args) {
        int a[]={1,0,1,1,1,0,1,1};
        System.out.println(fun(a));
    }


}

 *///Maximum consecutive 1s in an binary tree

/*
class main{
    private static int  fun(int[] a) {
        int res = 0;
        int count=0;

        for (int i=0;i<a.length;i++)
        {
            if (a[i] == 0) {
                count = 0;

              }

             else
                count++;
                 res = Math.max(res, count);
            }

            return res;
            }
    public static void main(String[] args)
    {
        int a[]={0,1,1,1,0,1,1};
        System.out.println(fun(a));

    }
}

 *///Maximum consecutive 1s in an binary tree efficient way

/*
class main{

    private static int fun(int[] a) {
        int res=a[0];

        for (int i=0;i<a.length;i++){//here we traverse the array
            int count=0;

            for (int j=i;j<a.length;j++){//here we add a[i] to count
                count=count+a[j];

                res=Math.max(res,count);//we find the max count in form of result
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,-2,3,-1,2};
        System.out.println(fun(a));
    }
}

 *///Maximum sum subarrays

/*
class main{
    private static int fun(int[] a) {
        int res=0;
        int end=a[0];

        for (int i=0;i<a.length;i++){

            end=Math.max(end+a[i],a[i]);

            res=Math.max(res,end);
        }
        return res;

    }

    public static void main(String[] args) {
        int a[]={1,-2,3,-1,2};
        System.out.println(fun(a));

    }

}

 *///Maximum sum subarrays efficient way

/*
class max{
    private static int fun(int[] a) {
        int res = 1;

        for (int i = 0; i < a.length; i++) {
            int count = 1;

            for (int j = i + 1; j < a.length; j++) {

                if ((a[j] % 2 == 0 && a[j - 1] % 2 != 0) //checking
                        ||                                    //or
                   (a[j] % 2 != 0 && a[j - 1] % 2 == 0))//checking
                {
                    count++;// true then count ++
                }else
                    break;

            }
            res=Math.max(res,count);//res is already 1 and calculate the max
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={7,10,13,14};
        System.out.println(fun(a));
    }


}

 */ //maximum length even-odd subarrays

/*
class max{
    private static int  fun(int[] a) {
        int res=1;
        int count =1;

        for (int i=1;i<a.length;i++){
            if ((a[i] % 2 == 0 && a[i - 1] % 2 != 0)                  //checking
                               ||                                    //or
                (a[i] % 2 != 0 && a[i - 1] % 2 == 0)){              //checking

                count++;
                res=Math.max(res,count);
            }
            else count=1;

        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={7,10,13,14};
        System.out.println(fun(a));

    }
}

 */ //maximum length even-odd subarrays efficient way

/*
class main{
    private static int fun(int[] a) {
        int res=a[0];
        int n=a.length;

        for (int i=0;i<n;i++){
            int curr_max=a[i];
            int curr_sum=a[i];

            for (int j=1;j<n;j++){
                int index=(i+j)%n;
                curr_sum=curr_sum+a[index];
                curr_max=Math.max(curr_max,curr_sum);
            }
            res=Math.max(res,curr_max);
            }
        return res;

    }
    public static void main(String[] args) {
        int a[]={5,-2,3,4};
        System.out.println(fun(a));
    }


}

 */ //maximum circular sum sub-arrays

/*
class main{
    private static int fun(int[] a) { //normal kadan's algo
        int res=a[0],maxend=a[0];
        int n=a.length;

        for (int i=1;i<n;i++){
            maxend=Math.max(a[i],maxend+a[i]);
            res=Math.max(res,maxend);
        }
        return res;
    }

    static int overallmaxsum(int[] a){
        //finding overall max
        int n=a.length;
        int max_normal=fun(a);
        if (max_normal<0)
            return max_normal;


        int a_sum=0;
        for (int i=0;i<n;i++){
            a_sum+=a[i];
            a[i]=-a[i];

        }
        int max_circular=a_sum+fun(a);

        return Math.max(max_normal,max_circular);
    }
    public static void main(String[] args) {
        int a[]={5,-2,3,4};

        System.out.println(fun(a));//this will give maximum sum

        System.out.println(overallmaxsum(a));//max circular sum
    }
}

 *///maximum circular sum sub-arrays efficient way

/*
class main{
    private static int fun(int[] a) {

        for (int i=0;i<a.length;i++){
            int count =1;
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    count++;
                }
            }
            if (count>a.length/2)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={3,8,3,4,8,8,8};

        System.out.println(fun(a));//will print index of highest number
    }
}

 */ // Majority element //better soln is moores algorithm

/*
class flips{
    public static void main(String[] args) {

        int a[]={0,0,1,1,0,0,1,1,0};
        int n=a.length;

        for (int i=1;i<n;i++){
            if (a[i]!=a[i-1]){
                if (a[i]!=a[0]){
                    System.out.print("from "+ i+" to ");
                } else
                    System.out.println(i-1);
            }
        }

        if ((a[n-1]) != a[0])
            System.out.println(n-1+" ");
    }
}

 */// using min flip turn all number equal

/*
class count_1s{
    public static void main(String[] args) {
        int a[]={0,0,0,1,1,1,1,1,1,1};
        int low =0;int high=a.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==0){
                low=mid+1;
            }
            else if(a[mid]==0||a[mid-1]==0){
              //return (n-mid)
                System.out.println(a.length-mid);
                break;
            }
            else high=mid-1;
        }
    }
    //return 0;
}

 *///count 1s in binary array






































































