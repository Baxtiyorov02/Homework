import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VideoData videoData=new VideoData(new UserData("Islombek","Baxtiyorov"),
                "Java darslar","10-dars",0,0);
        VideoData videoData1=new VideoData(new UserData("Islom","Baxtiyorov"),
                "Java darslar","1-dars",0,0);
        VideoData videoData2=new VideoData(new UserData("Islom","Baxtiyorov"),
                "Java darslar","20-dars",0,0);

        SocialRepository socialRepository=SocialRepository.getInstance();

        socialRepository.showMessageInterface=(message -> {
            System.out.println(message);
            System.out.println("\n");
        });
        socialRepository.showInfoInterface=(System.out::println);


        List<VideoData> videos=new ArrayList<>();
        videos.add(videoData);
        videos.add(videoData1);
        videos.add(videoData2);

        socialRepository.addVideo(videoData);
        socialRepository.addVideo(videoData1);
        //socialRepository.addVideos(videos);

        // socialRepository.removeVideo(videoData1.getUserData(),videoData1);
        socialRepository.disLikeTheVideo(videoData1);
        //socialRepository.getAllVideo();
        //socialRepository.getTopVideo(15);
        socialRepository.getByUser(new UserData("Islom","Baxtiyorov"));


    }
}
