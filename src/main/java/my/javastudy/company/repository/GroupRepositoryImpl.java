package my.javastudy.company.repository;

import my.javastudy.company.domain.Group;
import my.javastudy.company.domain.Member;

public class GroupRepositoryImpl implements GroupRepository{
    Group group;

    @Override
    public void addMember(Group g, Member m) {
        group = g;
        group.addMember(m);
    }

    @Override
    public void removeMember(Group g, Member m) {
        group = g;
        group.removeMember(m);
    }

    @Override
    public void findMemberByName(String name) {

    }
}
