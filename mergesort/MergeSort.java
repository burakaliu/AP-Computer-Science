import java.util.ArrayList;
public class MergeSort{
    public ArrayList<Integer> mergesort(ArrayList<Integer> a){
        if (a.size() == 1){
            return a;
        }

        ArrayList<Integer> left = new ArrayList<Integer>(a.subList(0, a.size()/2));
        ArrayList<Integer> right = new ArrayList<Integer>(a.subList(a.size()/2, a.size()));
        
        left = mergesort(left);
        right = mergesort(right);

        return merge(left, right);
    }

    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size()){
            if (left.get(i) < right.get(j)){
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }
        while (i < left.size()){
            result.add(left.get(i));
            i++;
        }
        while (j < right.size()){
            result.add(right.get(j));
            j++;
        }
        return result;
    }
}