package arrays;

public class merge2sortedArrays {
    public static void main(String[] args) {
        int[] a= {22,34,56,100};
        int[] b={46,69,90,99};

        int[] c = new int[a.length+b.length];
        int i =0, j=0,k=0;

        // merging
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]= a[i];
                i++; k++;
            }else{
                c[k]=b[j];
                j++; k++;
            }

        }


        // this whole condition will be responsible to handle 2 sorted arrays with different lengths


        if(i==a.length){ // now take elements from b only
            while(j<b.length) {
            c[k]=b[j];
            j++;k++;
            }
        }
        if(j==b.length){ // now take elements from a only
            while(i<a.length) {
                c[k]=a[i];
                i++;k++;
            }
        }
        for (int ele: c){
            System.out.print(ele+ " ");
        }
    }
}
