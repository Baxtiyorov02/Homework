package Topshiriq_2;

public enum Animals {
    DOG("wow, wow"), CAT("miyau,miyau"),FISH("   "),WOLK("auu,auu"),COW("muu,muu"),
    CHIVIN("vizz, vizz");
    private String voice;
    Animals(String voice) {
        this.voice=voice;
    }

    public String getVoice() {
        return voice;
    }
}
