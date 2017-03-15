package test.fetch.join

class BootStrap {

    def init = { servletContext ->
        new Book(name: "Book 1")
            .addToAuthors([name: "Author 1"])
            .addToAuthors([name: "Author 2"])
            .addToAuthors([name: "Author 3"])
            .addToAuthors([name: "Author 4"])
            .save(flush: true, failOnError: true)

        new Book(name: "Book 1-1")
            .addToAuthors([name: "Author 1-1"])
            .addToAuthors([name: "Author 2-1"])
            .addToAuthors([name: "Author 3-1"])
            .addToAuthors([name: "Author 4-1"])
            .save(flush: true, failOnError: true)

        new Book(name: "Book 1-2")
                .addToAuthors([name: "Author 1-1"])
                .addToAuthors([name: "Author 2-1"])
                .addToAuthors([name: "Author 3-1"])
                .addToAuthors([name: "Author 4-1"])
                .save(flush: true, failOnError: true)

        println "-------------------------------------------------------"

    }
    def destroy = {
    }
}
