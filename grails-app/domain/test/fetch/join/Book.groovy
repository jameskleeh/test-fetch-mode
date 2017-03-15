package test.fetch.join

class Book {

    String name

    static hasMany = [authors: Author]

    static constraints = {
    }
}
