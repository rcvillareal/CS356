/** Rodney Villareal
 *  Project 1 CS 356
 *  IVoteService: configures with a Question object
 *  accepts votes for a poll and counts votes and
 *  prints statistics from the Question object.
 */

import java.util.ArrayList;
import java.util.List;


public class IVoteService {
	private List<Student> currentStudents = new ArrayList<Student>();
	private List<String> currentAnswers = new ArrayList<String>();
	private Question question;
	public void setQuestion(Question question) {
		this.question = question;
		currentStudents.clear();
		currentAnswers.clear();
	}
	public void inputVote(Student student, String answer) {
		if(currentStudents.contains(student)) {
			subtractVote(currentAnswers.get(currentStudents.indexOf(student)));
			currentAnswers.set(currentStudents.indexOf(student), answer);
		}
		else {
			currentStudents.add(student);
			currentAnswers.add(answer);
		}
		tallyVote(answer);
	}
	
	private void subtractVote(String answer) {
		question.subtractAnswers(answer);
	}
	private void tallyVote(String answer) {		
		question.tallyAnswers(answer);
	}
	public void printStatistic() {
		question.printStatistics();
	}
	
}
