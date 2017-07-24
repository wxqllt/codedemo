package code;

public class BestTimetoBuyandSell {
	/***
	 * only one transaction
	 * 
	 * @param price
	 * @return
	 */
	public int BestTimetoBuyandSell_First(int[] price) {
		if (price.length == 0) {
			return 0;
		}
		int tempmixprice = price[0];
		int max = 0;
		for (int i = 1; i < price.length; i++) {
			if (price[i] > tempmixprice) {

				max = Math.max(max, price[i] - tempmixprice);
			} else
				tempmixprice = price[i];
		}
		return max;
	}

	/***
	 * can transact n times
	 * 
	 * @param price
	 * @return
	 */
	public int BestTimetoBuyandSell_Second_versionOne(int[] price) {
		if (price.length == 0 || price.length == 1)
			return 0;
		int i = 0;
		int valley = price[0];
		int peak = price[0];
		int max = 0;
		while (i < price.length - 1) {
			while (i < price.length - 1 && price[i] > price[i + 1])
				i++;
			valley = price[i];
			while (i < price.length - 1 && price[i] < price[i + 1])
				i++;
			peak = price[i];
			max += peak - valley;
		}
		return max;
	}

	public int BestTimetoBuyandSell_Second_versionTwo(int[] price) {
		if (price.length < 2) {
			return 0;
		}
		int max = 0;
		for (int j = 0; j < price.length - 1; j++) {
			if (price[j] < price[j + 1]) {
				max += price[j + 1] - price[j];
			}
		}
		return max;
	}
	/****
	 *  you can only have 2 times to transact
	 * @param p
	 * @return
	 */
	public int BestTimetoBuyandSell_thrid(int[] p ){
		if (p.length < 2) {
			return 0;
		}
		int firstbuy = p[0];
		int firstsell = 0;
		int secondbuy = p[0];
		int second = 0;
		for(int i = 1; i < p.length; i++){
			
			
		}
		
	
		
	}
	
	
	
	/***
	 * k times transaction
	 * 
	 * @param k
	 * @param p
	 * @return
	 */
	public int BestTimetoBuyandSell_fourth(int k, int[] p) {
		if (p.length < 2) {
			return 0;
		}
		if(k>(p.length/2) ){
            int maxtemp = 0;
            for(int n = 1; n< p.length; n++){
                if(p[n] > p[n-1]){
                    
                    maxtemp += p[n]-p[n-1];
                }
            }
            return maxtemp; 
        }
		int[][] t = new int[k + 1][p.length];
		for (int i = 1; i <= k; i++) {
			int tempMax = t[i-1][0] - p[0];
			for (int j = 1; j < p.length; j++) {
				t[i][j] = Math.max(t[i][j - 1], p[j] + tempMax);
				tempMax = Math.max(t[i - 1][j - 1] - p[j], tempMax);
			}
		}
		return t[k][p.length - 1];
	}
}
