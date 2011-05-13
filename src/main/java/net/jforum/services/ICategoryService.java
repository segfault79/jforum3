package net.jforum.services;

import net.jforum.entities.Category;

/**
 * @author Matthias Sefrin
 */
public interface ICategoryService {
    void add(Category category);

    void delete(int... ids);

    void update(Category category);

    void upCategoryOrder(int categoryId);

    void downCategoryOrder(int categoryId);
}
