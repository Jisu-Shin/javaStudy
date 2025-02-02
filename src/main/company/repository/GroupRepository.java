package main.company.repository;

import main.company.domain.Group;
import main.company.domain.Member;

public interface GroupRepository {

    public void addMember(Group g, Member m);
    public void removeMember(Group g, Member m);
    public void findMemberByName(String name);
}
