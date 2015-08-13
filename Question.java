/** Rodney Villareal
 *  Project 1 CS 356
 *  Question: Question interface with methods
 *  that set question string, adds or subtracts 
 *  answers and prints statistics to be inherited.
 */

public interface Question {
	public String getQuestion();
	public void setQuestion(String question);
	public void tallyAnswers(String answer);
	public void subtractAnswers(String answer);
	public void printStatistics();
}
