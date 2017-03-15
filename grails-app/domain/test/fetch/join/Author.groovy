package test.fetch.join

class Author {

    String name

    static belongsTo = [book: Book]

    static constraints = {
    }
}
