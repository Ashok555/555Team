package org.test.course;

public class TaskDay3 {
public static void main(String[] args) {
	for (int i = 0; i <=2; i++) {
		for (int j = 0; j <2; j++) {
			if (j==5) {
				break;
			}
			if (i==2) {
				continue;
			}
			System.out.println(j);
			}
		System.out.println(i);
		
	}

}
}
