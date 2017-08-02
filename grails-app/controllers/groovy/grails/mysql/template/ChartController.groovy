package groovy.grails.mysql.template

import com.google.gson.Gson;

class ChartController {

    def index() {
        def fruits = Fruit.list(sort:'value',order:'desc', max:5);
        respond([title     : "AnyChart Groovy Grails template",
                 chartTitle: "Top 5 fruits",
                 chartData : new Gson().toJson(fruits),
                 total     : Fruit.count()])
    }
}
