package net.jforum.services;

import net.jforum.actions.helpers.PermissionOptions;
import net.jforum.entities.Group;

/**
 * @author Matthias Sefrin
 */
public interface IGroupService {
    void savePermissions(int groupId, PermissionOptions permissions);

    void add(Group group);

    void update(Group group);

    void delete(int... ids);

    void appendRole(Group group, String roleName, int roleValue);
}
