package quiz;

import java.util.Scanner;

public class QuestionService {
	
Question questions[] = new Question[5];
String selection[] = new String[5];

public QuestionService() {
	
	questions[0] = new Question(1,"Size of int","2","4","8","6","4");
	questions[1] = new Question(2,"Size of char","2","1","8","6","2");
	questions[2] = new Question(3,"Size of double","2","4","8","6","8");
	questions[3] = new Question(4,"Size of float","2","4","8","6","8");
	questions[4] = new Question(5,"Size of boolean","1","4","8","6","1");

	
}

	public void displayQuestions() {
		
		for(Question qs:questions) {
		
		System.out.println(qs.toString());
		
		}
	}

	public void playQuiz() {
		int i=0;
		for (Question qs:questions) {
			
			//5System.out.println(qs.getId());
			System.out.println(qs.getQuestion());
			System.out.println(qs.getOpt1());
			System.out.println(qs.getOpt2());
			System.out.println(qs.getOpt3());
			System.out.println(qs.getOpt4());
			
			System.out.println("Please type in correct Answer");
			Scanner sc = new Scanner(System.in);
			selection[i] = sc.nextLine().trim();
			i++;
			
		}
		
		
	}
	
	public void printScore() {
		int count=0;
		for(int i=0;i<5;i++) {

			Question q=questions[i];
			String ans = q.getAns();
			String s = selection[i];
			if(ans.equals(s)) {
				count++;
			}
			else {
				count=count-2;
			}
			
		}
		
		System.out.println("Score is "+ count);
	}
	
}
