package net.jforum.services;

import net.jforum.actions.helpers.AttachedFile;
import net.jforum.entities.ModerationLog;
import net.jforum.entities.PollOption;
import net.jforum.entities.Post;

import java.util.List;

/**
 * @author Matthias Sefrin
 */
public interface IPostService {
    void delete(Post post);

    void update(Post post, boolean canChangeTopicType, List<PollOption> pollOptions,
            List<AttachedFile> attachments, ModerationLog moderationLog);
}
