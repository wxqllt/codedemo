package sowardTowardOffer;

/*

其实就是不断缩小两个指针之间的距离，直到指向同一个位置。注意的是，当两个指针之间的距离为1时，有两种情况：
1. [5,1] 此时mid指向５　　因为5 > 1　所以有　left　＝　mid＋１；
2. [1,2]　此时mid指向１　　1<2 故当mid < right 时应有，right = mid；

*/
public class MinNumberInRotateArray {

	public int minNumberInRotateArray(int[] l) {
		if (l.length == 0)
			return 0;
		int left = 0;
		int right = l.length - 1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (l[mid] > l[right]) {
				left = mid + 1;
			} else if (l[mid] == l[right]) {
				right = right - 1;
				// or left = left + 1; 此时不能确定在mid左边或右边故需要一步一步的移动
		
			} else {

				right = mid;
			}
		}
		// in the end left and right will point same position
		return l[left];
	}
}
