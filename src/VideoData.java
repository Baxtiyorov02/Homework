public class VideoData implements Comparable<VideoData> {
    UserData userData;
    private final String title;
    private final String  depasitory;
    private  int likeCount;
    private  int disLikeCount;

    public VideoData(UserData userData,
                     String title, String depasitory,
                     int likeCount, int disLikeCount) {
        this.userData = userData;
        this.title = title;
        this.depasitory = depasitory;
        this.likeCount = likeCount;
        this.disLikeCount = disLikeCount;
    }

    public UserData getUserData() {
        return userData;
    }

    public String getTitle() {
        return title;
    }

    public String getDepasitory() {
        return depasitory;
    }

    public int getLikeCount() {
        return likeCount;
    }
    public void incrementLike() {
        likeCount++;
    }
    public void incrementDisLike() {
        disLikeCount++;
    }



    @Override
    public String toString() {
        return "VideoData{" +
                "userData=" + userData +
                ", title='" + title + '\'' +
                ", depasitory='" + depasitory + '\'' +
                ", likeCount=" + likeCount +
                ", disLikeCount=" + disLikeCount +
                '}';
    }



    @Override
    public int compareTo(VideoData o) {
        return Integer.compare(this.likeCount, o.getLikeCount());
    }
}
