import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;


    public Bejegyzes(LocalDateTime letrejott, LocalDateTime szerkesztve) {
        this.letrejott = letrejott;
        this.szerkesztve = szerkesztve;
    }

    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;

    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like(){

    }
}

