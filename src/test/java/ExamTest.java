import static org.junit.Assert.*;

public class ExamTest {

    @org.junit.Test

        public void myMethod(){
        Exam myExam =  new Exam("PHP");
        myExam = null;
        myExam = new Exam("SQL");
        myExam = new Exam("JAVA");

        Exam yourExam = new Exam("PMP");
                yourExam =  myExam;
            
        }


    }
