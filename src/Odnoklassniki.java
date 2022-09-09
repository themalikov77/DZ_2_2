public class Odnoklassniki extends SocialNetwork {


    private int launchYear;
    private String color;

    public Odnoklassniki(int launchYear, String color,String benefit) {
        super(benefit);
        this.launchYear = launchYear;
        this.color = color;
    }



    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Launch Year: "+ launchYear +"\nColor: "+ color + "Benefit: " + getBenefit());

    }
}
