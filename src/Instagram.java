public class Instagram extends SocialNetwork {

    private String advantage;
    private int numberOfDownloads;


    public Instagram(String advantage, int numberOfDownloads, String benefit) {
        super(benefit);
        this.advantage = advantage;
        this.numberOfDownloads = numberOfDownloads;
    }



    public String getAdvantage() {
        return advantage;
    }

    public int getNumberOfDownloads() {
        return numberOfDownloads;
    }

    @Override
    public void print() {System.out.println("Advantage: " + advantage + "\nNumber of downloads: " + numberOfDownloads+
            "Benefit: " + getBenefit());

    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public void setNumberOfDownloads(int numberOfDownloads) {
        this.numberOfDownloads = numberOfDownloads;
    }
}
