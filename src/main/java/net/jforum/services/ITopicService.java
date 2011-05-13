package net.jforum.services;

import net.jforum.actions.helpers.AttachedFile;
import net.jforum.entities.PollOption;
import net.jforum.entities.Post;
import net.jforum.entities.Topic;

import java.util.List;

/**
 * @author Matthias Sefrin
 */
public interface ITopicService {
    void addTopic(Topic topic, List<PollOption> pollOptions, List<AttachedFile> attachments);

    void reply(Topic topic, Post post, List<AttachedFile> attachments);
}
