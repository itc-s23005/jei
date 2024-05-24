// s23005
// どんなプログラムか記入する  


public class d48Q5kadai {
		public static void main(String[] args) {
				int [] arr = {11, 22, 33, 44, 55};
				int n = arr.length;
				
				for(int i=0; i<n-1; i++) {
					int maxIndex = i;
					for(int j=i+1; j<n; j++) {
							if(arr[j] > arr[maxIndex]) {
									maxIndex = j;
					}
					int tmp = arr[maxIndex];
					arr[maxIndex] = arr[i];
					arr[i] = tmp;
				}	
		}
		for(int num : arr) {
				System.out.println(num);
	}
		}
}
