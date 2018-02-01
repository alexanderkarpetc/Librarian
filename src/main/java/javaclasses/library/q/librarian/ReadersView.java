package javaclasses.library.q.librarian;

import javaclasses.library.q.librarian.valueobject.UserVO;

import java.util.List;

public class ReadersView {
    private final List<UserVO> users;

    public ReadersView(List<UserVO> users) {
        this.users = users;
    }
}
