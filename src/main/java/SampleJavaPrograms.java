import java.util.*;

public class SampleJavaPrograms {
    public static void main(String[] args) {
        System.out.println("starts.............");
//        reverseString();
//        reverseString_StringBuilderWay();
//        swapNumbersWithoutUsing3rdNum();
//        findVowels();
//        findRepetitiveCharsInString();
//        sortArrayWithoutUsingSortMethod();

//        sortArrayWithUsingSortMethod();
//        nthMaxInArray();
        isPrime();
    }


    public static void reverseString(){
         String x = "India";
         char[] charArray  = x.toCharArray();
         int n=charArray.length;
        char[] charRevArray = new char[n];

        System.out.println(charArray);

         for(int i=n-1; i>=0;i--)
         {
             System.out.println(i);
             charRevArray[(n-i)-1] = charArray[i];
         }

        System.out.println(charRevArray);
    }

    public static void reverseString_StringBuilderWay(){
        String x = "India";
        char[] charArray  = x.toCharArray();
        int n=charArray.length;
        StringBuilder sb = new StringBuilder();

        for(int i=n-1; i>=0;i--)
        {
           sb.append(charArray[i]);
        }

        System.out.println(sb);
    }

    static public void swapNumbersWithoutUsing3rdNum(){
        int a = 22; int b = 33;
        System.out.println(String.format("a is %d, b is %d", a,b));
        b = b+a;
        a = b-a;
//        System.out.println(a);
        b = b-a;
//        System.out.println(b);
        System.out.println(String.format("a is %d, b is %d", a,b));
    }

    static public void findVowels(){
        String x = "India";
       boolean flag =  x.toLowerCase().matches(".*[aeiou].*");
        System.out.println(flag);
        int counter = 0;
        for (Character y: x.toCharArray()){
            if(y.toString().matches(".*[aeiouAEIOU]")){
                System.out.println(y);
                counter++;
            }

        }
        System.out.println(String.format("no of vowels - %d ", counter));


    }

    static public void findRepetitiveCharsInString(){
        String x = "India";
        char [] chArray = x.toCharArray();
        HashMap<Character, Integer> mapper = new HashMap<Character, Integer>();
        for(int i =0; i<=chArray.length-1; i ++){
            if (mapper.get(Character.toLowerCase(chArray[i])) == null){
                mapper.put(Character.toLowerCase(chArray[i]),1);
            }else{
                mapper.put(Character.toLowerCase(chArray[i]), mapper.get(Character.toLowerCase(chArray[i]))+1);
            }
        }
//
//        Integer [] valuesArray = mapper.values();
//        Arrays.sort(valuesArray);
//        System.out.println(Arrays.toString(valuesArray));
//        System.out.println(mapper.values());
//        mapper.values().stream().sorted();
//        System.out.println(mapper.values());
//        System.out.println(mapper.values().getClass());


        int maxValueInMap = (Collections.max(mapper.values()));
        System.out.println(maxValueInMap);


        ArrayList<Integer> tt = new ArrayList<>(mapper.values());
        Collections.sort(tt);
        System.out.println(tt);

        for(int a = 0; a< tt.size(); a++){
            for(int b = a+1; b<tt.size(); b++){
                if(tt.get(a)<tt.get(b)){
//                    tt.get(a) =00;
                }
            }
        }
        System.out.println(tt);

        for( HashMap.Entry<Character, Integer> entry : mapper.entrySet() ){

            if(entry.getValue().equals(1)){
                System.out.println("Key for value " +entry.getValue() + " is: " + entry.getKey());
               // break;
            }
        }

//        System.out.println(mapper);
    }

    public static void sortArrayWithoutUsingSortMethod(){
        int arr [] = new int[]{1,3,43333,599,2992};
        System.out.println("Given array :" + Arrays.toString(arr));
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int temp = 0;
                //> is for descending order
                //< is for ascending order
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
                System.out.println(arr[i]);

        }
        }

    public static void sortArrayWithUsingSortMethod(){
//        int arr [] = new int[]{1,3,43333,599,2992};
        Integer arr [] = {3,22,2,333993};
        System.out.println("Given array :" + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Ascending - Sorted Array :" + Arrays.toString(arr));

        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println("Descending - Sorted Array :" + Arrays.toString(arr));



    }
//to do
    static public void nthMaxInArray(){
        int [] arr = new int[]{2,3,2, 3893,22,3,93939,233};
        System.out.println("Given Array: " + Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("Sorted method:  "+ Arrays.toString(arr));
        int counter = 0;
        HashMap<Integer, Integer> mapper = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(mapper.get(arr[i])==null){
                mapper.put(arr[i], 1);
            }
            for(int j=i+1; j<arr.length; j++){
//                mapper.computeIfAbsent(arr[i], k -> counter + 1);
                int tmp = 0;
                if (arr[i]>=arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=tmp;
                    if(arr[i]==arr[j]){
                        mapper.put(arr[i], mapper.get(arr[i])+1);
                    }
                }
            }

        }

        System.out.println("sorted with calcs: " + Arrays.toString(arr));
        System.out.println(mapper.toString());
    }

    static public void isPrime(){
        int i, number, count;

        System.out.println(" Prime Numbers from 1 to 100 are : ");
        for(number = 1; number <= 100; number++)
        {
            count = 0;
            for (i = 2; i <= number/2; i++)
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && number != 1 )
            {
                System.out.print(number + " ");
            }
        }
    }

}