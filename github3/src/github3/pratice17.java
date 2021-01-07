package github3;
import java.util.Scanner;
public class pratice17 {
		private String name;
		private static long score;
		public long getScore() {
			return score;
		}
		public void setScore(long score) {
			this.score=score;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String toString() {
			return this.name;
		}
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int sNum=input.nextInt();
			int i,j;
			pratice17 b[]= new pratice17[sNum];
			for (i=0;i<b.length;i++) {
				b[i]=new pratice17();
				String name=input.next();
				b[i].setName(name);
				long chengji=input.nextLong();
				b[i].setScore(score);
				
			}
			for (i=0;i<b.length;i++) {
				for (j=i+1;j<b.length;j++) {
					if(b[i].getScore()<b[j].getScore()) {
						pratice17 s=new pratice17();
						s=b[i];
						b[i]=b[j];
						b[j]=s;
					}
				}
			}
			for (i=0;i++<b.length;i++) {
				System.out.println(b[i].getName() + "µÄ³É¼¨:" + b[i].getScore());
			}
	}
}
