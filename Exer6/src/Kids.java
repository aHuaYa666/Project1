public class Kids extends Mankind{
    private int yearsOld;

    public Kids(){

    }
    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }
    public Kids(int sex, int salary, int yearsOld){
        this.yearsOld = yearsOld;
        setSex(sex);
        setSalary(salary);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    public void printAge(){
        System.out.println("I am " + getYearsOld() + ".");
    }

    public void employeed(){
        super.employeed();
        System.out.println("Kids should study and no job.");

    }
}
