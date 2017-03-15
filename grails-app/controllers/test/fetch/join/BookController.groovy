package test.fetch.join

class BookController {

    def index(String term) {
        term = term ? "%${term}%" : "%"
        List<Book> books = Book.where {
            (name =~ term || authors { name =~ term })
        }.list(fetch: [authors: 'join'])

        respond(books: books)
    }
}
