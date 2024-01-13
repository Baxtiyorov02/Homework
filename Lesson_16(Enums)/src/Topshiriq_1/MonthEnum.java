package Topshiriq_1;

public enum MonthEnum {
    YANVAR("QISH"),FEVRAL("QISH"),MART("BAHOR"),APREL("BAHOR"),MAY("BAHOR"),
    IYUN("YOZ"), IYUL("YOZ"),AVGUST("YOZ"),
    SENTYABR("KUZ"),OKTYABR("KUZ"),NOYABT("KUZ"),DEKABR("QISH");

    private  String season;


    MonthEnum(String season) {
        this.season=season;

    }
    public  String getSeason(){
        return season;
    }
}
