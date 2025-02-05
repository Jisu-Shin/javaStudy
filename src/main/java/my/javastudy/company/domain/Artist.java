package my.javastudy.company.domain;

import java.time.LocalDate;

public class Artist {
    private String name;
    private LocalDate debutDt;
    private String originName;
    // TODO Artist가 솔로인지/배우인지/걸그룹인지/보이그룹인지 그 유형을 어떻게 구분하지?
    private ArtistType type;

    Artist(String name, ArtistType type){
        this(name, LocalDate.now(), type);
    }

    Artist(String name, LocalDate debutDt, ArtistType type) {
        this.name = name;
        this.debutDt = debutDt;
        this.type = type;
    }

    public void appearVarietyShow(String show) {
        System.out.println(name+"이/가 "+show+"에 출연하다");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDebutDt() {
        return debutDt;
    }

    public void setDebutDt(LocalDate debutDt) {
        this.debutDt = debutDt;
    }

    public String getOriginName() {
        return originName;
    }

    public ArtistType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", debutDt=" + debutDt +
                ", type='" + type + '\'' +
                '}';
    }
}
