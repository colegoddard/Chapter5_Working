public class Probability implements ProbabilityCalc, Comparable<Probability>
{
    private double goal;
    private double total;
    private double prob;
    
    Probability(double g, double t){
        goal = g;
        total = t;
    }
    
    public double getGoal() {
        return goal;
    }
    
    public double getTotal() {
        return total;
    }
    
    public double probabilityAND(Probability p2){
        return goal/total * p2.getGoal()/p2.getTotal();
    }
    
    public double probabilityOR(Probability p2, double overlap){
        return goal/total + p2.getGoal()/p2.getTotal() - overlap;
    }
    
    public int compareTo(Probability p2) {
        if (this.prob == p2.prob) {
            return 0;
        }
        else if(this.prob > p2.prob) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
