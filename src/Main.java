
public class Main {
    public static void main(String[] args) {


        System.out.println("Hello and welcome to the Quiz !");

        QuestionService service = new QuestionService();

        service.displayQuestions();

        service.calculateScore();
        }
    }
