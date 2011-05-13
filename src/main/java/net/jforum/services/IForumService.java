package net.jforum.services;

import net.jforum.entities.Forum;

/**
 * @author Matthias Sefrin
 */
public interface IForumService {
    void add(Forum forum);

    void update(Forum forum);

    void delete(int... ids);

    void upForumOrder(int forumId);

    void downForumOrder(int forumId);
}
