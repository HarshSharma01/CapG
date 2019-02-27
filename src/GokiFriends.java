import java.util.*;
public class GokiFriends {

	public static void main(String[] args) {
		int numFriends;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of frineds");
		numFriends=scan.nextInt();
		int allSkills;
		System.out.println("enter skills");
		allSkills=scan.nextInt();
		/*int[] numPeople=new int[numFriends];
		for(int i=0;i<numPeople.length;i++) {
			numPeople[i]=scan.nextInt();
		}*/
		int[] numSkills=new int[numFriends];
		for(int i=0;i<numFriends;i++) {
			numSkills[i]=scan.nextInt();
		}
		for(int i=0;i<numFriends;i++) {
			if(numSkills[i]<allSkills) {
				System.out.println("NO");
			}
			else if(numSkills[i]>=allSkills) {
				System.out.println("YES");
			}
		}

	}
}
