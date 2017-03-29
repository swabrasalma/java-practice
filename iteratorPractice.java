package practice;

import java.util.*;

public class iteratorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList twoD = new ArrayList();
		twoD.add(1);
		twoD.add(2);
		twoD.add(3);
		twoD.add(4);
		twoD.add(5);
		twoD.add(6);
		twoD.add(7);
		twoD.add(8);
		twoD.add(9);
		
		Iterator swabra = twoD.iterator();
		while(swabra.hasNext()){
			Object element = swabra.next();
			System.out.print(element + " ");
		}
	}

}
