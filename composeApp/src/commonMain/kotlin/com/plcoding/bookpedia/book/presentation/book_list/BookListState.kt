package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "kotlin",
    val searchResults: List<Book> = emptyList(), //books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

//val books = (1..100).map {
//    Book(
//        id = it.toString(),
//        title = "Book $it",
//        imageUrl = "#",
//        authors = listOf("Cletos", "Marcos"),
//        description = "Description $it",
//        language = emptyList(),
//        firstPublishYear = null,
//        averageRating = 4.543,
//        ratingCount = 5,
//        numPages = 100,
//        numEditions = 3
//    )
//}
