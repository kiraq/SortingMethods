public class utils {

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void bubble(int[] arr){
        int swaps = -1;
        while(swaps != 0){
            swaps = 0;
            for(int i = 0; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                    swaps++;
                }
            }
        }
    }

    public static void bubbleShort(int[] arr){
        int swaps = -1;
        int end = arr.length-1;
        while(swaps != 0){
            int i = 0;
            swaps = 0;
            while(i < end){
                if(arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                    swaps++;
                }
                i++;
            }
            end = i;
        }
    }

    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10001);
        }
        return arr;
    }

    public static void selection(int[] a){
        int minpos = 0;
        for (int curpos = 0; curpos < a.length-1; curpos++){
            int minVal = a[curpos];
            for(int i = curpos+1; i < a.length; i++){
                if(minVal > a[i]){
                    minVal = a[i];
                    minpos = i;
                }
            }
            swap(a,curpos,minpos);
        }
    }
    
    public static boolean checkSum(int[] before, int[] after){
        int s1 = 0;
        int s2 = 0;
        
        for(int i : before){
            s1+=before[i];
            s2+=after[i];
        }
        return(s1==s2);
    }
    
    public static boolean isSorted(int[] a){
        for(int i = 0; i < a.length-1; i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
}
