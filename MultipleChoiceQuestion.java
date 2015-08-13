/** Rodney Villareal
 *  Project 1 CS 356
 *  MultipleChoiceQuestion: MultipleChoiceQuestion class
 *  that has the question string, adds or subtracts 
 *  multiple answers and prints statistics method.
 */

import java.util.List;
import java.util.ArrayList;

public class MultipleChoiceQuestion implements Question {

	private String question;
	private List<Integer> tally = new ArrayList<Integer>();
	
	@Override
	public String getQuestion() {
		return question;
	}

	@Override
	public void setQuestion(String question) {
		this.question = question;
		for(int i = 0; i < 5; i++) {
			tally.add(0);
		}
	}
	
	@Override
	public void tallyAnswers(String answer) {
		if(answer.toLowerCase().contains("a"))
			tally.set(0, tally.get(0)+1);
		if(answer.toLowerCase().contains("b"))
			tally.set(1, tally.get(1)+1);			
		if(answer.toLowerCase().contains("c"))
			tally.set(2, tally.get(2)+1);
		if(answer.toLowerCase().contains("d"))
			tally.set(3, tally.get(3)+1);
		if(answer.toLowerCase().contains("e"))
			tally.set(4, tally.get(4)+1);							
	}
	
	@Override
	public void subtractAnswers(String answer) {
		if(answer.toLowerCase().contains("a"))
			tally.set(0, tally.get(0)-1);
		if(answer.toLowerCase().contains("b"))
			tally.set(1, tally.get(1)-1);			
		if(answer.toLowerCase().contains("c"))
			tally.set(2, tally.get(2)-1);
		if(answer.toLowerCase().contains("d"))
			tally.set(3, tally.get(3)-1);
		if(answer.toLowerCase().contains("e"))
			tally.set(4, tally.get(4)-1);							
	}

	@Override
	public void printStatistics() {
		System.out.println("A : " + tally.get(0));
		System.out.println("B : " + tally.get(1));
		System.out.println("C : " + tally.get(2));
		System.out.println("D : " + tally.get(3));
		System.out.println("E : " + tally.get(4));
	}
}
