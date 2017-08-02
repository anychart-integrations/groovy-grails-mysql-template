package groovy.grails.mysql.template

class Fruit {

    Integer id
    String name
    Integer value

    static constraints = {
    }

    static mapping = {
        table "fruits"
        version false
        id column: "id"
        name column: "name"
        value column: "value"
    }
}
