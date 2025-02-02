package my.javastudy.company.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Group extends Artist {

    protected final List<Member> memberList = new ArrayList<>();

    public Group(String name, LocalDate debutDt, ArtistType type) {
        super(name, debutDt, type);
    }

    // 추상메서드
    // TODO
    abstract void setType();

    public Member findMember(String name) {
        Member result = null;
        for (Member mem : memberList) {
            if (name.equals(mem.getName())) {
                result = mem;
            }
        }
        return result;
    }

    public void addMember(Member m){
        memberList.add(m);
    }

    public void removeMember(Member m) {
        memberList.remove(m);
    }

    public int getMemberCnt() {
        return memberList.size();
    }
}
