package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for(Lab lab : labs){
            if (lab.getName().equals(labName))
                return lab;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (getLab(labName) == null){
            throw new UnsupportedOperationException();
        }
        Lab lab = getLab(labName);
        lab.setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString(){
        String output = "";
        for(int i = labs.size() - 1; i >= 0; i--){
            output += labs.get(i).getName() + " > " + labs.get(i).getStatus();
            if (i != 0)
                output += "\n";
        }
        return output;
    }
}
