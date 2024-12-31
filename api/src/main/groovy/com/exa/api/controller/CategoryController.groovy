package com.exa.api.controller

import com.exa.api.entity.Category
import com.exa.api.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/categories')
class CategoryController
{
    @Autowired
    private final CategoryService categoryService

    @GetMapping('')
    List<Category> findAll()
    {
        categoryService.findAll()
    }

    @GetMapping('{id}')
    Optional<Category> findById(@PathVariable('id') int id)
    {
        categoryService.findById(id)
    }

    @PostMapping()
    Category save(@RequestBody Category category)
    {
        categoryService.save(category)
    }

    @PutMapping('{id}')
    Category update(@RequestBody Category category, @PathVariable('id') int id)
    {
        categoryService.update(category, id)
    }

    @DeleteMapping('{id}')
    Category delete(@PathVariable('id') int id) {
        categoryService.delete(id)
    }
}
