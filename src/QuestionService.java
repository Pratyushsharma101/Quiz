import java.sql.SQLOutput;
import java.util.Scanner;

public class QuestionService {


    Questions[] questions = new Questions[5];
    String []choice = new String[5];

    public QuestionService(){

        questions[0] =new Questions(1, "What is the capital city of Australia?", "Sydney", "Melbourne", "Canberra", "Brisbane", "Canberra");
        questions[1] =new Questions(2, "Which element has the chemical symbol 'O'?", "Gold", "Oxygen", "Osmium", "Ozone", "Oxygen"
        );
        questions[2] =new Questions(3, "Who wrote the play *Romeo and Juliet*?", "William Wordsworth", "George Orwell", "William Shakespeare", "Jane Austen", "William Shakespeare")
                ;
        questions[3] =new Questions(4, "What is the square root of 144?", "10", "11", "12", "14", "12");
        questions[4] =new Questions(5, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris"
        );

    }




    public void displayQuestions(){

        int j =0;
        for (Questions i : questions) {
            System.out.println("Question no. " + i.getId() +":" + i.getQues() + "\n a." + i.getOpt1() + "\n b." + i.getOpt2() + "\n c." + i.getOpt3() + "\n d." + i.getOpt4() );

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your answer");
            choice[j] = sc.nextLine();

            System.out.println("Your choice :" + choice[j] + "\n Correct Answer:" + i.getAns() +"\n");
            j++;
        }
    }

    public void calculateScore(){
        int count =0;
        int j=0;
        for( Questions q : questions){
            String answers = q.getAns();
            String userAns = choice[j++];

            if (answers.equals(userAns)){
                count++;
            }

        }
        System.out.println(count);
    }



}
