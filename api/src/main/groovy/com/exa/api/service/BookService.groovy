package com.exa.api.service

import com.exa.api.entity.Books

interface BookService
{
    List<Books> findAll()
}