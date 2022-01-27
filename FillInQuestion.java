import java.util.Scanner;
/**
 * A FillInQuestion is constructed with a string that contains the answer surrounded by '_'. For example,
 *   "The inventor of Java is _James Gosling_." The quesiton should be displayed as: "The inventor 
 *    of Java is __________."
 *
 * @author mrcallaghan
 * @version 26jan2022
 */

/*
 * The FillInQuestion extends (i.e., subclass of, is derived from) the Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * DO NOT declare instance variable to text and answer!  The text and answer instance variables 
     *   are inherited from the Question class.
     */
    
    /**
     * Constructs a FillInQuestion object with the specified text that contains the answer.
     */
    public FillInQuestion(String question)
    {
        /*
         * Explictly call the Question class's constructor that takes a single parameter.
         *     Calling a superclass's constructor *must* be the first line of code in
         *     the subclass's constructor.
         *     
         * If we don't explicilty call a superclass's constructor, Java will automatically
         *     call the superclass's default (i.e., no parameters) constructor.
         */
        super(question);
    }
    
    /**
     * This method overrides the setText method in the Question class.
     * 
     * Sets the text and the answer.
     * 
     * @param questionText the text of the question, including the answer.
     */
    @Override
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();  // "The inventor of Java is "
        String answer = parser.next();          // "James Gosling"
        question += "________" + parser.next(); // "________."
        
        
        /*
         * The inherited instance variables are private; they cannot be directly accessed.
         *   We must use the mutator and accessor methods.
         */
        //this.text = question;
        //this.answer = answer;
        
        /*
         * Use the "super" reserved word to call the setText method as defined in the superclass 
         *   (e.g. Question)
         */
        super.setText(question);
        
        /*
         * We should use the "this" reserved word to call the setAnswer method.  If
         *   the subclass doesn't overrride this method, the superclass's method will be called.
         *   
         *   We don't want to use "super" in this case because if we later override setAnswer, 
         *   the overridden method would not be called.
         */
        this.setAnswer(answer);
    
    
    }

}
