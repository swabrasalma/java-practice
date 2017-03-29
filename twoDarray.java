package practice;

public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k = 0, arrayElements[][] = new int[4][5];
		
		for(i=0; i<4; i++){
			for(j=0; j<5; j++){
				arrayElements[i][j] = k++;
				}
			}
		for(i=0; i<4; i++){
			for(j=0; j<5; j++){
				System.out.print(arrayElements[i][j] + " ");
//			System.out.println();
					}
			}

}
}
