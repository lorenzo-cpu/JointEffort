public class Addition {
    private double n1;
    private double n2;
    private double result;
    public Addition(double n1, double n2, double result)
    {
        this.n1=n1;
        this.n2=n2;
        this.result=result;
    }

    public double calculation()
    {
        result=n1+n2;
        return result;
    }
}
