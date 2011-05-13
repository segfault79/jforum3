package net.jforum.services;

import net.jforum.actions.helpers.ApproveInfo;
import net.jforum.entities.ModerationLog;
import net.jforum.entities.Post;
import net.jforum.entities.Topic;

import java.util.List;

/**
 * @author Matthias Sefrin
 */
public interface IModerationService {
    void moveTopics(int toForumId, ModerationLog moderationLog, int... topicIds);

    void lockUnlock(int[] topicIds, ModerationLog moderationLog);

    void deleteTopics(List<Topic> topics, ModerationLog moderationLog);

    void doApproval(int forumId, List<ApproveInfo> infos);

    void approvePost(Post post);
}
