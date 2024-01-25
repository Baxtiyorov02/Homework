import java.util.*;

public class SocialRepository {
    private static SocialRepository instance = null;
    List<VideoData> videos = new LinkedList<>();
    ShowInfoInterface showInfoInterface = null;
    ShowMessageInterface showMessageInterface = null;

    private boolean hasShowInfoInterface() {
        return showInfoInterface != null;
    }

    private boolean hasShowMessageInterface() {
        return showMessageInterface != null;
    }

    public void setShowInfoInterface(ShowInfoInterface showInfoInterface) {
        this.showInfoInterface = showInfoInterface;
    }

    public void setShowMessageInterface(ShowMessageInterface showMessageInterface) {
        this.showMessageInterface = showMessageInterface;
    }

    SocialRepository() {

        videos.add(new VideoData(new UserData("Islom", "Baxtiyorov"), "Java darslar", "1-dars", 85, 0));
        videos.add(new VideoData(new UserData("Islom", "Baxtiyorov"), "Java darslar", "2-dars", 20, 0));
        videos.add(new VideoData(new UserData("Jasur", "Hakimov"), "Java darslar", "3-dars", 5, 0));
        videos.add(new VideoData(new UserData("Islom", "Baxtiyorov"), "Java darslar", "4-dars", 30, 0));
        sort();
    }

    public static SocialRepository getInstance() {
        if (instance == null) {
            instance = new SocialRepository();
        }
        return instance;
    }

    private boolean isHaveVideo(VideoData videoData) {
        boolean t=false;
        for (int i = 0; i < videos.size(); i++) {
            VideoData video=videos.get(i);
            if (video.getDepasitory().equals(videoData.getDepasitory())
                    && video.getTitle().equals(videoData.getTitle())){
                t=true;
                break;
            }
        }
        return t;
    }
    private void sort(){
        Collections.sort(videos);
    }


    public void addVideo(VideoData videoData) {
        if (!isHaveVideo(videoData)) {
            videos.add(videoData);
            showMessageInterface.showMessage("Done!");
        } else {
            showMessageInterface.showMessage("Error! Oldin qo`shilgan");
        }
        sort();
    }
    public  void addVideos(List<VideoData> newVideos){
        for (int i = 0; i <newVideos.size() ; i++) {
            VideoData newVideo=newVideos.get(i);
            if(isHaveVideo(newVideo)){
                showInfoInterface.showInfo(newVideo);
            }
            addVideo(newVideo);
        }

    }

    public  void  removeVideo(UserData user,VideoData newVideo){
        String s=null;
        for (int i = 0; i <videos.size() ; i++) {

            VideoData video=videos.get(i);
            if(video.getUserData().equals(user)&&
                    video.getTitle().equals(newVideo.getTitle())&& video.getDepasitory().equals(newVideo.getDepasitory())){
                videos.remove(video);
                s="Done! video o`chirildi!";
                break;
            }
            else {
                s="Error!";
            }
        }
        showMessageInterface.showMessage(s);
    }
    public  void  likeTheVideo(VideoData videoData){
        if (isHaveVideo(videoData)){
            videoData.incrementLike();
            showMessageInterface.showMessage("Like uchun rahamt");
        }
        else {
            showMessageInterface.showMessage("Bu video tarmoqda mavjud emas");
        }
        sort();
    }
    public  void  disLikeTheVideo(VideoData videoData){
        if (isHaveVideo(videoData)){
            videoData.incrementDisLike();
            showMessageInterface.showMessage("Xudoga sodim karochi!");
        }
        else {
            showMessageInterface.showMessage("Bu video tarmoqda mavjud emas");
        }
    }

    public  void getByUser(UserData user){
        for (int i = 0; i <videos.size() ; i++) {
            if (videos.get(i).getUserData().equals(user)){
                showInfoInterface.showInfo(videos.get(i));
            }

        }
    }

    public void getAllVideo(){
        for (int i = 0; i <videos.size() ; i++) {
            showInfoInterface.showInfo(videos.get(i));

        }
    }
    public void getTopVideo(int count){
        for (int i = videos.size()-1; i>=0; i--) {
            if (videos.get(i).getLikeCount()<count){
                showInfoInterface.showInfo(videos.get(i));
            }

        }
    }

}



