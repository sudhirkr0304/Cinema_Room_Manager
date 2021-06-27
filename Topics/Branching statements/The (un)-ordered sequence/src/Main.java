import java.util.*;

class Main {

    static  boolean find(ArrayList<Integer> arr)
    {
        ArrayList<Integer> arr2 = (ArrayList<Integer>) arr.clone();

        Collections.sort(arr2);

        for(int i = 0 ; i< arr.size();i++)
        {
            if(arr.get(i) != arr2.get(i))
            {
                return  false;
            }
        }

        return true;

    }
    static  boolean find2(ArrayList<Integer> arr)
    {
        ArrayList<Integer> arr2 = (ArrayList<Integer>) arr.clone();

        Collections.sort(arr2 , Collections.reverseOrder());

        for(int i = 0 ; i< arr.size();i++)
        {
            if(arr.get(i) != arr2.get(i))
            {
                return  false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        // put your code here

        Scanner scanner  = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        int num = -1;

        while (num != 0)
        {
            num = scanner.nextInt();
            if(num != 0)
            {
                arr.add(num);
            }


        }

//        System.out.println(arr);
        System.out.println(find(arr) || find2(arr));
    }
}