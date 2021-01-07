package github3;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class pratice3 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the integers between 1 and 100: ");
	        HashMap<Integer, Integer> hashMap = new HashMap<>();
	        int n=input.nextInt();
	        while (n!=0) {
	            if (n<=100 && n>=0) {
	                if (hashMap.containsKey(n)) {
	                    hashMap.put(n,hashMap.get(n) + 1);
	                }
	                else
	                    hashMap.put(n,1);
	            }
	            n=input.nextInt();
	        }
	        for (Entry<Integer,Integer>entry:hashMap.entrySet()) {
	            System.out.println(entry.getKey()+" occurs "+entry.getValue()+((entry.getValue()==1) ? " time ":" times "));
	        }
		}
}
