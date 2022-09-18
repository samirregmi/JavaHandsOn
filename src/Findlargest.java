
public class Findlargest {
	public static void smallest(int a, int b, int c, int d, int e) {
//	int sm = (a<b)&&(a<c)&&(a<d)&&(a<e)?a:(b<c)&&(b<d)&&(b<e)?b:(c<d)&&(c<e)?c:(d<e)?d:e;
//	System.out.println(sm);
	int min = 0;
	while
	(a<0&&b<0&&c<0&&d<0&&e<0) {
		a--;
		b--;
		c--;
		d--;
		e--;
		System.out.println(min);
	min++;
	}
		
	}
	
	public static void findLargestAmongTwoNums(int a , int b) {
	
	int largest  = (a>b?a:b);
	
	System.out.println(largest);
	}
	
	public static void findLargestAmongThreeNums(int a, int b, int c ) {
		int largest = (a>b)&&(a>c)?a:(b>c)?b:c;
		System.out.println(largest);
	}
	public static int findSmallestInFourNums(int a, int b, int c, int d) {
		int smallest = (a<b)&&(a<c)&&(a<d)?a:(b<c)&&(b<d)?b:(c<d)?c:d;
		return smallest;
	}
	
	public static void main(String[] args) {
		smallest(100, 112, 120,905, 276);
		findLargestAmongTwoNums(4500,1200);
		findLargestAmongThreeNums(1200,200,350);
		int smallnum = findSmallestInFourNums(1041,2117,3043,4454);
		System.out.println(smallnum);
		
	}

}
// int largest = (one > two)&&(one > three) ? one : (two > three) ? two : three
//int largest = (a>b)&&(a>c)?a:(b>c)?b:c;	