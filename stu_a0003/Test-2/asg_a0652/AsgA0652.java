class AsgA0652{
	
	public int find_min_max(int[][] a) {
        int min = a[0][0];
	int max = a[0][0];
        for (int col = 0; col < a.length; col++) {
            for (int row = 0; row < a[col].length; row++) { 
                if (min > a[col][row]) {
                    min = a[col][row];
                }
            }
        }

        for (int col = 0; col < a.length; col++) {
            for (int row = 0; row < a[col].length; row++) {
                if (max < a[col][row]) {
                    max = a[col][row];
                }
            }
        }

	System.out.println(min);
	return max;
    }
}
