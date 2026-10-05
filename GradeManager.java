package grades;
import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Double> grades;

    public GradeManager(){
        grades = new ArrayList();
    }
        
    public void addGrade(double grade){
        grades.add(grade);
    }

    public Double calculateAverage(){
        Double sum = 0.0;
        for (double grade : grades){
            sum += grade;
        }
        return grades.isEmpty()? 0.0 :sum / grades.size();
    }
    public Integer countPassingGrades(){
        Integer count = 0;
        for (Double grade : grades){
            if (grade >=50.0){
                count++;
            }
        }    
        return count;
    }
    public boolean borrar(double grade){
        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i) == grade){
                grades.remove(i);
                return true;
            }
        }
        return false;
    }


}