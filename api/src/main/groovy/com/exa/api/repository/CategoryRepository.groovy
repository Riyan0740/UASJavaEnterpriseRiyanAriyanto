package com.exa.api.repository

import com.exa.api.entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository extends JpaRepository<Category, Integer>
{
    List<Category> findAll()
    Optional<Category> findById(Integer id)
    Category save(Category category)
    void delete(Category category)
}
