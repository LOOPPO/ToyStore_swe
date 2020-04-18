package Template;

public class RateCard extends Card {
    private int rate;
    public RateCard(String name,String surname,int rate) throws Exception{
        super(name,surname);
        setRate(rate);
    }
    public void setRate(int rate)throws Exception{
        if((rate<=100)&&(rate>=0)){
            this.rate=rate;
        }else{
            throw new Exception("Invalid rate...");
        }
    }
    public int getRate(){
        return rate;
    }
    public double calculateNewTotal(double total) {
        return total-(total*rate/100);
    }
}
