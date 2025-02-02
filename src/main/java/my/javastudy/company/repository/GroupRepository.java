package my.javastudy.company.repository;

import my.javastudy.company.domain.Group;
import my.javastudy.company.domain.Member;

public interface GroupRepository {

    public void addMember(Group g, Member m);
    public void removeMember(Group g, Member m);
    public void findMemberByName(String name);
}
