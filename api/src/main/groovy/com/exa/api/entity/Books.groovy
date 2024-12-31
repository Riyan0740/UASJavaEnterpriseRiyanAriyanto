package com.exa.api.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "books")
class Books
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer category_id

    @NotNull
    @Column(nullable = false)
    Integer id

    @NotNull
    @Column(nullable = false)
    String name

    @NotNull
    @Column(nullable = false)
    String isbn
}
