package Template;

public class MemberCard extends Card {
    private int points;
    public MemberCard(String name,String surname,int points){
        super(name,surname);
        this.points=points;;
    }
    public void add(int points){
        this.points+=points;
    }
    public void remove(int points){
        this.points-=points;
    }
    public int getPoints(){
        return points;
    }
    public double calculateNewTotal(double total) {
        if((points/100)>=total){
            points-=total*100;
            return 0;
        }
        return total-(points/100);
    }
}
