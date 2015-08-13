/** Rodney Villareal
 *  Project 1 CS 356
 *  SimulationDriver: creates different questions 
 *  and invokes the IVoteService automatically.
 */

import java.util.Scanner;

public class SimulationDriver {
	public static void main(String[] args) {
		System.out.println("Welcome to the IVote Service Simulator.\n\n"
						   	+ "This simulator will create a Multiple Choice Question\n"
							+ "and a Single Choice Question and tally the answers\n"
						   	+ "from a number of students.\n\n"
							+ "Press enter to continue.\n");
		Scanner in = new Scanner(System.in);
		String temp = in.nextLine();
		
		System.out.println("Creating a Multiple Choice Question...\n");
		Question mcq = new MultipleChoiceQuestion();
		String question = "What states have you traveled to?\n"
						+ "A. Nevada\n"
						+ "B. Hawaii\n"
						+ "C. New York\n"
						+ "D. Florida\n"
						+ "E. Alaska\n";
		mcq.setQuestion(question);
		IVoteService service = new IVoteService();
		service.setQuestion(mcq);		
		
		System.out.println("The question is - " + mcq.getQuestion() + "\n");
		System.out.println("Press enter to continue.\n");
		temp = in.nextLine();
		
		System.out.println("Creating students with ID's 1111, 2222, 3333, 4444 and 5555...\n");
		int ID = 1111;
		Student[] student = new Student[5];
		for(int i = 0; i < 5; i++) {
			student[i] = new Student();
			student[i].setId("" + ID);
			ID = ID + 1111;
		}
		
		System.out.println("Student " + student[0].getId() + " answers: a c d");
		service.inputVote(student[0], "a c d");
		System.out.println("Student " + student[1].getId() + " answers: a b e");
		service.inputVote(student[1], "a b e");
		System.out.println("Student " + student[2].getId() + " answers: b d");
		service.inputVote(student[2], "b d");
		System.out.println("Student " + student[3].getId() + " answers: c");
		service.inputVote(student[3], "c");
		System.out.println("Student " + student[4].getId() + " answers: a ");
		service.inputVote(student[4], "a");

		System.out.println("\nThe Statistics are:");
		service.printStatistic();

		System.out.println("\nPress enter to continue.\n");
		temp = in. nextLine();
		
		System.out.println("Two students vote again and only their last submission counts...\n");
		System.out.println("Student 3333 votes again with answer c");
		service.inputVote(student[2], "c");
		System.out.println("Student 4444 votes again with answer d");
		service.inputVote(student[3], "d");
		
		System.out.println("\nThe Statistics are:");
		service.printStatistic();
		
		System.out.println("\nPress enter to continue.\n");
		temp = in. nextLine();
		
		System.out.println("Creating a single Choice Question...\n");
		Question scq = new SingleChoiceQuestion();
		question = "What city do you live in?\n"
						+ "A. Fullerton\n"
						+ "B. Diamond Bar\n"
						+ "C. Pomona\n"
						+ "D. Chino Hills\n"
						+ "E. West Covina\n";
		scq.setQuestion(question);
		service.setQuestion(scq);		
		
		System.out.println("The question is - " + scq.getQuestion() + "\n");
		System.out.println("Press enter to continue.\n");
		temp = in.nextLine();
		
		System.out.println("Student " + student[0].getId() + " answers: b");
		service.inputVote(student[0], "b");
		System.out.println("Student " + student[1].getId() + " answers: d");
		service.inputVote(student[1], "d");
		System.out.println("Student " + student[2].getId() + " answers: b");
		service.inputVote(student[2], "b");
		System.out.println("Student " + student[3].getId() + " answers: a");
		service.inputVote(student[3], "a");
		System.out.println("Student " + student[4].getId() + " answers: e ");
		service.inputVote(student[4], "e");
		
		System.out.println("\nThe Statistics are:");
		service.printStatistic();

		System.out.println("\nPress enter to continue.\n");
		temp = in. nextLine();
				
		System.out.println("Three students vote again and only their last submission counts\n"
							+ "multiple answers or answers not listed do not count and"
							+ "their submissions are reset...\n");
		System.out.println("Student 1111 votes again with answer c d e");
		service.inputVote(student[0], "c d e");
		System.out.println("Student 2222 votes again with answer g");
		service.inputVote(student[1], "g");
		System.out.println("Student 4444 votes again with answer d");
		service.inputVote(student[3], "d");
		
		System.out.println("\nThe Statistics are:");
		service.printStatistic();
		
		System.out.println("\nPress enter to continue.\n");
		temp = in. nextLine();
		
	}
}
