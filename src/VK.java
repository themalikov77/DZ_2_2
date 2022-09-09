public class VK extends SocialNetwork {

    private String uniqueness;
    private int musicListeningTime;

    public VK(String uniqueness, int musicListeningTime, String benefit) {
        super(benefit);
        this.uniqueness = uniqueness;
        this.musicListeningTime = musicListeningTime;
    }


    public String getUniqueness() {
        return uniqueness;
    }

    public void setUniqueness(String uniqueness) {
        this.uniqueness = uniqueness;
    }

    public int getMusicListeningTime() {
        return musicListeningTime;
    }

    public void setMusicListeningTime(int musicListeningTime) {
        this.musicListeningTime = musicListeningTime;
    }

    @Override
    public void print() {
        System.out.println("Uniqueness: " + uniqueness + "\nMusic Listening Time: " + musicListeningTime + "Benefit: " + getBenefit() );



    }
}
